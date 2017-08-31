package poroLink.entities;

import java.util.ArrayList;

import poroLink.entities.base.BaseEntity;

public class Skill extends BaseEntity{

	 private int skill_id;
	 private String skill_name;
	 private int needs;
	 private int owns;
	 private int purcentageneeds;
	/**
     * Default constructor
     */
    public Skill(int id,String name, int need, int owns) {
    	this.setSkill_id(id);
    	this.setSkill_name(name);
    	this.setNeeds(need);
    	this.setOwns(owns);
    }
    public Skill() {
    	
    }
    public Skill(String name) {
    	this.setSkill_name(name);
    }

	/**
	 * @return the needs
	 */
	public int getNeeds() {
		return needs;
	}


	/**
	 * @param needs the needs to set
	 */
	public void setNeeds(int needs) {
		this.needs = needs;
	}


	/**
	 * @return the owns
	 */
	public int getOwns() {
		return owns;
	}


	/**
	 * @param owns the owns to set
	 */
	public void setOwns(int owns) {
		this.owns = owns;
	}


	/**
	 * @return the skill_id
	 */
	public int getSkill_id() {
		return skill_id;
	}

	/**
	 * @param skill_id the skill_id to set
	 */
	public void setSkill_id(int skill_id) {
		this.skill_id = skill_id;
	}

	/**
	 * @return the skill_name
	 */
	public String getSkill_name() {
		return skill_name;
	}

	/**
	 * @param skill_name the skill_name to set
	 */
	public void setSkill_name(String skill_name) {
		this.skill_name = skill_name;
	}


	/**
	 * @return the purcentageneeds
	 */
	public int getPurcentageneeds() {
		return purcentageneeds;
	}


	/**
	 * @param purcentageneeds the purcentageneeds to set
	 */
	public void setPurcentageneeds(int purcentageneeds) {
		this.purcentageneeds = purcentageneeds;
	}

	
   




}
