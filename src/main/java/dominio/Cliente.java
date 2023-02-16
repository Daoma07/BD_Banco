/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author HP
 */
public class Cliente {

    private Integer id_cliente;
    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    private Date fecha_nacimineto;
    private Integer id_direccion;
    //Edad no se pone porque se calcula desde la base de datos

    public Cliente() {
    }

    public Cliente(Integer id_cliente, String nombre, String apellido_paterno, String apellido_materno, Date fecha_nacimineto, Integer id_direccion) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.fecha_nacimineto = fecha_nacimineto;
        this.id_direccion = id_direccion;
    }

    public Cliente(String nombre, String apellido_paterno, String apellido_materno, Date fecha_nacimineto, Integer id_direccion) {
        this.nombre = nombre;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.fecha_nacimineto = fecha_nacimineto;
        this.id_direccion = id_direccion;
    }

    
    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public Date getFecha_nacimineto() {
        return fecha_nacimineto;
    }

    public void setFecha_nacimineto(Date fecha_nacimineto) {
        this.fecha_nacimineto = fecha_nacimineto;
    }

    public Integer getId_direccion() {
        return id_direccion;
    }

    public void setId_direccion(Integer id_direccion) {
        this.id_direccion = id_direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id_cliente=" + id_cliente + ", nombre=" + nombre + ", apellido_paterno=" + apellido_paterno + ", apellido_materno=" + apellido_materno + ", fecha_nacimineto=" + fecha_nacimineto + ", id_direccion=" + id_direccion + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.id_cliente);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.id_cliente, other.id_cliente)) {
            return false;
        }
        return true;
    }

}
