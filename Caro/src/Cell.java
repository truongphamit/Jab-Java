import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Cell extends JButton {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Board board;
	private char state;

	public Cell(final Board board) {
		state = ' ';
		setText(state + "");
		addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (state == ' ') {
					setState(Caro.turn);
					if (Caro.turn == 'X') {
						Caro.turn = 'O';
					} else {
						Caro.turn = 'X';
					}
					board.getStatus().setText(Caro.turn + " turn");
				}
				if (board.isWin('X')) {
					JOptionPane.showMessageDialog(new JFrame(), "X win");
					board.clearBoard();
				}
				if (board.isWin('O')) {
					JOptionPane.showMessageDialog(new JFrame(), "O win");
					board.clearBoard();
				}
				if (board.isFull()) {
					JOptionPane.showMessageDialog(new JFrame(), "Full");
					board.clearBoard();
				}
			}
		});
	}

	public char getState() {
		return state;
	}

	public void setState(char state) {
		this.state = state;
		setText(this.state + "");
	}

}
