package minesweeper;

/**
 * Created by User on 15.05.2017.
 */
public interface SaperLogic {
    void loadBoard(Cell[][] cells);

    boolean shouldBang(int x, int y);

    boolean finish();

    void suggest(int x, int y, boolean bomb);
}
