// Esta clase representa la entidad mapeada a la tabla registro_toques en la base de datos. 
// Es utilizada por JPA para interactuar directamente con los datos almacenados.
// Representa los datos que se guardan en la tabla registro_toques de la base de datos.
// Cada atributo está mapeado directamente a una columna en la tabla.

package com.fabulino.juegoToques.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "registro_toques") // Especificamos la tabla de la base de datos
public class JuegoToquesEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generación del ID
    private Long id;

    @Column(name = "id_usuario", nullable = false)
    private Long idUsuario;

    @Column(name = "orden_toques", nullable = false)
    private String ordenToques; // Almacena un texto plano como "pierna,cabeza,brazo"

    @Column(name = "toques_piernas", nullable = false)
    private int toquesPiernas;

    @Column(name = "toques_caderas", nullable = false)
    private int toquesCaderas;

    @Column(name = "toques_pechos", nullable = false)
    private int toquesPechos;

    @Column(name = "toques_brazos", nullable = false)
    private int toquesBrazos;

    @Column(name = "toques_cabeza", nullable = false)
    private int toquesCabeza;

    @Column(name = "toques_boca", nullable = false)
    private int toquesBoca;

    @Column(name = "fecha_datos", nullable = false)
    private LocalDateTime fechaDatos; // Mapeo de fecha y hora

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getOrdenToques() {
		return ordenToques;
	}

	public void setOrdenToques(String ordenToques) {
		this.ordenToques = ordenToques;
	}

	public int getToquesPiernas() {
		return toquesPiernas;
	}

	public void setToquesPiernas(int toquesPiernas) {
		this.toquesPiernas = toquesPiernas;
	}

	public int getToquesCaderas() {
		return toquesCaderas;
	}

	public void setToquesCaderas(int toquesCaderas) {
		this.toquesCaderas = toquesCaderas;
	}

	public int getToquesPechos() {
		return toquesPechos;
	}

	public void setToquesPechos(int toquesPechos) {
		this.toquesPechos = toquesPechos;
	}

	public int getToquesBrazos() {
		return toquesBrazos;
	}

	public void setToquesBrazos(int toquesBrazos) {
		this.toquesBrazos = toquesBrazos;
	}

	public int getToquesCabeza() {
		return toquesCabeza;
	}

	public void setToquesCabeza(int toquesCabeza) {
		this.toquesCabeza = toquesCabeza;
	}

	public int getToquesBoca() {
		return toquesBoca;
	}

	public void setToquesBoca(int toquesBoca) {
		this.toquesBoca = toquesBoca;
	}

	public LocalDateTime getFechaDatos() {
		return fechaDatos;
	}

	public void setFechaDatos(LocalDateTime fechaDatos) {
		this.fechaDatos = fechaDatos;
	}

    

}
