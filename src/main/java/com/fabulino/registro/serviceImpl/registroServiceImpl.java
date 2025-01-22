
	// Esta clase implementa la lógica de negocio definida en la interfaz JuegoToquesService. 
	// Es responsable de procesar los datos recibidos del controlador(restController) 
	// y pasarlos al repositorio para ser almacenados en la base de datos.

package com.fabulino.registro.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fabulino.registro.dto.DatosRegistroDto;
import com.fabulino.registro.repository.registroRepository;
import com.fabulino.registro.service.registroService;

@Service
	
public class registroServiceImpl implements registroService{

		@Autowired
		private registroRepository repository; // Inyectamos el repositorio

		@Override
		public String guardar(DatosRegistroDto datosRegistroDto) {
			try {

				// Llama al método del repositorio pasando todo por parametros
				repository.insertarCorreo(datosRegistroDto.getCorreo());
				repository.insertarUsuario(datosRegistroDto.getNombre(), repository.getIdCorreo(datosRegistroDto.getCorreo()), datosRegistroDto.getContraseña() );
				repository.insertarInformador(repository.getIdUsuario(datosRegistroDto.getNombre()), repository.getIdCorreo(datosRegistroDto.getCorreo()), datosRegistroDto.getTipo());

				return "Registro guardado correctamente";
			} catch (Exception e) {
				e.printStackTrace();				
				return "Error al guardar los datos: " + e.getMessage();
			}
		}

}
