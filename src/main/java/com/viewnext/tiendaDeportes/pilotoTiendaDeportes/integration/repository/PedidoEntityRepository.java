package com.viewnext.tiendaDeportes.pilotoTiendaDeportes.integration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.viewnext.tiendaDeportes.pilotoTiendaDeportes.integration.model.PedidoEntity;

@Repository
public interface PedidoEntityRepository extends JpaRepository<PedidoEntity, Long>{

}
