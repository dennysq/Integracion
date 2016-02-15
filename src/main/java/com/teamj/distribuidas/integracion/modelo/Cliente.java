/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamj.distribuidas.integracion.modelo;

import com.teamj.distribuidas.integracion.protocolo.Cuerpo;
import java.util.List;

/**
 *
 * @author LuisAlberto
 */
public class Cliente {

    private String id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    private List<Cuenta> cuentas;

    public Cliente(String id, String nombre, String apellido, String telefono, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public Cliente() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    @Override
    public String toString() {
        return id + Cuerpo.FIELD_SEPARATOR_CHAR + nombre + Cuerpo.FIELD_SEPARATOR_CHAR + apellido + Cuerpo.FIELD_SEPARATOR_CHAR + telefono
                + Cuerpo.FIELD_SEPARATOR_CHAR + telefono + Cuerpo.FIELD_SEPARATOR_CHAR + cuentasAsTexto();
    }

    public String cuentasAsTexto() {
        String aux;
        aux = "";
        for (int i = 0; i < this.cuentas.size(); i++) {
            aux = aux + cuentas.get(i).toString();

        }
        return aux;
    }

    public String astexto() {
        return id + "a" + nombre + "a" + apellido + "a" + telefono + "a" + telefono;
    }

}
