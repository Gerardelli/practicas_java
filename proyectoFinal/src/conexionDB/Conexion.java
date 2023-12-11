package conexionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    //Constantes de la base de datos
    static String username = "root";
    static String password = "rootives";
    static String database = "TIENDA";
    static String port = "3306";
    static String hostname = "localhost";

    static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?useSSL=false";

    Connection connection = null;

    public Conexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url,username,password);
            if (connection!=null){
                System.out.println("Conexion exitosa");
            }
        } catch (Exception e) {
            System.out.println("Hubo un error de conexion" + e);
        }
    }

    public Connection Conectar(){
        return connection;
    }

    public void Desconectar() throws Exception{
        connection.close();
    }

}
