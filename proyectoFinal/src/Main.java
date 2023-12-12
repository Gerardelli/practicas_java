import DAO.EmpleadoDAO;
import conexionDB.Conexion;
import modelos.Empleado;

import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empleado empleado = new Empleado();
        Conexion conexion = new Conexion();
        EmpleadoDAO empleadoDAO = new EmpleadoDAO(conexion);
        
        
        int opcion;
        
        do {
            //
            System.out.println("#######################################");
            System.out.println("########### TIENDA IVES ###############");
            System.out.println("#######################################");
            System.out.println("Ingresa una de las opciones del menú");
            System.out.println("1) Registar Empleados");
            System.out.println("2) Ver Empleados");
            System.out.println("3) Salir");
            System.out.print("Ingresa la opcion: ");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("SELECCIONASTE LA OPCION REGISTRAR EMPLEADO");
                    System.out.print("Ingresa el id del empleado: ");
                    empleado.setId_empleado(scanner.nextInt());
                    System.out.print("Ingresa el nombre: ");
                    empleado.setNombre_empleado(scanner.next());
                    System.out.print("Ingresa el apellido: ");
                    empleado.setApellidos(scanner.next());
                    System.out.print("Ingresa el telefono: ");
                    empleado.setTelefono(scanner.next());
                    System.out.print("Ingresa el puesto: ");
                    empleado.setPuesto(scanner.next());
                    System.out.print("Ingresa el sueldo: ");
                    empleado.setSueldo(scanner.nextFloat());
                    System.out.print("Ingresa el tipo de empleado: ");
                    empleado.setTipo_empleado(scanner.next());

                    boolean respuesta = empleadoDAO.RegistrarEmpleado(empleado);

                    if (respuesta){
                        System.out.println("El empleado se registro exitosamente");
                    }else {
                        System.out.println("Fallo");
                    }
                    break;
                case 2:
                    List<Empleado> empleadoList = empleadoDAO.mostrarEmpleados();
                    for (Empleado empleado1 : empleadoList){
                        System.out.println("#####################################");
                        System.out.println("### Datos del empleado " + empleado1.getId_empleado() + "###");
                        System.out.println("#####################################");
                        System.out.println("Nombre: " + empleado1.getNombre_empleado());
                        System.out.println("Apellidos: "+ empleado1.getApellidos());
                        System.out.println("Telefono: " + empleado1.getTelefono());
                        System.out.println("Puesto: " + empleado1.getPuesto());
                        System.out.println("Sueldo: " + empleado1.getSueldo());
                        System.out.println("Tipo Empleado: " + empleado1.getTipo_empleado() + "\n");
                    }
                default:
                    System.out.println("Escribe una opcion correcta");
            }
            
        } while (opcion != 3);



    }
}