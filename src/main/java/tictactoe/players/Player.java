package tictactoe.players;

import tictactoe.Marks;

public interface Player {
    int nextMove();
    Marks getMark();
    boolean isReady();
}
