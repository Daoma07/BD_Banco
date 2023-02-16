/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import Frames.CrearCliente;
import dominio.Direccion;
import excepciones.PersistenciaException;
import implementaciones.ClientesDAO;
import implementaciones.ConexionBD;
import implementaciones.DireccionDAO;
import interfaces.IClientesDAO;
import interfaces.IConexionBD;
import interfaces.IDireccionDAO;

/**
 *
 * @author HP
 */
public class pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws PersistenciaException {
        // TODO code application logic here
        
       
   IConexionBD manejadorConexiones = new ConexionBD(
                "jdbc:mysql://localhost/banco_1pm",
                "root",
                "daniel2002");
        IClientesDAO clientesDAO = new ClientesDAO(manejadorConexiones);
        IDireccionDAO direccionessDAO = new DireccionDAO(manejadorConexiones);
        new CrearCliente(clientesDAO,direccionessDAO).setVisible(true);
    }
    
}
