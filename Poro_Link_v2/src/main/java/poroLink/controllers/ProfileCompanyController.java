package poroLink.controllers;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.text.JTextComponent;

import poroLink.entities.Company;
import poroLink.entities.Post;
import poroLink.entities.Skill;
import poroLink.views.HomeView;
import poroLink.views.ProfileCompanyView;



/**
 * @author Minet
 *
 */
public class ProfileCompanyController extends BaseController{
	private ProfileCompanyView view;
	private Company user;
	private JFrame frame;

	public ProfileCompanyController(JFrame frame) {
		super.frame = frame;
		super.view = new ProfileCompanyView(this.frame);
		
		user = new Company(1,"rrr");

		/**
		 * Launch the application.
		 */
		Post poste1 = new Post(1, "dévellopeur java");
		Post poste2 = new Post(2, "Chef de projet java");
		poste1.setFirstname_agent("Jean-Louieon");
		poste1.setLastname_agent("Dupond");
		poste1.setMail_agent("jeanlouieondupond@yahoo.fr");
		poste2.setFirstname_agent("Thérèson");
		poste2.setLastname_agent("Dupont");
		poste2.setMail_agent("theresondupont@yahoo.fr");

		Skill java = new Skill(1, "java", 5, 0);
		Skill c = new Skill(2, "C", 3, 0);
		Skill php = new Skill(3, "PhP", 2, 0);
		Skill sql = new Skill(4, "SQL", 4, 0);
		Skill git = new Skill(5, "Git", 4, 0);
		ArrayList<Skill> skills1 = new ArrayList<Skill>();
		ArrayList<Skill> skills2 = new ArrayList<Skill>();
		skills1.add(c);
		skills1.add(sql);
		skills1.add(git);
		skills2.add(java);
		skills2.add(php);
		skills2.add(sql);

		poste1.setPresentation("Bla bla bla, bla bla bla, bli bla bli" + "/n" + "bla bli bla blo bla bli");
		poste1.setSkills(skills1);
		poste2.setPresentation("Je désire trouver une jeune femme blonde a forte poitrine pour le travail");
		ArrayList<Post> post = new ArrayList<Post>();
		post.add(poste1);
		post.add(poste2);
		
		
		Company company1 = new Company(2,"Ma comp");
		company1.setPosts(post);
		/*
		EventQueue.invokeLater(new Runnable() { // EventQueue.invokeLater permet

			public void run() { 
				try {
					view = new ProfileCompanyView(ProfileCompanyController.this.frame);
					frame.setVisible(true);
					ViewsUtils.Edit(frame, view.getEditAddress(), view.getTxtAddress());
					ViewsUtils.Edit(frame, view.getEditName(), view.getTxtNomEntreprise());
					ViewsUtils.Edit(frame, view.getEditLinkWebSite(), view.getTxtLienSiteEntreprise());
					ViewsUtils.Edit(frame, view.getEditPhone(), view.getTxtTlphone());
					ViewsUtils.Edit(frame, view.getEditDescription(), view.getTxtrDescription());
					ViewsUtils.Edit(frame, view.getEditLinkedinLink(), view.getTxtLienLinkedin());
					ViewsUtils.ShowPost(view.getComboBox(), view.getTxtDescriptionPost(), view.getTxtRecruteurCoordonnee(), poste1);

				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
				for (int i = 0 ; i < post.size(); i++) {
					view.getComboBox().addItem(post.get(i).getPost_name()
							);
				}
				
					
				
			}
		});
		*/

	}

	@Override
	public void initEvent() {
		// TODO Auto-generated method stub
		
	}

}
