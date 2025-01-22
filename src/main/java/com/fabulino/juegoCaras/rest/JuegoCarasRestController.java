package com.fabulino.juegoCaras.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fabulino.juegoCaras.dto.JuegoCarasDto;
import com.fabulino.juegoCaras.service.JuegoCarasService;

@RestController
@RequestMapping("/api/juegoCaras")
public class JuegoCarasRestController {
	
	// Inyectamos el servicio JuegoCarasService para delegar la lógica de negocio.
	// JuegoCarasService es responsable de procesar los datos recibidos y guardarlos en la base de datos.
	
	@Autowired
	private JuegoCarasService juegoCarasService;
	
	@PostMapping("/recibirDatos")
	public String recibirDatos(@RequestBody JuegoCarasDto juegoCarasDto) {
		return juegoCarasService.guardar(juegoCarasDto);
	}

}
