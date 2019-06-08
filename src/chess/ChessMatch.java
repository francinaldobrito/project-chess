/**
 * 
 */
package chess;

import boardgame.Board;

/**
 * @author Francinaldo Brito Classe partida de Xadrez Onde sera implementado as
 *         regras do xadrez
 *
 */
public class ChessMatch {
	private Board board;

	public ChessMatch() {
		board = new Board(8, 8);
	}

	public ChessPiece[][] getPieces() {
		ChessPiece[][] matriz = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				matriz[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return matriz;
	}
}
