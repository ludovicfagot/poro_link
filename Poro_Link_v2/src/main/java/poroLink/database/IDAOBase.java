package poroLink.database;

import java.sql.ResultSet;
import java.util.List;

import poroLink.entities.base.BaseEntity;

public interface IDAOBase {
	public ResultSet executeRequete(String requete);
	public void insert(BaseEntity item);
	public void update(BaseEntity item);
	public void delete(BaseEntity item);
	public void select(BaseEntity item);
	public List<BaseEntity> get();
	
}
