// La interfaz JuegoToquesService define la lógica de negocio relacionada con los registros de toques. 
// Actúa como un contrato para su implementación (JuegoToquesServiceImpl).
package com.fabulino.juegoToques.service;

import com.fabulino.juegoToques.dto.JuegoToquesDto;

public interface JuegoToquesService {
	String guardar(JuegoToquesDto juegoToquesDto);
}
