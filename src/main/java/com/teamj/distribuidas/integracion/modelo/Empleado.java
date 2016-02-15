/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamj.distribuidas.integracion.modelo;

import com.teamj.distribuidas.integracion.protocolo.Cuerpo;

/**
 *
 * @author LuisAlberto
 */
public class Empleado {
    private Integer id;
    private String nombreUsuario;
    private String password;
    private String identificacion;
    private String email;

    public Empleado(Integer id, String nombreUsuario, String password, String identificacion, String email) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.identificacion = identificacion;
        this.email = email;
    }

    public Empleado() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return id + Cuerpo.FIELD_SEPARATOR_CHAR + nombreUsuario + Cuerpo.FIELD_SEPARATOR_CHAR + password + Cuerpo.FIELD_SEPARATOR_CHAR + identificacion + Cuerpo.FIELD_SEPARATOR_CHAR + email;
    }
    
    
    
}
