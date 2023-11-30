import com.Asesor.Asesor;
import com.Empleado.Empleado;
import com.Persona.Persona;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //El programa creará un arreglo de empleados y un arreglo de asesores

        Scanner scanner = new Scanner(System.in);


        System.out.println("Programa que crea arreglos de Empleados y Asesores de una empresa");
        System.out.print("Ingresa el numero de empleados que deseas crear: ");
        int numEmp = scanner.nextInt();

        Empleado[] empleadosArray = new Empleado[numEmp];

        for(int i = 0; i<numEmp; i++){
            System.out.print("Ingresa el nombre del Empleado: ");
            String nombre = scanner.next();
            System.out.print("Ingresa la edad: ");
            int edad = scanner.nextInt();
            System.out.print("Ingresa el telefono: ");
            int tel = scanner.nextInt();
            System.out.print("Ingresa el DNI: ");
            String dni = scanner.next();
            System.out.print("Ingresa el sueldo: ");
            int sueldo = scanner.nextInt();
            System.out.print("Ingresa el puesto: ");
            String puesto = scanner.next();
            System.out.print("Ingresa el departamento: ");
            String departamento = scanner.next();

            empleadosArray[i] = new Empleado(nombre, edad,tel,dni,sueldo,puesto,departamento);

        }

        System.out.print("Ingresa el número de Asesores que desear agregar: ");
        int numAsesores = scanner.nextInt();
        Asesor[] asesorsArray = new Asesor[numAsesores];

        for (int i = 0; i< numAsesores; i++){
            System.out.print("Ingresa el nombre del Asesor: ");
            String nombre = scanner.next();
            System.out.print("Ingresa la edad: ");
            int edad = scanner.nextInt();
            System.out.print("Ingresa el telefono: ");
            int tel = scanner.nextInt();
            System.out.print("Ingresa el ID: ");
            int id = scanner.nextInt();
            System.out.print("Agrega el nombre de la empresa: ");
            String empresa = scanner.next();
            System.out.print("Ingresa las horas trabajadas: ");
            int horas = scanner.nextInt();

            asesorsArray[i] = new Asesor(nombre,edad,tel,id,empresa,horas);
            asesorsArray[i].asignarSueldo();

        }

        for (int i = 0; i<numAsesores; i++){
            System.out.println(asesorsArray[i].detallesAsesor());
        }

    }
}