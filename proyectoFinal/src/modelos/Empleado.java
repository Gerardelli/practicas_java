package modelos;

public class Empleado {
    int id_empleado;
    String nombre_empleado;
    String apellidos;
    String telefono;
    String puesto;
    float sueldo;
    String tipo_empleado;

    public Empleado(int id_empleado, String nombre_empleado, String apellidos, String telefono, String puesto, float sueldo, String tipo_empleado) {
        this.id_empleado = id_empleado;
        this.nombre_empleado = nombre_empleado;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.puesto = puesto;
        this.sueldo = sueldo;
        this.tipo_empleado = tipo_empleado;
    }

    public Empleado() {

    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getNombre_empleado() {
        return nombre_empleado;
    }

    public void setNombre_empleado(String nombre_empleado) {
        this.nombre_empleado = nombre_empleado;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public String getTipo_empleado() {
        return tipo_empleado;
    }

    public void setTipo_empleado(String tipo_empleado) {
        this.tipo_empleado = tipo_empleado;
    }
}
