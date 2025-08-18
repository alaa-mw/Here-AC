import AST.Program;
import Grammer.AngularLexer;
import Grammer.AngularParser;
import SemanticCheck.SemanticError;
import SymbolTable.InterfaceMissing.SymbolTable;
import Visitor.BaseVisitor;
import Generation.Generation;
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
        // AST visit and print
        CharStream cs = fromFileName(source);
        AngularLexer lexer = new AngularLexer(cs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        AngularParser parser = new AngularParser(token);
        ParseTree tree = parser.program();
        Program doc = (Program) new BaseVisitor().visit(tree);
        //System.out.println(doc);

        // Semantic check
        BaseVisitor visitor = new BaseVisitor();
        visitor.visit(tree);
        System.out.println();
        System.out.println("================================");
        SymbolTable symbolTable = visitor.getSymbolTable();
        symbolTable.printToFile("src/result/symbolTable.txt");
        System.out.println();
        SemanticError semanticError = new SemanticError();
        //System.out.println(print());
        semanticError.errorResult();

        // Code Generation
        Generation generation=new Generation();
        generation.generate(doc);
    }
    public static String getSource(int fileKey) {
        return switch (fileKey) {
            case 0 -> "src/Test/newTests/finalCode.txt";
            case 1 -> "src/Test/newTests/mainTest.txt";
            case 2 -> "src/Test/newTests/calculator.txt";
            case 3 -> "src/Test/newTests/errorTest.txt";
            case 4 -> "src/Test/test3.txt";
            case 5 -> "src/Test/test4.txt";
            default -> throw new IllegalArgumentException("Unknown test file: " + fileKey);
        };
    }
}