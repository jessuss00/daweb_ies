package ies.alcores.daweb.service;

import ies.alcores.daweb.model.Profesor;
import ies.alcores.daweb.repository.ProfesorRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProfesorService {

    @Autowired
    private ProfesorRepository profesorRepository;

    private List<Profesor> findAll(){
        return this.profesorRepository.findAll();
    }
}
