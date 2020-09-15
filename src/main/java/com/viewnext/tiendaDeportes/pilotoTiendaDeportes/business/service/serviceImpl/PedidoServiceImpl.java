package com.viewnext.tiendaDeportes.pilotoTiendaDeportes.business.service.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viewnext.tiendaDeportes.pilotoTiendaDeportes.business.model.Pedido;
import com.viewnext.tiendaDeportes.pilotoTiendaDeportes.business.service.PedidoService;
import com.viewnext.tiendaDeportes.pilotoTiendaDeportes.integration.model.PedidoEntity;
import com.viewnext.tiendaDeportes.pilotoTiendaDeportes.integration.repository.PedidoEntityRepository;

@Service
public class PedidoServiceImpl implements PedidoService{

	
	@Autowired
	private DozerBeanMapper dozerBeanMapper;
	
	@Autowired
	private PedidoEntityRepository pedidoEntityRepository;
	@Override
	public List<Pedido> create(List<Pedido> pedidos) {
		
		
		final List<PedidoEntity> pedidosEntities = pedidos.stream()
							.map(pedido -> dozerBeanMapper.map(pedido, PedidoEntity.class))
							.collect(Collectors.toList());
		
		List<PedidoEntity> createdPedidosOnDB = pedidoEntityRepository.saveAll(pedidosEntities);
		
		final List<Pedido> createdPedidosFromDB = createdPedidosOnDB.stream()
									.map(pedidoEntity -> dozerBeanMapper.map(pedidoEntity,Pedido.class))
									.collect(Collectors.toList());
		
		return createdPedidosFromDB;
	}

	@Override
	public List<Pedido> getAll() {
		
		final List<PedidoEntity> pedidosEntities = pedidoEntityRepository.findAll();
		final List<Pedido> pedidos = pedidosEntities.stream()
								.map(pedidoEntity -> dozerBeanMapper.map(pedidoEntity, Pedido.class))
								.collect(Collectors.toList());
		return pedidos;
	}

}
