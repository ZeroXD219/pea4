package com.almacen.api.entidad;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empleado")
public class Empleado implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long idempleado;
	private String nomempleado;
	private String dni;
	private String telefono;
	private String correo;
	public Long getIdempleado() {
		return idempleado;
	}
	public void setIdempleado(Long idempleado) {
		this.idempleado = idempleado;
	}
	public String getNomempleado() {
		return nomempleado;
	}
	public void setNomempleado(String nomempleado) {
		this.nomempleado = nomempleado;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	
}
