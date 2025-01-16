// Esta clase implementa la lógica de negocio definida en la interfaz JuegoToquesService. 
// Es responsable de procesar los datos recibidos del controlador(restController) 
// y pasarlos al repositorio para ser almacenados en la base de datos.

package com.fabulino.juegoToques.serviceImpl;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fabulino.juegoToques.dto.JuegoToquesDto;
import com.fabulino.juegoToques.repository.JuegoToquesRepository;
import com.fabulino.juegoToques.service.JuegoToquesService;

@Service
public class JuegoToquesServiceImpl implements JuegoToquesService {

	@Autowired
	private JuegoToquesRepository repository; // Inyectamos el repositorio

	@Override
	public String guardar(JuegoToquesDto juegoToquesDto) {
		try {
			// Convierte el array a texto plano separado por comas
			String ordenToquesTexto = "";
			if (juegoToquesDto.getOrdenToques() != null && juegoToquesDto.getOrdenToques().length > 0) {
			    ordenToquesTexto = String.join(",", juegoToquesDto.getOrdenToques());
			} else {
			    ordenToquesTexto = ""; // Deja vacío si no hay datos
			}

			// Llama al método del repositorio pasando todo por parametros
			repository.insertarJuegoToques(Long.parseLong(juegoToquesDto.getId()), ordenToquesTexto, // Texto plano
					juegoToquesDto.getNumToques().getPiernas(), juegoToquesDto.getNumToques().getCaderas(),
					juegoToquesDto.getNumToques().getPechos(), juegoToquesDto.getNumToques().getBrazos(),
					juegoToquesDto.getNumToques().getCabeza(), juegoToquesDto.getNumToques().getBoca(),
					LocalDateTime.now());

			return "Registro guardado correctamente";
		} catch (Exception e) {
			e.printStackTrace();
			return "Error al guardar los datos: " + e.getMessage();
		}
	}

}
