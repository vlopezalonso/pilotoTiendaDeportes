package com.viewnext.tiendaDeportes.pilotoTiendaDeportes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viewnext.tiendaDeportes.pilotoTiendaDeportes.business.model.Cliente;
import com.viewnext.tiendaDeportes.pilotoTiendaDeportes.business.service.ClienteService;


@RestController
@CrossOrigin
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
	@GetMapping
	public List<Cliente> getAll(){
		return clienteService.getAll();
	}
	
		
}