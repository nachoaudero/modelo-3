import entities.Articulo;
import entities.Cliente;
import entities.Imagenes;
import entities.UnidadMedida;
import repositories.InMemoryRepository;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        InMemoryRepository<Cliente> clienteInMemoryRepository = new InMemoryRepository<>();
        InMemoryRepository<UnidadMedida> unidadMedidaInMemoryRepository = new InMemoryRepository<>();
        InMemoryRepository<Articulo> articuloInMemoryRepository = new InMemoryRepository<>();
        InMemoryRepository<Imagenes> imagenesInMemoryRepository = new InMemoryRepository<>();

        Cliente cliente1 = Cliente.builder()
                .nombre("Carlos")
                .apellido("Perez")
                .telefono("261-1111111")
                .email("carlosperez@gmail.com")
                .fechaNacimiento(LocalDate.of(2000,1,1))
                .build();

        Cliente cliente2 = Cliente.builder()
                .nombre("Aaron")
                .apellido("Kibysz")
                .telefono("261-2222222")
                .email("aarroonnkkibbyysszz@gmail.com")
                .fechaNacimiento(LocalDate.of(2002,5,11))
                .build();
        Cliente cliente3 = Cliente.builder()
                .nombre("Fernando")
                .apellido("Alonzo")
                .telefono("261-3333333")
                .email("vivala33@gmail.com")
                .fechaNacimiento(LocalDate.of(1981,7,29))
                .build();

        clienteInMemoryRepository.save(cliente1);
        clienteInMemoryRepository.save(cliente2);
        clienteInMemoryRepository.save(cliente3);

        UnidadMedida porciones8 = UnidadMedida.builder()
                .denominacion("8 Porciones")
                .build();
        UnidadMedida porciones4 = UnidadMedida.builder()
                .denominacion("4 Porciones")
                .build();
        UnidadMedida litro1 = UnidadMedida.builder()
                .denominacion("1 Litro")
                .build();

        unidadMedidaInMemoryRepository.save(porciones8);
        unidadMedidaInMemoryRepository.save(porciones4);
        unidadMedidaInMemoryRepository.save(litro1);


        Imagenes imagen1 = Imagenes.builder()
                .nombre("Pizza Grande Hawaiana")
                .url("https://assets.unileversolutions.com/recipes-v2/244028.jpg")
                .build();
        Imagenes imagen2 = Imagenes.builder()
                .nombre("Pizza Grande Napolitana")
                .url("https://laalemanacomidas.com.ar/wp-content/uploads/2020/04/photo.jpg")
                .build();
        Imagenes imagen3 = Imagenes.builder()
                .nombre("Pizza Grande Muzza")
                .url("https://www.nueva-ciudad.com.ar/advf/imagenes/editadas/5e05008a2355e_800x550.jpg")
                .build();
        Imagenes imagen4 = Imagenes.builder()
                .nombre("Pizza Chica Hawaiana")
                .url("https://i.pinimg.com/474x/c0/27/d6/c027d695056b37f48444d5bf79420d27.jpg")
                .build();
        Imagenes imagen5 = Imagenes.builder()
                .nombre("Pizza Chica Napolitana")
                .url("https://thespicechica.com/wp-content/uploads/2018/06/pizza-napoletana-junio-2018.jpg")
                .build();
        Imagenes imagen6 = Imagenes.builder()
                .nombre("Pizza Chica Muzza")
                .url("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRbBIsba21JpGku26uPP4YXwYrmZ_xZuw-9EA&s")
                .build();
        Imagenes imagen7 = Imagenes.builder()
                .nombre("Cerveza Andes")
                .url("https://statics.dinoonline.com.ar/imagenes/full_600x600_ma/3100629_f.jpg")
                .build();
        Imagenes imagen8 = Imagenes.builder()
                .nombre("Cerveza Quilmes")
                .url("https://acdn.mitiendanube.com/stores/798/865/products/31270646-e55aacf8ff8a8a986016639329846487-640-0.jpg")
                .build();

        imagenesInMemoryRepository.save(imagen1);
        imagenesInMemoryRepository.save(imagen2);
        imagenesInMemoryRepository.save(imagen3);
        imagenesInMemoryRepository.save(imagen4);
        imagenesInMemoryRepository.save(imagen5);
        imagenesInMemoryRepository.save(imagen6);
        imagenesInMemoryRepository.save(imagen7);
        imagenesInMemoryRepository.save(imagen8);

        Articulo pizzaGrande1 = Articulo.builder()
                .denominacion("Pizza Grande Hawaiana")
                .precioVenta(5000D)
                .precioCompra(3000D)
                .stockActual(80)
                .stockMaximo(100)
                .imagen(imagen1)
                .unidad(porciones8)
                .tiempoEstimadoMinutos(25)
                .build();

        Articulo pizzaChica1 = Articulo.builder()
                .denominacion("Pizza Chica Hawaiana")
                .precioVenta(4000D)
                .precioCompra(2000D)
                .stockActual(100)
                .stockMaximo(150)
                .imagen(imagen4)
                .unidad(porciones4)
                .tiempoEstimadoMinutos(20)
                .build();

        Articulo pizzaGrande2 = Articulo.builder()
                .denominacion("Pizza Grande Napolitana")
                .precioVenta(4500D)
                .precioCompra(3100D)
                .stockActual(75)
                .stockMaximo(110)
                .imagen(imagen2)
                .unidad(porciones8)
                .tiempoEstimadoMinutos(25)
                .build();

        Articulo pizzaChica2 = Articulo.builder()
                .denominacion("Pizza Chica Napolitana")
                .precioVenta(3500D)
                .precioCompra(1500D)
                .stockActual(120)
                .stockMaximo(175)
                .imagen(imagen5)
                .unidad(porciones4)
                .tiempoEstimadoMinutos(20)
                .build();

        Articulo pizzaGrande3 = Articulo.builder()
                .denominacion("Pizza Grande Muzza")
                .precioVenta(4700D)
                .precioCompra(3200D)
                .stockActual(90)
                .stockMaximo(130)
                .imagen(imagen3)
                .unidad(porciones8)
                .tiempoEstimadoMinutos(25)
                .build();

        Articulo pizzaChica3 = Articulo.builder()
                .denominacion("Pizza Chica Muzza")
                .precioVenta(3800D)
                .precioCompra(2000D)
                .stockActual(60)
                .stockMaximo(150)
                .imagen(imagen6)
                .unidad(porciones4)
                .tiempoEstimadoMinutos(20)
                .build();

        Articulo cerveza1 = Articulo.builder()
                .denominacion("Cerveza Andes")
                .precioVenta(2000D)
                .precioCompra(1000D)
                .stockActual(175)
                .stockMaximo(200)
                .imagen(imagen7)
                .unidad(litro1)
                .tiempoEstimadoMinutos(0)
                .build();
        Articulo cerveza2 = Articulo.builder()
                .denominacion("Cerveza Quilmes")
                .precioVenta(1800D)
                .precioCompra(900D)
                .stockActual(151)
                .stockMaximo(200)
                .imagen(imagen8)
                .unidad(litro1)
                .tiempoEstimadoMinutos(0)
                .build();

        articuloInMemoryRepository.save(pizzaGrande1);
        articuloInMemoryRepository.save(pizzaGrande2);
        articuloInMemoryRepository.save(pizzaGrande3);
        articuloInMemoryRepository.save(pizzaChica1);
        articuloInMemoryRepository.save(pizzaChica2);
        articuloInMemoryRepository.save(pizzaChica3);
        articuloInMemoryRepository.save(cerveza1);
        articuloInMemoryRepository.save(cerveza2);


    }
}
