package poroLink;

import javax.swing.JFrame;

import poroLink.controllers.ConnectionController;

public class Launcher {

	public static void main(String[] args) {
		JFrame frame= new JFrame();
		new ConnectionController(frame);
	}
	
}
