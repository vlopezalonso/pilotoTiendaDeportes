package com.viewnext.tiendaDeportes.pilotoTiendaDeportes.integration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.viewnext.tiendaDeportes.pilotoTiendaDeportes.integration.model.ArticuloEntity;

@Repository
public interface ArticuloEntityRepository extends JpaRepository<ArticuloEntity, Long>{

	
}
