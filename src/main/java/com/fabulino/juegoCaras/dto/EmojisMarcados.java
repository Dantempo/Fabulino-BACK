package com.fabulino.juegoCaras.dto;

public class EmojisMarcados {

	private boolean confusion;
	private boolean emocion;
	private boolean felicidad;
	private boolean miedo;
	private boolean rabia;
	private boolean sorpresa;
	private boolean timidez;
	private boolean tristeza;
	
    public EmojisMarcados() {
    	super();
        this.confusion = false;
        this.emocion = false;
        this.felicidad = false;
        this.miedo = false;
        this.rabia = false;
        this.sorpresa = false;
        this.timidez = false;
        this.tristeza = false;
    }
		
	public boolean isConfusion() {
		return confusion;
	}
	public boolean isEmocion() {
		return emocion;
	}
	public boolean isFelicidad() {
		return felicidad;
	}
	public boolean isMiedo() {
		return miedo;
	}
	public boolean isRabia() {
		return rabia;
	}
	public boolean isSorpresa() {
		return sorpresa;
	}
	public boolean isTimidez() {
		return timidez;
	}
	public boolean isTristeza() {
		return tristeza;
	}

	public void setConfusion(boolean confusion) {
		this.confusion = confusion;
	}

	public void setEmocion(boolean emocion) {
		this.emocion = emocion;
	}

	public void setFelicidad(boolean felicidad) {
		this.felicidad = felicidad;
	}

	public void setMiedo(boolean miedo) {
		this.miedo = miedo;
	}

	public void setRabia(boolean rabia) {
		this.rabia = rabia;
	}

	public void setSorpresa(boolean sorpresa) {
		this.sorpresa = sorpresa;
	}

	public void setTimidez(boolean timidez) {
		this.timidez = timidez;
	}

	public void setTristeza(boolean tristeza) {
		this.tristeza = tristeza;
	}

}
