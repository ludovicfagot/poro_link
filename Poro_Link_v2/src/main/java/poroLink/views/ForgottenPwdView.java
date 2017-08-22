package poroLink.views;

import javax.swing.JFrame;
import javax.swing.JPanel;

import poroLink.utils.views.ViewUtils;

import java.awt.GridBagLayout;
import javax.swing.JTextArea;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;

public class ForgottenPwdView{

	private JPanel contentPane;
	private JTextArea indicationsTextArea;
	private JPanel returnPwdPanel;
	private JLabel mailLabel;
	private JTextField mailText;
	private JButton btnValidate;
	private JLabel failLabel;
	private JPanel panel;

	public JPanel getContentPane() {
		return contentPane;
	}

	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}

	public JTextArea getIndicationsTextArea() {
		return indicationsTextArea;
	}

	public void setIndicationsTextArea(JTextArea indicationsTextArea) {
		this.indicationsTextArea = indicationsTextArea;
	}

	public JPanel getReturnPwdPanel() {
		return returnPwdPanel;
	}

	public void setReturnPwdPanel(JPanel returnPwdPanel) {
		this.returnPwdPanel = returnPwdPanel;
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

	public JButton getBtnValidate() {
		return btnValidate;
	}

	public void setBtnValidate(JButton btnValidate) {
		this.btnValidate = btnValidate;
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
	public ForgottenPwdView(JFrame frame) {
		
		contentPane = new JPanel();
		ViewUtils.configureJFrame(frame, contentPane);
		
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{30};
		gbl_contentPane.rowHeights = new int[]{30};
		contentPane.setLayout(gbl_contentPane);
		
		panel = new JPanel();
		panel.setOpaque(false);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		contentPane.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{30, 30};
		gbl_panel.rowHeights = new int[]{30, 30, 82, 30, 30, 30};
		gbl_panel.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		panel.setLayout(gbl_panel);
		
		indicationsTextArea = new JTextArea();
		GridBagConstraints gbc_indicationsTextArea = new GridBagConstraints();
		gbc_indicationsTextArea.fill = GridBagConstraints.BOTH;
		gbc_indicationsTextArea.insets = new Insets(0, 0, 5, 0);
		gbc_indicationsTextArea.gridx = 0;
		gbc_indicationsTextArea.gridy = 0;
		panel.add(indicationsTextArea, gbc_indicationsTextArea);
		indicationsTextArea.setForeground(new java.awt.Color(245, 243, 245));
		indicationsTextArea.setOpaque(false);
		indicationsTextArea.setFont(new Font("Arial", Font.PLAIN, 18));
		indicationsTextArea.setText("Veuillez renseigner votre adresse mail,\r\nun nouveau mot de passe vous sera envoy\u00E9.");
		
		returnPwdPanel = new JPanel();
		GridBagConstraints gbc_returnPwdPanel = new GridBagConstraints();
		gbc_returnPwdPanel.fill = GridBagConstraints.BOTH;
		gbc_returnPwdPanel.insets = new Insets(0, 0, 5, 0);
		gbc_returnPwdPanel.gridx = 0;
		gbc_returnPwdPanel.gridy = 2;
		panel.add(returnPwdPanel, gbc_returnPwdPanel);
		returnPwdPanel.setBackground(new java.awt.Color(245, 243, 245, 150));
		GridBagLayout gbl_returnPwdPanel = new GridBagLayout();
		gbl_returnPwdPanel.columnWidths = new int[]{30, 30, 30, 129, 30};
		gbl_returnPwdPanel.rowHeights = new int[]{30, 30, 30};
		gbl_returnPwdPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0};
		gbl_returnPwdPanel.rowWeights = new double[]{0.0, 0.0, 0.0};
		returnPwdPanel.setLayout(gbl_returnPwdPanel);
		
		failLabel = new JLabel("Cette adresse mail est inconnue !");
		GridBagConstraints gbc_failLabel = new GridBagConstraints();
		gbc_failLabel.gridwidth = 5;
		gbc_failLabel.insets = new Insets(0, 0, 5, 5);
		gbc_failLabel.gridx = 0;
		gbc_failLabel.gridy = 0;
		returnPwdPanel.add(failLabel, gbc_failLabel);
		failLabel.setForeground(Color.RED);
		failLabel.setVisible(false);
		failLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		
		mailLabel = new JLabel("Adresse mail :");
		mailLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		GridBagConstraints gbc_mailLabel = new GridBagConstraints();
		gbc_mailLabel.anchor = GridBagConstraints.EAST;
		gbc_mailLabel.insets = new Insets(0, 0, 5, 5);
		gbc_mailLabel.gridx = 2;
		gbc_mailLabel.gridy = 1;
		returnPwdPanel.add(mailLabel, gbc_mailLabel);
		
		mailText = new JTextField();
		mailText.setFont(new Font("Arial", Font.PLAIN, 18));
		GridBagConstraints gbc_mailText = new GridBagConstraints();
		gbc_mailText.insets = new Insets(0, 0, 5, 5);
		gbc_mailText.fill = GridBagConstraints.HORIZONTAL;
		gbc_mailText.gridx = 3;
		gbc_mailText.gridy = 1;
		returnPwdPanel.add(mailText, gbc_mailText);
		mailText.setColumns(10);
		
		btnValidate = new JButton("Valider");
		GridBagConstraints gbc_btnValidate = new GridBagConstraints();
		gbc_btnValidate.insets = new Insets(0, 0, 5, 0);
		gbc_btnValidate.gridx = 0;
		gbc_btnValidate.gridy = 3;
		panel.add(btnValidate, gbc_btnValidate);
	}

}
