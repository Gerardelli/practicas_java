package com.Empleado;

import com.Persona.Persona;

public class Empleado extends Persona {

    String dni;
    int sueldo;
    String puesto;
    String departamento;

    //agregar al metodo constructor los atributos creados puesto y departamento

    public Empleado() {

    }

    public Empleado(String nombre, int edad, int telefono, String dni, int sueldo, String puesto, String departamento) {
        super(nombre, edad, telefono);
        this.dni = dni;
        this.sueldo = sueldo;
        this.puesto = puesto;
        this.departamento = departamento;

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


    public String toStringEmpleado() {
        return "Empleado{" +
                "dni='" + dni + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
}
