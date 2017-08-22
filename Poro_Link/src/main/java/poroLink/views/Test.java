package poroLink.views;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;

public class Test extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test frame = new Test();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.BLACK);
		setContentPane(contentPane);
		
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{30, 30, 30, 30, 30, 30, 30, 30, 13, 30, 30, 0, 14, 30, 162, 0, 30, 22, 0, 0, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30};
		gbl_contentPane.rowHeights = new int[]{30, 30, 30, 30, 30, 30, 30, 30, 61, 30, 30, 30, 30, 30};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\Biblioth\u00E8ques\\Documents\\POEC\\Projet\\Eclipse\\Poro_Link\\Pictures\\logomini.png"));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 4;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JSeparator separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.gridwidth = 4;
		gbc_separator.gridheight = 2;
		gbc_separator.insets = new Insets(0, 0, 5, 5);
		gbc_separator.gridx = 14;
		gbc_separator.gridy = 1;
		contentPane.add(separator, gbc_separator);
		
		JPanel connectionPanel = new JPanel();
		connectionPanel.setBackground(new java.awt.Color(245, 243, 245, 150));
		GridBagConstraints gbc_PanelConnection = new GridBagConstraints();
		gbc_PanelConnection.insets = new Insets(0, 0, 5, 5);
		gbc_PanelConnection.fill = GridBagConstraints.BOTH;
		gbc_PanelConnection.gridx = 11;
		gbc_PanelConnection.gridy = 4;
		gbc_PanelConnection.gridwidth = 8;
		gbc_PanelConnection.gridheight = 4;
		gbc_PanelConnection.weightx=1;
		gbc_PanelConnection.weighty=1;
		contentPane.add(connectionPanel, gbc_PanelConnection);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{117, 55, 30, 30, 91, 88};
		gbl_panel.rowHeights = new int[]{30, 30, 30, 30, 30, 30, 30, 0, 30, 30};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		connectionPanel.setLayout(gbl_panel);
		
		JLabel failLabel = new JLabel("Informations non valides !");
		failLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		failLabel.setForeground(Color.RED);
		failLabel.setVisible(false);
		GridBagConstraints gbc_FailLabel = new GridBagConstraints();
		gbc_FailLabel.insets = new Insets(0, 0, 5, 5);
		gbc_FailLabel.gridx = 1;
		gbc_FailLabel.gridy = 0;
		gbc_FailLabel.gridwidth = 4;
		connectionPanel.add(failLabel, gbc_FailLabel);
		
		JLabel mailLabel = new JLabel("Adresse mail :");
		mailLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		GridBagConstraints gbc_MailLabel = new GridBagConstraints();
		gbc_MailLabel.anchor = GridBagConstraints.EAST;
		gbc_MailLabel.insets = new Insets(0, 0, 5, 5);
		gbc_MailLabel.gridx = 1;
		gbc_MailLabel.gridy = 2;
		connectionPanel.add(mailLabel, gbc_MailLabel);
		
		JTextField mailText = new JTextField();
		mailText.setFont(new Font("Arial", Font.PLAIN, 18));
		GridBagConstraints gbc_MailText = new GridBagConstraints();
		gbc_MailText.insets = new Insets(0, 0, 5, 5);
		gbc_MailText.fill = GridBagConstraints.HORIZONTAL;
		gbc_MailText.gridx = 2;
		gbc_MailText.gridy = 2;
		gbc_MailText.gridwidth = 3;
		connectionPanel.add(mailText, gbc_MailText);
		mailText.setColumns(10);
		
		JLabel pwdLabel = new JLabel("Mot de passe :");
		pwdLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		GridBagConstraints gbc_PwdLabel = new GridBagConstraints();
		gbc_PwdLabel.anchor = GridBagConstraints.EAST;
		gbc_PwdLabel.insets = new Insets(0, 0, 5, 5);
		gbc_PwdLabel.gridx = 1;
		gbc_PwdLabel.gridy = 3;
		connectionPanel.add(pwdLabel, gbc_PwdLabel);
		
		JPasswordField pwd = new JPasswordField();
		pwd.setFont(new Font("Arial", Font.PLAIN, 18));
		GridBagConstraints gbc_Pwd = new GridBagConstraints();
		gbc_Pwd.insets = new Insets(0, 0, 5, 5);
		gbc_Pwd.fill = GridBagConstraints.HORIZONTAL;
		gbc_Pwd.gridx = 2;
		gbc_Pwd.gridy = 3;
		gbc_Pwd.gridwidth = 3;
		connectionPanel.add(pwd, gbc_Pwd);
		
		JButton btnConnection = new JButton();
		btnConnection.setIcon(new ImageIcon("D:\\Biblioth\u00E8ques\\Documents\\POEC\\Projet\\Eclipse\\Poro_Link\\Pictures\\connectionButton.png"));
		GridBagConstraints gbc_BtnConnection = new GridBagConstraints();
		gbc_BtnConnection.insets = new Insets(0, 0, 5, 5);
		gbc_BtnConnection.gridx = 1;
		gbc_BtnConnection.gridy = 5;
		gbc_BtnConnection.gridwidth = 4;
		btnConnection.setBorder(null);
		btnConnection.setContentAreaFilled(false);
		btnConnection.setRolloverEnabled(false);
		btnConnection.setCursor(new Cursor(Cursor.HAND_CURSOR));
		connectionPanel.add(btnConnection, gbc_BtnConnection);
		
		JLabel forgottenPwdLabel = new JLabel("Mot de passe oublié ?");
		forgottenPwdLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		forgottenPwdLabel.setForeground(new java.awt.Color(28, 85, 136));
		forgottenPwdLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
		GridBagConstraints gbc_ForgottenPwdLabel = new GridBagConstraints();
		gbc_ForgottenPwdLabel.insets = new Insets(0, 0, 5, 5);
		gbc_ForgottenPwdLabel.gridx = 1;
		gbc_ForgottenPwdLabel.gridy = 7;
		gbc_ForgottenPwdLabel.gridwidth = 4;
		connectionPanel.add(forgottenPwdLabel, gbc_ForgottenPwdLabel);
		
		JButton btnRegistration = new JButton();
		btnRegistration.setIcon(new ImageIcon("D:\\Biblioth\u00E8ques\\Documents\\POEC\\Projet\\Eclipse\\Poro_Link\\Pictures\\registrationButton.png"));
		GridBagConstraints gbc_BtnRegistration = new GridBagConstraints();
		gbc_BtnRegistration.anchor = GridBagConstraints.WEST;
		gbc_BtnRegistration.insets = new Insets(0, 0, 5, 5);
		gbc_BtnRegistration.gridx = 14;
		gbc_BtnRegistration.gridy = 8;
		btnRegistration.setBorder(null);
		btnRegistration.setContentAreaFilled(false);
		btnRegistration.setRolloverEnabled(false);
		btnRegistration.setCursor(new Cursor(Cursor.HAND_CURSOR));
		contentPane.add( btnRegistration, gbc_BtnRegistration);
	}
}
