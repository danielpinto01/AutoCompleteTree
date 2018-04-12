package views;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MainWindow extends JFrame{

	private static final long serialVersionUID = 1L;
	private JTextField jTextField;
	private JButton btnAddWord;

	public MainWindow() {
		setTitle("AutoCompleteAdd");
		getContentPane().setBackground(Color.WHITE);
		setExtendedState(MAXIMIZED_BOTH);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setIconImage(new ImageIcon("src/images/Icon.png").getImage());
		setLayout(new BorderLayout());

		init();
		
		setVisible(true);
	}

	public void init() {
		jTextField = new JTextField(15);
		jTextField.setBorder(BorderFactory.createTitledBorder("Word"));
		add(jTextField, BorderLayout.NORTH);
		
		btnAddWord = new JButton("Add");
		add(btnAddWord, BorderLayout.SOUTH);
	}
}
