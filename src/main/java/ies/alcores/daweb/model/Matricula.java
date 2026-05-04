package ies.alcores.daweb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Matricula {

    @ManyToOne
    private Alumno idAlumno;

    @ManyToOne
    private Asignatura idAsignatura;

}
