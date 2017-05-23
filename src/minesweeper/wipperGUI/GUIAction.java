package minesweeper.wipperGUI;

import minesweeper.BaseAction;
import minesweeper.SaperLogic;
import minesweeper.GeneratorBoard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by User on 15.05.2017.
 */
public class GUIAction extends BaseAction implements ActionListener, MouseListener {
    private GUIBoard board;

    public GUIAction(SaperLogic logic, GUIBoard board, GeneratorBoard generator) {
        super(logic, board, generator);
        this.board = board;
        this.board.addMouseListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        this.initGame();
    }

    public void mouseClicked(MouseEvent e) {

        int x = e.getX() / GUIBoard.PADDING;
        int y = e.getY() / GUIBoard.PADDING;

        if (e.getButton()==1){
            if (board.cells[x][y].isBomb()){
                board.drawBang();
            }
        }else if (e.getButton()==3){
            board.cells[x][y].suggestEmpty();
        }else if (e.getButton()==2){
            board.cells[x][y].suggestBomb();
        }

        this.board.drawCell(x, y);
        board.repaint();
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }
}
