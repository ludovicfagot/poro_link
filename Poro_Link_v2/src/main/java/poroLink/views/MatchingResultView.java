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
import javax.swing.SwingConstants;

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
		gbl_panel.columnWidths = new int[]{0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
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
				gbc_lblRsultatDeLa.gridwidth = 2;
				gbc_lblRsultatDeLa.insets = new Insets(0, 0, 5, 0);
				gbc_lblRsultatDeLa.gridx = 0;
				gbc_lblRsultatDeLa.gridy = 0;
				panel.add(lblRsultatDeLa, gbc_lblRsultatDeLa);
				
				panel_1 = new JPanel();
				GridBagConstraints gbc_panel_1 = new GridBagConstraints();
				gbc_panel_1.fill = GridBagConstraints.BOTH;
				gbc_panel_1.insets = new Insets(0, 0, 5, 0);
				gbc_panel_1.gridx = 1;
				gbc_panel_1.gridy = 1;
				panel.add(panel_1, gbc_panel_1);
				GridBagLayout gbl_panel_1 = new GridBagLayout();
				gbl_panel_1.columnWidths = new int[]{0, 0, 0};
				gbl_panel_1.rowHeights = new int[]{0, 312, 0, 0};
				gbl_panel_1.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
				gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
				panel_1.setLayout(gbl_panel_1);
				
				panel_2 = new JPanel();
				GridBagConstraints gbc_panel_2 = new GridBagConstraints();
				gbc_panel_2.fill = GridBagConstraints.BOTH;
				gbc_panel_2.insets = new Insets(0, 0, 5, 0);
				gbc_panel_2.gridx = 1;
				gbc_panel_2.gridy = 1;
				panel_1.add(panel_2, gbc_panel_2);
				GridBagLayout gbl_panel_2 = new GridBagLayout();
				gbl_panel_2.columnWidths = new int[]{0, 262, 0, 0};
				gbl_panel_2.rowHeights = new int[]{0, 0, 0};
				gbl_panel_2.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
				gbl_panel_2.rowWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
				panel_2.setLayout(gbl_panel_2);
				
				lblemePlace = new JLabel("");
				lblemePlace.setHorizontalTextPosition(SwingConstants.LEFT);
				lblemePlace.setHorizontalAlignment(SwingConstants.LEFT);
				GridBagConstraints gbc_lblemePlace = new GridBagConstraints();
				gbc_lblemePlace.insets = new Insets(0, 0, 5, 5);
				gbc_lblemePlace.gridx = 0;
				gbc_lblemePlace.gridy = 0;
				panel_2.add(lblemePlace, gbc_lblemePlace);
				lblemePlace.setIcon(new ImageIcon("C:\\Users\\ludov\\eclipse-workspace\\gitporo\\Poro_Link_v2\\Pictures\\Candidate\\3.png"));
				
				lblerPlace = new JLabel("");
				GridBagConstraints gbc_lblerPlace = new GridBagConstraints();
				gbc_lblerPlace.insets = new Insets(0, 0, 5, 5);
				gbc_lblerPlace.gridx = 1;
				gbc_lblerPlace.gridy = 0;
				panel_2.add(lblerPlace, gbc_lblerPlace);
				lblerPlace.setIcon(new ImageIcon("C:\\Users\\ludov\\eclipse-workspace\\gitporo\\Poro_Link_v2\\Pictures\\Candidate\\1.png"));
		
		lblemePlace_1 = new JLabel("");
		GridBagConstraints gbc_lblemePlace_1 = new GridBagConstraints();
		gbc_lblemePlace_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblemePlace_1.gridx = 2;
		gbc_lblemePlace_1.gridy = 0;
		panel_2.add(lblemePlace_1, gbc_lblemePlace_1);
		lblemePlace_1.setHorizontalTextPosition(SwingConstants.LEFT);
		lblemePlace_1.setIcon(new ImageIcon("C:\\Users\\ludov\\eclipse-workspace\\gitporo\\Poro_Link_v2\\Pictures\\Candidate\\2.png"));
		
		lblCandidat2 = new JLabel("candidat2");
		GridBagConstraints gbc_lblCandidat2 = new GridBagConstraints();
		gbc_lblCandidat2.insets = new Insets(0, 0, 0, 5);
		gbc_lblCandidat2.gridx = 0;
		gbc_lblCandidat2.gridy = 1;
		panel_2.add(lblCandidat2, gbc_lblCandidat2);
		
		lblCandidat1 = new JLabel("candidat1");
		GridBagConstraints gbc_lblCandidat1 = new GridBagConstraints();
		gbc_lblCandidat1.insets = new Insets(0, 0, 0, 5);
		gbc_lblCandidat1.gridx = 1;
		gbc_lblCandidat1.gridy = 1;
		panel_2.add(lblCandidat1, gbc_lblCandidat1);
		
		lblCandidat3 = new JLabel("candidat2");
		GridBagConstraints gbc_lblCandidat3 = new GridBagConstraints();
		gbc_lblCandidat3.gridx = 2;
		gbc_lblCandidat3.gridy = 1;
		panel_2.add(lblCandidat3, gbc_lblCandidat3);
		
		lblPodium = new JLabel("");
		lblPodium.setHorizontalAlignment(SwingConstants.LEFT);
		lblPodium.setHorizontalTextPosition(SwingConstants.LEFT);
		GridBagConstraints gbc_lblPodium = new GridBagConstraints();
		gbc_lblPodium.gridwidth = 2;
		gbc_lblPodium.gridx = 0;
		gbc_lblPodium.gridy = 2;
		panel_1.add(lblPodium, gbc_lblPodium);
		lblPodium.setIcon(new ImageIcon("C:\\Users\\ludov\\eclipse-workspace\\gitporo\\Poro_Link_v2\\Pictures\\podium.png"));
		
		lblSkillsDuPoste = new JLabel("Skills du poste");
		GridBagConstraints gbc_lblSkillsDuPoste = new GridBagConstraints();
		gbc_lblSkillsDuPoste.insets = new Insets(0, 0, 5, 5);
		gbc_lblSkillsDuPoste.gridx = 0;
		gbc_lblSkillsDuPoste.gridy = 2;
		panel.add(lblSkillsDuPoste, gbc_lblSkillsDuPoste);
		
		lblCanditatsEtSkills = new JLabel("Canditats et skills");
		GridBagConstraints gbc_lblCanditatsEtSkills = new GridBagConstraints();
		gbc_lblCanditatsEtSkills.insets = new Insets(0, 0, 5, 0);
		gbc_lblCanditatsEtSkills.gridx = 1;
		gbc_lblCanditatsEtSkills.gridy = 2;
		panel.add(lblCanditatsEtSkills, gbc_lblCanditatsEtSkills);
		
		textAreaSkills = new JTextArea();
		lblCanditatsEtSkills.setLabelFor(textAreaSkills);
		GridBagConstraints gbc_textAreaSkills = new GridBagConstraints();
		gbc_textAreaSkills.insets = new Insets(0, 0, 0, 5);
		gbc_textAreaSkills.fill = GridBagConstraints.BOTH;
		gbc_textAreaSkills.gridx = 0;
		gbc_textAreaSkills.gridy = 3;
		panel.add(textAreaSkills, gbc_textAreaSkills);
		
		textAreaCanditate = new JTextArea();
		GridBagConstraints gbc_textAreaCanditate = new GridBagConstraints();
		gbc_textAreaCanditate.fill = GridBagConstraints.BOTH;
		gbc_textAreaCanditate.gridx = 1;
		gbc_textAreaCanditate.gridy = 3;
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
