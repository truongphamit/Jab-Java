
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

public class UserInterface extends JFrame {
	private static final long serialVersionUID = 1L;
	
	// Components
	private javax.swing.JButton btnTranslate;
	private javax.swing.JScrollPane jScrollPaneResult;
	private javax.swing.JMenuBar mainMenuBar;
	private javax.swing.JMenu menuFile;
	private javax.swing.JMenuItem itemNew;
	private javax.swing.JMenuItem itemEdit;
	private javax.swing.JMenuItem itemExit;
	private javax.swing.JLabel lbResult;
	private javax.swing.ButtonGroup rdGroup;
	private javax.swing.JRadioButton rdbEV;
	private javax.swing.JRadioButton rdbVE;
	private javax.swing.JTextField tfInput;
	// End Components
	
	private static final String evPath = "dictd_anh-viet.txt";
	private static final String vepath = "dictd_viet-anh.txt";
	private Dictionary evDict;
	private Dictionary veDict;

	public UserInterface(String title) throws IOException {
		super(title);
		evDict = new Dictionary(evPath);
		veDict = new Dictionary(vepath);
		initComponents();
	}

	private void initComponents() {
		rdGroup = new ButtonGroup();
		tfInput = new JTextField();
		btnTranslate = new JButton();
		lbResult = new JLabel("", SwingConstants.CENTER);
		jScrollPaneResult = new JScrollPane();
		rdbEV = new JRadioButton();
		rdbVE = new JRadioButton();
		mainMenuBar = new JMenuBar();
		menuFile = new JMenu();
		itemNew = new JMenuItem();
		itemEdit = new JMenuItem();
		itemExit = new JMenuItem();

		lbResult.setBorder(new EmptyBorder(5, 5, 5, 5));

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setSize(new java.awt.Dimension(800, 600));

		tfInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				tfInputActionPerformed(evt);
			}
		});

		btnTranslate.setText("Dịch");
		btnTranslate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnTranslateActionPerformed(evt);
			}
		});

		jScrollPaneResult.setViewportView(lbResult);
		rdGroup.add(rdbEV);
		rdbEV.setText("E-V");
		rdbEV.setSelected(true);
		rdbEV.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clear();
			}
		});

		rdGroup.add(rdbVE);
		rdbVE.setText("V-E");
		rdbVE.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clear();
			}
		});

		menuFile.setText("Tùy chọn");
		menuFile.add(itemNew);
		itemNew.setText("Thêm mới");
		itemNew.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				itemNewActionPerformed(evt);
			}
		});

		itemEdit.setText("Sửa");
		menuFile.add(itemEdit);
		itemEdit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				itemEditActionPerformed(evt);
			}
		});

		itemExit.setText("Thoát");
		menuFile.add(itemExit);
		itemExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		mainMenuBar.add(menuFile);
		setJMenuBar(mainMenuBar);

		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout
						.createParallelGroup(
								GroupLayout.Alignment.LEADING)
						.addGroup(
								layout.createSequentialGroup()
										.addComponent(tfInput, GroupLayout.PREFERRED_SIZE, 350,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18).addComponent(btnTranslate)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
										.addComponent(rdbEV).addGap(18, 18, 18).addComponent(rdbVE).addGap(46, 46, 46))
						.addGroup(layout.createSequentialGroup()
								.addComponent(jScrollPaneResult, GroupLayout.PREFERRED_SIZE, 596,
										GroupLayout.PREFERRED_SIZE)
										.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))));
		layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(tfInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(btnTranslate).addComponent(rdbEV).addComponent(rdbVE))
						.addGap(18, 18, 18)
						.addComponent(jScrollPaneResult, GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
						.addContainerGap()));
		pack();
	}

	private void tfInputActionPerformed(java.awt.event.ActionEvent evt) {
		translateAction();
	}

	private void btnTranslateActionPerformed(java.awt.event.ActionEvent evt) {
		translateAction();
	}

	private void itemEditActionPerformed(java.awt.event.ActionEvent evt) {
		if (rdbEV.isSelected()) {
			if (tfInput.getText().isEmpty() || lbResult.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Trống!");
				return;
			}
			new EditDialog(evDict, new Word(tfInput.getText(), lbResult.getText()));
		}
		if (rdbVE.isSelected()) {
			if (tfInput.getText().isEmpty() || lbResult.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Trống!");
				return;
			}
			new EditDialog(veDict, new Word(tfInput.getText(), lbResult.getText()));
		}
	}

	private void itemNewActionPerformed(java.awt.event.ActionEvent evt) {
		if (rdbEV.isSelected()) {
			new NewDialog(evDict);
		}
		if (rdbVE.isSelected()) {
			new NewDialog(veDict);
		}
	}

	private void clear() {
		tfInput.setText("");
		lbResult.setText("");
	}

	private void translateAction() {
		if (rdbEV.isSelected()) {
			lbResult.setText(findByEnglish(tfInput.getText()));
		}
		if (rdbVE.isSelected()) {
			lbResult.setText(findByVietnamese(tfInput.getText()));
		}
	}

	private String findByEnglish(String s) {
		for (Word n : evDict.getWords()) {
			if (n.getWord().equals(s)) {
				return n.getResult();
			}
		}
		return "Không tìm thấy";
	}

	private String findByVietnamese(String s) {
		for (Word n : veDict.getWords()) {
			if (n.getWord().equals(s)) {
				return n.getResult();
			}
		}
		return "Không tìm thấy";
	}

	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					UserInterface dict = new UserInterface("TDict");
					dict.setVisible(true);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
	}
}
