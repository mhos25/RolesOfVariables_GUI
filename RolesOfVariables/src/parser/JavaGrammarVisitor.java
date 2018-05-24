// Generated from JavaGrammar.g4 by ANTLR 4.7.1
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavaGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(JavaGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#class_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_statement(JavaGrammarParser.Class_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#main_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_method(JavaGrammarParser.Main_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JavaGrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InverseBool}
	 * labeled alternative in {@link JavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInverseBool(JavaGrammarParser.InverseBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link JavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(JavaGrammarParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NegativeNumber}
	 * labeled alternative in {@link JavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegativeNumber(JavaGrammarParser.NegativeNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link JavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(JavaGrammarParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link JavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(JavaGrammarParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link JavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(JavaGrammarParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link JavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(JavaGrammarParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code And}
	 * labeled alternative in {@link JavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(JavaGrammarParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Relational}
	 * labeled alternative in {@link JavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational(JavaGrammarParser.RelationalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String}
	 * labeled alternative in {@link JavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(JavaGrammarParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link JavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(JavaGrammarParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link JavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(JavaGrammarParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StaticIntDeclaration}
	 * labeled alternative in {@link JavaGrammarParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticIntDeclaration(JavaGrammarParser.StaticIntDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarDeclarationAndAssignment}
	 * labeled alternative in {@link JavaGrammarParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclarationAndAssignment(JavaGrammarParser.VarDeclarationAndAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleVarDeclaration}
	 * labeled alternative in {@link JavaGrammarParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleVarDeclaration(JavaGrammarParser.SimpleVarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListDeclaration}
	 * labeled alternative in {@link JavaGrammarParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListDeclaration(JavaGrammarParser.ListDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#varDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclarationList(JavaGrammarParser.VarDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code directVarAssignment}
	 * labeled alternative in {@link JavaGrammarParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectVarAssignment(JavaGrammarParser.DirectVarAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InputVar}
	 * labeled alternative in {@link JavaGrammarParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputVar(JavaGrammarParser.InputVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintStatementAndVariable}
	 * labeled alternative in {@link JavaGrammarParser#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatementAndVariable(JavaGrammarParser.PrintStatementAndVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintStatementandVariable2}
	 * labeled alternative in {@link JavaGrammarParser#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatementandVariable2(JavaGrammarParser.PrintStatementandVariable2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintStatementandVariable3}
	 * labeled alternative in {@link JavaGrammarParser#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatementandVariable3(JavaGrammarParser.PrintStatementandVariable3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintStatementandExpression}
	 * labeled alternative in {@link JavaGrammarParser#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatementandExpression(JavaGrammarParser.PrintStatementandExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simplePrintStatement}
	 * labeled alternative in {@link JavaGrammarParser#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimplePrintStatement(JavaGrammarParser.SimplePrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintComplexStatement}
	 * labeled alternative in {@link JavaGrammarParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintComplexStatement(JavaGrammarParser.PrintComplexStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintString}
	 * labeled alternative in {@link JavaGrammarParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintString(JavaGrammarParser.PrintStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompareStatements_if}
	 * labeled alternative in {@link JavaGrammarParser#branch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareStatements_if(JavaGrammarParser.CompareStatements_ifContext ctx);
	/**
	 * Visit a parse tree produced by the {@code If_statement_Or_Operator}
	 * labeled alternative in {@link JavaGrammarParser#branch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement_Or_Operator(JavaGrammarParser.If_statement_Or_OperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OtherIfStatements}
	 * labeled alternative in {@link JavaGrammarParser#branch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtherIfStatements(JavaGrammarParser.OtherIfStatementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoWhile_Or_Operator}
	 * labeled alternative in {@link JavaGrammarParser#do_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhile_Or_Operator(JavaGrammarParser.DoWhile_Or_OperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleDoWhile}
	 * labeled alternative in {@link JavaGrammarParser#do_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleDoWhile(JavaGrammarParser.SimpleDoWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(JavaGrammarParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(JavaGrammarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#userInput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserInput(JavaGrammarParser.UserInputContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#incrementation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementation(JavaGrammarParser.IncrementationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#decrement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrement(JavaGrammarParser.DecrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(JavaGrammarParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeclareVariable_For}
	 * labeled alternative in {@link JavaGrammarParser#forInitialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareVariable_For(JavaGrammarParser.DeclareVariable_ForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignVariable_For}
	 * labeled alternative in {@link JavaGrammarParser#forInitialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignVariable_For(JavaGrammarParser.AssignVariable_ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#forChange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForChange(JavaGrammarParser.ForChangeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleBooleanVariableDeclaration}
	 * labeled alternative in {@link JavaGrammarParser#booleanVarDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleBooleanVariableDeclaration(JavaGrammarParser.SimpleBooleanVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanVariableDeclarationAndAssignment}
	 * labeled alternative in {@link JavaGrammarParser#booleanVarDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanVariableDeclarationAndAssignment(JavaGrammarParser.BooleanVariableDeclarationAndAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanVariableEvaluationAndAssignment}
	 * labeled alternative in {@link JavaGrammarParser#booleanVarAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanVariableEvaluationAndAssignment(JavaGrammarParser.BooleanVariableEvaluationAndAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleBooleanVariableAssignment}
	 * labeled alternative in {@link JavaGrammarParser#booleanVarAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleBooleanVariableAssignment(JavaGrammarParser.SimpleBooleanVariableAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code true}
	 * labeled alternative in {@link JavaGrammarParser#booleanValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue(JavaGrammarParser.TrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code false}
	 * labeled alternative in {@link JavaGrammarParser#booleanValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalse(JavaGrammarParser.FalseContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#inverseBoolean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInverseBoolean(JavaGrammarParser.InverseBooleanContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#charArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharArray(JavaGrammarParser.CharArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#arrayAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAssignment(JavaGrammarParser.ArrayAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#arrayElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElement(JavaGrammarParser.ArrayElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#comparingArrayElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparingArrayElements(JavaGrammarParser.ComparingArrayElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#comparingBooleanAndArrayElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparingBooleanAndArrayElement(JavaGrammarParser.ComparingBooleanAndArrayElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#printSyntax}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintSyntax(JavaGrammarParser.PrintSyntaxContext ctx);
}