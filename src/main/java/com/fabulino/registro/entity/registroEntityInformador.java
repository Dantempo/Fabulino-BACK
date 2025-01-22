package com.fabulino.registro.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "informadores") // Especificamos la tabla de la base de datos

public class registroEntityInformador {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generación del ID
	private Long id;
	
	@OneToOne
	@JoinColumn(name = "id_usuario", referencedColumnName = "id")
	private registroEntityUsuario id_usuario;

	@OneToOne
	@JoinColumn(name = "id_correo", referencedColumnName = "id")
	private registroEntityCorreo id_correo;

	@Column(name = "tipo", nullable = false)
	private String tipo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public registroEntityCorreo getId_correo() {
		return id_correo;
	}

	public void setId_correo(registroEntityCorreo id_correo) {
		this.id_correo = id_correo;
	}

	public registroEntityUsuario getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(registroEntityUsuario id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
