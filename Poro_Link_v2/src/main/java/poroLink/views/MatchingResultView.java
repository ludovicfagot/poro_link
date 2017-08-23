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
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 27, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 1.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
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
				
				lblRsultatDeLa = new JLabel("fddd");
				lblRsultatDeLa.setFont(new Font("Arial", Font.PLAIN, 18));
				
				GridBagConstraints gbc_lblRsultatDeLa = new GridBagConstraints();
				gbc_lblRsultatDeLa.gridwidth = 7;
				gbc_lblRsultatDeLa.insets = new Insets(0, 0, 5, 5);
				gbc_lblRsultatDeLa.gridx = 1;
				gbc_lblRsultatDeLa.gridy = 0;
				panel.add(lblRsultatDeLa, gbc_lblRsultatDeLa);
				
				lblemePlace = new JLabel("");
				lblemePlace.setIcon(new ImageIcon("C:\\Users\\ludov\\eclipse-workspace\\gitporo\\Poro_Link_v2\\Pictures\\Candidate\\3.png"));
				GridBagConstraints gbc_lblemePlace = new GridBagConstraints();
				gbc_lblemePlace.insets = new Insets(0, 0, 5, 5);
				gbc_lblemePlace.gridx = 4;
				gbc_lblemePlace.gridy = 1;
				panel.add(lblemePlace, gbc_lblemePlace);
				
				lblerPlace = new JLabel("");
				lblerPlace.setIcon(new ImageIcon("C:\\Users\\ludov\\eclipse-workspace\\gitporo\\Poro_Link_v2\\Pictures\\Candidate\\1.png"));
				GridBagConstraints gbc_lblerPlace = new GridBagConstraints();
				gbc_lblerPlace.insets = new Insets(0, 0, 5, 5);
				gbc_lblerPlace.gridx = 5;
				gbc_lblerPlace.gridy = 1;
				panel.add(lblerPlace, gbc_lblerPlace);
		
		lblemePlace_1 = new JLabel("");
		lblemePlace_1.setIcon(new ImageIcon("C:\\Users\\ludov\\eclipse-workspace\\gitporo\\Poro_Link_v2\\Pictures\\Candidate\\2.png"));
		GridBagConstraints gbc_lblemePlace_1 = new GridBagConstraints();
		gbc_lblemePlace_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblemePlace_1.gridx = 6;
		gbc_lblemePlace_1.gridy = 1;
		panel.add(lblemePlace_1, gbc_lblemePlace_1);
		
		lblCandidat2 = new JLabel("candidat2");
		GridBagConstraints gbc_lblCandidat2 = new GridBagConstraints();
		gbc_lblCandidat2.insets = new Insets(0, 0, 5, 5);
		gbc_lblCandidat2.gridx = 4;
		gbc_lblCandidat2.gridy = 3;
		panel.add(lblCandidat2, gbc_lblCandidat2);
		
		lblCandidat1 = new JLabel("candidat1");
		GridBagConstraints gbc_lblCandidat1 = new GridBagConstraints();
		gbc_lblCandidat1.insets = new Insets(0, 0, 5, 5);
		gbc_lblCandidat1.gridx = 5;
		gbc_lblCandidat1.gridy = 3;
		panel.add(lblCandidat1, gbc_lblCandidat1);
		
		lblCandidat3 = new JLabel("candidat2");
		GridBagConstraints gbc_lblCandidat3 = new GridBagConstraints();
		gbc_lblCandidat3.insets = new Insets(0, 0, 5, 5);
		gbc_lblCandidat3.gridx = 6;
		gbc_lblCandidat3.gridy = 3;
		panel.add(lblCandidat3, gbc_lblCandidat3);
		
		lblPodium = new JLabel("Podium");
		lblPodium.setIcon(new ImageIcon("C:\\Users\\ludov\\eclipse-workspace\\gitporo\\Poro_Link_v2\\Pictures\\podium.png"));
		GridBagConstraints gbc_lblPodium = new GridBagConstraints();
		gbc_lblPodium.gridwidth = 5;
		gbc_lblPodium.insets = new Insets(0, 0, 5, 5);
		gbc_lblPodium.gridx = 3;
		gbc_lblPodium.gridy = 6;
		panel.add(lblPodium, gbc_lblPodium);
		
		lblSkillsDuPoste = new JLabel("Skills du poste");
		GridBagConstraints gbc_lblSkillsDuPoste = new GridBagConstraints();
		gbc_lblSkillsDuPoste.insets = new Insets(0, 0, 5, 5);
		gbc_lblSkillsDuPoste.gridx = 1;
		gbc_lblSkillsDuPoste.gridy = 7;
		panel.add(lblSkillsDuPoste, gbc_lblSkillsDuPoste);
		
		lblCanditatsEtSkills = new JLabel("Canditats et skills");
		GridBagConstraints gbc_lblCanditatsEtSkills = new GridBagConstraints();
		gbc_lblCanditatsEtSkills.insets = new Insets(0, 0, 5, 5);
		gbc_lblCanditatsEtSkills.gridx = 3;
		gbc_lblCanditatsEtSkills.gridy = 7;
		panel.add(lblCanditatsEtSkills, gbc_lblCanditatsEtSkills);
		
		textAreaSkills = new JTextArea();
		lblCanditatsEtSkills.setLabelFor(textAreaSkills);
		GridBagConstraints gbc_textAreaSkills = new GridBagConstraints();
		gbc_textAreaSkills.insets = new Insets(0, 0, 0, 5);
		gbc_textAreaSkills.fill = GridBagConstraints.BOTH;
		gbc_textAreaSkills.gridx = 1;
		gbc_textAreaSkills.gridy = 8;
		panel.add(textAreaSkills, gbc_textAreaSkills);
		
		textAreaCanditate = new JTextArea();
		GridBagConstraints gbc_textAreaCanditate = new GridBagConstraints();
		gbc_textAreaCanditate.insets = new Insets(0, 0, 0, 5);
		gbc_textAreaCanditate.fill = GridBagConstraints.BOTH;
		gbc_textAreaCanditate.gridx = 3;
		gbc_textAreaCanditate.gridy = 8;
		panel.add(textAreaCanditate, gbc_textAreaCanditate);
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
