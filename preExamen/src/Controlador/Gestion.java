
package Controlador;

import Modelo.Cliente;
import Modelo.Vehiculo;
import Modelo.Venta;
import java.util.ArrayList;

/**
 *
 * @author w
 */
public class Gestion {
    static ArrayList<Cliente> clientes = new ArrayList<>();
    ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    ArrayList<Venta> ventas = new ArrayList<>();
    
    
    public void agregarCliente(Cliente cliente){
        clientes.add(cliente);
    }
    
    public void listarClientes(){
        for (Cliente cli : clientes) {
            System.out.println("Clientes: "+ cli);
        }
    }
    
    public ArrayList<Cliente> listarEnTB(){
        ArrayList<Cliente> clientestb = new ArrayList<>();
        for (Cliente cliente : clientes) {
            clientestb.add(cliente);
        }
        return clientestb; 
    }
    
    public void agregarVehiculo(Vehiculo vehi){
        vehiculos.add(vehi);
    }
    
    public void listarVehiculos(){
        for (Vehiculo vehi : vehiculos) {
            vehi.MostrarDatos();
        }
    }
    
    
    public void hacerVenta(Venta venta){
        boolean clientEncontrado = false, vehiculoEncontrado = false; // <- Verificar
        
        Cliente client = null;
        Vehiculo veh = null;
        
        for (Cliente cliente : clientes) {
            if (cliente.getRut().equals(venta.getCliente().getRut())){
                client = cliente;
                clientEncontrado = true;
                break;
            }
        }
        
        if(!clientEncontrado){
            System.out.println("Cliente no encontrado / existente");
        }
        
        
        for (Vehiculo vehi : vehiculos) {
            if(vehi.getPatente().equals(venta.getVehiculo().getPatente())){
                veh = vehi;
                vehiculoEncontrado = true;
                break;
            }
            
        }
        if(!vehiculoEncontrado){
            System.out.println("Vehiculo no encontrado / existente");
        }
        
        ventas.add(new Venta(client, veh, venta.getValorTotal(), venta.getFecha()));

        
    }
    
    public void listar(){
        for (Venta ve : ventas) {
            System.out.println(ve.toString());
            
        }
    }
    
}
