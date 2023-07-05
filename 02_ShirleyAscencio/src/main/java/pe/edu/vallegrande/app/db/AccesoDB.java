package pe.edu.vallegrande.app.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class AccesoDB {

	public static Connection getConnection() throws SQLException {
		Connection conexion = null;
		String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

		//Conexion a base local Shirley
		String urlDB = "jdbc:sqlserver://localhost:1433;databaseName=db_ShirleyAscencio;encrypt=true;TrustServerCertificate=True;";
		String user = "sa";
		String pass = "Shirley#73931448";

		
		try {
			// Conexión con la BD
			Class.forName(driver).getDeclaredConstructor().newInstance();
			conexion = DriverManager.getConnection(urlDB, user, pass);
		} catch (SQLException e) {
			throw e;
		} catch (ClassNotFoundException e) {
			throw new SQLException("No se encontro el driver de la BD.");
		} catch (Exception e) {
			throw new SQLException("No se puede establecer conexión de la BD.");
		}
		return conexion;
	}
}
