package entities;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DetallePedido {
    private Long id;
    private Integer cantidad;
    private Double subTotal;
    private Articulo articulo;

    @Override
    public String toString() {
        return "Artículo: " + articulo.getDenominacion()
                + "Cantidad: " + cantidad
                + "SubTotal: " + subTotal;

    }
}
