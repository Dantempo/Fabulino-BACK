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

}
