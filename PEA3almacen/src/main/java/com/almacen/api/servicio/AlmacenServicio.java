package com.almacen.api.servicio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.almacen.api.entidad.Almacen;

public interface AlmacenServicio extends JpaRepository<Almacen, Long> {

}
