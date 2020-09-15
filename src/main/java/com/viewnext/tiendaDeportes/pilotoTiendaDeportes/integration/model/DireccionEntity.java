package com.viewnext.tiendaDeportes.pilotoTiendaDeportes.integration.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class DireccionEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String calle;
	private String poblacion;
	private String codigoPostal;
	private String provincia;
	private String pais;
	
	public DireccionEntity() {
		
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "DireccionEntity [calle=" + calle + ", poblacion=" + poblacion + ", codigoPostal=" + codigoPostal
				+ ", provincia=" + provincia + ", pais=" + pais + "]";
	}
		
	
}
