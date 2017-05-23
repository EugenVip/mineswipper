package minesweeper.wipperGUI;

import minesweeper.Cell;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

/**
 * Created by User on 15.05.2017.
 */
public class GUICell implements Cell<Graphics>{

    private boolean bomb;
    private boolean suggestBomb = false;
    private boolean suggestEmpty = false;

    public GUICell(boolean bomb){
        this.bomb = bomb;
    }
    public boolean isBomb() {
        return this.bomb;
    }

    public boolean isSuggestBomb() {
        return this.suggestBomb;
    }

    public boolean isSuggestEmpty() {
        return this.suggestEmpty;
    }

    public void suggestEmpty() {
        this.suggestEmpty = true;
        this.suggestBomb = false;
    }

    public void suggestBomb() {
        this.suggestBomb = true;
        this.suggestEmpty = false;
    }

    public void draw(Graphics paint, boolean real, int xCoordinate, int yCoordinate)
    {

        if (real) {
            if (this.isBomb()) {
                paint.drawString("BANG!", xCoordinate*GUIBoard.PADDING + GUIBoard.PADDING/2, yCoordinate*GUIBoard.PADDING + GUIBoard.PADDING/2);
            }
        }
        else
        {
            if (this.isSuggestBomb()){
                    paint.drawString("*", xCoordinate*GUIBoard.PADDING + GUIBoard.PADDING/2, yCoordinate*GUIBoard.PADDING + GUIBoard.PADDING/2);
            }else
                if (this.isSuggestEmpty()){
                    paint.drawString("x", xCoordinate*GUIBoard.PADDING + GUIBoard.PADDING/2, yCoordinate*GUIBoard.PADDING + GUIBoard.PADDING/2);
            }else
            {
                paint.drawString("", xCoordinate*GUIBoard.PADDING + GUIBoard.PADDING/2, yCoordinate*GUIBoard.PADDING + GUIBoard.PADDING/2);
            }
        }

    }
}
