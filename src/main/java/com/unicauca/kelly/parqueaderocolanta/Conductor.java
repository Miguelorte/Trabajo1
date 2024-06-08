
package com.unicauca.kelly.parqueaderocolanta;

import java.util.Date;

public class Conductor extends Persona {
    //Atributos
    private TipoArea Area;
    
    public Conductor(TipoArea Area, int noIdentificacion, String nombre, String apellido, Date fechaNacimiento) {
        super(noIdentificacion, nombre, apellido, fechaNacimiento);
        this.Area = Area;
    }
    
    //Getter and Setter
    public TipoArea getArea() {
        return Area;
    }

    public void setArea(TipoArea Area) {
        this.Area = Area;
    }
    //Método toString

    @Override
    public String toString() {
        return super.toString() + "Conductor{" + "Area=" + Area + '}';
    }
    
    
}
