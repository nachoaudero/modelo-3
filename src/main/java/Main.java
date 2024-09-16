import entities.*;
import repositories.InMemoryRepository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        // Crear un repositorio para cada clase
        InMemoryRepository<Articulo> articuloRepository = new InMemoryRepository<>();
        InMemoryRepository<UnidadMedida> unidadMedidaRepository = new InMemoryRepository<>();
        InMemoryRepository<Imagenes> imagenesRepository = new InMemoryRepository<>();
        InMemoryRepository<Pedido> pedidoRepository = new InMemoryRepository<>();
        InMemoryRepository<Cliente> clienteRepository = new InMemoryRepository<>();

        // Creamos 3 clientes
        Cliente cliente1 = Cliente.builder()
                .nombre("Juan")
                .apellido("Perez")
                .telefono("2611234567")
                .email("juanperecito@gmail.com")
                .fechaNacimiento(LocalDate.of(1999, 5, 29))
                .build();
        Cliente cliente2 = Cliente.builder()
                .nombre("Marcos")
                .apellido("Diaz")
                .telefono("2619348539")
                .email("marquitosd@gmail.com")
                .fechaNacimiento(LocalDate.of(1995, 2, 1))
                .build();
        Cliente cliente3 = Cliente.builder()
                .nombre("Marta")
                .apellido("Gimenez")
                .telefono("2614752938")
                .email("gimenezmartita@gmail.com")
                .fechaNacimiento(LocalDate.of(2001, 11, 30))
                .build();
        clienteRepository.save(cliente1);
        clienteRepository.save(cliente2);
        clienteRepository.save(cliente3);

        // Creamos unidades de medida
        UnidadMedida ochoPorciones = UnidadMedida.builder().denominacion("8 porciones").build();
        UnidadMedida cuatroPorciones = UnidadMedida.builder().denominacion("4 porciones").build();
        UnidadMedida unLitro = UnidadMedida.builder().denominacion("1 litro").build();

        unidadMedidaRepository.save(ochoPorciones);
        unidadMedidaRepository.save(cuatroPorciones);
        unidadMedidaRepository.save(unLitro);

        // Creamos imagenes
        Imagenes imagen1 = Imagenes.builder()
                .nombre("Pizza grande Hawaiana")
                .url("https//pizzaHawGran.png")
                .build();
        Imagenes imagen2 = Imagenes.builder()
                .nombre("Pizza grande Napolitana")
                .url("https//pizzaNapGran.png")
                .build();
        Imagenes imagen3 = Imagenes.builder()
                .nombre("Pizza grande Muzza")
                .url("https//pizzaMuzGran.png")
                .build();
        Imagenes imagen4 = Imagenes.builder()
                .nombre("Pizza chica Hawaiana")
                .url("https//pizzaHawChi.png")
                .build();
        Imagenes imagen5 = Imagenes.builder()
                .nombre("Pizza chica Napolitana")
                .url("https//pizzaNapChi.png")
                .build();
        Imagenes imagen6 = Imagenes.builder()
                .nombre("Pizza chica Muzza")
                .url("https//pizzaMuzChi.png")
                .build();
        Imagenes imagen7 = Imagenes.builder()
                .nombre("Cerveza Andes")
                .url("https//cervezaAnd.png")
                .build();
        Imagenes imagen8 = Imagenes.builder()
                .nombre("Cerveza Quilmes")
                .url("https//cervezaQui.png")
                .build();
        imagenesRepository.save(imagen1);
        imagenesRepository.save(imagen2);
        imagenesRepository.save(imagen3);
        imagenesRepository.save(imagen4);
        imagenesRepository.save(imagen5);
        imagenesRepository.save(imagen6);
        imagenesRepository.save(imagen7);
        imagenesRepository.save(imagen8);

        // Crear articulos
        Articulo pizzaHawaianaGrande = Articulo.builder()
                .denominacion("Pizza grande Hawaiana.")
                .precioVenta(10500D)
                .precioCompra(8900D)
                .stockActual(80)
                .stockMaximo(100)
                .unidad(ochoPorciones)
                .imagen(imagen1)
                .tiempoEstimadoMinutos(30)
                .build();
        Articulo pizzaHawaianaChica = Articulo.builder()
                .denominacion("Pizza chica Hawaiana.")
                .precioVenta(8500D)
                .precioCompra(6950D)
                .stockActual(70)
                .stockMaximo(120)
                .unidad(cuatroPorciones)
                .imagen(imagen4)
                .tiempoEstimadoMinutos(25)
                .build();
        Articulo pizzaNapolitanaGrande = Articulo.builder()
                .denominacion("Pizza grande Napolitana")
                .precioVenta(10000D)
                .precioCompra(8500D)
                .stockActual(50)
                .stockMaximo(90)
                .unidad(ochoPorciones)
                .imagen(imagen2)
                .tiempoEstimadoMinutos(25)
                .build();
        Articulo pizzaNapolitanaChica = Articulo.builder()
                .denominacion("Pizza chica Napolitana")
                .precioVenta(9000D)
                .precioCompra(7900D)
                .stockActual(60)
                .stockMaximo(100)
                .unidad(cuatroPorciones)
                .imagen(imagen5)
                .tiempoEstimadoMinutos(20)
                .build();
        Articulo pizzaMuzzaGrande = Articulo.builder()
                .denominacion("Pizza grande Muzza")
                .precioVenta(7500D)
                .precioCompra(5000D)
                .stockActual(90)
                .stockMaximo(150)
                .unidad(ochoPorciones)
                .imagen(imagen3)
                .tiempoEstimadoMinutos(20)
                .build();
        Articulo pizzaMuzzaChica = Articulo.builder()
                .denominacion("Pizza chica Muzza")
                .precioVenta(6000D)
                .precioCompra(3500D)
                .stockActual(120)
                .stockMaximo(200)
                .unidad(cuatroPorciones)
                .imagen(imagen6)
                .tiempoEstimadoMinutos(15)
                .build();
        Articulo cervezaAndes = Articulo.builder()
                .denominacion("Cerveza Andes")
                .precioVenta(2000D)
                .precioCompra(1500D)
                .stockActual(40)
                .stockMaximo(60)
                .unidad(unLitro)
                .imagen(imagen7)
                .tiempoEstimadoMinutos(0)
                .build();
        Articulo cervezaQuilmes = Articulo.builder()
                .denominacion("Cerveza Quilmes")
                .precioVenta(2000D)
                .precioCompra(1500D)
                .stockActual(30)
                .stockMaximo(60)
                .unidad(unLitro)
                .imagen(imagen8)
                .tiempoEstimadoMinutos(0)
                .build();
        articuloRepository.save(pizzaHawaianaGrande);
        articuloRepository.save(pizzaHawaianaChica);
        articuloRepository.save(pizzaNapolitanaGrande);
        articuloRepository.save(pizzaNapolitanaChica);
        articuloRepository.save(pizzaMuzzaGrande);
        articuloRepository.save(pizzaMuzzaChica);
        articuloRepository.save(cervezaAndes);
        articuloRepository.save(cervezaQuilmes);

        // Desarrollo del programa
        double total = 0;
        double totalCosto = 0;
        DetallePedido pizzaC1 = DetallePedido.builder()
                .cantidad(1)
                .articulo(pizzaNapolitanaGrande)
                .build();
        pizzaC1.setSubTotal(pizzaC1.getArticulo().getPrecioVenta() * pizzaC1.getCantidad());
        DetallePedido cervezaC1 = DetallePedido.builder()
                .cantidad(1)
                .articulo(cervezaQuilmes)
                .build();
        cervezaC1.setSubTotal(cervezaC1.getArticulo().getPrecioVenta() * cervezaC1.getCantidad());
        Pedido pedidoCliente1 = Pedido.builder()
                .horaEstimadaFinalizacion(LocalTime.of(20, 45))
                .estado(Estado.terminado)
                .tipoEnvio(TipoEnvio.retiroLocal)
                .formaDePago(FormaDePago.debito)
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
                .articulo(pizzaHawaianaChica)
                .build();
        pizzaC2.setSubTotal(pizzaC2.getArticulo().getPrecioVenta() * pizzaC2.getCantidad());
        DetallePedido cervezaC2 = DetallePedido.builder()
                .cantidad(3)
                .articulo(cervezaQuilmes)
                .build();
        cervezaC2.setSubTotal(cervezaC2.getArticulo().getPrecioVenta() * cervezaC2.getCantidad());
        Pedido pedidoCliente2 = Pedido.builder()
                .horaEstimadaFinalizacion(LocalTime.of(21, 15))
                .estado(Estado.terminado)
                .tipoEnvio(TipoEnvio.delivery)
                .formaDePago(FormaDePago.credito)
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
                .articulo(pizzaHawaianaGrande)
                .build();
        pizza1C3.setSubTotal(pizza1C3.getArticulo().getPrecioVenta() * pizza1C3.getCantidad());
        DetallePedido pizza2C3 = DetallePedido.builder()
                .cantidad(1)
                .articulo(pizzaMuzzaChica)
                .build();
        pizza2C3.setSubTotal(pizza2C3.getArticulo().getPrecioVenta() * pizza2C3.getCantidad());
        DetallePedido pizza3C3 = DetallePedido.builder()
                .cantidad(1)
                .articulo(pizzaNapolitanaGrande)
                .build();
        pizza3C3.setSubTotal(pizza3C3.getArticulo().getPrecioVenta() * pizza3C3.getCantidad());
        DetallePedido cervezaC3 = DetallePedido.builder()
                .cantidad(2)
                .articulo(cervezaAndes)
                .build();
        cervezaC3.setSubTotal(cervezaC3.getArticulo().getPrecioVenta() * cervezaC3.getCantidad());
        Pedido pedidoCliente3 = Pedido.builder()
                .horaEstimadaFinalizacion(LocalTime.of(22, 0))
                .estado(Estado.terminado)
                .tipoEnvio(TipoEnvio.retiroLocal)
                .formaDePago(FormaDePago.efectivo)
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
                .articulo(pizzaMuzzaChica)
                .build();
        pizzaC1P2.setSubTotal(pizzaC1P2.getArticulo().getPrecioVenta() * pizzaC1P2.getCantidad());
        DetallePedido cervezaC1P2 = DetallePedido.builder()
                .cantidad(1)
                .articulo(cervezaAndes)
                .build();
        cervezaC1P2.setSubTotal(cervezaC1P2.getArticulo().getPrecioVenta() * cervezaC1P2.getCantidad());
        Pedido segundoPedidoCliente1 = Pedido.builder()
                .horaEstimadaFinalizacion(LocalTime.of(23, 10))
                .estado(Estado.preparacion)
                .tipoEnvio(TipoEnvio.retiroLocal)
                .formaDePago(FormaDePago.efectivo)
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
        List<Articulo> todosArticulos = articuloRepository.findAll();
        todosArticulos.forEach(System.out::println);
    }
}
