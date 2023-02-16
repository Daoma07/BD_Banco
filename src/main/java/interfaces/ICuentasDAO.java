/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import dominio.Cuenta;

/**
 *
 * @author HP
 */
public interface ICuentasDAO {

    Cuenta insertar(Cuenta cuenta);

    /**
     * Deposito asi mismo
     */
    Cuenta actualizarSaldo(Cuenta numero_cuenta);

    Cuenta cancelarCuenta(Cuenta numero_cuenta);

}
