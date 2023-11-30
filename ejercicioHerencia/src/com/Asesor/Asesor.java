package com.Asesor;

import com.Persona.Persona;

public class Asesor extends Persona {

    int costo_hora = 150;
    int id;
    String empresa;
    int horasTrabajadas;
    int sueldo;

    public Asesor() {
    }

    public Asesor(String nombre, int edad, int telefono, int id, String empresa, int horasTrabajadas) {
        super(nombre, edad, telefono);
        this.id = id;
        this.empresa = empresa;
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public void asignarSueldo(){
        this.sueldo = horasTrabajadas * costo_hora;
    }

    public String toStringAsesor() {
        return "Asesor{" +
                "id=" + id +
                ", empresa='" + empresa + '\'' +
                ", horasTrabajadas=" + horasTrabajadas +
                '}';
    }

    public String detallesAsesor(){
        return "Datos Asesor { " + "Nombre: " + getNombre() + ", Edad: " + getEdad() + ", Telefono: " + getTelefono() + ", Sueldo: " + sueldo;
    }
}
