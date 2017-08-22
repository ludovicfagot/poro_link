package poroLink.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import poroLink.entities.AppUser;
import poroLink.managers.ViewsManager;
import poroLink.views.HomeView;
import poroLink.views.LoginView;
import poroLink.views.MatchingResultView;
import poroLink.views.MatchingView;

public class MatchingResultController extends BaseController {

	public MatchingResultController(JFrame frame){
		super.frame = frame;
		super.view = new MatchingResultView(this.frame);
	}

	@Override
	public void initEvent() {
	
		MatchingResultView view = (MatchingResultView) super.view;
		view.getBtnValidate().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					//ViewsManager.getInstance().next(new MatchingResultController(frame));
			}
		});
	}

	@Override
	public void initView() {
		//((HomeView)getView()).getMenuBar().getLblUserfirstname().setText(((AppUser)this.viewDatas.get("currentUser")).getMail());
		((MatchingResultView)getView()).getTextField().setText(((AppUser)this.viewDatas.get("currentUser")).getMail());		
	}
}