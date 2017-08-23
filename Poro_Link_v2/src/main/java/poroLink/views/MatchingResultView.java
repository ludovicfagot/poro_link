//coucou
package poroLink.views;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.GridBagLayout;

import javax.swing.JTextField;

import poroLink.views.usercontrols.MenuBar;

import java.awt.Font;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import java.awt.Color;

public class MatchingResultView extends BaseView {
	private JTextField textField;
	
	private JTextArea textAreaSkills;
	/**
	 * @return the btnValidate
	 */




	private MenuBar menuBar;
	private JLabel lblSkillsDuPoste;
	private JLabel lblCanditatsEtSkills;
	private JTextArea textAreaCanditate;
	private JLabel lblRsultatDeLa;
	private JLabel lblPodium;
	private JLabel lblemePlace;
	private JLabel lblemePlace_1;
	private JLabel lblerPlace;
	private JLabel lblCandidat1;
	private JLabel lblCandidat2;
	private JLabel lblCandidat3;
	private JPanel panel_1;
	private JPanel panel_2;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	

	/**
	 * @return the textAreaSkills
	 */
	public JTextArea getTextAreaSkills() {
		return textAreaSkills;
	}

	/**
	 * @param textAreaSkills the textAreaSkills to set
	 */
	public void setTextAreaSkills(JTextArea textAreaSkills) {
		this.textAreaSkills = textAreaSkills;
	}

	/**
	 * @return the menuBar
	 */
	public MenuBar getMenuBar() {
		return menuBar;
	}

	/**
	 * @return the textField
	 */
	public JTextField getTextField() {
		return textField;
	}

	/**
	 * @param textField the textField to set
	 */
	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	/**
	 * @param menuBar the menuBar to set
	 */
	public void setMenuBar(MenuBar menuBar) {
		this.menuBar = menuBar;
	}

