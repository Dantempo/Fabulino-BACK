
package com.fabulino.registro.entity;

// Esta clase representa la entidad mapeada a la tabla registro_toques en la base de datos. 
// Es utilizada por JPA para interactuar directamente con los datos almacenados.
// Representa los datos que se guardan en la tabla registro_toques de la base de datos.
// Cada atributo está mapeado directamente a una columna en la tabla.	import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios") // Especificamos la tabla de la base de datos
public class registroEntityUsuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generación del ID
	private Long id;

	@Column(name = "nombre", nullable = false)
	private String nombre;

	@OneToOne
	@JoinColumn(name = "id_correo", referencedColumnName = "id")
	private registroEntityCorreo id_correo;

	@Column(name = "contraseña", nullable = false)
	private int contraseña;

	public registroEntityUsuario() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public registroEntityCorreo getId_correo() {
		return id_correo;
	}

	public void setId_correo(registroEntityCorreo id_correo) {
		this.id_correo = id_correo;
	}

	public int getContraseña() {
		return contraseña;
	}

	public void setContraseña(int contraseña) {
		this.contraseña = contraseña;
	}
}
