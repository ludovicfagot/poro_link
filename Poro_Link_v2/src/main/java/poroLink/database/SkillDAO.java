package poroLink.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import poroLink.entities.Skill;
import poroLink.entities.base.BaseEntity;

public class SkillDAO extends BaseDAO {

	public static final String TABLE="skill";
	public static final String ID="skill_id";
	public static final String NAME="skill_name";
	public static final String LEVEL="owns";
	public static final String NEED="need";
	
	public SkillDAO() {
		super(TABLE,ID);
	}

	/* (non-Javadoc)
	 * @see poroLink.database.IDAOBase#insert(poroLink.entities.base.BaseEntity)
	 */
	/*
	public void insert(BaseEntity item) {
		// TODO Auto-generated method stub
		
	}
	*/

	/* (non-Javadoc)
	 * @see poroLink.database.IDAOBase#update(poroLink.entities.base.BaseEntity)
	 */
	@Override
	public void update(BaseEntity item) {
		// TODO Auto-generated method stub	
	}

	/* (non-Javadoc)
	 * @see poroLink.database.IDAOBase#delete(poroLink.entities.base.BaseEntity)
	 */
	@Override
	public void delete(BaseEntity item) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see poroLink.database.IDAOBase#select(poroLink.entities.base.BaseEntity)
	 */
	@Override
	public void select(BaseEntity item) {
		// TODO Auto-generated method stub
	}

	/* (non-Javadoc)
	 * @see poroLink.database.IDAOBase#get()
	 */
	@Override
	public List<BaseEntity> get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseEntity get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseEntity parseResultSetToOject(ResultSet rs) {
		Skill skill = new Skill();
		try {
			skill.setSkill_id(rs.getInt(ID));
			skill.setNeeds(rs.getInt(LEVEL));
			skill.setOwns(rs.getInt(NEED));
			skill.setSkill_name(rs.getString(NAME));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return skill;
	}

	@Override
	public String parseOjectToString(BaseEntity item) {
		String res="";
		Skill skill = (Skill)item;
		if(skill.getId()==0) {
			res="null,";
		}else {
			res=skill.getId()+",";	
		}
		res+="'"+skill.getSkill_name()+"'";
		return res;
	}
	@Override
	public String parseUpdate(BaseEntity item) {
		String result = "";
		Skill skill = (Skill) item;
		result += NAME + " = '" + skill.getSkill_name();
		return result;
	}
}
