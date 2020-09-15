package com.viewnext.tiendaDeportes.pilotoTiendaDeportes.integration.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class LineaPedidoEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	ArticuloEntity articulo;
	
	private Integer cantidad;
	
	public LineaPedidoEntity() {
		
	}

	public ArticuloEntity getArticulo() {
		return articulo;
	}

	public void setArticulo(ArticuloEntity articulo) {
		this.articulo = articulo;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "LineaPedidoEntity [articulo=" + articulo + ", cantidad=" + cantidad + "]";
	}
	
	
	
}
