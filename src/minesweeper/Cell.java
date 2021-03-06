package minesweeper;

/**
 * Created by User on 15.05.2017.
 */
public interface Cell<T> {
    boolean isBomb();

    boolean isSuggestBomb();

    boolean isSuggestEmpty();

    void suggestEmpty();

    void suggestBomb();

    //void draw(T paint, boolean real);

    void draw(T paint, boolean real, int xCoord, int yCoord);
}
