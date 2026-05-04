package ies.alcores.daweb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@Entity
public class Asignatura {

    @Id
    private Long id;
    private String nombre;
    private int horas;

    @ManyToOne
    private Profesor profesor;

}
