package poroLink.controllers;

import javax.swing.JFrame;

import poroLink.views.ListUserView;

public class ListUserController extends BaseController {

	public ListUserController(JFrame frame){
		super.frame = frame;
		super.view = new ListUserView(this.frame);
	}

	@Override
	public void initEvent() {
		view = (ListUserView) super.view;

	}

	
	@Override
	public void initView() {
	
		
	}
}
