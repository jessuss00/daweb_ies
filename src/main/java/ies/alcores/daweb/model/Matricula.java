package ies.alcores.daweb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@NoArgsConstructor(force = true)
@RequiredArgsConstructor
public class Matricula {

    @Id
    private final Long id;

    @ManyToOne
    private final Alumno idAlumno;

    @ManyToOne
    private final Asignatura idAsignatura;

}
