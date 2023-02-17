/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementaciones;

import dominio.Cliente;
import excepciones.PersistenciaException;
import interfaces.IConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class ClientesDAO implements interfaces.IClientesDAO {

    private static final Logger LOG = Logger.getLogger(ClientesDAO.class.getName());
    private final IConexionBD MANEJADOR_CONEXIONES;

    public ClientesDAO(IConexionBD manejadorConexiones) {
        this.MANEJADOR_CONEXIONES = manejadorConexiones;
    }

    @Override
    public Cliente insertar(Cliente cliente) throws PersistenciaException {
        String sql = "INSERT INTO cliente(nombres, apellido_paterno, apellido_materno, fecha_nacimiento, id_direccion) VALUES(?,?,?,?,?)";
        try (
                Connection conexion = MANEJADOR_CONEXIONES.crearConexion();
                PreparedStatement comando = conexion.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);) {

            comando.setString(1, cliente.getNombre());
            comando.setString(2, cliente.getApellido_paterno());
            comando.setString(3, cliente.getApellido_materno());
            comando.setString(4, cliente.getFecha_nacimineto());
            comando.setInt(5, cliente.getId_direccion());

            comando.executeUpdate();
            ResultSet rs = comando.getGeneratedKeys();

            while (rs.next()) {
                int claveGenerada = rs.getInt(1);
                cliente.setId_cliente(claveGenerada);
                JOptionPane.showMessageDialog(null, "Cliente Creado con EXITO");
                return cliente;
            }
            LOG.log(Level.WARNING, "Se inserto el cliente pero no se gener� id");
            throw new PersistenciaException("Se inserto el cliente pero no se gener� id");
        } catch (SQLException ex) {
            LOG.log(Level.SEVERE, "No se pudo insertar al cliente " + ex.getMessage());
            throw new PersistenciaException("No se pudo insertar al cliente " + ex.getMessage());
        }
    }

    @Override
    public Cliente actualizar(Integer id_cliente) {

        return null;

    }

    @Override
    public Cliente consultar(Integer id_cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
