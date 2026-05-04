package ies.alcores.daweb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@AllArgsConstructor
public class Matricula {

    @Id
    private Long id;

    @ManyToOne
    private Alumno idAlumno;

    @ManyToOne
    private Asignatura idAsignatura;

}
