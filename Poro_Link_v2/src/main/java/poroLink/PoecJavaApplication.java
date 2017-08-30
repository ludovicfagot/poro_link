/**
 *
 */
package poroLink;

import java.sql.ResultSet;
import java.sql.SQLException;

import poroLink.database.SkillDAO;
import poroLink.managers.ViewsManager;

public class PoecJavaApplication {

	public static void main(String[] args) {
/*
		ViewsManager.getInstance().start();
*/		
		SkillDAO dao = new SkillDAO();
		ResultSet set = dao.executeRequete("Show Tables");
		try {
			while(set.next()) {
				System.out.println(set.getString(1));
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
