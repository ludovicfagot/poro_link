package poroLink.utils.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;

public class ViewUtils {
	
	/**
	 * Allow to configure all screens of application with default size values and frame will be set to the center of the screen
	 * @param contentPane 
	 * @param jFrame 
	 * 
	 */
	public static void configureJFrame(JFrame jFrame, JPanel contentPane/*, JMenuBar menuBar*/) {

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.setBackground(new Color(28, 85, 136));
		jFrame.setContentPane(contentPane);
		
/*
		menuBar.setBackground(SystemColor.control);
		menuBar.setBorder(null);
		menuBar.setBorderPainted(false);
		jFrame.setJMenuBar(menuBar);
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(SystemColor.control);
		btnNewButton.setIcon(new ImageIcon("Pictures/logomini.png"));
		menuBar.add(btnNewButton);
		
		JSeparator separator = new JSeparator();
		separator.setOpaque(true);
		separator.setBackground(SystemColor.control);
		menuBar.add(separator);
		
		JButton btnNewButton_1 = new JButton("Liste des utilisateurs");
		btnNewButton_1.setAutoscrolls(true);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setForeground(SystemColor.textText);
		btnNewButton_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton_1.setBounds(new Rectangle(60, 60, 60, 60));
		btnNewButton_1.setBackground(SystemColor.control);
		menuBar.add(btnNewButton_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOpaque(true);
		separator_1.setBackground(SystemColor.control);
		menuBar.add(separator_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBackground(SystemColor.control);
		menuBar.add(btnNewButton_2);
	*/}
	
	public static void configureFirstJFrame (JFrame frame){
		
		int frameWidth = 800;
		int frameHeight = 600;
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int screenWidth = (int) screenSize.getWidth();
		int screenHeight = (int) screenSize.getHeight();
		int screenMiddleWidth = (screenWidth / 2) - (frameWidth / 2);
		int screenMiddleHeight = (screenHeight / 2) - (frameHeight / 2);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(screenMiddleWidth, screenMiddleHeight, frameWidth, frameHeight);
		
	}
}
