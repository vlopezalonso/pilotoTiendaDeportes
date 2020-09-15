package com.viewnext.tiendaDeportes.pilotoTiendaDeportes.business.model;

public class Articulo {

	private Long codigoArticulo;
	private String nombreArticulo;
	private Boolean stockDisponible;
	
	
	public Articulo() {
		
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
		return "Articulo [codigoArticulo=" + codigoArticulo + ", nombreArticulo=" + nombreArticulo
				+ ", stockDisponible=" + stockDisponible + "]";
	}

}
