package ies.alcores.daweb.model;

import jakarta.persistence.Entity;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@Entity
public class Alumno {

    @Id
    private Long id;
    private String nombre;
    private String apellidos;
    private String ipasen;

}
