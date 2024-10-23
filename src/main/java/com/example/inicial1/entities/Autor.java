package com.example.inicial1.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.envers.Audited;


@Entity
@Table(name="autor")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
@Audited
public class Autor extends Base{

    private String nombre;
    private String apellido;
    @Column(name="bibliografía", length = 1500)
    public String bibliografia;
}
