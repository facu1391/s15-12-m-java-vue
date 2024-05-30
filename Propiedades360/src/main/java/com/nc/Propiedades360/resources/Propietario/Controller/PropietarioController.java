package com.nc.Propiedades360.resources.Propietario.Controller;

import com.nc.Propiedades360.resources.Propietario.Entity.Propietario;
import com.nc.Propiedades360.resources.Propietario.Service.PropietarioService;
import com.nc.Propiedades360.resources.inmueble.entity.Inmueble;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/propietario")
public class PropietarioController {

    private final PropietarioService propietarioService;

    @Autowired
    public PropietarioController(PropietarioService usuarioService) {
        this.propietarioService = usuarioService;
    }

    @PostMapping("/create")
    public ResponseEntity<Propietario> createPropietario(@RequestBody Propietario propietario) {
        Propietario newPropietario = propietarioService.savePropietario(propietario);
        return ResponseEntity.ok(newPropietario);
    }

    @GetMapping("/obtener-propietario/{propietarioId}")
    public ResponseEntity<Propietario> obtenerPropietario(@PathVariable Long propietarioId) {
        Propietario propietario = propietarioService.getPropietarioById(propietarioId);
        return ResponseEntity.ok(propietario);
    }

    @PostMapping("/publicar-inmueble")
    public Inmueble publicarInmueble(@RequestBody Inmueble inmueble, @RequestParam Long propietarioId) {
        return propietarioService.publicarInmueble(inmueble, propietarioId);
    }




    @PutMapping("/actualizar-inmueble/{inmuebleId}")
    public Inmueble actualizarInmueble(@PathVariable("inmuebleId") int inmuebleId, @RequestBody Inmueble inmueble) {
        return propietarioService.actualizarInmueble(inmuebleId, inmueble);
    }

    @DeleteMapping("/eliminar-inmueble/{inmuebleId}")
    public void eliminarInmueble(@PathVariable Long inmuebleId) {
        propietarioService.eliminarInmueble(inmuebleId);
    }



}
