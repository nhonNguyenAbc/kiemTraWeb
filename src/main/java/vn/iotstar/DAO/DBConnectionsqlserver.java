package vn.iotstar.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionsqlserver {
	private final String serverName = "NGUYENTHANHNHON\\SQLEXPRESS";
	private final String dbName = "KIEMTRA";
	private final String portNumber = "1433";
	private final String instance = "";// MSSQLSERVER LEAVE THIS ONE EMPTY IF YOUR SQL IS A SINGLE INSTANCE
	private final String userID = "sa";
	private final String password = "13102003";
	
	public Connection getConnection() throws Exception {
		String url = "jdbc:sqlserver://" + serverName + ":" +
		portNumber + "\\" + instance + ";databaseName=" + dbName;
		if (instance == null || instance.trim().isEmpty())
		url = "jdbc:sqlserver://"+serverName+":"+portNumber
		+";databaseName="+dbName;
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		return DriverManager.getConnection(url, userID, password);
		}
	public static void main(String[] args) {
		try {
		System.out.println(new DBConnectionsqlserver().getConnection());
		} catch (Exception e) {
		e.printStackTrace();
		}
		}
}
