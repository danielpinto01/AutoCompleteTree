package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import views.MainWindow;

public class Controller implements ActionListener {
	
	private MainWindow mainWindow;

	public Controller() {
		mainWindow = new MainWindow();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	}	
}