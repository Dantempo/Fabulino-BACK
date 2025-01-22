
package com.fabulino.juegoCaras.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fabulino.juegoCaras.entity.JuegoCarasEntity;

public interface JuegoCarasRepository extends JpaRepository<JuegoCarasEntity, Long> {

	@Modifying
	@Transactional
	@Query(value = "INSERT INTO registros_caras (id_usuario, imagen, emocion, felicidad, miedo, rabia, sorpresa, timidez, tristeza, confusion, toques_confusion, toques_emocion, toques_felicidad, toques_miedo, toques_rabia, toques_sorpresa, toques_timidez, toques_tristeza, orden_emojis) "
			+ "VALUES (:idUsuario, :imagen, :emocion, :felicidad, :miedo, :rabia, :sorpresa, :timidez, :tristeza, :confusion, :toques_confusion, :toques_emocion, :toques_felicidad, :toques_miedo, :toques_rabia, :toques_sorpresa, :toques_timidez, :toques_tristeza, :orden_emojis)", nativeQuery = true)
	void insertRegistroCaras(
			@Param("idUsuario") Long idUsuario,
			@Param("imagen") int imagen,
			@Param("emocion") boolean emocion, 
			@Param("felicidad") boolean felicidad,
			@Param("miedo") boolean miedo,
			@Param("rabia") boolean rabia, 
			@Param("sorpresa") boolean sorpresa, 
			@Param("timidez") boolean timidez,
			@Param("tristeza") boolean tristeza, 
			@Param("confusion") boolean confusion,
			@Param("toques_confusion") int toquesConfusion, 
			@Param("toques_emocion") int toquesEmocion,
			@Param("toques_felicidad") int toquesFelicidad, 
			@Param("toques_miedo") int toquesMiedo,
			@Param("toques_rabia") int toquesRabia,
			@Param("toques_sorpresa") int toquesSorpresa,
			@Param("toques_timidez") int toquesTimidez,
			@Param("toques_tristeza") int toquesTristeza,
			@Param("orden_emojis") String ordenEmojis);
}
