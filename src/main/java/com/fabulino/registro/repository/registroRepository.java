
// Esta clase es un repositorio de Spring Data JPA que se encarga de interactuar directamente con la base de datos 
// para realizar operaciones relacionadas con la entidad JuegoToquesEntity.

package com.fabulino.registro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.fabulino.registro.entity.registroEntityUsuario;

@Repository

public interface registroRepository extends JpaRepository<registroEntityUsuario, Long> {	
	
	@Transactional
	@Query(value = "SELECT id FROM correos WHERE correo = :correo", nativeQuery = true)
	Long getIdCorreo(@Param("correo") String correo);
	
	@Transactional
	@Query(value = "SELECT id FROM usuarios WHERE usuario = :usuario", nativeQuery = true)
	Long getIdUsuario(@Param("usuario") String usuario);
	
	
	@Modifying
	@Transactional
	@Query(value = "INSERT INTO correos (correo) "
			+ "VALUES (:correo)", nativeQuery = true)
	void insertarCorreo(@Param("correo") String correo);

	
	@Modifying
	@Transactional
	@Query(value = "INSERT INTO usuarios (nombre, id_email, contraseña) "
			+ "VALUES (:nombre, :id_correo, :contraseña)", nativeQuery = true)

	void insertarUsuario(@Param("nombre") String nombre, @Param("id_email") Long id_email,
			@Param("contraseña") String contraseña);
	
	@Modifying
	@Transactional
	@Query(value = "INSERT INTO inforamdores (id_usuario, id_correo, tipo) "
			+ "VALUES (:id_usuario, :id_correo, :tipo)", nativeQuery = true)
	void insertarInformador(@Param("id_correo") Long id_correo, @Param("id_usuario") Long id_usuario, @Param("tipo") String tipo);

}
