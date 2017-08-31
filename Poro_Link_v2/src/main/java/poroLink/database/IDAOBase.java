package poroLink.database;

import java.sql.ResultSet;
import java.util.List;

import poroLink.entities.base.BaseEntity;

public interface IDAOBase {
	public ResultSet excuteRequest(String requete);
	public BaseEntity parseResultSetToOject (ResultSet rs);
	public String parseOjectToString (BaseEntity item);
	public BaseEntity insert(BaseEntity item);
	public void update(BaseEntity item);
	public void delete(BaseEntity item);
	public void deleteAll();
	public void select(BaseEntity item);
	public BaseEntity get(int id);
	public List<BaseEntity> get();
	public ResultSet excuteSelect(String request);
	public BaseEntity executePreparedStatement(BaseEntity item, String request);
	public String parseUpdate(BaseEntity item);
	
}
