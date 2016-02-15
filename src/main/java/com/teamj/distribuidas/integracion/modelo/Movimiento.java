/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamj.distribuidas.integracion.modelo;

import com.teamj.distribuidas.integracion.protocolo.Cuerpo;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author LuisAlberto
 */
public class Movimiento {

    private Integer id;
    private BigDecimal monto;
    private Date fechaHora;
    private BigDecimal Saldo;
    private String tipo;
    private String descripcion;
    private Cuenta cuenta;

    public Movimiento(Integer id, BigDecimal monto, Date fechaHora, BigDecimal Saldo, String tipo, String descripcion, Cuenta cuenta) {
        this.id = id;
        this.monto = monto;
        this.fechaHora = fechaHora;
        this.Saldo = Saldo;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.cuenta = cuenta;
    }

    public Movimiento() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public BigDecimal getSaldo() {
        return Saldo;
    }

    public void setSaldo(BigDecimal Saldo) {
        this.Saldo = Saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return id + Cuerpo.FIELD_SEPARATOR_CHAR + monto + Cuerpo.FIELD_SEPARATOR_CHAR + fechaHora + Cuerpo.FIELD_SEPARATOR_CHAR + Saldo + Cuerpo.FIELD_SEPARATOR_CHAR + tipo + Cuerpo.FIELD_SEPARATOR_CHAR + descripcion + Cuerpo.FIELD_SEPARATOR_CHAR + cuenta;
    }

}
