package minesweeper;

/**
 * Created by User on 15.05.2017.
 */
public interface UserAction {
    void initGame();

    void select(int x, int y, boolean bomb);
}
