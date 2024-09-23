package entities;

import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Setter
@Builder
public class DetallePedido {
    private Long id;
    private Integer cantidad;
    private Double subTotal;
    private Articulo articulo;
}