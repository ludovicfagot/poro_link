package poroLink.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Map;

import poroLink.utils.file.FileManager;

public class DBManager {
	
	/** Singleton */
	private DBManager()
	{
		connect();
	}
 
	/** Instance unique pré-initialisée */
	private static DBManager INSTANCE = new DBManager();
 
	/** Point d'accès pour l'instance unique du singleton */
	public static DBManager getInstance()
	{	
		return INSTANCE;
	}
	
	/** fin singleton */
	
	private Connection con;
	private String DBNAME = "mydb";
	private static final String PASSWORD = "password";
	private static final String LOGIN = "login";
	private static final String DB_NAME = "dbName";
	private static final String PORT = "port";
	private static final String SERVER_ADRESS = "serverAdress";
	private static final String DBCONFIG = "dbconfig";
	private static final String CONFIG = "config";

	
	public void connect() {
		connect(CONFIG,DBCONFIG);
	}
	
	public void connect(String path, String file) {
		FileManager fileMnager = new FileManager(path,file);
		Map<String,Object> datas=fileMnager.extractFromPattern();
		String password="";
		if(datas.containsKey(PASSWORD)) {
			password=datas.get(PASSWORD).toString();
		}
		connect(datas.get(SERVER_ADRESS).toString(),datas.get(PORT).toString(),datas.get(DB_NAME).toString(),datas.get(LOGIN).toString(),password);
	}
	
	public void connect(String serverAdress, String port, String dbName, String login, String password) {
		DBNAME = dbName;
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			con = DriverManager.getConnection("jdbc:mysql://"+serverAdress+":"+port+"/"+ dbName,login,password);
			
			//here sonoo is database name, root is username and password  
			/*
			
			*/  
		}catch(Exception e){ 
			System.err.println(e.getMessage());
		}  
	}

	/**
	 * @return the dBNAME
	 */
	public String getDBNAME() {
		return DBNAME;
	}

	/**
	 * @return the con
	 */
	public Connection getCon() {
		return con;
	}



}
