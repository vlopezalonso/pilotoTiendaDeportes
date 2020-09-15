package com.viewnext.tiendaDeportes.pilotoTiendaDeportes.integration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.viewnext.tiendaDeportes.pilotoTiendaDeportes.integration.model.ClienteEntity;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, String>{

}
