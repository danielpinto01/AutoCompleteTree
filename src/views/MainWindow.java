package views;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import controllers.Controller;
import controllers.Events;
import models.Node;

public class MainWindow extends JFrame{

	private static final long serialVersionUID = 1L;
	private JTextField jTextField;
	private JButton btnAddWord;
	
	private JTree jTree;
	private DefaultTreeModel modelRoot;
	private DefaultMutableTreeNode model;
	private JScrollPane jsTree;
	
	
	public MainWindow(Controller controller) {
		setTitle("AutoCompleteAdd");
		getContentPane().setBackground(Color.WHITE);
		setExtendedState(MAXIMIZED_BOTH);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setIconImage(new ImageIcon("src/images/Icon.png").getImage());
		setLayout(new BorderLayout());

		init(controller);

		setVisible(true);
	}

	public void init(Controller controller) {
		jTextField = new JTextField(15);
		jTextField.setBorder(BorderFactory.createTitledBorder("Word"));
		add(jTextField, BorderLayout.NORTH);

		btnAddWord = new JButton("Add");
		btnAddWord.addActionListener(controller);
		btnAddWord.setActionCommand(Events.ADD_WORD.toString());
		add(btnAddWord, BorderLayout.SOUTH);
		
		model = new DefaultMutableTreeNode();
		modelRoot = new DefaultTreeModel(model);
		jTree = new JTree(modelRoot);
		jsTree = new JScrollPane(jTree);
		add(jsTree, BorderLayout.CENTER);
	}
	
	public String getTextWord(){
		return jTextField.getText();
	}
	
	public void paintTree(Node root) {
		DefaultMutableTreeNode uiRoot = new DefaultMutableTreeNode(root);
		modelRoot.setRoot(uiRoot);
		model.add(uiRoot);
		for (int i = 0; i < root.getNodes().size(); i++) {
			createNode(uiRoot, root.getNodes().get(i));
		}
		
		revalidate();
		repaint();
	}
	
	private void createNode(DefaultMutableTreeNode actual, Node node) {
		if (node != null) {
			DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(node);
			actual.add(newNode);
			for (int i = 0; i < node.getNodes().size(); i++) {
				createNode(newNode, node.getNodes().get(i));
			}
		}
	}
}
