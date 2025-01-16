package com.fabulino.juegoToques.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fabulino.juegoToques.dto.JuegoToquesDto;
import com.fabulino.juegoToques.service.JuegoToquesService;
//import com.fabulino.juegoToques.serviceImpl.JuegoToquesServiceImpl;

@RestController
@RequestMapping("/api/juegoToques")
public class JuegoToquesRestController {
	// Inyectamos el servicio JuegoToquesService para delegar la lógica de negocio.
	// JuegoToquesService es responsable de procesar los datos recibidos y guardarlos en la base de datos.
	@Autowired
	private JuegoToquesService juegoToquesService;
	
	@PostMapping("/recibirDatos")
	public String recibirDatos(@RequestBody JuegoToquesDto juegoToquesDto) {
		return juegoToquesService.guardar(juegoToquesDto);
	}
	
}
