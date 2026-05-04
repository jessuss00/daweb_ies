package ies.alcores.daweb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@AllArgsConstructor
public class Asignatura {

    @Id
    private Long id;
    private String nombre;
    private int horas;

    @ManyToOne
    private Profesor profesor;

}
