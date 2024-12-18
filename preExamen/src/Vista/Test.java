/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Controlador.Gestion;
import Modelo.Automovil;
import Modelo.Camioneta;
import Modelo.Cliente;
import Modelo.Vehiculo;
import Modelo.Venta;

/**
 *
 * @author w
 */
public class Test {
    public static void main(String[] args) {
        
        Gestion gest = new Gestion();
        
        Cliente cli1 = new Cliente("12.345.678-9", "Carlos Pérez", " carlos.perez@example.com ", 912345678);
        Cliente cli2 = new Cliente("14.567.890-2", "María González", " maria.gonzalez@example.com ", 987654321);
        gest.agregarCliente(cli1);
        gest.agregarCliente(cli2);
        gest.listarClientes();
        
        Vehiculo veh1 = new Automovil("Convencional", false, "HVDF10", "Toyota", "Corlla", 50000);
        Vehiculo veh2 = new Camioneta(750, "KLWX33", "Chevrolet", "Silverado", 15000);
        
        
        gest.agregarVehiculo(veh1);
        gest.agregarVehiculo(veh2);
        gest.listarVehiculos();
        
        Venta ven1 = new Venta(cli1, veh1, 15000, "17/12/2024");
        Venta ven2 = new Venta(cli2, veh2, 63000, "23/12/2024");
        
        gest.hacerVenta(ven1);
        gest.hacerVenta(ven2);
        gest.listar();
        
    }
}
