import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class Board extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Cell[][] board = new Cell[3][3];
	JLabel status;

	public Board() {
		setTitle("Caro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setLayout(new GridLayout(4, 3, 0, 0));
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = new Cell(this);
				add(board[i][j]);
			}
		}
		status = new JLabel(Caro.turn + " turn");
		add(status, BorderLayout.CENTER);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public JLabel getStatus() {
		return status;
	}

	public void setStatus(JLabel status) {
		this.status = status;
	}

	public Cell getPosition(int row, int column) {
		return board[row][column];
	}

	public void setPosition(int row, int column, char state) {
		board[row][column].setState(state);
	}

	public boolean checkRows(char state) {
		for (int i = 0; i < 3; i++) {
			if (board[i][0].getState() == state && board[i][1].getState() == state && board[i][2].getState() == state)
				return true;
		}
		return false;
	}

	public boolean checkColumns(char state) {
		for (int i = 0; i < 3; i++) {
			if (board[0][i].getState() == state && board[1][i].getState() == state && board[2][i].getState() == state)
				return true;
		}
		return false;
	}

	public boolean checkDiagonal(char state) {
		if (board[0][0].getState() == state && board[1][1].getState() == state && board[2][2].getState() == state)
			return true;
		if (board[2][0].getState() == state && board[1][1].getState() == state && board[0][2].getState() == state)
			return true;
		return false;
	}

	public boolean isWin(char state) {
		if (checkRows(state))
			return true;
		if (checkColumns(state))
			return true;
		if (checkDiagonal(state))
			return true;
		return false;
	}

	public void clearBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j].setState(' ');
			}
		}
	}
	
	public boolean isFull() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j].getState() == ' ') return false;
			}
		}
		return true;
	}
}
