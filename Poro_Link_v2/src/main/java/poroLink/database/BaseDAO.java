package poroLink.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class BaseDAO implements IDAOBase {

	/* (non-Javadoc)
	 * @see poroLink.database.IDAOBase#executeRequete(java.lang.String)
	 */
	@Override
	public ResultSet executeRequete(String request) {
		// TODO Auto-generated method stub
		ResultSet result=null;
		
		try {
			Statement stmt=DBManager.getInstance().getCon().createStatement();
			result = stmt.executeQuery(request);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
}
