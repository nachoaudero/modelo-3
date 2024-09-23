package entities;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Setter
@Builder
public class Pedido {
    private Long id;
    private LocalTime horaEstimadaFinalizacion;
    private Double total;
    private Double totalCosto;
    private Estado estado;
    private Envio tipoEnvio;
    private FormaPago formaDePago;
    private LocalDate fechaPedido;

    @Builder.Default
    private Set<DetallePedido> detalles = new HashSet<>();
}