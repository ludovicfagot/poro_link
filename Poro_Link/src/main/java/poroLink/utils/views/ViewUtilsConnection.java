package poroLink.utils.views;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ViewUtilsConnection {
	
	/**
	 * Allow to configure all screens of application with default size values and frame will be set to the center of the screen
	 * @param contentPane 
	 * @param jFrame 
	 * 
	 */
	public static void configureJFrame(JFrame jFrame, JPanel contentPane) {
		int frameWitdth = 800;
		int frameHeight = 600;
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int screenWidth = (int) screenSize.getWidth();
		int screenHeight = (int) screenSize.getHeight();
		
		int screenMiddleWidth =(screenWidth/2)-(frameWitdth/2) ;
		int screenMiddleHeight = (screenHeight/2) - (frameHeight/2);
		
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setBounds(screenMiddleWidth, screenMiddleHeight, frameWitdth, frameHeight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		jFrame.setContentPane(contentPane);
		contentPane.setBackground(new java.awt.Color(28, 85, 136));
	}

}
