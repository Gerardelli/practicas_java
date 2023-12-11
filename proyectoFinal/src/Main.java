import DAO.EmpleadoDAO;
import conexionDB.Conexion;
import modelos.Empleado;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empleado empleado = new Empleado();
        Conexion conexion = new Conexion();
        EmpleadoDAO empleadoDAO = new EmpleadoDAO(conexion);

        System.out.println("Programa para registrar empleados");
        System.out.print("Ingresa el id del empleado");
        empleado.setId_empleado(scanner.nextInt());
        System.out.print("Ingresa el nombre");
        empleado.setNombre_empleado(scanner.next());
        System.out.print("Ingresa el apellido");
        empleado.setApellidos(scanner.next());
        System.out.print("Ingresa el telefono");
        empleado.setTelefono(scanner.next());
        System.out.print("Ingresa el puesto");
        empleado.setPuesto(scanner.next());
        System.out.print("Ingresa el sueldo");
        empleado.setSueldo(scanner.nextFloat());
        System.out.print("Ingresa el tipo de empleado");
        empleado.setTipo_empleado(scanner.next());

        boolean respuesta = empleadoDAO.RegistrarEmpleado(empleado);

        if (respuesta){
            System.out.println("El empleado se registro exitosamente");
        }else {
            System.out.println("Fallo");
        }

    }
}