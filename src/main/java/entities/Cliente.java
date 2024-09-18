package entities;

import lombok.*;
import java.time.LocalDate;
import java.util.HashSet;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Cliente {
    private Long id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private LocalDate fechaNacimiento;

    @Builder.Default
    private HashSet<Pedido> hace = new HashSet<>();
}
