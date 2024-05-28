package com.nc.Propiedades360.resources.Propietario.Controller;

import com.nc.Propiedades360.resources.Propietario.Entity.Propietario;
import com.nc.Propiedades360.resources.Propietario.Service.PropietarioService;
import com.nc.Propiedades360.resources.inmueble.entity.Inmueble;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/propietario")
public class PropietarioController {


    private final PropietarioService propietarioService;

    public PropietarioController(PropietarioService usuarioService) {
        this.propietarioService = usuarioService;
    }

    @PostMapping("/publicarInmueble")
    public Inmueble publicarInmueble(@RequestBody Inmueble inmueble, @RequestParam Long propietarioId) {
        return propietarioService.publicarInmueble(inmueble, propietarioId);
    }

    @PutMapping("/actualizarInmueble/{inmuebleId}")
    public Inmueble actualizarInmueble(@PathVariable int inmuebleId, @RequestBody Inmueble inmueble) {
        return propietarioService.actualizarInmueble(inmuebleId, inmueble);
    }

    @DeleteMapping("/eliminarInmueble/{inmuebleId}")
    public void eliminarInmueble(@PathVariable Long inmuebleId) {
        propietarioService.eliminarInmueble(inmuebleId);
    }



}
