package poroLink.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

import javax.swing.JFrame;
import poroLink.entities.AppUser;
import poroLink.entities.Candidate;
import poroLink.entities.Company;
import poroLink.entities.Post;
import poroLink.entities.Skill;
import poroLink.managers.ViewsManager;
import poroLink.views.HomeView;
import poroLink.views.LoginView;
import poroLink.views.MatchingResultView;
import poroLink.views.MatchingView;

public class MatchingResultController extends BaseController {
	//public TreeMap<Integer,Integer> tmCandidate = new TreeMap<>();
	//List<String> list = new ArrayList<String>();
	//private ArrayList<Candidate> candidatlist;
	List<Candidate> candidatlist = new ArrayList<Candidate>();
	Candidate candidat = new Candidate();

	/**
	 * @return the candidat
	 */
	public Candidate getCandidat() {
		return candidat;
	}

	/**
	 * @param candidat the candidat to set
	 */
	public void setCandidat(Candidate candidat) {
		this.candidat = candidat;
	}

	/**
	 * @param candidatlist the candidatlist to set
	 */
	public void setCandidatlist(ArrayList<Candidate> candidatlist) {
		this.candidatlist = candidatlist;
	}

	private Object getTmCandidate;
	
	public  MatchingResultController(JFrame frame){
		super.frame = frame;
		super.view = new MatchingResultView(this.frame);
	}

	@Override
	public void initEvent() {
		MatchingResultView view = (MatchingResultView) super.view;
		/*
		view.getBtnValidate().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
					//ViewsManager.getInstance().next(new MatchingResultController(frame));	
			}
		});
		*/
	}

	
	@Override
	public void initView() {
		//((MatchingResultView)getView()).getTextField().setText(((Post)this.viewDatas.get("currentPost")).getPost_name());	
		((MatchingResultView)getView()).getLblRsultatDeLa().setText("R\u00E9sultat de la recherche pour le poste : " + ((Post)this.viewDatas.get("currentPost")).getPost_name());
		
		//affichage des skills
		for(int i=0;i<((Post) this.viewDatas.get("currentPost")).getSkills().size();i++) {
			((MatchingResultView)getView()).getTextAreaSkills().setText(((MatchingResultView)getView()).getTextAreaSkills().getText()+ "\n" +((Post)this.viewDatas.get("currentPost")).getSkills().get(i).getSkill_name() + " niveau "+ ((Post)this.viewDatas.get("currentPost")).getSkills().get(i).getNeeds());
		}
		// recher des besoins en pourcentage
		//setpurcentageneeds();
		
		
		// affichage des canditats
		for (Candidate postulant : generateCandidate()) {
			for(int i=0;i<postulant.getSkills().size();i++) {
				((MatchingResultView)getView()).getTextAreaCanditate().setText(((MatchingResultView)getView()).getTextAreaCanditate().getText()+ "\n" +(postulant.getFirstname()+" compétences : "+ postulant.getSkills().get(i).getSkill_name()+ " niveau" +postulant.getSkills().get(i).getOwns()));
				
			}
			// recherche des pourcentage des canditats
				
			candidatlist.add(compatibilite(postulant));
			
		}
		//return StudentName1.compareTo(StudentName2);
		//Collections.sort(candidatlist, getPurcentcompatibility());
		//candidatlist.sort(null);
		System.out.println(candidat.FirstCandidate(candidatlist).getFirstname());
		candidatlist.remove(candidat.FirstCandidate(candidatlist));
		System.out.println(candidat.FirstCandidate(candidatlist).getFirstname());
		/*
		for(int i=0;i<candidatlist.size();i++) {
			System.out.println(candidatlist.get(i).getPurcentcompatibility());
		}
		*/
		
	}	
	public Candidate compatibilite(Candidate candidate) {
		
		

		
		
		int purcentagecomatibility=0;
		int purcentagebesoin=0;
		purcentagecomatibility=0;
		for(int i=0;i<candidate.getSkills().size();i++) {
			
			for(int j=0;j<((Post) this.viewDatas.get("currentPost")).getSkills().size();j++) {
				purcentagebesoin=0;
				for(int k=0;k<((Post) this.viewDatas.get("currentPost")).getSkills().size();k++) {
						purcentagebesoin+=((Post)this.viewDatas.get("currentPost")).getSkills().get(k).getNeeds();	
				}
				
				purcentagebesoin=((Post)this.viewDatas.get("currentPost")).getSkills().get(j).getNeeds()*(100/purcentagebesoin);
				
				if(candidate.getSkills().get(i).getSkill_id()==((Post) this.viewDatas.get("currentPost")).getSkills().get(j).getSkill_id()) {
							
					switch (candidate.getSkills().get(i).getOwns()) {
					case 1:
						purcentagecomatibility+=purcentagebesoin*30/100;
					break;
					case 2:
						purcentagecomatibility+=purcentagebesoin*50/100;
					break;
					case 3:
						purcentagecomatibility+=purcentagebesoin*65/100;
					break;
					case 4:
						purcentagecomatibility+=purcentagebesoin*75/100;
					break;
					case 5:
						purcentagecomatibility+=purcentagebesoin*100/100;

					break;
					}	
				}
				
			}
			
		}
		((MatchingResultView)getView()).getTextAreaCanditate().setText(((MatchingResultView)getView()).getTextAreaCanditate().getText()+ "\n" +candidate.getFirstname()+" "+ purcentagecomatibility + " %");
			//this.tmCandidate.put(candidate.getAppuser_id(), purcentagecomatibility);
		candidate.setPurcentcompatibility(purcentagecomatibility);
		
		return candidate;
	}
	
	/**
	 * @return the tmCandidate
	 */
	

	public List<Candidate> generateCandidate() {
		
		List<Candidate> result = new ArrayList<Candidate>();
		List<Skill> skills1 = new ArrayList<Skill>();
		List<Skill> skills2 = new ArrayList<Skill>();
		
		Skill s1 = new Skill(1,"JAVA",0,5);
		Skill s2 = new Skill(2,"C",0,5);
		Skill s3 = new Skill(3,"C++",0,5);
		Skill s4 = new Skill(4,"html",0,5);
		Skill s5 = new Skill(5,"css",0,5);
		Skill s6 = new Skill(5,"css",0,5);
		Skill s7 = new Skill(2,"C",0,1);
		
		skills1.add(s1);
		skills1.add(s2);
		skills1.add(s3);
		skills1.add(s6);

		skills2.add(s1);
		//skills2.add(s5);
		//skills2.add(s7);
		
		Candidate c1 = new Candidate(1,"Jean louis","on");
		c1.setSkills(skills1);
		
		Candidate c2 = new Candidate(2,"Carl Eric","ongh");
		c2.setSkills(skills2);
		result.add(c2);
		result.add(c1);
		
		return result;

	}
}