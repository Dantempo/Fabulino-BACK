package com.fabulino.juegoCaras.entity;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "registros_caras") // Especificamos la tabla de la base de datos
public class JuegoCarasEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generación del ID
	private Long id;
	
	@Column(name = "id_usuario", nullable = false)
	private Long idUsuario;
	
	@Column(name = "imagen", nullable = false)
	private boolean imagen;
	
	@Column(name = "emocion", nullable = false)
	private boolean emocion;
	
	@Column(name = "felicidad", nullable = false)
	private boolean felicidad;
	
	@Column(name = "miedo", nullable = false)
	private boolean miedo;
	
	@Column(name = "rabia", nullable = false)
	private boolean rabia;
	
	@Column(name = "sorpresa", nullable = false)
	private boolean sorpresa;
	
	@Column(name = "timidez", nullable = false)
	private boolean timidez;
	
	@Column(name = "tristeza", nullable = false)
	private boolean tristeza;
	
	@Column(name = "confusion", nullable = false)
	private boolean confusion;
	
	@Column(name = "toques_confusion", nullable = false)
	private int toques_confusion;
	
	@Column(name = "toques_emocion", nullable = false)
	private int toques_emocion;
	
	@Column(name = "toques_felicidad", nullable = false)
	private int toques_felicidad;
	
	@Column(name = "toques_miedo", nullable = false)
	private int toques_miedo;
	
	@Column(name = "toques_rabia", nullable = false)
	private int toques_rabia;
	
	@Column(name = "toques_sorpresa", nullable = false)
	private int toques_sorpresa;
	
	@Column(name = "toques_timidez", nullable = false)
	private int toques_timidez;
	
	@Column(name = "toques_tristeza", nullable = false)
	private int toques_tristeza;
	
	@Column(name = "fecha_registro", nullable = false)
	private LocalDateTime fecha_registro; // Mapeo de fecha y hora
	
    @Column(name = "orden_emojis", nullable = false)
    private String orden_emojis;// Almacena un texto plano como "tristeza,timidez,etc..."
    
    
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

	
	public boolean getImagen() {
		return imagen;
	}
	public void setImagen(boolean imagen) {
		this.imagen = imagen;
	}

	
	public boolean getEmocion() {
		return emocion;
	}
	public void setEmocion(boolean emocion) {
		this.emocion = emocion;
	}

	
	public boolean getFelicidad() {
		return felicidad;
	}
	public void setFelicidad(boolean felicidad) {
		this.felicidad = felicidad;
	}

	
	public boolean getMiedo() {
		return miedo;
	}
	public void setMiedo(boolean miedo) {
		this.miedo = miedo;
	}

	
	public boolean getRabia() {
		return rabia;
	}
	public void setRabia(boolean rabia) {
		this.rabia = rabia;
	}

	
	public boolean getSorpresa() {
		return sorpresa;
	}
	public void setSorpresa(boolean sorpresa) {
		this.sorpresa = sorpresa;
	}

	
	public boolean getTimidez() {
		return timidez;
	}
	public void setTimidez(boolean timidez) {
		this.timidez = timidez;
	}

	
	public boolean getTristeza() {
		return tristeza;
	}
	public void setTristeza(boolean tristeza) {
		this.tristeza = tristeza;
	}

	
	public boolean getConfusion() {
		return confusion;
	}
	public void setConfusion(boolean confusion) {
		this.confusion = confusion;
	}

	
	public int getToques_confusion() {
		return toques_confusion;
	}
	public void setToques_confusion(int toques_confusion) {
		this.toques_confusion = toques_confusion;
	}

	
	public int getToques_emocion() {
		return toques_emocion;
	}
	public void setToques_emocion(int toques_emocion) {
		this.toques_emocion = toques_emocion;
	}

	
	public int getToques_felicidad() {
		return toques_felicidad;
	}
	public void setToques_felicidad(int toques_felicidad) {
		this.toques_felicidad = toques_felicidad;
	}

	
	public int getToques_miedo() {
		return toques_miedo;
	}
	public void setToques_miedo(int toques_miedo) {
		this.toques_miedo = toques_miedo;
	}

	
	public int getToques_rabia() {
		return toques_rabia;
	}
	public void setToques_rabia(int toques_rabia) {
		this.toques_rabia = toques_rabia;
	}

	
	public int getToques_sorpresa() {
		return toques_sorpresa;
	}
	public void setToques_sorpresa(int toques_sorpresa) {
		this.toques_sorpresa = toques_sorpresa;
	}

	
	public int getToques_timidez() {
		return toques_timidez;
	}
	public void setToques_timidez(int toques_timidez) {
		this.toques_timidez = toques_timidez;
	}

	
	public int getToques_tristeza() {
		return toques_tristeza;
	}
	public void setToques_tristeza(int toques_tristeza) {
		this.toques_tristeza = toques_tristeza;
	}

	
	public LocalDateTime getFecha_registro() {
		return fecha_registro;
	}
	public void setFecha_registro(LocalDateTime fecha_registro) {
		this.fecha_registro = fecha_registro;
	}

	
	public String getOrden_emojis() {
		return orden_emojis;
	}
	public void setOrden_emojis(String orden_emojis) {
		this.orden_emojis = orden_emojis;
	}
}
