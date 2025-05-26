//import Grammer.AngularLexer;
import gen.Grammer.AngularLexer;
import Grammer.AngularParser;
import Duplicate_attribute.BaseVisitor2;
        import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;


public class Main {
    public static void main(String[] args) throws IOException {
            String source = "src/Test/test2.txt" ;
//            String source = "src/Test/newTests/mainTest.txt" ;
//        String source = "src/Test/newTests/calculator.txt" ;
            CharStream cs = fromFileName(source);
            AngularLexer lexer = new AngularLexer(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            AngularParser parser = new AngularParser(token);
            ParseTree tree = parser.program();
            BaseVisitor2 visitor2= new BaseVisitor2();
            visitor2.visit(tree);
            visitor2.getSymbolTable().printTable();
           // Program doc = (Program) new BaseVisitor2().visit(tree);
           // System.out.println(doc);
        }
}