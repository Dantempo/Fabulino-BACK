package com.fabulino.juegoCaras.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fabulino.juegoCaras.dto.JuegoCarasDto;
import com.fabulino.juegoCaras.repository.JuegoCarasRepository;
import com.fabulino.juegoCaras.service.JuegoCarasService;

@Service

public class JuegoCarasServiceImpl implements JuegoCarasService {
	
	@Autowired
	private JuegoCarasRepository juegoCarasRepository; // Inyectamos el repositorio
	
	@Override
	public String guardar(JuegoCarasDto juegoCarasDto) {
		try {

			// Llama al método del repositorio pasando todo por parametros
			juegoCarasRepository.insertRegistroCaras(
					juegoCarasDto.getId(), 
					juegoCarasDto.getImagen(),
					juegoCarasDto.getEmjMarcados().isEmocion(), 
					juegoCarasDto.getEmjMarcados().isFelicidad(), 
					juegoCarasDto.getEmjMarcados().isMiedo(),
					juegoCarasDto.getEmjMarcados().isRabia(), 
					juegoCarasDto.getEmjMarcados().isSorpresa(), 
					juegoCarasDto.getEmjMarcados().isTimidez(),
					juegoCarasDto.getEmjMarcados().isTristeza(), 
					juegoCarasDto.getEmjMarcados().isConfusion(), 
					juegoCarasDto.getNumToques().getConfusion(),
					juegoCarasDto.getNumToques().getEmocion(), 
					juegoCarasDto.getNumToques().getFelicidad(),
					juegoCarasDto.getNumToques().getMiedo(),
					juegoCarasDto.getNumToques().getRabia(),
					juegoCarasDto.getNumToques().getSorpresa(),
					juegoCarasDto.getNumToques().getTimidez(),
					juegoCarasDto.getNumToques().getTristeza(),
					juegoCarasDto.conversorString()
					);

			return "Registro guardado correctamente";
		} catch (Exception e) {
			e.printStackTrace();
			return "Error al guardar los datos: " + e.getMessage();
		}
	}

}
