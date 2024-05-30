package com.nc.Propiedades360.resources.Propietario.Service;

import com.nc.Propiedades360.resources.Propietario.Entity.Propietario;
import com.nc.Propiedades360.resources.Propietario.Repository.PropietarioRepository;
import com.nc.Propiedades360.resources.inmueble.entity.Inmueble;
import com.nc.Propiedades360.resources.inmueble.repository.InmuebleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.Optional;
@Service
public class PropietarioService {

    private final InmuebleRepository inmuebleRepository;
    private final PropietarioRepository propietarioRepository;

    // Inyección de dependencias a través del constructor
    @Autowired
    public PropietarioService(InmuebleRepository inmuebleRepository, PropietarioRepository propietarioRepository) {
        this.inmuebleRepository = inmuebleRepository;
        this.propietarioRepository = propietarioRepository;
    }

   //metodo crear propietario

    public Propietario savePropietario(Propietario propietario) {
        return propietarioRepository.save(propietario);
    }

    public Propietario getPropietarioById(Long id) {
        Optional<Propietario> propietario = propietarioRepository.findById(id);
        if (propietario.isPresent()) {
            return propietario.get();
        } else {
            throw new RuntimeException("Propietario no encontrado");
        }
    }
    // Método para actualizar un inmueble con validaciones
    @Transactional
    public Inmueble publicarInmueble(Inmueble inmueble, Long propietarioId) {
        Optional<Propietario> propietario = propietarioRepository.findById(propietarioId);
        if (propietario.isPresent()) {
            inmueble.setPropietario(propietario.get());
            return inmuebleRepository.save(inmueble);
        } else {
            throw new RuntimeException("Propietario no encontrado");
        }
    }

    @Transactional
    public Inmueble actualizarInmueble(long inmuebleId, Inmueble inmuebleDetalles) {
        Optional<Inmueble> inmuebleOptional = inmuebleRepository.findById(inmuebleId);
        if (inmuebleOptional.isPresent()) {
            Inmueble inmueble = inmuebleOptional.get();
            inmueble.setTipo(inmuebleDetalles.getTipo());
            inmueble.setFoto(inmuebleDetalles.getFoto());
            inmueble.setPrecio(inmuebleDetalles.getPrecio());
            inmueble.setNumeroDeHabitaciones(inmuebleDetalles.getNumeroDeHabitaciones());
            inmueble.setNumeroDeBanios(inmuebleDetalles.getNumeroDeBanios());
            inmueble.setEstado(inmuebleDetalles.getEstado());
            inmueble.setSuperficie(inmuebleDetalles.getSuperficie());
            inmueble.setDatosDeContacto(inmuebleDetalles.getDatosDeContacto());

            Optional<Propietario> propietario = propietarioRepository.findById((long) inmueble.getPropietario().getId());
            if (propietario.isPresent()) {
                inmueble.setPropietario(propietario.get());
            }


            return inmuebleRepository.save(inmueble);
        } else {
            throw new RuntimeException("Inmueble no encontrado");
        }
    }

    @Transactional
    public void eliminarInmueble(Long inmuebleId) {
        inmuebleRepository.deleteById(inmuebleId);
    }
}
