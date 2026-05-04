package ies.alcores.daweb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@AllArgsConstructor
public class Matricula {

    @ManyToOne
    private Alumno idAlumno;

    @ManyToOne
    private Asignatura idAsignatura;

}
