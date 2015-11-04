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

public class NewDialog extends JDialog{

	private static final long serialVersionUID = 1L;
	private Dictionary dict;
	//Components
	private JPanel panel;
	private JLabel lbWord, lbResult;
	private TextField tfWord, tfResult;
	private JButton btn;
	
	public NewDialog(Dictionary dict) {
		this.setDict(dict);
		initComponents();
	}
	
	private void initComponents() {
		setTitle("Thêm mới");
		panel = new JPanel();
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        panel.setLayout(null);
        
        lbWord= new JLabel("Từ");
        lbWord.setBounds(10, 11, 54, 14);
        panel.add(lbWord);
        
        tfWord = new TextField(20);
        tfWord.setBounds(74, 8, 195, 20);
        panel.add(tfWord);
        
        lbResult = new JLabel("Nghĩa");
        lbResult.setBounds(10, 42, 46, 14);
        panel.add(lbResult);
        
        tfResult = new TextField(20);
        tfResult.setBounds(74, 39, 195,20);
        panel.add(tfResult);
        
        btn = new JButton("Thêm");
        btn.setBounds(184, 75, 89, 23);
        panel.add(btn);
        btn.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				if (tfWord.getText().isEmpty() || tfResult.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Không được để trống!");
					return;
				}
				Word word = new Word(tfWord.getText(), "<html>@" + tfWord.getText() + "<br> -" + tfResult.getText() + "</html>");
				try {
					if (dict.add(word)) {
						JOptionPane.showMessageDialog(null, "Thêm thành công!");
						dispose();
					} else {
						JOptionPane.showMessageDialog(null, "Đã tồn tại!");
					}
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
