package com.viewnext.tiendaDeportes.pilotoTiendaDeportes.business.service.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viewnext.tiendaDeportes.pilotoTiendaDeportes.business.model.Articulo;
import com.viewnext.tiendaDeportes.pilotoTiendaDeportes.business.service.ArticuloService;
import com.viewnext.tiendaDeportes.pilotoTiendaDeportes.integration.model.ArticuloEntity;
import com.viewnext.tiendaDeportes.pilotoTiendaDeportes.integration.repository.ArticuloEntityRepository;

@Service
public class ArticuloServiceImpl implements ArticuloService{

	@Autowired
	private DozerBeanMapper dozerBeanMapper;
	
	@Autowired
	private ArticuloEntityRepository articuloEntityRepository; 
	
	@Override
	public List<Articulo> getAll() {
		
		final List<ArticuloEntity> articulosEntities = articuloEntityRepository.findAll();
		
		final List<Articulo> articulos = articulosEntities.stream()
										.map(artEntity -> dozerBeanMapper.map(artEntity,Articulo.class))
										.collect(Collectors.toList());
		
		return articulos;
	}

	@Override
	public void create(Articulo articulo) {
	
		articuloEntityRepository.save(dozerBeanMapper.map(articulo,ArticuloEntity.class));
	}

}
