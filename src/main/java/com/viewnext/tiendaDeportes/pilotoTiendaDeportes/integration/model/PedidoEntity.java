package com.viewnext.tiendaDeportes.pilotoTiendaDeportes.integration.model;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name = "PEDIDOS")
public class PedidoEntity {

	@Id
	@GeneratedValue(generator = "PEDIDOS_SEQ")
	private Long id;
	
	@ManyToOne
	private ClienteEntity cliente;
	
	@Embedded
	DireccionEntity direccion;
	
	@ElementCollection(fetch = FetchType.EAGER)
	@OrderColumn(name="INDICE")	
	@CollectionTable(
			name="LINEAS_PEDIDO",
			joinColumns = @JoinColumn(name="ID_PEDIDO"))
	List<LineaPedidoEntity> lineasPedido;
	
	public PedidoEntity() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public DireccionEntity getDireccion() {
		return direccion;
	}

	public void setDireccion(DireccionEntity direccion) {
		this.direccion = direccion;
	}

	public List<LineaPedidoEntity> getLineasPedido() {
		return lineasPedido;
	}

	public void setLineasPedido(List<LineaPedidoEntity> lineasPedido) {
		this.lineasPedido = lineasPedido;
	}

	
	public ClienteEntity getCliente() {
		return cliente;
	}

	public void setCliente(ClienteEntity cliente) {
		this.cliente = cliente;
	}

	
	@Override
	public String toString() {
		return "PedidoEntity [id=" + id + ", cliente=" + cliente + ", direccion=" + direccion + ", lineasPedido="
				+ lineasPedido + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PedidoEntity other = (PedidoEntity) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}
