package com.viewnext.tiendaDeportes.pilotoTiendaDeportes.business.model;



public class LineaPedido {
	private Articulo articulo;
	private int cantidad;
	
	public LineaPedido() {
		
	}
	
	public Articulo getArticulo() {
		return articulo;
	}
	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "LineaPedido [articulo=" + articulo + ", cantidad=" + cantidad + "]";
	}

}
