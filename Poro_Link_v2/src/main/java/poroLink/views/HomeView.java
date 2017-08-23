package poroLink.views;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.GridBagLayout;

import javax.swing.JTextField;

import poroLink.views.usercontrols.MenuBar;

import java.awt.Font;
import java.awt.GridBagConstraints;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomeView extends BaseView {
	private JLabel lblNewLabel;
	/**
	 * @return the lblNewLabel_1
	 */
	public JLabel getLblNewLabel_1() {
		return lblNewLabel_1;
	}

	/**
	 * @param lblNewLabel_1 the lblNewLabel_1 to set
	 */
	public void setLblNewLabel_1(JLabel lblNewLabel_1) {
		this.lblNewLabel_1 = lblNewLabel_1;
	}

	private JButton btnValidate;
	private JLabel lblNewLabel_1;
	private JButton btnRechercherUnCandidat;
	/**
	 * @return the btnValidate
	 */
	public JButton getBtnValidate() {
		return btnValidate;
	}

	/**
	 * @param btnValidate the btnValidate to set
	 */
	public void setBtnValidate(JButton btnValidate) {
		this.btnValidate = btnValidate;
	}

	



	/**
	 * @return the lblNewLabel
	 */
	public JLabel getLblNewLabel() {
		return lblNewLabel;
	}

	/**
	 * @param lblNewLabel the lblNewLabel to set
	 */
	public void setLblNewLabel(JLabel lblNewLabel) {
		this.lblNewLabel = lblNewLabel;
	}

	/**
	 * @param menuBar the menuBar to set


	/**
	 * Create the frame.
	 */
	public HomeView(JFrame frame) {
		super.pageName = "Home";
		JPanel panel = new JPanel();
		super.contentPane = panel;
		
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{49, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{67, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
				lblNewLabel = new JLabel();
				lblNewLabel.setBorder(null);
				GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
				gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel.gridx = 1;
				gbc_lblNewLabel.gridy = 1;
				//lblNewLabel.setIcon(new ImageIcon("Pictures/Candidate/1.png"));
				panel.add(lblNewLabel, gbc_lblNewLabel);
				
				lblNewLabel_1 = new JLabel("New label");
				lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 18));
				GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
				gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel_1.gridx = 1;
				gbc_lblNewLabel_1.gridy = 2;
				panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
				
				btnRechercherUnCandidat = new JButton("Rechercher un candidat");
				GridBagConstraints gbc_btnRechercherUnCandidat = new GridBagConstraints();
				gbc_btnRechercherUnCandidat.insets = new Insets(0, 0, 0, 5);
				gbc_btnRechercherUnCandidat.gridx = 1;
				gbc_btnRechercherUnCandidat.gridy = 4;
				panel.add(btnRechercherUnCandidat, gbc_btnRechercherUnCandidat);
	}

	/**
	 * @return the btnRechercherUnCandidat
	 */
	public JButton getBtnRechercherUnCandidat() {
		return btnRechercherUnCandidat;
	}

	/**
	 * @param btnRechercherUnCandidat the btnRechercherUnCandidat to set
	 */
	public void setBtnRechercherUnCandidat(JButton btnRechercherUnCandidat) {
		this.btnRechercherUnCandidat = btnRechercherUnCandidat;
	}
}
