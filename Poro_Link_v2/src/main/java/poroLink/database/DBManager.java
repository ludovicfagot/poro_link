package poroLink.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Map;

import poroLink.utils.file.FileManager;

public class DBManager {
	/** Constructeur privé */
	private DBManager()
	{
		
	}
 
	/** Instance unique pré-initialisée */
	private static DBManager INSTANCE = new DBManager();
 
	/** Point d'accès pour l'instance unique du singleton */
	public static DBManager getInstance()
	{	
		return INSTANCE;
	}
	
	private Connection con;
	
	public void connect() {
		connect("config","dbconfig");
	}
	
	public void connect(String path, String file) {
		FileManager fileMnager = new FileManager(path,file);
		Map<String,Object> datas=fileMnager.extractFromPattern();
		connect(datas.get("serverAdress").toString(),datas.get("port").toString(),datas.get("dbName").toString(),datas.get("login").toString(),datas.get("password").toString());
	}
	
	public void connect(String serverAdress, String port, String dbName, String login, String password) {
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			con=DriverManager.getConnection(  
			"jdbc:mysql://"+serverAdress+":"+port+"/"+ dbName,login,password);  
			//here sonoo is database name, root is username and password  
			/*
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from emp");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			con.close();
			*/  
		}catch(Exception e){ 
			System.err.println(e.getMessage());
		}  
	}
}
