package poroLink.views;


import javax.swing.JFrame;
import javax.swing.JPanel;

import poroLink.utils.views.ViewUtils;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JPasswordField;

public class ConnectionView  extends BaseView {
	
	private JPanel contentPane;
	private JPanel logoPoro;
	private ImageIcon icon;
	private JLabel img;
	private JPanel logoImie;
	private ImageIcon icon2;
	private JLabel img2;
	private JLabel punchline;
	private JLabel mailLabel;
	private JTextField mailText;
	private JPasswordField pwd;
	private JLabel pwdLabel;
	private JButton btnConnection;
	private JButton btnRegistration;
	private JLabel forgottenPwdLabel;
	private JLabel failLabel;
	
	/*
	public JPanel getContentPane() {
		return contentPane;
	}
	*/

	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}

	public JPanel getLogoPoro() {
		return logoPoro;
	}

	public void setLogoPoro(JPanel logoPoro) {
		this.logoPoro = logoPoro;
	}

	public ImageIcon getIcon() {
		return icon;
	}

	public void setIcon(ImageIcon icon) {
		this.icon = icon;
	}

	public JLabel getImg() {
		return img;
	}

	public void setImg(JLabel img) {
		this.img = img;
	}

	public JPanel getLogoImie() {
		return logoImie;
	}

	public void setLogoImie(JPanel logoImie) {
		this.logoImie = logoImie;
	}

	public ImageIcon getIcon2() {
		return icon2;
	}

	public void setIcon2(ImageIcon icon2) {
		this.icon2 = icon2;
	}

	public JLabel getImg2() {
		return img2;
	}

	public void setImg2(JLabel img2) {
		this.img2 = img2;
	}

	public JLabel getPunchline() {
		return punchline;
	}

	public void setPunchline(JLabel punchline) {
		this.punchline = punchline;
	}

	public JLabel getMailLabel() {
		return mailLabel;
	}

	public void setMailLabel(JLabel mailLabel) {
		this.mailLabel = mailLabel;
	}

	public JTextField getMailText() {
		return mailText;
	}

	public void setMailText(JTextField mailText) {
		this.mailText = mailText;
	}

	public JPasswordField getPwd() {
		return pwd;
	}

	public void setPwd(JPasswordField pwd) {
		this.pwd = pwd;
	}

	public JLabel getPwdLabel() {
		return pwdLabel;
	}

	public void setPwdLabel(JLabel pwdLabel) {
		this.pwdLabel = pwdLabel;
	}

	public JButton getBtnConnection() {
		return btnConnection;
	}

	public void setBtnConnection(JButton btnConnection) {
		this.btnConnection = btnConnection;
	}

	public JButton getBtnRegistration() {
		return btnRegistration;
	}

	public void setBtnRegistration(JButton btnRegistration) {
		this.btnRegistration = btnRegistration;
	}

	public JLabel getForgottenPwdLabel() {
		return forgottenPwdLabel;
	}

	public void setForgottenPwdLabel(JLabel forgottenPwdLabel) {
		this.forgottenPwdLabel = forgottenPwdLabel;
	}

	public JLabel getFailLabel() {
		return failLabel;
	}

	public void setFailLabel(JLabel failLabel) {
		this.failLabel = failLabel;
	}

	/**
	 * Create the frame.
	 */
	public ConnectionView(JFrame frame) {

		super.pageName = "Connection";
		JPanel panel = new JPanel();
		super.contentPane = panel;
		
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{30, 30, 30, 30, 30, 30, 30, 30, 13, 30, 30, 14, 30, 0, 30, 0, 30, 22, 0, 0, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30};
		gbl_contentPane.rowHeights = new int[]{30, 30, 30, 30, 30, 30, 30, 30, 61, 30, 30, 30, 30, 30};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_contentPane);
		
		JPanel connectionPanel = new JPanel();
		connectionPanel.setBackground(new java.awt.Color(245, 243, 245, 150));
		GridBagConstraints gbc_PanelConnection = new GridBagConstraints();
		gbc_PanelConnection.insets = new Insets(0, 0, 5, 5);
		gbc_PanelConnection.fill = GridBagConstraints.BOTH;
		gbc_PanelConnection.gridx = 8;
		gbc_PanelConnection.gridy = 4;
		gbc_PanelConnection.gridwidth = 13;
		gbc_PanelConnection.gridheight = 4;
		panel.add(connectionPanel, gbc_PanelConnection);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{30, 30, 0, 30, 55, 30, 30, 91, 30, 30, 30};
		gbl_panel.rowHeights = new int[]{30, 30, 30, 30, 30, 30, 30, 0, 30, 30};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		connectionPanel.setLayout(gbl_panel);
		
		failLabel = new JLabel("Informations non valides !");
		failLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		failLabel.setForeground(Color.RED);
		failLabel.setVisible(false);
		GridBagConstraints gbc_FailLabel = new GridBagConstraints();
		gbc_FailLabel.insets = new Insets(0, 0, 5, 5);
		gbc_FailLabel.gridx = 4;
		gbc_FailLabel.gridy = 0;
		gbc_FailLabel.gridwidth = 4;
		connectionPanel.add(failLabel, gbc_FailLabel);
		
		mailLabel = new JLabel("Adresse mail :");
		mailLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		GridBagConstraints gbc_MailLabel = new GridBagConstraints();
		gbc_MailLabel.anchor = GridBagConstraints.EAST;
		gbc_MailLabel.insets = new Insets(0, 0, 5, 5);
		gbc_MailLabel.gridx = 4;
		gbc_MailLabel.gridy = 2;
		connectionPanel.add(mailLabel, gbc_MailLabel);
		
		mailText = new JTextField();
		mailText.setFont(new Font("Arial", Font.PLAIN, 18));
		GridBagConstraints gbc_MailText = new GridBagConstraints();
		gbc_MailText.insets = new Insets(0, 0, 5, 5);
		gbc_MailText.fill = GridBagConstraints.HORIZONTAL;
		gbc_MailText.gridx = 5;
		gbc_MailText.gridy = 2;
		gbc_MailText.gridwidth = 3;
		connectionPanel.add(mailText, gbc_MailText);
		mailText.setColumns(10);
		
		pwdLabel = new JLabel("Mot de passe :");
		pwdLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		GridBagConstraints gbc_PwdLabel = new GridBagConstraints();
		gbc_PwdLabel.anchor = GridBagConstraints.EAST;
		gbc_PwdLabel.insets = new Insets(0, 0, 5, 5);
		gbc_PwdLabel.gridx = 4;
		gbc_PwdLabel.gridy = 3;
		connectionPanel.add(pwdLabel, gbc_PwdLabel);
		
		pwd = new JPasswordField();
		pwd.setFont(new Font("Arial", Font.PLAIN, 18));
		GridBagConstraints gbc_Pwd = new GridBagConstraints();
		gbc_Pwd.insets = new Insets(0, 0, 5, 5);
		gbc_Pwd.fill = GridBagConstraints.HORIZONTAL;
		gbc_Pwd.gridx = 5;
		gbc_Pwd.gridy = 3;
		gbc_Pwd.gridwidth = 3;
		connectionPanel.add(pwd, gbc_Pwd);
		
		btnConnection = new JButton();
		btnConnection.setIcon(new ImageIcon("Pictures/connectionButton.png"));
		GridBagConstraints gbc_BtnConnection = new GridBagConstraints();
		gbc_BtnConnection.insets = new Insets(0, 0, 5, 5);
		gbc_BtnConnection.gridx = 4;
		gbc_BtnConnection.gridy = 5;
		gbc_BtnConnection.gridwidth = 4;
		btnConnection.setBorder(null);
		btnConnection.setContentAreaFilled(false);
		btnConnection.setRolloverEnabled(false);
		btnConnection.setCursor(new Cursor(Cursor.HAND_CURSOR));
		connectionPanel.add(btnConnection, gbc_BtnConnection);
		
		forgottenPwdLabel = new JLabel("Mot de passe oublié ?");
		forgottenPwdLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		forgottenPwdLabel.setForeground(new java.awt.Color(28, 85, 136));
		forgottenPwdLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
		GridBagConstraints gbc_ForgottenPwdLabel = new GridBagConstraints();
		gbc_ForgottenPwdLabel.insets = new Insets(0, 0, 5, 5);
		gbc_ForgottenPwdLabel.gridx = 4;
		gbc_ForgottenPwdLabel.gridy = 7;
		gbc_ForgottenPwdLabel.gridwidth = 4;
		connectionPanel.add(forgottenPwdLabel, gbc_ForgottenPwdLabel);
		
		btnRegistration = new JButton();
		btnRegistration.setIcon(new ImageIcon("Pictures/registrationButton.png"));
		GridBagConstraints gbc_BtnRegistration = new GridBagConstraints();
		gbc_BtnRegistration.insets = new Insets(0, 0, 5, 5);
		gbc_BtnRegistration.gridx = 15;
		gbc_BtnRegistration.gridy = 8;
		btnRegistration.setBorder(null);
		btnRegistration.setContentAreaFilled(false);
		btnRegistration.setRolloverEnabled(false);
		btnRegistration.setCursor(new Cursor(Cursor.HAND_CURSOR));
		panel.add( btnRegistration, gbc_BtnRegistration);
		
	}

}

