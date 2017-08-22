package poroLink.controllers;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

import poroLink.entities.AppUser;
import poroLink.entities.Candidate;
import poroLink.entities.Company;
import poroLink.managers.ViewsManager;
import poroLink.views.ConnectionView;


public class ConnectionController extends BaseController {
	
	private AppUser user;
	
	private JFrame frame;
	private ConnectionView view;
	public ConnectionController(JFrame frame) {
		super.frame = frame;
		user = new Company(888,"ma compagyt");
		super.view = new ConnectionView(this.frame);
		
	}
	
	@Override
	public void initEvent() {
		
		view = (ConnectionView) super.view;
		
		view.getBtnRegistration().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.getBtnRegistration().setContentAreaFilled(false);
				ViewsManager.getInstance().next(new RegistrationController(frame));
			}
		});
		
		view.getBtnConnection().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.getBtnConnection().setContentAreaFilled(false);
				ViewsManager.getInstance().next(new HomeController(frame));
			}
		});
		
		view.getForgottenPwdLabel().addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {

				ViewsManager.getInstance().next(new ForgottenPwdController(frame));
			}
		});
		
	}

	@Override
	public void setupDatas() {
		this.viewDatas.put("currentUser", user);
		
		
	}
	
	
}
