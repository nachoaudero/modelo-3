package entities;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Imagen {
    private Long id;
    private String denominacion;
}
