package tictactoe.players;

import org.junit.Before;
import org.junit.Test;
import tictactoe.Board;
import tictactoe.BoardHelper;
import tictactoe.Marks;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class ComputerPlayerTest {
    private Board board;
    private ComputerPlayer computer;

    @Before
    public void initialize() {
        board = new Board();
        computer = new ComputerPlayer(Marks.CROSS, board);
    }

    @Test
    public void blockOpponentRow() {
        BoardHelper.update(board, "X--OO-X--");
        assertThat(computer.nextMove()).isEqualTo(5);
    }

    @Test
    public void blockOpponentColumn() {
        BoardHelper.update(board, "OX-O-X---");
        assertThat(computer.nextMove()).isEqualTo(6);
    }

    @Test
    public void blockOpponentDiagonal() {
        BoardHelper.update(board, "OX--OX---");
        assertThat(computer.nextMove()).isEqualTo(8);
    }

    @Test
    public void winRow() {
        BoardHelper.update(board, "X-X-O---O");
        assertThat(computer.nextMove()).isEqualTo(1);
    }

    @Test
    public void winColumn() {
        BoardHelper.update(board, "XO-XO--XO");
        assertThat(computer.nextMove()).isEqualTo(6);
    }
}
