import entities.*;
import repositories.InMemoryRepository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        InMemoryRepository<Cliente> clienteInMemoryRepository = new InMemoryRepository<>();
        InMemoryRepository<UnidadMedida> unidadMedidaInMemoryRepository = new InMemoryRepository<>();
        InMemoryRepository<Articulo> articuloInMemoryRepository = new InMemoryRepository<>();
        InMemoryRepository<Imagenes> imagenesInMemoryRepository = new InMemoryRepository<>();
        InMemoryRepository<Pedido> pedidoRepository = new InMemoryRepository<>();

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

        //DESARROLLO DE EJERCICIOS

        double total = 0;
        double totalCosto = 0;
        DetallePedido pizzaC1 = DetallePedido.builder()
                .cantidad(1)
                .articulo(pizzaGrande2)
                .build();
        pizzaC1.setSubTotal(pizzaC1.getArticulo().getPrecioVenta() * pizzaC1.getCantidad());
        DetallePedido cervezaC1 = DetallePedido.builder()
                .cantidad(1)
                .articulo(cerveza2)
                .build();
        cervezaC1.setSubTotal(cervezaC1.getArticulo().getPrecioVenta() * cervezaC1.getCantidad());
        Pedido pedidoCliente1 = Pedido.builder()
                .horaEstimadaFinalizacion(LocalTime.of(20, 45))
                .estado(Estado.terminado)
                .tipoEnvio(Envio.retiroLocal)
                .formaDePago(FormaPago.debito)
                .fechaPedido(LocalDate.now())
                .build();
        pedidoCliente1.getDetalles().add(pizzaC1);
        pedidoCliente1.getDetalles().add(cervezaC1);
        for (DetallePedido detallePedido : pedidoCliente1.getDetalles()) {
            total += detallePedido.getSubTotal() * detallePedido.getCantidad();
            totalCosto += detallePedido.getArticulo().getPrecioCompra() * detallePedido.getCantidad();
        }
        pedidoCliente1.setTotal(total);
        pedidoCliente1.setTotalCosto(totalCosto);
        total = 0;
        totalCosto = 0;

        DetallePedido pizzaC2 = DetallePedido.builder()
                .cantidad(1)
                .articulo(pizzaChica1)
                .build();
        pizzaC2.setSubTotal(pizzaC2.getArticulo().getPrecioVenta() * pizzaC2.getCantidad());
        DetallePedido cervezaC2 = DetallePedido.builder()
                .cantidad(3)
                .articulo(cerveza2)
                .build();
        cervezaC2.setSubTotal(cervezaC2.getArticulo().getPrecioVenta() * cervezaC2.getCantidad());
        Pedido pedidoCliente2 = Pedido.builder()
                .horaEstimadaFinalizacion(LocalTime.of(21, 15))
                .estado(Estado.terminado)
                .tipoEnvio(Envio.delivery)
                .formaDePago(FormaPago.credito)
                .fechaPedido(LocalDate.now())
                .build();
        pedidoCliente2.getDetalles().add(pizzaC2);
        pedidoCliente2.getDetalles().add(cervezaC2);
        for (DetallePedido detallePedido : pedidoCliente2.getDetalles()) {
            total += detallePedido.getSubTotal() * detallePedido.getCantidad();
            totalCosto += detallePedido.getArticulo().getPrecioCompra() * detallePedido.getCantidad();
        }
        pedidoCliente2.setTotal(total);
        pedidoCliente2.setTotalCosto(totalCosto);
        total = 0;
        totalCosto = 0;

        DetallePedido pizza1C3 = DetallePedido.builder()
                .cantidad(1)
                .articulo(pizzaGrande1)
                .build();
        pizza1C3.setSubTotal(pizza1C3.getArticulo().getPrecioVenta() * pizza1C3.getCantidad());
        DetallePedido pizza2C3 = DetallePedido.builder()
                .cantidad(1)
                .articulo(pizzaChica3)
                .build();
        pizza2C3.setSubTotal(pizza2C3.getArticulo().getPrecioVenta() * pizza2C3.getCantidad());
        DetallePedido pizza3C3 = DetallePedido.builder()
                .cantidad(1)
                .articulo(pizzaGrande2)
                .build();
        pizza3C3.setSubTotal(pizza3C3.getArticulo().getPrecioVenta() * pizza3C3.getCantidad());
        DetallePedido cervezaC3 = DetallePedido.builder()
                .cantidad(2)
                .articulo(cerveza1)
                .build();
        cervezaC3.setSubTotal(cervezaC3.getArticulo().getPrecioVenta() * cervezaC3.getCantidad());
        Pedido pedidoCliente3 = Pedido.builder()
                .horaEstimadaFinalizacion(LocalTime.of(22, 0))
                .estado(Estado.terminado)
                .tipoEnvio(Envio.retiroLocal)
                .formaDePago(FormaPago.efectivo)
                .fechaPedido(LocalDate.now())
                .build();
        pedidoCliente3.getDetalles().add(pizza1C3);
        pedidoCliente3.getDetalles().add(pizza2C3);
        pedidoCliente3.getDetalles().add(pizza3C3);
        pedidoCliente3.getDetalles().add(cervezaC3);
        for (DetallePedido detallePedido : pedidoCliente3.getDetalles()) {
            total += detallePedido.getSubTotal() * detallePedido.getCantidad();
            totalCosto += detallePedido.getArticulo().getPrecioCompra() * detallePedido.getCantidad();
        }
        pedidoCliente3.setTotal(total);
        pedidoCliente3.setTotalCosto(totalCosto);

        pedidoRepository.save(pedidoCliente1);
        pedidoRepository.save(pedidoCliente2);
        pedidoRepository.save(pedidoCliente3);

        cliente1.getHace().add(pedidoCliente1);
        cliente2.getHace().add(pedidoCliente2);
        cliente3.getHace().add(pedidoCliente3);

        System.out.println("--------BIENVENIDO--------\nPedido del cliente 1 llamado " + cliente1.getNombre());
        Optional<Pedido> traerPedidoCliente1 = pedidoRepository.findById(pedidoCliente1.getId());
        traerPedidoCliente1.ifPresent(pedido -> {
            System.out.println("El cliente ordeno:");
            for (DetallePedido detalle : pedido.getDetalles()) {
                System.out.println(detalle.getCantidad() + " " + detalle.getArticulo().getDenominacion());
            }
            System.out.println("El cliente debe pagar $" + pedido.getTotal());
        });

        System.out.println("--------------------------------\nPedido del cliente 2 llamado " + cliente2.getNombre());
        Optional<Pedido> traerPedidoCliente2 = pedidoRepository.findById(pedidoCliente2.getId());
        traerPedidoCliente2.ifPresent(pedido -> {
            System.out.println("El cliente ordeno:");
            for (DetallePedido detalle : pedido.getDetalles()) {
                System.out.println(detalle.getCantidad() + " " + detalle.getArticulo().getDenominacion());
            }
            System.out.println("El cliente debe pagar $" + pedido.getTotal());
        });

        System.out.println("--------------------------------\nPedido del cliente 3 llamado " + cliente3.getNombre());
        Optional<Pedido> traerPedidoCliente3 = pedidoRepository.findById(pedidoCliente3.getId());
        traerPedidoCliente3.ifPresent(pedido -> {
            System.out.println("El cliente ordeno:");
            for (DetallePedido detalle : pedido.getDetalles()) {
                System.out.println(detalle.getCantidad() + " " + detalle.getArticulo().getDenominacion());
            }
            System.out.println("El cliente debe pagar $" + pedido.getTotal());
        });

        total = 0;
        totalCosto = 0;
        DetallePedido pizzaC1P2 = DetallePedido.builder()
                .cantidad(1)
                .articulo(pizzaChica3)
                .build();
        pizzaC1P2.setSubTotal(pizzaC1P2.getArticulo().getPrecioVenta() * pizzaC1P2.getCantidad());
        DetallePedido cervezaC1P2 = DetallePedido.builder()
                .cantidad(1)
                .articulo(cerveza1)
                .build();
        cervezaC1P2.setSubTotal(cervezaC1P2.getArticulo().getPrecioVenta() * cervezaC1P2.getCantidad());
        Pedido segundoPedidoCliente1 = Pedido.builder()
                .horaEstimadaFinalizacion(LocalTime.of(23, 10))
                .estado(Estado.preparacion)
                .tipoEnvio(Envio.retiroLocal)
                .formaDePago(FormaPago.efectivo)
                .fechaPedido(LocalDate.now())
                .build();
        segundoPedidoCliente1.getDetalles().add(pizzaC1P2);
        segundoPedidoCliente1.getDetalles().add(cervezaC1P2);
        for (DetallePedido detallePedido : segundoPedidoCliente1.getDetalles()) {
            total += detallePedido.getSubTotal() * detallePedido.getCantidad();
            totalCosto += detallePedido.getArticulo().getPrecioCompra() * detallePedido.getCantidad();
        }
        segundoPedidoCliente1.setTotal(total);
        segundoPedidoCliente1.setTotalCosto(totalCosto);

        pedidoRepository.save(segundoPedidoCliente1);
        cliente1.getHace().add(segundoPedidoCliente1);

        System.out.println("--------------------------------\nSegundo pedido del cliente 1 llamado " + cliente1.getNombre());
        Optional<Pedido> traerSegundoPedidoCliente1 = pedidoRepository.findById(segundoPedidoCliente1.getId());
        traerSegundoPedidoCliente1.ifPresent(pedido -> {
            System.out.println("El cliente ordeno:");
            for (DetallePedido detalle : pedido.getDetalles()) {
                System.out.println(detalle.getCantidad() + " " + detalle.getArticulo().getDenominacion());
            }
            System.out.println("El cliente debe pagar $" + pedido.getTotal());
        });

        System.out.println("--------------------------------\nEl cliente 3 llamado " + cliente1.getNombre() + " pidio " + cliente1.getHace().size() + " veces");

        System.out.println("--------------------------------\nTODOS LOS ARTICULOS DEL NEGOCIO");
        List<Articulo> todosArticulos = articuloInMemoryRepository.findAll();
        todosArticulos.forEach(System.out::println);
    }
}
