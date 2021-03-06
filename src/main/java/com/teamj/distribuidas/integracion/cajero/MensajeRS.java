/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamj.distribuidas.integracion.cajero;

import com.teamj.distribuidas.integracion.protocolo.Cabecera;
import com.teamj.distribuidas.integracion.protocolo.Mensaje;
import com.teamj.distribuidas.integracion.protocolo.consulta.CuentaRS;
import com.teamj.distribuidas.integracion.protocolo.seguridad.AutenticacionRS;
import com.teamj.distribuidas.integracion.protocolo.transaccion.DepositoRS;
import com.teamj.distribuidas.integracion.protocolo.transaccion.RetiroRS;



/**
 *
 * @author LuisAlberto
 */
public class MensajeRS extends Mensaje {
	public MensajeRS() {
	}

	public MensajeRS(String originador, String idMensaje) {
		this.cabecera = new Cabecera(Mensaje.TIPO_MENSAJE_RESPONSE, originador, idMensaje);
	}

	@Override
	public boolean build(String input) {
		boolean result = true;
		if (validate(input)) {
			this.cabecera = new Cabecera();

			if (this.cabecera.build(input.substring(0, Cabecera.HEADER_LENGTH))) {
				String cuerpo = input.substring(Cabecera.HEADER_LENGTH);

				if (this.cabecera.getTipoMensaje().equals(Mensaje.TIPO_MENSAJE_RESPONSE)) {
					switch (this.cabecera.getIdMensaje()) {
					case ID_MENSAJE_AUTENTICACION:
						AutenticacionRS autenticacionRS = new AutenticacionRS();
                                                autenticacionRS.build(cuerpo);
						this.cuerpo = autenticacionRS;
						break;
					case ID_MENSAJE_CONSULTACUENTA:
						CuentaRS cuentaRS = new CuentaRS();
						cuentaRS.build(cuerpo);
						this.cuerpo = cuentaRS;
						break;
					case ID_MENSAJE_DEPOSITO:
						DepositoRS depositoRS = new DepositoRS();
						depositoRS.build(cuerpo);
						this.cuerpo = depositoRS;
						break;
					case ID_MENSAJE_RETIRO:
						RetiroRS retiroRS = new RetiroRS();
						retiroRS.build(cuerpo);
						this.cuerpo = retiroRS;
						break;
					default:
						result = false;
					}
				} else {
					result = false;
				}
			} else {
				result = false;
			}
		} else {
			result = false;
		}
		return result;

	}

}
