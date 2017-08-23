package poroLink.views;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.GridBagLayout;

import javax.swing.JTextField;

import poroLink.utils.views.ViewUtils;
import poroLink.views.usercontrols.MenuBar;

import java.awt.Font;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class MatchingView extends BaseView {
	private JPanel contentPane;
	private JComboBox comboBoxPosts;
	private JButton btnValide;
	private JLabel lblNewLabel;
	
	/**
	 * @return the btnValide
	 */
	public JButton getBtnValide() {
		return btnValide;
	}


	/**
	 * @param btnValide the btnValide to set
	 */
	public void setBtnValide(JButton btnValide) {
		this.btnValide = btnValide;
	}


	/**
	 * @return the textField
	 */



	/**
	 * @param textField the textField to set
	 */


	/**
	 * @return the comboBoxPosts
	 */
	public JComboBox getComboBoxPosts() {
		return comboBoxPosts;
	}


	/**
	 * @param comboBoxPosts the comboBoxPosts to set
	 */
	public void setComboBoxPosts(JComboBox comboBoxPosts) {
		this.comboBoxPosts = comboBoxPosts;
	}

	
	
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
	 * @return the lblHello
	 */



	/**
	 * @param lblHello the lblHello to set
	 */

	
	public MatchingView(JFrame frame)  {
		super.pageName = "Matching";
		contentPane = new JPanel();


		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		lblNewLabel = new JLabel("Recherche de candidat pour le poste");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		comboBoxPosts = new JComboBox();
		GridBagConstraints gbc_comboBoxPosts = new GridBagConstraints();
		gbc_comboBoxPosts.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxPosts.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxPosts.gridx = 1;
		gbc_comboBoxPosts.gridy = 2;
		contentPane.add(comboBoxPosts, gbc_comboBoxPosts);
		
		btnValide = new JButton("OK");

		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 2;
		contentPane.add(btnValide, gbc_btnNewButton);
		
	}
}
