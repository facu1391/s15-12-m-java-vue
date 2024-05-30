package com.nc.Propiedades360.resources.Cliente.Controller;

import com.nc.Propiedades360.resources.Cliente.Entity.Cliente;
import com.nc.Propiedades360.resources.Cliente.Service.ClienteService;
import com.nc.Propiedades360.resources.inmueble.entity.Inmueble;
import com.nc.Propiedades360.resources.reserva.entity.Reserva;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.math.BigDecimal;

@RestController
@RequestMapping("/cliente")
public class ClienteController {


    private final ClienteService clienteService;

    public ClienteController(ClienteService usuarioService) {
        this.clienteService = usuarioService;
    }

    @PostMapping("/buscar-inmueble")
    public ResponseEntity<Inmueble> buscarInmueble(@RequestParam Long inmuebleId) {
        Inmueble inmueble = clienteService.buscarInmueble(inmuebleId);
        return ResponseEntity.ok(inmueble);
    }

    @PostMapping("/reservar")
    public ResponseEntity<Void> reservarInmueble(@RequestBody ReservaRequest reservaRequest) {
        Cliente cliente = reservaRequest.getCliente();
        Inmueble inmueble = reservaRequest.getInmueble();
        LocalDate fechaInicio = reservaRequest.getFechaInicio();
        LocalDate fechaFin = reservaRequest.getFechaFin();

        clienteService.reservarInmueble(cliente, inmueble, fechaInicio, fechaFin);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/pagar")
    public ResponseEntity<Void> realizarPago(@RequestBody PagoRequest pagoRequest) {
        Long cliente = pagoRequest.getClienteId();
        Long reserva = pagoRequest.getReservaId();
        BigDecimal monto = pagoRequest.getMonto();
        String metodoPago = pagoRequest.getMetodoPago();

        clienteService.realizarPago(cliente, reserva, monto, metodoPago);
        return ResponseEntity.ok().build();
    }
}
