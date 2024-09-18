package entities;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UnidadMedida {
    private long id;
    private String denominacion;
}
