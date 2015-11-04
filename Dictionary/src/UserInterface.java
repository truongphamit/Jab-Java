
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class UserInterface extends JFrame {
	
	private static final long serialVersionUID = 1L;
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
		rdGroup = new javax.swing.ButtonGroup();
		tfInput = new javax.swing.JTextField();
		btnTranslate = new javax.swing.JButton();
		lbResult = new javax.swing.JLabel("",SwingConstants.CENTER);
		jScrollPaneResult = new javax.swing.JScrollPane();
		rdbEV = new javax.swing.JRadioButton();
		rdbVE = new javax.swing.JRadioButton();
		mainMenuBar = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        itemNew = new javax.swing.JMenuItem();
        itemEdit = new javax.swing.JMenuItem();

        lbResult.setBorder(new EmptyBorder(5, 5, 5, 5));
        
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setSize(new java.awt.Dimension(800, 600));

		tfInput.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				tfInputActionPerformed(evt);
			}
		});

		btnTranslate.setText("Dịch");
		btnTranslate.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnTranslateActionPerformed(evt);
			}
		});
		
		jScrollPaneResult.setViewportView(lbResult);
		rdGroup.add(rdbEV);
		rdbEV.setText("E-V");
		rdbEV.setSelected(true);

		rdGroup.add(rdbVE);
		rdbVE.setText("V-E");
		
		menuFile.setText("Tùy chọn");
		menuFile.add(itemNew);
        itemNew.setText("Thêm mới");
        itemNew.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				itemNewActionPerformed(evt);
			}
		});
        itemEdit.setText("Sửa");
        menuFile.add(itemEdit);
        itemEdit.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				itemEditActionPerformed(evt);
			}
		});
        
        mainMenuBar.add(menuFile);
        setJMenuBar(mainMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfInput, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTranslate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(rdbEV)
                        .addGap(18, 18, 18)
                        .addComponent(rdbVE)
                        .addGap(46, 46, 46))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPaneResult, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTranslate)
                    .addComponent(rdbEV)
                    .addComponent(rdbVE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneResult, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                .addContainerGap())
        );

		pack();
	}

	private void tfInputActionPerformed(java.awt.event.ActionEvent evt) {
		translateAction();
	}

	private void btnTranslateActionPerformed(java.awt.event.ActionEvent evt) {
		translateAction();
	}
	
	// Dialog add new word
	private void itemNewActionPerformed(java.awt.event.ActionEvent evt){
		if (rdbEV.isSelected()) {
			new NewDialog(evDict);
		}
		if (rdbVE.isSelected()) {
			new NewDialog(veDict);
		}
	}
	
	private void itemEditActionPerformed(java.awt.event.ActionEvent evt){
		if (rdbEV.isSelected()) {
			new EditDialog(evDict, new Word(tfInput.getText(), lbResult.getText()));
		}
		if (rdbVE.isSelected()) {
			new EditDialog(veDict, new Word(tfInput.getText(), lbResult.getText()));
		}
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
	
	//Main
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					UserInterface dict;
					dict = new UserInterface("TDict");
					dict.setVisible(true);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	//Components
	private javax.swing.JButton btnTranslate;
	private javax.swing.JScrollPane jScrollPaneResult;
    private javax.swing.JMenuBar mainMenuBar;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenuItem itemNew;
    private javax.swing.JMenuItem itemEdit;
	private javax.swing.JLabel lbResult;
	private javax.swing.ButtonGroup rdGroup;
	private javax.swing.JRadioButton rdbEV;
	private javax.swing.JRadioButton rdbVE;
	private javax.swing.JTextField tfInput;
	//End Components
}
