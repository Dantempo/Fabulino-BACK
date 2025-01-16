// Esta clase es un Data Transfer Object (DTO) que define cómo se reciben los datos desde el frontend.
// Mapea el JSON enviado por el cliente a un objeto en Java.

package com.fabulino.juegoToques.dto;

public class JuegoToquesDto {
	private String id;
	private String [] ordenToques;
	private NumeroToques numToques;
	
	
	public JuegoToquesDto(String id, String[] ordenToques, NumeroToques numToques) {
		super();
		this.id = id;
		this.ordenToques = ordenToques;
		this.numToques = numToques;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String[] getOrdenToques() {
		return ordenToques;
	}


	public void setOrdenToques(String[] ordenToques) {
		this.ordenToques = ordenToques;
	}


	public NumeroToques getNumToques() {
		return numToques;
	}


	public void setNumToques(NumeroToques numToques) {
		this.numToques = numToques;
	}
	
	
	
	
	
	
	
	
}
