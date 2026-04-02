package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionDB {

	private static final String URL = "jdbc:mysql://localhost:3306/donAparato";
    private static final String USUARIO = "root";
    private static final String CLAVE = "1390"; // tu clave de MySQL

    private static Connection conexion;

    public static Connection getConexion() {
        if (conexion == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conexion = DriverManager.getConnection(URL, USUARIO, CLAVE);
                System.out.println("Conexion exitosa");
            } catch (ClassNotFoundException e) {
                System.out.println("Driver no encontrado: " + e.getMessage());
            } catch (SQLException e) {
                System.out.println("Error conexion: " + e.getMessage());
            }
        }
        return conexion;
    }

}
