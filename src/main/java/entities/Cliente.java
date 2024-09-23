package entities;

import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString(exclude = "hace")
@Builder
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