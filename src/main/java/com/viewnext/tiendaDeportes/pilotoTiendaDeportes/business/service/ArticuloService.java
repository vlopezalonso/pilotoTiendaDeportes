package com.viewnext.tiendaDeportes.pilotoTiendaDeportes.business.service;

import java.util.List;

import com.viewnext.tiendaDeportes.pilotoTiendaDeportes.business.model.Articulo;

public interface ArticuloService {

	public List<Articulo> getAll();
	public void create(Articulo articulo);
}
