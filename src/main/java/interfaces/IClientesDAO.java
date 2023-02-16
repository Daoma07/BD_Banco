/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import dominio.Cliente;

/**
 *
 * @author HP
 */
public interface IClientesDAO {

    
    Cliente insertar(Cliente cliente);

    Cliente actualizar(Integer id_cliente);

    Cliente consultar(Integer id_cliente);

}
