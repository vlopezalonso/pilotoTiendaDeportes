package com.viewnext.tiendaDeportes.pilotoTiendaDeportes.integration.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ARTICULOS")
public class ArticuloEntity implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	private Long codigoArticulo;
	
	private String nombreArticulo;
	private Boolean stockDisponible;
	
	public ArticuloEntity() {
		
	}

	public Long getCodigoArticulo() {
		return codigoArticulo;
	}

	public void setCodigoArticulo(Long codigoArticulo) {
		this.codigoArticulo = codigoArticulo;
	}

	public String getNombreArticulo() {
		return nombreArticulo;
	}

	public void setNombreArticulo(String nombreArticulo) {
		this.nombreArticulo = nombreArticulo;
	}

	public Boolean getStockDisponible() {
		return stockDisponible;
	}

	public void setStockDisponible(Boolean stockDisponible) {
		this.stockDisponible = stockDisponible;
	}

	@Override
	public String toString() {
		return "ArticuloEntity [codigoArticulo=" + codigoArticulo + ", nombreArticulo=" + nombreArticulo
				+ ", stockDisponible=" + stockDisponible + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoArticulo == null) ? 0 : codigoArticulo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ArticuloEntity other = (ArticuloEntity) obj;
		if (codigoArticulo == null) {
			if (other.codigoArticulo != null)
				return false;
		} else if (!codigoArticulo.equals(other.codigoArticulo))
			return false;
		return true;
	}
	
	
	
	
}
