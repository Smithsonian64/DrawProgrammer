// Generated from inputCommands.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link inputCommandsParser}.
 */
public interface inputCommandsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link inputCommandsParser#inputCommands}.
	 * @param ctx the parse tree
	 */
	void enterInputCommands(inputCommandsParser.InputCommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link inputCommandsParser#inputCommands}.
	 * @param ctx the parse tree
	 */
	void exitInputCommands(inputCommandsParser.InputCommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link inputCommandsParser#command_list}.
	 * @param ctx the parse tree
	 */
	void enterCommand_list(inputCommandsParser.Command_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link inputCommandsParser#command_list}.
	 * @param ctx the parse tree
	 */
	void exitCommand_list(inputCommandsParser.Command_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link inputCommandsParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(inputCommandsParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link inputCommandsParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(inputCommandsParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link inputCommandsParser#left}.
	 * @param ctx the parse tree
	 */
	void enterLeft(inputCommandsParser.LeftContext ctx);
	/**
	 * Exit a parse tree produced by {@link inputCommandsParser#left}.
	 * @param ctx the parse tree
	 */
	void exitLeft(inputCommandsParser.LeftContext ctx);
	/**
	 * Enter a parse tree produced by {@link inputCommandsParser#right}.
	 * @param ctx the parse tree
	 */
	void enterRight(inputCommandsParser.RightContext ctx);
	/**
	 * Exit a parse tree produced by {@link inputCommandsParser#right}.
	 * @param ctx the parse tree
	 */
	void exitRight(inputCommandsParser.RightContext ctx);
	/**
	 * Enter a parse tree produced by {@link inputCommandsParser#up}.
	 * @param ctx the parse tree
	 */
	void enterUp(inputCommandsParser.UpContext ctx);
	/**
	 * Exit a parse tree produced by {@link inputCommandsParser#up}.
	 * @param ctx the parse tree
	 */
	void exitUp(inputCommandsParser.UpContext ctx);
	/**
	 * Enter a parse tree produced by {@link inputCommandsParser#down}.
	 * @param ctx the parse tree
	 */
	void enterDown(inputCommandsParser.DownContext ctx);
	/**
	 * Exit a parse tree produced by {@link inputCommandsParser#down}.
	 * @param ctx the parse tree
	 */
	void exitDown(inputCommandsParser.DownContext ctx);
	/**
	 * Enter a parse tree produced by {@link inputCommandsParser#move}.
	 * @param ctx the parse tree
	 */
	void enterMove(inputCommandsParser.MoveContext ctx);
	/**
	 * Exit a parse tree produced by {@link inputCommandsParser#move}.
	 * @param ctx the parse tree
	 */
	void exitMove(inputCommandsParser.MoveContext ctx);
	/**
	 * Enter a parse tree produced by {@link inputCommandsParser#set_brush_size}.
	 * @param ctx the parse tree
	 */
	void enterSet_brush_size(inputCommandsParser.Set_brush_sizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link inputCommandsParser#set_brush_size}.
	 * @param ctx the parse tree
	 */
	void exitSet_brush_size(inputCommandsParser.Set_brush_sizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link inputCommandsParser#set_heading}.
	 * @param ctx the parse tree
	 */
	void enterSet_heading(inputCommandsParser.Set_headingContext ctx);
	/**
	 * Exit a parse tree produced by {@link inputCommandsParser#set_heading}.
	 * @param ctx the parse tree
	 */
	void exitSet_heading(inputCommandsParser.Set_headingContext ctx);
	/**
	 * Enter a parse tree produced by {@link inputCommandsParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(inputCommandsParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link inputCommandsParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(inputCommandsParser.For_statementContext ctx);
}