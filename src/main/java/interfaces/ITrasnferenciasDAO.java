/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import dominio.Transferencia;

/**
 *
 * @author HP
 */
public interface ITrasnferenciasDAO {

    Transferencia insertar(Transferencia transferencia);

    Transferencia consultar(Integer id_transferencia);

}
