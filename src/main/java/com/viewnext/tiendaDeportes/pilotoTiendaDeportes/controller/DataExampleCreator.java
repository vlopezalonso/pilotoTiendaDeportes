package com.viewnext.tiendaDeportes.pilotoTiendaDeportes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viewnext.tiendaDeportes.pilotoTiendaDeportes.business.model.Articulo;
import com.viewnext.tiendaDeportes.pilotoTiendaDeportes.business.model.Cliente;
import com.viewnext.tiendaDeportes.pilotoTiendaDeportes.business.service.ArticuloService;
import com.viewnext.tiendaDeportes.pilotoTiendaDeportes.business.service.ClienteService;

@RestController
@CrossOrigin
public class DataExampleCreator {


	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private ArticuloService articuloService;
	
	
	@GetMapping("/crearDatos")
	public String reset() {
	//TODO borrado datos 
//		articuloEntityRepository.deleteAll();
//		ClienteEntityepository.deleteAll();
				
		createClientes();
		createArticulos();
		
		return "ok";
	}
	
	private void createClientes() {
			
		System.out.println("creando clientes...");
		
		Cliente cliente = new Cliente();
		cliente.setDni("23433323Q");
		cliente.setNombre("Jose");
		cliente.setApellido("Ruiz");
		
		Cliente cliente2 = new Cliente();
		cliente2.setDni("23546576P");
		cliente2.setNombre("Rigoberto");
		cliente2.setApellido("Floripondio");
		
		clienteService.create(cliente);
		clienteService.create(cliente2);
	}
	
	private void createArticulos() {
		System.out.println("creando articulos...");
		
		Articulo articulo1 = new Articulo();
		articulo1.setCodigoArticulo(23423423L);
		articulo1.setNombreArticulo("Zapatillas running");
		articulo1.setStockDisponible(true);
		
		Articulo articulo2 = new Articulo();
		articulo2.setCodigoArticulo(56546456L);
		articulo2.setNombreArticulo("Panatalones fitness");
		articulo2.setStockDisponible(false);
		
		Articulo articulo3 = new Articulo();
		articulo3.setCodigoArticulo(3468743543L);
		articulo3.setNombreArticulo("camiseta transpirable");
		articulo3.setStockDisponible(true);
		
		articuloService.create(articulo1);
		articuloService.create(articulo2);
		articuloService.create(articulo3);
	}
	
}
