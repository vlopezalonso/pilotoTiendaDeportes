package com.viewnext.tiendaDeportes.pilotoTiendaDeportes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viewnext.tiendaDeportes.pilotoTiendaDeportes.business.model.Pedido;
import com.viewnext.tiendaDeportes.pilotoTiendaDeportes.business.service.PedidoService;

@RestController
@CrossOrigin
@RequestMapping("/pedidos")
public class PedidoController {

	@Autowired
	PedidoService pedidoService;
	
	@GetMapping
	public List<Pedido> getAll(){
		return pedidoService.getAll();
	}
	
	@PostMapping
	public List<Pedido> create(@RequestBody List<Pedido> pedidos){
		return (List<Pedido>) pedidoService.create(pedidos);
	}
}
