package DAO;

import conexionDB.Conexion;
import modelos.Empleado;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class EmpleadoDAO {

    Conexion conexion;

    public EmpleadoDAO(Conexion conexion){
        this.conexion = conexion;
    }

    public boolean RegistrarEmpleado(Empleado empleado){
        String consulta = "INSERT INTO EMPLEADO VALUES (?,?,?,?,?,?,?);";

        try {
            PreparedStatement query = conexion.Conectar().prepareStatement(consulta);
            query.setInt(1, empleado.getId_empleado());
            query.setString(2, empleado.getNombre_empleado());
            query.setString(3,empleado.getApellidos());
            query.setString(4,empleado.getTelefono());
            query.setString(5, empleado.getPuesto());
            query.setFloat(6, empleado.getSueldo());
            query.setString(7, empleado.getTipo_empleado());
            query.execute();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

}
