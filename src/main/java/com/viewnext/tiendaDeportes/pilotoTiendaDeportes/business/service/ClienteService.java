package com.viewnext.tiendaDeportes.pilotoTiendaDeportes.business.service;

import java.util.List;



import com.viewnext.tiendaDeportes.pilotoTiendaDeportes.business.model.Cliente;


public interface ClienteService {
	
	public List<Cliente> getAll();
	public void create(Cliente cliente);
}
