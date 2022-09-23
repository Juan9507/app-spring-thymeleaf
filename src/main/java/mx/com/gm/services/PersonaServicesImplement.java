package mx.com.gm.services;

import mx.com.gm.domain.Persona;
import mx.com.gm.repository.IpersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonaServicesImplement implements IpersonaServices{

    @Autowired
    private IpersonaRepository ipersonaRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Persona> listarPersonas() {
        return (List<Persona>) ipersonaRepository.findAll();
    }

    @Override
    @Transactional
    public void guardar(Persona persona) {
        ipersonaRepository.save(persona);
    }

    @Override
    @Transactional
    public void eliiminar(Persona persona) {
        ipersonaRepository.delete(persona);
    }

    @Override
    @Transactional(readOnly = true)
    public Persona encontrarPersona(Persona persona) {
        return ipersonaRepository.findById(persona.getId_persona()).orElse(null);
    }
}
