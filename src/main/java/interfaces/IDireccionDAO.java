/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import dominio.Direccion;

/**
 *
 * @author HP
 */
public interface IDireccionDAO {

    Direccion insertar(Direccion direccion);

    Direccion actualizar(Integer id_direccion);

    Direccion consultar(Integer id_direccion);

}
