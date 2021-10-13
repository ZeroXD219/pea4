package com.almacen.api.servicio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.almacen.api.entidad.Empleado;

public interface EmpleadoServicio extends JpaRepository<Empleado, Long> {

}
