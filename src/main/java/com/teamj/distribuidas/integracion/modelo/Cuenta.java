/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamj.distribuidas.integracion.modelo;

import com.teamj.distribuidas.integracion.protocolo.Cuerpo;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author LuisAlberto
 */
public class Cuenta {

    private String id;
    private String numero;
    private BigDecimal saldo;
    private String codigoCliente;
    private List<Movimiento> movimientos;

    public Cuenta(String id, String numero, BigDecimal saldo, String codigoCliente) {
        this.id = id;
        this.numero = numero;
        this.saldo = saldo;
        this.codigoCliente = codigoCliente;
    }

    public Cuenta() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public List<Movimiento> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(List<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }

    @Override
    public String toString() {
        return id + Cuerpo.FIELD_SEPARATOR_CHAR + numero + Cuerpo.FIELD_SEPARATOR_CHAR + saldo + Cuerpo.FIELD_SEPARATOR_CHAR + codigoCliente + Cuerpo.FIELD_SEPARATOR_CHAR + movimientosAsTexto();
    }
    
    public String movimientosAsTexto() {
        String aux;
        aux = "";
        for (int i = 0; i < this.movimientos.size(); i++) {
            aux = aux + movimientos.get(i).toString();

        }
        return aux;
    }

    public String astexto() {
        return id + "a" + numero + "a" + saldo + "a" + codigoCliente + "a";
    }

}
