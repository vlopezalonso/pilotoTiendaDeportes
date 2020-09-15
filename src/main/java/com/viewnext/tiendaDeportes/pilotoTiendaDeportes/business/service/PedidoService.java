package com.viewnext.tiendaDeportes.pilotoTiendaDeportes.business.service;

import java.util.List;

import com.viewnext.tiendaDeportes.pilotoTiendaDeportes.business.model.Pedido;



public interface PedidoService {

	public List<Pedido> create(List<Pedido> pedidos);
	public List<Pedido> getAll();
}
