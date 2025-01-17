// Esta clase es un Data Transfer Object (DTO) que define cómo se reciben los datos desde el frontend.
// Mapea el JSON enviado por el cliente a un objeto en Java.

package com.fabulino.registro.dto;

public class DatosRegistroDto {
	private String correo;
	private String nombre;
	private String contraseña;
	private String tipo;
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
}
