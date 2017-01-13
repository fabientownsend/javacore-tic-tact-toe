package tictactoe;

import org.junit.Test;
import tictactoe.players.ComputerPlayer;
import tictactoe.players.Player;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class PartyTest {
    private Party party;

    @Test
    public void firstPlayerIsCross() {
        party = createGameWithTwoComputerPlayers(3);
        assertThat(party.getCurrentPlayerMark()).isEqualTo(Marks.CROSS);
    }

    @Test
    public void lastPlayerIsCrossWhenTie() {
        party = createGameWithTwoComputerPlayers(3);
        while (!party.isGameOver()) {
            party.play();
        }

        assertThat(party.getCurrentPlayerMark()).isEqualTo(Marks.CROSS);
    }

    @Test(timeout = 18000)
    public void computerTake18secondsMaximumToFinishTheGame() {
        party = createGameWithTwoComputerPlayers(3);
        while (!party.isGameOver()) {
            party.play();
        }
    }

    @Test(timeout = 24000)
    public void computerTake24SecondsMaximumToFinishTheGame() {
        party = createGameWithTwoComputerPlayers(4);
        while (!party.isGameOver()) {
            party.play();
        }
    }

    private Party createGameWithTwoComputerPlayers(int boardSize) {
        Board board = new Board(boardSize);
        Player player_1 = new ComputerPlayer(Marks.CROSS, board);
        Player player_2 = new ComputerPlayer(Marks.NOUGHT, board);
        return new Party(board, player_1, player_2);
    }
}
