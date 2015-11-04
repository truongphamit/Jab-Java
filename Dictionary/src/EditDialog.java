import java.awt.HeadlessException;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class EditDialog extends JDialog{

	private static final long serialVersionUID = 1L;
	private Dictionary dict;
	private Word word;
	//Components
	private JPanel panel;
	private JLabel lbWord, lbResult;
	private TextField tfWord, tfResult;
	private JButton btn;
	
	public EditDialog(Dictionary dict, Word word) {
		this.setDict(dict);
		this.word = word;
		initComponents();
	}
	
	private void initComponents() {
		setTitle("Sửa");
		panel = new JPanel();
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        panel.setLayout(null);
        
        lbWord= new JLabel("Từ");
        lbWord.setBounds(10, 11, 54, 14);
        panel.add(lbWord);
        
        tfWord = new TextField(word.getWord(),20);
        tfWord.setBounds(74, 8, 195, 20);
        panel.add(tfWord);
        
        lbResult = new JLabel("Nghĩa");
        lbResult.setBounds(10, 42, 46, 14);
        panel.add(lbResult);
        
        tfResult = new TextField(word.getResult(), 20);
        tfResult.setBounds(74, 39, 195,20);
        panel.add(tfResult);
        
        btn = new JButton("Xong");
        btn.setBounds(184, 75, 89, 23);
        panel.add(btn);
        btn.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				if (tfWord.getText().isEmpty() || tfResult.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Không được để trống!");
					return;
				}
				try {
					if (dict.edit(word, new Word(tfWord.getText(), tfResult.getText()))) {
						JOptionPane.showMessageDialog(null, "Đã sửa!");
						dispose();
					} else {
						JOptionPane.showMessageDialog(null, "Có lỗi xảy ra!");
					}
				} catch (HeadlessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
        
        add(panel);
        setSize(300, 150);
        setLocationRelativeTo(null);
        setVisible(true);
	}

	public Dictionary getDict() {
		return dict;
	}

	public void setDict(Dictionary dict) {
		this.dict = dict;
	}
}
