/**
 *
 */
package poroLink;

import java.sql.ResultSet;
import java.sql.SQLException;

import poroLink.database.SkillDAO;
import poroLink.entities.Skill;
import poroLink.managers.ViewsManager;

public class PoecJavaApplication {

	public static void main(String[] args) {
/*
		ViewsManager.getInstance().start();
*/		
		SkillDAO dao = new SkillDAO();
		Skill skill = new Skill("fd");
		dao.insert(skill);
		
		SkillDAO dao2 = new SkillDAO();
		ResultSet set = dao2.excuteSelect("Show Tables");
		try {
			while(set.next()) {
				System.out.println(set.getString(1));
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		/*
				Skill firstSkill = new Skill();
		firstSkill.setLevel(10);
		firstSkill.setName("skill1");

		for (int i = 0; i < 100; i++) {
			skillDao.insert(firstSkill);
		}

		List<BaseEntity> skills = skillDao.get();

		Skill updateS = (Skill) skills.get(10);
		updateS.setName("new name to test");
		skillDao.update(updateS);

		CandidateDAO candidateDao = new CandidateDAO();
		Candidate c1 = new Candidate();
		c1.setFirstname("toto");
		c1.setLastname("dupont");
		c1.setLogin("toto");
		c1.setPassword("eltoto");

		c1.getSkills().add((Skill) skills.get(0));
		c1.getSkills().add((Skill) skills.get(1));
		c1.getSkills().add((Skill) skills.get(2));

		candidateDao.insert(c1);
		candidateDao.insertSkills(c1);


		Candidate c2 = new Candidate();
		c2 = (Candidate) candidateDao.get(c1.getId());
		candidateDao.getSkills(c2);

		for (BaseEntity baseEntity : skills) {
			skillDao.delete(baseEntity);
		}
		 */
		
		
	}
}
