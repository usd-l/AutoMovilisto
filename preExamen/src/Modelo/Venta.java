/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author w
 */
public class Venta {
    private Cliente cliente;
    private Vehiculo vehiculo;
    
    private int valorTotal;
    private String fecha;

    public Venta() {
    }

    public Venta(Cliente cliente, Vehiculo vehiculo, int valorTotal, String fecha) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.valorTotal = valorTotal;
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Venta{" + "cliente=" + cliente + ", vehiculo=" + vehiculo + ", valorTotal=" + valorTotal + ", fecha=" + fecha + '}';
    }
    
    
    
    
}
