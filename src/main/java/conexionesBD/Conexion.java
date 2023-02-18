/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionesBD;

import implementaciones.*;
import interfaces.*;
import presentacion.*;

/**
 *
 * @author HP
 */
public class Conexion {

    IConexionBD manejadorConexiones = new ConexionBD(
            "jdbc:mysql://localhost/banco_1pm",
            "root",
            "david");

    public void generarPresentacionesRegistroCliente() {
        IClientesDAO clientesDAO = new ClientesDAO(manejadorConexiones);
        IDireccionDAO direccionesDAO = new DireccionDAO(manejadorConexiones);
        new RegistroCliente(clientesDAO, direccionesDAO).setVisible(true);
    }

    public ICuentasDAO generarPresentacionesRegistrarCuenta() {
        ICuentasDAO cuentasDAO = new CuentasDAO(manejadorConexiones);

        return new CuentasDAO(manejadorConexiones);

    }

}
