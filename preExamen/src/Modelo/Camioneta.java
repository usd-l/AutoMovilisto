/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author w
 */
public class Camioneta  extends Vehiculo{

    private double capacidadCarga; //en kg

    public Camioneta() {
    }

    public Camioneta(double capacidadCarga, String patente, String marca, String modelo, int kilometraje) {
        super(patente, marca, modelo, kilometraje);
        this.capacidadCarga = capacidadCarga;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }


    
    @Override
    public void MostrarDatos() {
        System.out.println("Camioneta " + "\ncapacidadCarga=" + capacidadCarga +
                 " Patente: " + super.getPatente() +
                " Marca: "+ super.getMarca()+
                " Modelo: "+ super.getModelo()+
                " Kilometraje: " + super.getKilometraje());
    }
    
    
    
}