	/**
	 * Create the frame.
	 */
	public MatchingResultView(JFrame frame) {
		super.pageName = "Résultat de la recherche";
		JPanel panel = new JPanel();
		super.contentPane = panel;

		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{74, 648, 79, 0};
		gbl_panel.rowHeights = new int[]{598, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		/*
		menuBar = new MenuBar();
		GridBagConstraints gbc_menuBar = new GridBagConstraints();
		gbc_menuBar.fill = GridBagConstraints.HORIZONTAL;
		gbc_menuBar.gridx = 0;
		gbc_menuBar.gridy = 0;
		gbc_menuBar.gridwidth = 10;
		panel.add(menuBar.getContentPane(), gbc_menuBar);
		*/
				
				panel_2 = new JPanel();
				panel_2.setOpaque(false);
				GridBagConstraints gbc_panel_2 = new GridBagConstraints();
				gbc_panel_2.insets = new Insets(0, 0, 0, 5);
				gbc_panel_2.fill = GridBagConstraints.BOTH;
				gbc_panel_2.gridx = 1;
				gbc_panel_2.gridy = 0;
				panel.add(panel_2, gbc_panel_2);
				GridBagLayout gbl_panel_2 = new GridBagLayout();
				gbl_panel_2.columnWidths = new int[]{0, 468, 0};
				gbl_panel_2.rowHeights = new int[]{0, 0, 27, 0, 104, 0};
				gbl_panel_2.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
				gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
				panel_2.setLayout(gbl_panel_2);
				
				lblRsultatDeLa = new JLabel("fddd");
				lblRsultatDeLa.setForeground(Color.WHITE);
				GridBagConstraints gbc_lblRsultatDeLa = new GridBagConstraints();
				gbc_lblRsultatDeLa.gridheight = 2;
				gbc_lblRsultatDeLa.gridwidth = 2;
				gbc_lblRsultatDeLa.insets = new Insets(0, 0, 5, 0);
				gbc_lblRsultatDeLa.gridx = 0;
				gbc_lblRsultatDeLa.gridy = 0;
				panel_2.add(lblRsultatDeLa, gbc_lblRsultatDeLa);
				lblRsultatDeLa.setFont(new Font("Arial", Font.PLAIN, 18));
		
		panel_1 = new JPanel();
		panel_1.setOpaque(false);
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridwidth = 2;
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 2;
		panel_2.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{43, 201, 21, 138, 30, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		lblemePlace = new JLabel("");
		GridBagConstraints gbc_lblemePlace = new GridBagConstraints();
		gbc_lblemePlace.insets = new Insets(0, 0, 5, 5);
		gbc_lblemePlace.gridx = 1;
		gbc_lblemePlace.gridy = 0;
		panel_1.add(lblemePlace, gbc_lblemePlace);
		lblemePlace.setIcon(new ImageIcon("D:\\Biblioth\u00E8ques\\Documents\\POEC\\Projet\\Eclipse\\git\\Poro_Link_v2\\Pictures\\Candidate\\3.png"));
		
		lblerPlace = new JLabel("");
		GridBagConstraints gbc_lblerPlace = new GridBagConstraints();
		gbc_lblerPlace.insets = new Insets(0, 0, 5, 5);
		gbc_lblerPlace.gridx = 3;
		gbc_lblerPlace.gridy = 0;
		panel_1.add(lblerPlace, gbc_lblerPlace);
		lblerPlace.setIcon(new ImageIcon("D:\\Biblioth\u00E8ques\\Documents\\POEC\\Projet\\Eclipse\\git\\Poro_Link_v2\\Pictures\\Candidate\\1.png"));
		
		lblemePlace_1 = new JLabel("");
		GridBagConstraints gbc_lblemePlace_1 = new GridBagConstraints();
		gbc_lblemePlace_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblemePlace_1.gridx = 5;
		gbc_lblemePlace_1.gridy = 0;
		panel_1.add(lblemePlace_1, gbc_lblemePlace_1);
		lblemePlace_1.setIcon(new ImageIcon("D:\\Biblioth\u00E8ques\\Documents\\POEC\\Projet\\Eclipse\\git\\Poro_Link_v2\\Pictures\\Candidate\\2.png"));
		
		lblCandidat2 = new JLabel("candidat2");
		lblCandidat2.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblCandidat2 = new GridBagConstraints();
		gbc_lblCandidat2.insets = new Insets(0, 0, 5, 5);
		gbc_lblCandidat2.gridx = 1;
		gbc_lblCandidat2.gridy = 1;
		panel_1.add(lblCandidat2, gbc_lblCandidat2);
		
		lblCandidat1 = new JLabel("candidat1");
		lblCandidat1.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblCandidat1 = new GridBagConstraints();
		gbc_lblCandidat1.insets = new Insets(0, 0, 5, 5);
		gbc_lblCandidat1.gridx = 3;
		gbc_lblCandidat1.gridy = 1;
		panel_1.add(lblCandidat1, gbc_lblCandidat1);
		
		lblCandidat3 = new JLabel("candidat3");
		lblCandidat3.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblCandidat3 = new GridBagConstraints();
		gbc_lblCandidat3.insets = new Insets(0, 0, 5, 0);
		gbc_lblCandidat3.gridx = 5;
		gbc_lblCandidat3.gridy = 1;
		panel_1.add(lblCandidat3, gbc_lblCandidat3);
		
		lblPodium = new JLabel("");
		GridBagConstraints gbc_lblPodium = new GridBagConstraints();
		gbc_lblPodium.gridwidth = 5;
		gbc_lblPodium.insets = new Insets(0, 0, 0, 5);
		gbc_lblPodium.gridx = 1;
		gbc_lblPodium.gridy = 2;
		panel_1.add(lblPodium, gbc_lblPodium);
		lblPodium.setIcon(new ImageIcon("D:\\Biblioth\u00E8ques\\Documents\\POEC\\Projet\\Eclipse\\git\\Poro_Link_v2\\Pictures\\podium.png"));
		
		lblSkillsDuPoste = new JLabel("Skills du poste");
		lblSkillsDuPoste.setForeground(Color.WHITE);
		lblSkillsDuPoste.setFont(new Font("Arial", Font.PLAIN, 16));
		GridBagConstraints gbc_lblSkillsDuPoste = new GridBagConstraints();
		gbc_lblSkillsDuPoste.insets = new Insets(0, 0, 5, 5);
		gbc_lblSkillsDuPoste.gridx = 0;
		gbc_lblSkillsDuPoste.gridy = 3;
		panel_2.add(lblSkillsDuPoste, gbc_lblSkillsDuPoste);
		
		lblCanditatsEtSkills = new JLabel("Canditats et skills");
		lblCanditatsEtSkills.setForeground(Color.WHITE);
		lblCanditatsEtSkills.setFont(new Font("Arial", Font.PLAIN, 16));
		GridBagConstraints gbc_lblCanditatsEtSkills = new GridBagConstraints();
		gbc_lblCanditatsEtSkills.insets = new Insets(0, 0, 5, 0);
		gbc_lblCanditatsEtSkills.gridx = 1;
		gbc_lblCanditatsEtSkills.gridy = 3;
		panel_2.add(lblCanditatsEtSkills, gbc_lblCanditatsEtSkills);
		lblCanditatsEtSkills.setLabelFor(textAreaSkills);
		
		scrollPane_1 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.insets = new Insets(0, 0, 0, 5);
		gbc_scrollPane_1.gridx = 0;
		gbc_scrollPane_1.gridy = 4;
		panel_2.add(scrollPane_1, gbc_scrollPane_1);
		
		textAreaSkills = new JTextArea();
		scrollPane_1.setViewportView(textAreaSkills);
		
		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 4;
		panel_2.add(scrollPane, gbc_scrollPane);
		
		textAreaCanditate = new JTextArea();
		scrollPane.setViewportView(textAreaCanditate);
	}

	/**
	 * @return the lblRsultatDeLa
	 */
	public JLabel getLblRsultatDeLa() {
		return lblRsultatDeLa;
	}

	/**
	 * @param lblRsultatDeLa the lblRsultatDeLa to set
	 */
	public void setLblRsultatDeLa(JLabel lblRsultatDeLa) {
		this.lblRsultatDeLa = lblRsultatDeLa;
	}

	/**
	 * @return the textAreaCanditate
	 */
	public JTextArea getTextAreaCanditate() {
		return textAreaCanditate;
	}

	/**
	 * @param textAreaCanditate the textAreaCanditate to set
	 */
	public void setTextAreaCanditate(JTextArea textAreaCanditate) {
		this.textAreaCanditate = textAreaCanditate;
	}
}
