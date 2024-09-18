package entities;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pedido {
    private long id;
    private LocalTime horaEstimadaFinalizacion;
    private Double total;
    private Double totalCosto;
    private EstadoPedido estado;
    private TipoEnvio envio;
    private FormaPago formaPago;
    private LocalDate fechaPedido;

    @Builder.Default
    private HashSet<DetallePedido> detallePedidos = new HashSet<>();
}
