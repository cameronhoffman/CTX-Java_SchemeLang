grammar Expr2;

/*
 * Implements the following simple grammar:
 * eval -> additionExp NEWLINE | NEWLINE
 * additionExp -> multiplyExp (PLUS multiplyExp | MINUS multiplyExp)*
 * multiplyExp -> atomExp (TIMES atomExp | DIVIDE atomExp)*
 * atomExp -> number | LPAREN additionExp RParen
 */
 
@header {
package calc;
import java.util.*;
}

eval:    additionExp NEWLINE    {System.out.println($additionExp.value);} 
    |    NEWLINE
    ;

additionExp returns [Integer value]
    :    m1=multiplyExp       {$value =  $m1.value;} 
        ( PLUS m2=multiplyExp {$value += $m2.value;} 
        | MINUS m2=multiplyExp {$value -= $m2.value;}
        )* 
    ;

multiplyExp returns [Integer value]
    :    a1=atomExp       {$value =  $a1.value;}
        ( TIMES a2=atomExp {$value *= $a2.value;} 
        | DIVIDE a2=atomExp {$value /= $a2.value;}
        )* 
    ;

atomExp returns [Integer value]
    :    n=Number                {$value = Integer.parseInt($n.text);}
    |    LPAREN exp=additionExp RPAREN {$value = $exp.value;}
    ;

Number
    :    ('0'..'9')+
    ;

WS  :   [ \t]+ -> skip ; // toss out whitespace

NEWLINE:'\r'? '\n' ;     // return newlines to parser (is end-statement signal)

TIMES : '*' ;
DIVIDE : '/' ;
PLUS : '+' ;
MINUS : '-' ;
LPAREN: '(';
RPAREN: ')';
