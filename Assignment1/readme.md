CSC 3311, Programming Assignment 1, Calculator
===================================================

Background
-----
In this assignment you will be using the ANTLR tool to extend a grammar for a simple calculator. Currently the calculator can perform addition, subtraction, multiplication and division and supports parentheses.

[ANTLR v4](http://antlr.org) is a tool to automatically create lexers and parsers for programming languages. I’m supplying you a base ANTLR file ("Expr2.g4") within a NetBeans project which you will modify. "Expr2.g4" is the only file you will need to modify for this assignment. You will be adding grammar rules and tweaking existing rules.

To Do
---------
The grammar/code you have been given fully implements addition, subtraction, multiplication and division, as well as parentheses for positive integers only. For example. The following work just fine:

    > 4 + 2 → 6 
    > 4 * 3 + 2 → 14 
    > 2 + 3 * 4 → 14 
    > (2 + 3) * 4 → 20 
    > 6 - 4 / 2 → 4 

Your task is to extend the calculator in the following ways:

* unary minus: negative numbers are not currently supported, and you need to add them. For example, you must make this work: 

        > -4 + -3 → -7 

  The easiest way to do this is add a rule to atomExp to match a minus sign followed by a number and do the right thing with it. Your Java code will look similar to the rule: 

        : n=Number {$value = Integer.parseInt($n.text);} 

  but you will have to make the result negative.

* modulo: You will add the ‘%’ (modulo) operator to the language and make it do the right thing. The ‘%’ symbol is not currently matched in the lexer so you will need to add that first. Modulo is at the same level of precedence as multiplication and division, so the easiest route is to add a rule to multiplyExp to handle it. The following are examples of mod: 

        > 6 + 4 % 3 → 7 
        > 7 % 8 - 2 → 5

* exponentiation: You will add an exponent operator'^' to the language. For example, 2 ^ 3 would be 8 because 2 raised to third power is 8. You can use the function Math.pow() to raise one number to the power of another. (Just google ‘Math.pow()’ for information on this Java library function.) Math.pow() returns a double and you need an Integer. double does not readily convert to the Integer object, so you need to cast the result of Math.pow to 'int' first.
This one is tricky. What precedence level should '^' be at? It should be at a higher precedence level than multiplication and division. Here are some example runs:

        > 5 ^ 2 * 3 → 75 
        > 3 * 5 ^ 2 → 75 
        > (3 * 5) ^ 2 → 225 