package com.viewnext.tiendaDeportes.pilotoTiendaDeportes.business.model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private Long id;
	private Cliente cliente;
	private Direccion direccion;
	private List<LineaPedido> lineasPedido = new ArrayList<>();
	
	public Pedido() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public List<LineaPedido> getLineasPedido() {
		return lineasPedido;
	}

	public void setLineasPedido(List<LineaPedido> lineasPedido) {
		this.lineasPedido = lineasPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", cliente=" + cliente + ", direccion=" + direccion + ", lineasPedido="
				+ lineasPedido + "]";
	}

	
	
	
}
