package com.nc.Propiedades360.resources.Propietario.Entity;

import com.nc.Propiedades360.resources.Usuario.Entity.Usuario;
import com.nc.Propiedades360.resources.inmueble.entity.Inmueble;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "propietario")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Propietario extends Usuario {

    @OneToMany(targetEntity = Inmueble.class, fetch = FetchType.LAZY, mappedBy = "propietario")
    private List<Inmueble> inmuebles;
    public void publicarInmueble(Inmueble inmueble) {
    }

    public void actualizarInmueble(Inmueble inmueble) {

    }

    public void eliminarInmueble(int inmuebleId) {

    }

}
