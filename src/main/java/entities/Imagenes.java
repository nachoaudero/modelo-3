package entities;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Setter
@Builder
public class Imagenes {
    private Long id;
    private String nombre;
    private String url;
}