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
					juegoCarasDto.getEmojisMarcados().isEmocion(), 
					juegoCarasDto.getEmojisMarcados().isFelicidad(), 
					juegoCarasDto.getEmojisMarcados().isMiedo(),
					juegoCarasDto.getEmojisMarcados().isRabia(), 
					juegoCarasDto.getEmojisMarcados().isSorpresa(), 
					juegoCarasDto.getEmojisMarcados().isTimidez(),
					juegoCarasDto.getEmojisMarcados().isTristeza(), 
					juegoCarasDto.getEmojisMarcados().isConfusion(), 
					juegoCarasDto.getNumeroToques().getConfusion(),
					juegoCarasDto.getNumeroToques().getEmocion(), 
					juegoCarasDto.getNumeroToques().getFelicidad(),
					juegoCarasDto.getNumeroToques().getMiedo(),
					juegoCarasDto.getNumeroToques().getRabia(),
					juegoCarasDto.getNumeroToques().getSorpresa(),
					juegoCarasDto.getNumeroToques().getTimidez(),
					juegoCarasDto.getNumeroToques().getTristeza(),
					juegoCarasDto.conversorString()
					);

			return "Registro guardado correctamente";
		} catch (Exception e) {
			e.printStackTrace();
			return "Error al guardar los datos: " + e.getMessage();
		}
	}

}
