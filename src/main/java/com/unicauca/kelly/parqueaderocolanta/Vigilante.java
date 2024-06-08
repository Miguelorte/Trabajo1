
package com.unicauca.kelly.parqueaderocolanta;

import java.util.Date;

public class Vigilante extends Persona{
    //Atributos
   private TipoVigilancia zonaVigilancia;

    public Vigilante(TipoVigilancia zonaVigilancia, int noIdentificacion, String nombre, String apellido, Date fechaNacimiento) {
        super(noIdentificacion, nombre, apellido, fechaNacimiento);
        this.zonaVigilancia = zonaVigilancia;
    }
    
    //Getter and Setter

    public TipoVigilancia getZonaVigilancia() {
        return zonaVigilancia;
    }

    public void setZonaVigilancia(TipoVigilancia zonaVigilancia) {
        this.zonaVigilancia = zonaVigilancia;
    }
    
    //Método toString

    @Override
    public String toString() {
        return super.toString()+ "Vigilante{" + "zonaVigilancia=" + zonaVigilancia + '}';
    }
    
    
   
   
}
