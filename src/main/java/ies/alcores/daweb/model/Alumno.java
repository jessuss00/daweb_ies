package ies.alcores.daweb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@AllArgsConstructor
public class Alumno {

    @Id
    private Long id;
    private String nombre;
    private String apellidos;
    private String ipasen;

}
