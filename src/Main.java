import AST.Program;
//import Grammer.AngularLexer;
import Grammer.AngularLexer;
import Grammer.AngularParser;
import SemanticCheck.SemanticError;
import SymbolTable.SymbolTable;
import Visitor.BaseVisitor;
import Grammer.AngularLexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;


public class Main {
    public static void main(String[] args) throws IOException {

//         String source = "src/Test/test2.txt" ;
           String source = "src/Test/newTests/mainTest.txt" ;
//        String source = "src/Test/newTests/errorTest.txt" ;
//         String source = "src/Test/newTests/calculator.txt" ;


//        String source = "src/Test/test10.txt" ;
            CharStream cs = fromFileName(source);
            AngularLexer lexer = new AngularLexer(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            AngularParser parser = new AngularParser(token);
            ParseTree tree = parser.program();
            Program doc = (Program) new BaseVisitor().visit(tree);
            System.out.println(doc);

        BaseVisitor visitor = new BaseVisitor();
        visitor.visit(tree);
        System.out.println();
        System.out.println("================================");
        SymbolTable symbolTable = visitor.getSymbolTable();
        symbolTable.printToFile("src/result/symbolTable.txt");
        System.out.println();
        SemanticError semanticError = new SemanticError();
        System.out.println(semanticError.getPropertyDecSTHashMap());
        semanticError.errorResult();

    }
}