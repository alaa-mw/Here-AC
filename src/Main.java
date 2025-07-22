import AST.Program;
//import Grammer.AngularLexer;
import Grammer.AngularParser;
import SemanticCheck.SemanticError;
import SymbolTable.InterfaceMissing.SymbolTable;
import Visitor.BaseVisitor;
import gen.Grammer.AngularLexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.util.Scanner;
import static org.antlr.v4.runtime.CharStreams.fromFileName;


public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter: ");
        int input = Integer.parseInt(scanner.nextLine().trim());

        String source = getSource(input);

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
//        System.out.println(print());
        semanticError.errorResult();

    }
    public static String getSource(int fileKey) {
        return switch (fileKey) {
            case 1 -> "src/Test/newTests/mainTest.txt";
            case 2 -> "src/Test/newTests/calculator.txt";
            case 3 -> "src/Test/newTests/errorTest.txt";
            case 5 -> "Test/test5.txt";
            case 4 -> "src/Test/test4.txt";
            case 10 -> "src/Test/test10.txt";
            default -> throw new IllegalArgumentException("Unknown test file: " + fileKey);
        };
    }
}