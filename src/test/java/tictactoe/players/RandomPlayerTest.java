package tictactoe.players;

import org.junit.Rule;
import org.junit.Test;
import tictactoe.Board;
import tictactoe.BoardHelper;
import tictactoe.Marks;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class RandomPlayerTest {
    @Rule
    public RepeatRule repeatRule = new RepeatRule();

    @Test
    @Repeat(times = 100)
    public void getARandomMoveFromMoveAvailable2() {
        Board board = BoardHelper.createBoard("XOXXOX---");
        RandomPlayer randomPlayer = new RandomPlayer(Marks.CROSS, board);

        assertThat(randomPlayer.nextMove()).isIn(board.freePositions());
    }
}


