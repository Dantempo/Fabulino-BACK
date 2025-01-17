
	// La interfaz JuegoToquesService define la lógica de negocio relacionada con los registros de toques. 
	// Actúa como un contrato para su implementación (JuegoToquesServiceImpl).

package com.fabulino.registro.service;

import com.fabulino.registro.dto.DatosRegistroDto;

public interface registroService {

		String guardar(DatosRegistroDto DatosRegistroDto);
}
