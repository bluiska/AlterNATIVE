// Generated from AlterNATIVE.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AlterNATIVEParser}.
 */
public interface AlterNATIVEListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AlterNATIVEParser#funcall}.
	 * @param ctx the parse tree
	 */
	void enterFuncall(@NotNull AlterNATIVEParser.FuncallContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlterNATIVEParser#funcall}.
	 * @param ctx the parse tree
	 */
	void exitFuncall(@NotNull AlterNATIVEParser.FuncallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code brackets_precedence}
	 * labeled alternative in {@link AlterNATIVEParser#number_operation}.
	 * @param ctx the parse tree
	 */
	void enterBrackets_precedence(@NotNull AlterNATIVEParser.Brackets_precedenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code brackets_precedence}
	 * labeled alternative in {@link AlterNATIVEParser#number_operation}.
	 * @param ctx the parse tree
	 */
	void exitBrackets_precedence(@NotNull AlterNATIVEParser.Brackets_precedenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlterNATIVEParser#bool_operation}.
	 * @param ctx the parse tree
	 */
	void enterBool_operation(@NotNull AlterNATIVEParser.Bool_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlterNATIVEParser#bool_operation}.
	 * @param ctx the parse tree
	 */
	void exitBool_operation(@NotNull AlterNATIVEParser.Bool_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlterNATIVEParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(@NotNull AlterNATIVEParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlterNATIVEParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(@NotNull AlterNATIVEParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlterNATIVEParser#case_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCase_stmt(@NotNull AlterNATIVEParser.Case_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlterNATIVEParser#case_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCase_stmt(@NotNull AlterNATIVEParser.Case_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlterNATIVEParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull AlterNATIVEParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlterNATIVEParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull AlterNATIVEParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlterNATIVEParser#dountil}.
	 * @param ctx the parse tree
	 */
	void enterDountil(@NotNull AlterNATIVEParser.DountilContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlterNATIVEParser#dountil}.
	 * @param ctx the parse tree
	 */
	void exitDountil(@NotNull AlterNATIVEParser.DountilContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlterNATIVEParser#case_condition}.
	 * @param ctx the parse tree
	 */
	void enterCase_condition(@NotNull AlterNATIVEParser.Case_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlterNATIVEParser#case_condition}.
	 * @param ctx the parse tree
	 */
	void exitCase_condition(@NotNull AlterNATIVEParser.Case_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlterNATIVEParser#whileloop}.
	 * @param ctx the parse tree
	 */
	void enterWhileloop(@NotNull AlterNATIVEParser.WhileloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlterNATIVEParser#whileloop}.
	 * @param ctx the parse tree
	 */
	void exitWhileloop(@NotNull AlterNATIVEParser.WhileloopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code toPower}
	 * labeled alternative in {@link AlterNATIVEParser#number_operation}.
	 * @param ctx the parse tree
	 */
	void enterToPower(@NotNull AlterNATIVEParser.ToPowerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code toPower}
	 * labeled alternative in {@link AlterNATIVEParser#number_operation}.
	 * @param ctx the parse tree
	 */
	void exitToPower(@NotNull AlterNATIVEParser.ToPowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlterNATIVEParser#var_type}.
	 * @param ctx the parse tree
	 */
	void enterVar_type(@NotNull AlterNATIVEParser.Var_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlterNATIVEParser#var_type}.
	 * @param ctx the parse tree
	 */
	void exitVar_type(@NotNull AlterNATIVEParser.Var_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlterNATIVEParser#operations}.
	 * @param ctx the parse tree
	 */
	void enterOperations(@NotNull AlterNATIVEParser.OperationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlterNATIVEParser#operations}.
	 * @param ctx the parse tree
	 */
	void exitOperations(@NotNull AlterNATIVEParser.OperationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlterNATIVEParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(@NotNull AlterNATIVEParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlterNATIVEParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(@NotNull AlterNATIVEParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlterNATIVEParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(@NotNull AlterNATIVEParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlterNATIVEParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(@NotNull AlterNATIVEParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlterNATIVEParser#logic_connector}.
	 * @param ctx the parse tree
	 */
	void enterLogic_connector(@NotNull AlterNATIVEParser.Logic_connectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlterNATIVEParser#logic_connector}.
	 * @param ctx the parse tree
	 */
	void exitLogic_connector(@NotNull AlterNATIVEParser.Logic_connectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code merge}
	 * labeled alternative in {@link AlterNATIVEParser#array_functions}.
	 * @param ctx the parse tree
	 */
	void enterMerge(@NotNull AlterNATIVEParser.MergeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code merge}
	 * labeled alternative in {@link AlterNATIVEParser#array_functions}.
	 * @param ctx the parse tree
	 */
	void exitMerge(@NotNull AlterNATIVEParser.MergeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code concatinate_text}
	 * labeled alternative in {@link AlterNATIVEParser#text_operation}.
	 * @param ctx the parse tree
	 */
	void enterConcatinate_text(@NotNull AlterNATIVEParser.Concatinate_textContext ctx);
	/**
	 * Exit a parse tree produced by the {@code concatinate_text}
	 * labeled alternative in {@link AlterNATIVEParser#text_operation}.
	 * @param ctx the parse tree
	 */
	void exitConcatinate_text(@NotNull AlterNATIVEParser.Concatinate_textContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlterNATIVEParser#bool_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBool_stmt(@NotNull AlterNATIVEParser.Bool_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlterNATIVEParser#bool_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBool_stmt(@NotNull AlterNATIVEParser.Bool_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlterNATIVEParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull AlterNATIVEParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlterNATIVEParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull AlterNATIVEParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divide}
	 * labeled alternative in {@link AlterNATIVEParser#number_operation}.
	 * @param ctx the parse tree
	 */
	void enterDivide(@NotNull AlterNATIVEParser.DivideContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divide}
	 * labeled alternative in {@link AlterNATIVEParser#number_operation}.
	 * @param ctx the parse tree
	 */
	void exitDivide(@NotNull AlterNATIVEParser.DivideContext ctx);
	/**
	 * Enter a parse tree produced by the {@code join}
	 * labeled alternative in {@link AlterNATIVEParser#array_functions}.
	 * @param ctx the parse tree
	 */
	void enterJoin(@NotNull AlterNATIVEParser.JoinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code join}
	 * labeled alternative in {@link AlterNATIVEParser#array_functions}.
	 * @param ctx the parse tree
	 */
	void exitJoin(@NotNull AlterNATIVEParser.JoinContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlterNATIVEParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrint_stmt(@NotNull AlterNATIVEParser.Print_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlterNATIVEParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrint_stmt(@NotNull AlterNATIVEParser.Print_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiply}
	 * labeled alternative in {@link AlterNATIVEParser#number_operation}.
	 * @param ctx the parse tree
	 */
	void enterMultiply(@NotNull AlterNATIVEParser.MultiplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiply}
	 * labeled alternative in {@link AlterNATIVEParser#number_operation}.
	 * @param ctx the parse tree
	 */
	void exitMultiply(@NotNull AlterNATIVEParser.MultiplyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlterNATIVEParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull AlterNATIVEParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlterNATIVEParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull AlterNATIVEParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link AlterNATIVEParser#number_operation}.
	 * @param ctx the parse tree
	 */
	void enterAdd(@NotNull AlterNATIVEParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link AlterNATIVEParser#number_operation}.
	 * @param ctx the parse tree
	 */
	void exitAdd(@NotNull AlterNATIVEParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code increment_or_decrement}
	 * labeled alternative in {@link AlterNATIVEParser#number_functions}.
	 * @param ctx the parse tree
	 */
	void enterIncrement_or_decrement(@NotNull AlterNATIVEParser.Increment_or_decrementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code increment_or_decrement}
	 * labeled alternative in {@link AlterNATIVEParser#number_functions}.
	 * @param ctx the parse tree
	 */
	void exitIncrement_or_decrement(@NotNull AlterNATIVEParser.Increment_or_decrementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code slice_string}
	 * labeled alternative in {@link AlterNATIVEParser#text_function}.
	 * @param ctx the parse tree
	 */
	void enterSlice_string(@NotNull AlterNATIVEParser.Slice_stringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code slice_string}
	 * labeled alternative in {@link AlterNATIVEParser#text_function}.
	 * @param ctx the parse tree
	 */
	void exitSlice_string(@NotNull AlterNATIVEParser.Slice_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlterNATIVEParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull AlterNATIVEParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlterNATIVEParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull AlterNATIVEParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subtract}
	 * labeled alternative in {@link AlterNATIVEParser#number_operation}.
	 * @param ctx the parse tree
	 */
	void enterSubtract(@NotNull AlterNATIVEParser.SubtractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subtract}
	 * labeled alternative in {@link AlterNATIVEParser#number_operation}.
	 * @param ctx the parse tree
	 */
	void exitSubtract(@NotNull AlterNATIVEParser.SubtractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code length}
	 * labeled alternative in {@link AlterNATIVEParser#array_functions}.
	 * @param ctx the parse tree
	 */
	void enterLength(@NotNull AlterNATIVEParser.LengthContext ctx);
	/**
	 * Exit a parse tree produced by the {@code length}
	 * labeled alternative in {@link AlterNATIVEParser#array_functions}.
	 * @param ctx the parse tree
	 */
	void exitLength(@NotNull AlterNATIVEParser.LengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlterNATIVEParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull AlterNATIVEParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlterNATIVEParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull AlterNATIVEParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlterNATIVEParser#function_def}.
	 * @param ctx the parse tree
	 */
	void enterFunction_def(@NotNull AlterNATIVEParser.Function_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlterNATIVEParser#function_def}.
	 * @param ctx the parse tree
	 */
	void exitFunction_def(@NotNull AlterNATIVEParser.Function_defContext ctx);
	/**
	 * Enter a parse tree produced by the {@code slice_array}
	 * labeled alternative in {@link AlterNATIVEParser#array_functions}.
	 * @param ctx the parse tree
	 */
	void enterSlice_array(@NotNull AlterNATIVEParser.Slice_arrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code slice_array}
	 * labeled alternative in {@link AlterNATIVEParser#array_functions}.
	 * @param ctx the parse tree
	 */
	void exitSlice_array(@NotNull AlterNATIVEParser.Slice_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlterNATIVEParser#forloop}.
	 * @param ctx the parse tree
	 */
	void enterForloop(@NotNull AlterNATIVEParser.ForloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlterNATIVEParser#forloop}.
	 * @param ctx the parse tree
	 */
	void exitForloop(@NotNull AlterNATIVEParser.ForloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlterNATIVEParser#return_block}.
	 * @param ctx the parse tree
	 */
	void enterReturn_block(@NotNull AlterNATIVEParser.Return_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlterNATIVEParser#return_block}.
	 * @param ctx the parse tree
	 */
	void exitReturn_block(@NotNull AlterNATIVEParser.Return_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlterNATIVEParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull AlterNATIVEParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlterNATIVEParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull AlterNATIVEParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlterNATIVEParser#bool_operator}.
	 * @param ctx the parse tree
	 */
	void enterBool_operator(@NotNull AlterNATIVEParser.Bool_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlterNATIVEParser#bool_operator}.
	 * @param ctx the parse tree
	 */
	void exitBool_operator(@NotNull AlterNATIVEParser.Bool_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlterNATIVEParser#input_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInput_stmt(@NotNull AlterNATIVEParser.Input_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlterNATIVEParser#input_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInput_stmt(@NotNull AlterNATIVEParser.Input_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlterNATIVEParser#case_block}.
	 * @param ctx the parse tree
	 */
	void enterCase_block(@NotNull AlterNATIVEParser.Case_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlterNATIVEParser#case_block}.
	 * @param ctx the parse tree
	 */
	void exitCase_block(@NotNull AlterNATIVEParser.Case_blockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code modulo}
	 * labeled alternative in {@link AlterNATIVEParser#number_operation}.
	 * @param ctx the parse tree
	 */
	void enterModulo(@NotNull AlterNATIVEParser.ModuloContext ctx);
	/**
	 * Exit a parse tree produced by the {@code modulo}
	 * labeled alternative in {@link AlterNATIVEParser#number_operation}.
	 * @param ctx the parse tree
	 */
	void exitModulo(@NotNull AlterNATIVEParser.ModuloContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlterNATIVEParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(@NotNull AlterNATIVEParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlterNATIVEParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(@NotNull AlterNATIVEParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlterNATIVEParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(@NotNull AlterNATIVEParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlterNATIVEParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(@NotNull AlterNATIVEParser.OperandContext ctx);
}