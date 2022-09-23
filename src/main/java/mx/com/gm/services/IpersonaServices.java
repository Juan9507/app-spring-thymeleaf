package mx.com.gm.services;

import mx.com.gm.domain.Persona;

import java.util.List;

public interface IpersonaServices {

    List<Persona> listarPersonas();

    void guardar(Persona persona);

    void eliiminar(Persona persona);

    Persona encontrarPersona(Persona persona);

}
