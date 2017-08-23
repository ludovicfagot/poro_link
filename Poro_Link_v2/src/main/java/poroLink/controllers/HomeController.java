package poroLink.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import poroLink.entities.AppUser;
import poroLink.entities.Candidate;
import poroLink.managers.ViewsManager;
import poroLink.views.HomeView;

public class HomeController extends BaseController {
	
	public HomeController(JFrame frame){
		super.frame = frame;
		super.view = new HomeView(this.frame);
		
		
		
		
	}

	@Override
	public void initEvent() {
		HomeView view = (HomeView) super.view;
		
		Candidate candidate = new Candidate(1,"ludo","fagot");
		
		view.getLblNewLabel().setIcon(new ImageIcon("Pictures/Candidate/"+candidate.getAppuser_id()+".png"));
		view.getLblNewLabel_1().setText(candidate.getFirstname()+" "+candidate.getLastname());
		
		view.getBtnRechercherUnCandidat().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					ViewsManager.getInstance().next(new MatchingController(frame));
			}
		});
		
	}

	
	@Override
	public void initView() {
		
		//((HomeView)getView()).getMenuBar().getLblUserfirstname().setText(((AppUser)this.viewDatas.get("currentUser")).getMail());
		//((HomeView)getView()).getTextField().setText(((AppUser)this.viewDatas.get("currentUser")).getMail());
		
		
	}
}
