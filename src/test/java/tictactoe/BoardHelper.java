package tictactoe;

public class BoardHelper {
    public static Board createBoard(String stringBoard) {
        Board board = new Board(3);
        for (int i = 0; i < stringBoard.length(); i ++) {
            if (stringBoard.charAt(i) == 'X') {
                board.putMark(Marks.CROSS, i);
            }
            if (stringBoard.charAt(i) == 'O') {
                board.putMark(Marks.NOUGHT, i);
            }
        }
        return board;
    }

    public static Board update(Board board, String stringBoard) {
        for (int i = 0; i < stringBoard.length(); i ++) {
            if (stringBoard.charAt(i) == 'X') {
                board.putMark(Marks.CROSS, i);
            }
            if (stringBoard.charAt(i) == 'O') {
                board.putMark(Marks.NOUGHT, i);
            }
        }
        return board;
    }
}
