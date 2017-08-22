package poroLink.views;

import java.awt.EventQueue;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JMenuBar;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Point;
import java.awt.Insets;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Rectangle;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Dimension;
import javax.swing.border.LineBorder;

import poroLink.utils.views.ViewUtils;

import java.awt.Panel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JFormattedTextField;

public class ProfileCandidateView {

	private JPanel contentPane;
	private JTextField txtNomCandidat;
	private JTextField txtTlphone;
	private JTextField txtAdresseMail;
	private JTextField txtLienSiteInternet;
	private JTextField txtProfilLinkedin;
	private JTextField txtListeDeComptences;
	private JList skillList;

	/**
	 * @return the contentPane
	 */
	public JPanel getContentPane() {
		return contentPane;
	}


	/**
	 * @param contentPane the contentPane to set
	 */
	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}


	/**
	 * @return the txtNomCandidat
	 */
	public JTextField getTxtNomCandidat() {
		return txtNomCandidat;
	}


	/**
	 * @param txtNomCandidat the txtNomCandidat to set
	 */
	public void setTxtNomCandidat(JTextField txtNomCandidat) {
		this.txtNomCandidat = txtNomCandidat;
	}


	/**
	 * @return the txtTlphone
	 */
	public JTextField getTxtTlphone() {
		return txtTlphone;
	}


	/**
	 * @param txtTlphone the txtTlphone to set
	 */
	public void setTxtTlphone(JTextField txtTlphone) {
		this.txtTlphone = txtTlphone;
	}


	/**
	 * @return the txtAdresseMail
	 */
	public JTextField getTxtAdresseMail() {
		return txtAdresseMail;
	}


	/**
	 * @param txtAdresseMail the txtAdresseMail to set
	 */
	public void setTxtAdresseMail(JTextField txtAdresseMail) {
		this.txtAdresseMail = txtAdresseMail;
	}


	/**
	 * @return the txtLienSiteInternet
	 */
	public JTextField getTxtLienSiteInternet() {
		return txtLienSiteInternet;
	}


	/**
	 * @param txtLienSiteInternet the txtLienSiteInternet to set
	 */
	public void setTxtLienSiteInternet(JTextField txtLienSiteInternet) {
		this.txtLienSiteInternet = txtLienSiteInternet;
	}


	/**
	 * @return the txtProfilLinkedin
	 */
	public JTextField getTxtProfilLinkedin() {
		return txtProfilLinkedin;
	}


	/**
	 * @param txtProfilLinkedin the txtProfilLinkedin to set
	 */
	public void setTxtProfilLinkedin(JTextField txtProfilLinkedin) {
		this.txtProfilLinkedin = txtProfilLinkedin;
	}


	/**
	 * @return the txtListeDeComptences
	 */
	public JTextField getTxtListeDeComptences() {
		return txtListeDeComptences;
	}


	/**
	 * @param txtListeDeComptences the txtListeDeComptences to set
	 */
	public void setTxtListeDeComptences(JTextField txtListeDeComptences) {
		this.txtListeDeComptences = txtListeDeComptences;
	}


	/**
	 * @return the skillList
	 */
	public JList getSkillList() {
		return skillList;
	}


	/**
	 * @param skillList the skillList to set
	 */
	public void setSkillList(JList skillList) {
		this.skillList = skillList;
	}


	public ProfileCandidateView(JFrame frame) {
		/*
		contentPane = new JPanel();
		JMenuBar menuBar = new JMenuBar();
		ViewsUtils.configureJFrame(frame, contentPane, menuBar);
		
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{32, 205, 67, 38, 36, 42, 195, 36, 0};
		gbl_contentPane.rowHeights = new int[]{1, 41, 0, -7, 31, 26, 110, 0, 60, 149, 97, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBorder(new LineBorder(new Color(51, 102, 153), 1, true));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Minet\\Downloads\\20864450_10214162450926257_2019830956_n.png"));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridheight = 4;
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		Box verticalBox = Box.createVerticalBox();
		verticalBox.setBorder(new LineBorder(new Color(51, 102, 153), 1, true));
		GridBagConstraints gbc_verticalBox = new GridBagConstraints();
		gbc_verticalBox.gridheight = 4;
		gbc_verticalBox.insets = new Insets(0, 0, 5, 5);
		gbc_verticalBox.gridx = 2;
		gbc_verticalBox.gridy = 1;
		contentPane.add(verticalBox, gbc_verticalBox);
		
		txtNomCandidat = new JTextField();
		txtNomCandidat.setBorder(new LineBorder(new Color(51, 102, 153), 1, true));
		txtNomCandidat.setMinimumSize(new Dimension(100, 20));
		txtNomCandidat.setCaretColor(SystemColor.control);
		txtNomCandidat.setEditable(false);
		txtNomCandidat.setText("Nom Candidat");
		verticalBox.add(txtNomCandidat);
		txtNomCandidat.setColumns(10);
		
		txtTlphone = new JTextField();
		txtTlphone.setBorder(new LineBorder(new Color(51, 102, 153), 1, true));
		txtTlphone.setCaretColor(SystemColor.control);
		txtTlphone.setEditable(false);
		txtTlphone.setText("T\u00E9l\u00E9phone");
		verticalBox.add(txtTlphone);
		txtTlphone.setColumns(10);
		
		txtAdresseMail = new JTextField();
		txtAdresseMail.setBorder(new LineBorder(new Color(51, 102, 153), 1, true));
		txtAdresseMail.setCaretColor(SystemColor.control);
		txtAdresseMail.setEditable(false);
		txtAdresseMail.setText("Adresse mail");
		verticalBox.add(txtAdresseMail);
		txtAdresseMail.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("Modifi\u00E9");
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_3.gridx = 3;
		gbc_btnNewButton_3.gridy = 1;
		contentPane.add(btnNewButton_3, gbc_btnNewButton_3);
		
		JButton button = new JButton("Modifi\u00E9");
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 5, 0);
		gbc_button.gridx = 7;
		gbc_button.gridy = 1;
		contentPane.add(button, gbc_button);
		
		Box verticalBox_1 = Box.createVerticalBox();
		verticalBox_1.setBorder(new LineBorder(new Color(51, 102, 153), 1, true));
		GridBagConstraints gbc_verticalBox_1 = new GridBagConstraints();
		gbc_verticalBox_1.gridheight = 4;
		gbc_verticalBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_verticalBox_1.gridx = 6;
		gbc_verticalBox_1.gridy = 1;
		contentPane.add(verticalBox_1, gbc_verticalBox_1);
		
		txtLienSiteInternet = new JTextField();
		txtLienSiteInternet.setBorder(new LineBorder(new Color(51, 102, 153), 1, true));
		txtLienSiteInternet.setMinimumSize(new Dimension(100, 20));
		txtLienSiteInternet.setCaretColor(SystemColor.control);
		txtLienSiteInternet.setEditable(false);
		txtLienSiteInternet.setText("Lien site internet");
		verticalBox_1.add(txtLienSiteInternet);
		txtLienSiteInternet.setColumns(10);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		verticalBox_1.add(verticalStrut_1);
		
		txtProfilLinkedin = new JTextField();
		txtProfilLinkedin.setBorder(new LineBorder(new Color(51, 102, 153), 1, true));
		txtProfilLinkedin.setCaretColor(SystemColor.control);
		txtProfilLinkedin.setEditable(false);
		txtProfilLinkedin.setText("profil Linkedin");
		verticalBox_1.add(txtProfilLinkedin);
		txtProfilLinkedin.setColumns(10);
		
		JButton button_1 = new JButton("Modifi\u00E9");
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.insets = new Insets(0, 0, 5, 0);
		gbc_button_1.gridx = 7;
		gbc_button_1.gridy = 4;
		contentPane.add(button_1, gbc_button_1);
		
		JTextArea txtrDescription = new JTextArea();
		txtrDescription.setBorder(new LineBorder(new Color(51, 102, 153), 1, true));
		txtrDescription.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtrDescription.setText("Description");
		GridBagConstraints gbc_txtrDescription = new GridBagConstraints();
		gbc_txtrDescription.gridheight = 2;
		gbc_txtrDescription.gridwidth = 6;
		gbc_txtrDescription.insets = new Insets(0, 0, 5, 5);
		gbc_txtrDescription.fill = GridBagConstraints.BOTH;
		gbc_txtrDescription.gridx = 1;
		gbc_txtrDescription.gridy = 5;
		contentPane.add(txtrDescription, gbc_txtrDescription);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(51, 102, 153), 1, true));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridheight = 3;
		gbc_panel.gridwidth = 2;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 7;
		contentPane.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] {311, 0};
		gbl_panel.rowHeights = new int[] {3, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		txtListeDeComptences = new JTextField();
		txtListeDeComptences.setEditable(false);
		txtListeDeComptences.setBorder(new LineBorder(new Color(51, 102, 153), 1, true));
		txtListeDeComptences.setText("Liste de comp\u00E9tences");
		GridBagConstraints gbc_txtListeDeComptences = new GridBagConstraints();
		gbc_txtListeDeComptences.insets = new Insets(0, 0, 5, 0);
		gbc_txtListeDeComptences.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtListeDeComptences.gridx = 0;
		gbc_txtListeDeComptences.gridy = 0;
		panel.add(txtListeDeComptences, gbc_txtListeDeComptences);
		txtListeDeComptences.setColumns(10);
		
		skillList = new JList();
		skillList.setBorder(new LineBorder(new Color(51, 102, 153), 1, true));
		skillList.setVisibleRowCount(7);
		skillList.setModel(new AbstractListModel() {
			String[] values = new String[] {"Comp\u00E9tence 1", "Comp\u00E9tence 2", "Comp\u00E9tence 3", "Comp\u00E9tence 4", "Comp\u00E9tence 5", "Comp\u00E9tence 6", "Comp\u00E9tence 7", ""};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		skillList.setToolTipText("");
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 0;
		gbc_list.gridy = 1;
		panel.add(skillList, gbc_list);
		
		JButton button_3 = new JButton("Modifi\u00E9");
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.insets = new Insets(0, 0, 5, 5);
		gbc_button_3.gridx = 3;
		gbc_button_3.gridy = 7;
		contentPane.add(button_3, gbc_button_3);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridheight = 3;
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.gridwidth = 2;
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 5;
		gbc_panel_1.gridy = 7;
		contentPane.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{125, 140, 0};
		gbl_panel_1.rowHeights = new int[]{33, 51, 0, 55, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("Dipl\u00F4me en cours");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 0;
		panel_1.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JList list_1 = new JList();
		list_1.setModel(new AbstractListModel() {
			String[] values = new String[] {"Concepteur logiciel"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		GridBagConstraints gbc_list_1 = new GridBagConstraints();
		gbc_list_1.gridwidth = 2;
		gbc_list_1.insets = new Insets(0, 0, 5, 0);
		gbc_list_1.fill = GridBagConstraints.BOTH;
		gbc_list_1.gridx = 0;
		gbc_list_1.gridy = 1;
		panel_1.add(list_1, gbc_list_1);
		
		JLabel lblNewLabel_2 = new JLabel("Dipl\u00F4mes");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		panel_1.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JList list_2 = new JList();
		list_2.setModel(new AbstractListModel() {
			String[] values = new String[] {"BAC", "Licence de glandouille", "BAFA"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		GridBagConstraints gbc_list_2 = new GridBagConstraints();
		gbc_list_2.gridwidth = 2;
		gbc_list_2.insets = new Insets(0, 0, 0, 5);
		gbc_list_2.fill = GridBagConstraints.BOTH;
		gbc_list_2.gridx = 0;
		gbc_list_2.gridy = 3;
		panel_1.add(list_2, gbc_list_2);
		
		JButton button_2 = new JButton("Modifi\u00E9");
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.insets = new Insets(0, 0, 5, 0);
		gbc_button_2.gridx = 7;
		gbc_button_2.gridy = 7;
		contentPane.add(button_2, gbc_button_2);
		*/
	}
	

}
