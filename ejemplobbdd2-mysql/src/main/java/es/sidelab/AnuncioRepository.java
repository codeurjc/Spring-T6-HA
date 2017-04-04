package es.sidelab;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import es.sidelab.model.Anuncio;

public interface AnuncioRepository extends JpaRepository<Anuncio, Long> {

//	select nombre, asunto, comentario
//	from anuncios
//	where nombre = nombreAnuncio

	Anuncio findByNombre(String nombre);
	Anuncio findByAsunto(String asunto);
	Anuncio findByNombreAndAsunto(String nombre, String asunto);
	
}
