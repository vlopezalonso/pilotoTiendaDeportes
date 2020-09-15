package com.viewnext.tiendaDeportes.pilotoTiendaDeportes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viewnext.tiendaDeportes.pilotoTiendaDeportes.business.model.Articulo;
import com.viewnext.tiendaDeportes.pilotoTiendaDeportes.business.service.ArticuloService;

@RestController
@CrossOrigin
@RequestMapping("/articulos")
public class ArticuloController {

	@Autowired
	private ArticuloService articuloService;
	
	@GetMapping
	public List<Articulo> getAll(){
		return articuloService.getAll();
	}
}
