package poroLink.controllers;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

import poroLink.views.ConnectionView;

public class ConnectionController {
	
	private JFrame frame;
	private ConnectionView view;

	public ConnectionController(JFrame frame) {
		this.frame=frame;
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view = new ConnectionView(ConnectionController.this.frame);
					frame.setVisible(true);
					registrationEvent();
					connectionEvent();
					forgottenPwdEvent();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private void registrationEvent() {
		view.getBtnRegistration().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.getBtnRegistration().setContentAreaFilled(false);
				new RegistrationController(frame);
			}
		});
	}
	
	private void connectionEvent() {
		view.getBtnConnection().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					//TODO
			}
		});
	}
	
	private void forgottenPwdEvent() {
		view.getForgottenPwdLabel().addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				new ForgottenPwdController(frame);
			}
		});
	}
}
