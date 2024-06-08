
package com.unicauca.kelly.parqueaderocolanta;
public class Vehículo {
    //Atributos
    private String Placa;
    private TipoVehículo tipoVehículo;
    
    //Constructor con parámetros

    public Vehículo(String Placa, TipoVehículo tipoVehículo) {
        this.Placa = Placa;
        this.tipoVehículo = tipoVehículo;
    }
    
    //Getter and Setter

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public TipoVehículo getTipoVehículo() {
        return tipoVehículo;
    }

    public void setTipoVehículo(TipoVehículo tipoVehículo) {
        this.tipoVehículo = tipoVehículo;
    }
    //Método toString 

    @Override
    public String toString() {
        return "Veh\u00edculo{" + "Placa=" + Placa + ", tipoVeh\u00edculo=" + tipoVehículo + '}';
    }
    
}
