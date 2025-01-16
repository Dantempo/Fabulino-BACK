// Esta clase es un repositorio de Spring Data JPA que se encarga de interactuar directamente con la base de datos 
// para realizar operaciones relacionadas con la entidad JuegoToquesEntity.
package com.fabulino.juegoToques.repository;

import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.fabulino.juegoToques.entity.JuegoToquesEntity;

@Repository
public interface JuegoToquesRepository extends JpaRepository<JuegoToquesEntity, Long> {
	@Modifying
	@Transactional
	@Query(value = "INSERT INTO registros_toques (id_usuario, orden_toques, toques_piernas, toques_caderas, toques_pechos, toques_brazos, toques_cabeza, toques_boca, fecha_datos) "
			+ "VALUES (:idUsuario, :ordenToques, :toquesPiernas, :toquesCaderas, :toquesPechos, :toquesBrazos, :toquesCabeza, :toquesBoca, :fechaDatos)", nativeQuery = true)
	
	void insertarJuegoToques(@Param("idUsuario") Long idUsuario, @Param("ordenToques") String ordenToques,
			@Param("toquesPiernas") int toquesPiernas, @Param("toquesCaderas") int toquesCaderas,
			@Param("toquesPechos") int toquesPechos, @Param("toquesBrazos") int toquesBrazos,
			@Param("toquesCabeza") int toquesCabeza, @Param("toquesBoca") int toquesBoca,
			@Param("fechaDatos") LocalDateTime fechaDatos);

}
