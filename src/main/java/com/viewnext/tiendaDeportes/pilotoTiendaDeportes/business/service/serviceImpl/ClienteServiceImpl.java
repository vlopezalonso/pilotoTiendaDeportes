package com.viewnext.tiendaDeportes.pilotoTiendaDeportes.business.service.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viewnext.tiendaDeportes.pilotoTiendaDeportes.business.model.Cliente;
import com.viewnext.tiendaDeportes.pilotoTiendaDeportes.business.service.ClienteService;
import com.viewnext.tiendaDeportes.pilotoTiendaDeportes.integration.model.ClienteEntity;
import com.viewnext.tiendaDeportes.pilotoTiendaDeportes.integration.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	DozerBeanMapper dozerBeanMapper;
	
	@Autowired
	ClienteRepository clienteRepository;
	
	@Override
	public List<Cliente> getAll() {
		
		final List<ClienteEntity> clientesEntities = clienteRepository.findAll();
		
		final List<Cliente> clientes = clientesEntities.stream()
				.map(clienteEntity -> dozerBeanMapper.map(clienteEntity,Cliente.class))
				.collect(Collectors.toList());	
		
		return clientes;
	}

	@Override
	public void create(Cliente cliente) {
		
		clienteRepository.save(dozerBeanMapper.map(cliente, ClienteEntity.class));
		
	}
	
	

}
