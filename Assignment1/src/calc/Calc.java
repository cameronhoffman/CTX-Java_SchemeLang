/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calc;

/**
 *
 * @author phil
 */
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Calc {
    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if ( args.length>0 ) inputFile = args[0];
        InputStream is = System.in;
        if ( inputFile!=null ) {
            is = new FileInputStream(inputFile);
        }
        System.out.print("> ");

        BufferedReader br = new BufferedReader(new InputStreamReader(is)); 
        String expr = br.readLine();              // get first expression
        int line = 1;                             // track input expr line numbers

                Expr2Parser parser = new Expr2Parser(null); // share single parser instance
                parser.setBuildParseTree(false);          // don't need trees

        while ( expr!=null ) {             // while we have more expressions
            // create new lexer and token stream for each line (expression)
            ANTLRInputStream input = new ANTLRInputStream(expr+"\n");
            Expr2Lexer lexer = new Expr2Lexer(input);
            lexer.setLine(line);           // notify lexer of input position
            lexer.setCharPositionInLine(0);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser.setInputStream(tokens); // notify parser of new token stream
            parser.eval();                 // start the parser
            System.out.print("> ");
            expr = br.readLine();          // see if there's another line
            line++;
        }
    }
}
