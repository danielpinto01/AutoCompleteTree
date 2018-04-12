package views;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MainWindow extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	public MainWindow() {
		setTitle("AutoCompleteAdd");
		getContentPane().setBackground(Color.WHITE);
		setExtendedState(MAXIMIZED_BOTH);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setIconImage(new ImageIcon("src/images/Icon.png").getImage());
		setLayout(new BorderLayout());

		setVisible(true);
	}
}
