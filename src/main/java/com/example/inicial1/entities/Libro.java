package com.example.inicial1.entities;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="libro")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
@Audited
public class Libro extends Base {

    private String titulo;
    private int paginas;
    private String genero;
    private int fecha;

    @ManyToMany(cascade = CascadeType.REFRESH)
    private List<Autor> autores ;

}
