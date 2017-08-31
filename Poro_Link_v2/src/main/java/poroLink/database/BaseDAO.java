package poroLink.database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import poroLink.entities.base.BaseEntity;

public abstract class BaseDAO implements IDAOBase {
	
	private String table;
	private String id;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/* (non-Javadoc)
	 * @see poroLink.database.IDAOBase#delete(poroLink.entities.base.BaseEntity)
	 */
	@Override
	public void delete(BaseEntity item) {
		// TODO Auto-generated method stub
		excuteRequest("DELETE FROM "+ table+" WHERE "+id+"="+item.getId());
	}
	public void deleteAll() {
		excuteRequest("DELETE FROM "+ table);
	}

	/* (non-Javadoc)
	 * @see poroLink.database.IDAOBase#select(poroLink.entities.base.BaseEntity)
	 */
	@Override
	public void select(BaseEntity item) {
		
	}

	/* (non-Javadoc)
	 * @see poroLink.database.IDAOBase#get(int)
	 */
	@Override
	public BaseEntity get(int id) {
		ResultSet rs = excuteRequest("SELECT * FROM " + table+" WHERE "+this.id+"="+id);
		BaseEntity entity=null;
		try {
			rs.next();
			entity=parseResultSetToOject(rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return entity;
	}

	/* (non-Javadoc)
	 * @see poroLink.database.IDAOBase#get()
	 */
	@Override
	public List<BaseEntity> get() {
		List<BaseEntity> entities = new ArrayList<BaseEntity>();
		ResultSet rs= excuteRequest("SELECT * FROM " + table);
		try {
			while(rs.next()) {
				entities.add(parseResultSetToOject(rs));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return entities;
	}

	
	
	/* (non-Javadoc)
	 * @see poroLink.database.IDAOBase#insert(poroLink.entities.base.BaseEntity)
	 */
	@Override
	public BaseEntity insert(BaseEntity item) {
		//excuteRequest("INSERT INTO " + table+" VALUES ("+parseOjectToString(item)+");");	
		return executePreparedStatement(item,"INSERT INTO " + table + " VALUES(" + parseOjectToString(item) + ")");
	}

	/* (non-Javadoc)
	 * @see poroLink.database.IDAOBase#update(poroLink.entities.base.BaseEntity)
	 */
	@Override
	public void update(BaseEntity item) {
		//excuteRequest("UPDATE "+ table +" SET `skill_name` = 'toto2' WHERE "+this.id+"="+id);	
		excuteRequest("UPDATE "+ table +" SET "+parseUpdate(item)+" WHERE "+this.id+"="+id);
	}

	/**
	 * @return the table
	 */
	public String getTable() {
		return table;
	}

	public BaseDAO(String table, String id) {
		this.table=table;
		this.id=id;
	}
	
	/* (non-Javadoc)
	 * @see poroLink.database.IDAOBase#executeRequete(java.lang.String)
	 */
	@Override
	public ResultSet excuteRequest(String request) {
		ResultSet result=null;
		try {
			Statement stmt=DBManager.getInstance().getCon().createStatement();
			//result = stmt.executeQuery(request);
			stmt.executeUpdate(request);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	@Override
	public ResultSet excuteSelect(String request) {
		ResultSet result=null;
		try {
			Statement stmt=DBManager.getInstance().getCon().createStatement();
			result=stmt.executeQuery(request);		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	@Override
	public BaseEntity executePreparedStatement(BaseEntity item, String request) {

		try {
			PreparedStatement prest;

			prest = DBManager.getInstance().getCon()
					.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
			prest.executeUpdate();
			ResultSet rs = prest.getGeneratedKeys();
			if (rs.next()) {
				item.setId(rs.getInt(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return item;
	}
}
