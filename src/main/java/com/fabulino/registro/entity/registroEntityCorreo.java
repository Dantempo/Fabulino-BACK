package com.fabulino.registro.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "correos") // Especificamos la tabla de la base de datos
public class registroEntityCorreo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generación del ID
	private Long id;

	@Column(name = "correo", nullable = false)
	private String correo;

	@OneToOne(mappedBy = "id_correo", cascade = CascadeType.ALL)
	public registroEntityUsuario usuarios;

	public registroEntityCorreo() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public registroEntityUsuario getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(registroEntityUsuario usuarios) {
		this.usuarios = usuarios;
	}

}
