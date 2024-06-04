package com.nc.Propiedades360.resources.visita.entity;



import com.nc.Propiedades360.resources.Cliente.Entity.Cliente;
import com.nc.Propiedades360.resources.inmueble.entity.Inmueble;
import com.nc.Propiedades360.resources.reserva.entity.Reserva;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Visita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date fechaVisita;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "inmueble_id")
    private Inmueble inmueble;


}
