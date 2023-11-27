package com.Empleado;

import com.Persona.Persona;

public class Empleado extends Persona {

    String dni;
    int sueldo;

    public Empleado(String dni, int sueldo) {
        this.dni = dni;
        this.sueldo = sueldo;
    }

    public Empleado(String nombre, int edad, int telefono, String dni, int sueldo) {
        super(nombre, edad, telefono);
        this.dni = dni;
        this.sueldo = sueldo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "dni='" + dni + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
}
