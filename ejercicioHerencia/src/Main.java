import com.Empleado.Empleado;
import com.Persona.Persona;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Persona perosona1 = new Persona("Josue", 22, 1234567890);

        Empleado empleado1 = new Empleado("Edgar", 20, 1234567890, "0987654321",5000);

        System.out.println(perosona1.toString2());
        System.out.println(empleado1.toString());
        System.out.println(empleado1.toString2());
    }
}