package ies.alcores.daweb.service;

import ies.alcores.daweb.model.Alumno;
import ies.alcores.daweb.repository.AlumnoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AlumnoService {

    @Autowired
    private AlumnoRepository alumnoRepository;

    public List<Alumno> findAll(){
        return alumnoRepository.findAll();
    }
}
