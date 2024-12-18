/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author w
 */
public class Automovil extends Vehiculo{

    private String tipoEnergia; //Convencial, electrico o hibrido
    private boolean tieneAire;

    public Automovil() {
    }

    public Automovil(String tipoEnergia, boolean tieneAire, String patente, String marca, String modelo, int kilometraje) {
        super(patente, marca, modelo, kilometraje);
        this.tipoEnergia = tipoEnergia;
        this.tieneAire = tieneAire;
    }

    

    public String getTipoEnergia() {
        return tipoEnergia;
    }

    public void setTipoEnergia(String tipoEnergia) {
        this.tipoEnergia = tipoEnergia;
    }

    public boolean isTieneAire() {
        return tieneAire;
    }

    public void setTieneAire(boolean tieneAire) {
        this.tieneAire = tieneAire;
    }
    
    
    
    
    @Override
    public void MostrarDatos() {
        System.out.println("Automovil " + "\n"
                + "tipoEnergia=" + tipoEnergia +
                " tieneAire=" + tieneAire +
                " Patente: " + super.getPatente() +
                " Marca: "+ super.getMarca()+
                " Modelo: "+ super.getModelo()+
                " Kilometraje: " + super.getKilometraje());
    }
    
}
