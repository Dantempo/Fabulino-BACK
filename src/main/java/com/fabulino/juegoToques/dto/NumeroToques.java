// Esta clase encapsula los datos relacionados con el número de toques en cada parte del cuerpo.
// Actúa como un subobjeto dentro de JuegoToquesDto.
package com.fabulino.juegoToques.dto;

public class NumeroToques {
	private int piernas;
    private int caderas;
    private int pechos;
    private int brazos;
    private int cabeza;
    private int boca;
    
    
	public int getPiernas() {
		return piernas;
	}
	public int getCaderas() {
		return caderas;
	}
	public int getPechos() {
		return pechos;
	}
	public int getBrazos() {
		return brazos;
	}
	public int getCabeza() {
		return cabeza;
	}
	public int getBoca() {
		return boca;
	}
    
    
}