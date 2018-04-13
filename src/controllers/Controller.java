package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import models.Tree;
import views.MainWindow;

public class Controller implements ActionListener {
	
	private MainWindow mainWindow;
	private Tree tree;

	public Controller() {
		mainWindow = new MainWindow(this);
		tree = new Tree();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		switch (Events.valueOf(e.getActionCommand())) {
		case ADD_WORD:
			tree.addToTree(mainWindow.getTextWord(), tree.getRootTree());
			break;
		}
		mainWindow.paintTree(tree.getRootTree());
	}	
}