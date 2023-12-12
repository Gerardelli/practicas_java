package DAO;

import conexionDB.Conexion;
import modelos.Empleado;
//Clases para guardar los datos en una consulta y guardar cambios en la base de datos
import java.sql.PreparedStatement;
import java.sql.SQLException;
//Clases para obtener los datos de una tabla de una base de datos
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;


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

    //El metodo mostarEmpleados debe regresar una lista de empleados con todos sus datos
    public List<Empleado>  mostrarEmpleados(){

        String consulta = "SELECT * FROM EMPLEADO";

        try {
            PreparedStatement query = conexion.Conectar().prepareCall(consulta);
            ResultSet resultSet = query.executeQuery();

            List<Empleado> empleadoList = new LinkedList<>();
            Empleado empleado;

            while (resultSet.next()){
                empleado = new Empleado(resultSet.getInt("id_empleado"));
                empleado.setNombre_empleado(resultSet.getString("nombre_empleado"));
                empleado.setApellidos(resultSet.getString("apellidos"));
                empleado.setTelefono(resultSet.getString("telefono"));
                empleado.setPuesto(resultSet.getString("puesto"));
                empleado.setSueldo(resultSet.getFloat("sueldo"));
                empleado.setTipo_empleado(resultSet.getString("tipo_empleado"));

                empleadoList.add(empleado);
            }

            return empleadoList;

        } catch (SQLException e) {
            return null;
        }

    }



}
