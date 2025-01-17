package com.fabulino.registro.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fabulino.registro.dto.DatosRegistroDto;
import com.fabulino.registro.service.registroService;
//import com.fabulino.juegoToques.serviceImpl.JuegoToquesServiceImpl;

@RestController
@RequestMapping("/api/form")	
	
public class registroRestController {


		// Inyectamos el servicio registroService para delegar la lógica de negocio.
		// JuegoToquesService es responsable de procesar los datos recibidos y guardarlos en la base de datos.
		@Autowired
		private registroService registroService;
		
		@PostMapping("/recibirDatos")
		public String recibirDatos(@RequestBody DatosRegistroDto DatosregistroDto) {
			return registroService.guardar(DatosregistroDto);
		}		
	}
