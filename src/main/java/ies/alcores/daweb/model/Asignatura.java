package ies.alcores.daweb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

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
