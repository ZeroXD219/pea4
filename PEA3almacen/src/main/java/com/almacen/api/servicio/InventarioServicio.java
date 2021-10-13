package com.almacen.api.servicio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.almacen.api.entidad.Inventario;

public interface InventarioServicio extends JpaRepository<Inventario, Long> {

}
