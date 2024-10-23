package com.example.inicial1.repositories;

import com.example.inicial1.entities.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {
    // Aquí puedes agregar métodos personalizados si es necesario

    List<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido);
    Page<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido,Pageable pageable);


    //boolean existsByDni(String dni);

    @Query(value="SELECT p FROM Persona p WHERE p.nombre LIKE %?1% OR p.apellido LIKE %?2%")
    List<Persona> search(String nombre,String apellido);

    @Query(value="SELECT p FROM Persona p WHERE p.nombre LIKE %?1% OR p.apellido LIKE %?2%")
    Page<Persona> search(String nombre,String apellido,Pageable pageable);

    @Query(value="SELECT * FROM Persona p WHERE p.nombre LIKE %?1% OR p.apellido LIKE %?2%",
            nativeQuery= true
    )
    List<Persona> searchNativo(String nombre, String apellido);

    @Query(value="SELECT * FROM Persona p WHERE p.nombre LIKE %?1% OR p.apellido LIKE %?2%",
            nativeQuery= true,
            countQuery = "SELECT count(*) FROM persona"
    )
    Page<Persona> searchNativo(String nombre, Pageable apellido);


}