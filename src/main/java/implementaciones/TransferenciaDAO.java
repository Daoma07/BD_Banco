/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones;

import dominio.Transferencia;
import interfaces.ITrasnferenciasDAO;

/**
 *
 * @author deivi
 */
public class TransferenciaDAO implements ITrasnferenciasDAO{

    /**
     * 
     * @param transferencia
     * @return 
     */
    //TODO: Tenemos pensado usar triggers en esta parte para lo de transferencias al momento de actualizar una cuenta(descontarle la tranferencia)
    //y seguido de eso hacer un trigger que le reste a la otra cuenta, dentro de ese proceso decidimos tener un rollback despues de hacer el primer descuento.
    @Override
    public Transferencia insertar(Transferencia transferencia) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Transferencia consultar(Integer id_transferencia) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
