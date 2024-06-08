
package com.unicauca.kelly.parqueaderocolanta;

import java.util.Date;

public class Persona {
    //Atributos
    private int noIdentificacion;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    
    //Constructor
    public Persona(int noIdentificacion, String nombre, String apellido, Date fechaNacimiento ){
     this.noIdentificacion = noIdentificacion;
     this.nombre = nombre;
     this.apellido = apellido;
     this.fechaNacimiento = fechaNacimiento;
    }

    //Getter and setter
    public int getNoIdentificacion() {
        return noIdentificacion;
    }

    public void setNoIdentificacion(int noIdentificacion) {
        this.noIdentificacion = noIdentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    //Método toString
    @Override
    public String toString() {
        return "Persona{" + "noIdentificacion=" + noIdentificacion + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    
    
    
}
