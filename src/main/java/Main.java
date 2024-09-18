import entities.*;
import repositories.InMemoryRepository;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        InMemoryRepository<Cliente> repoCliente = new InMemoryRepository<>();
        InMemoryRepository<UnidadMedida> repoUnidadMedida = new InMemoryRepository<>();
        InMemoryRepository<Articulo> repoArticulo = new InMemoryRepository<>();
        InMemoryRepository<Imagen> repoImagen = new InMemoryRepository<>();
        InMemoryRepository<Pedido> repoPedido = new InMemoryRepository<>();
        InMemoryRepository<DetallePedido> repoDetallePedido = new InMemoryRepository<>();

        Cliente cliente1 = Cliente.builder()
                .nombre("Fran")
                .apellido("Chiappetta")
                .telefono("2613644251")
                .email("franciscomartinezchiappetta@gmail.com")
                .fechaNacimiento(LocalDate.now())
                .build();

        Cliente cliente2 = Cliente.builder()
                .nombre("Julian")
                .apellido("Chiappetta")
                .telefono("2613648651")
                .email("julianmartinezchiappetta@gmail.com")
                .fechaNacimiento(LocalDate.now())
                .build();

        Cliente cliente3 = Cliente.builder()
                .nombre("Sin brujula")
                .apellido("Sin radio")
                .telefono("5:06")
                .email("signodelalma@haedo.com")
                .fechaNacimiento(LocalDate.now())
                .build();

        repoCliente.save(cliente1);
        repoCliente.save(cliente2);
        repoCliente.save(cliente3);



        UnidadMedida ochoPorc = UnidadMedida.builder()
                .denominacion("8 porciones")
                .build();
        UnidadMedida cuatroPorc = UnidadMedida.builder()
                .denominacion("4 porciones")
                .build();
        UnidadMedida unLitro = UnidadMedida.builder()
                .denominacion("1 litro")
                .build();
        repoUnidadMedida.save(ochoPorc);
        repoUnidadMedida.save(cuatroPorc);
        repoUnidadMedida.save(unLitro);

        //Crear imagenes
        Imagen imagen1 = Imagen.builder()
                .denominacion("Pizza Grande Hawaiana")
                .build();
        Imagen imagen2 = Imagen.builder()
                .denominacion("Pizza Grande Napolitana")
                .build();
        Imagen imagen3 = Imagen.builder()
                .denominacion("Pizza Grande Muzza")
                .build();
        Imagen imagen4 = Imagen.builder()
                .denominacion("Pizza Chica Hawaiana")
                .build();
        Imagen imagen5 = Imagen.builder()
                .denominacion("Pizza Chica Napolitana")
                .build();
        Imagen imagen6 = Imagen.builder()
                .denominacion("Pizza Chica Muzza")
                .build();
        Imagen imagen7 = Imagen.builder()
                .denominacion("Cerveza Andes")
                .build();
        Imagen imagen8 = Imagen.builder()
                .denominacion("Cerveza Quilmes")
                .build();

        Articulo cerveza1 = Articulo.builder()
                .denominacion("Cerveza Andes")
                .precioVenta(5000D)
                .precioCompra(3000D)
                .stockActual(65)
                .stockMaximo(150)
                .imagen(imagen7)
                .unidadMedida(unLitro)
                .build();
        Articulo cerveza2 = Articulo.builder()
                .denominacion("Cerveza Quilmes")
                .precioVenta(6500D)
                .precioCompra(4000D)
                .stockActual(45)
                .stockMaximo(150)
                .imagen(imagen8)
                .unidadMedida(unLitro)
                .build();

        Articulo pizzaChica1 = Articulo.builder()
                .denominacion("Pizza Chica Hawaiana")
                .precioVenta(4500D)
                .precioCompra(2750D)
                .stockActual(20)
                .stockMaximo(40)
                .imagen(imagen4)
                .unidadMedida(cuatroPorc)
                .build();
        Articulo pizzaChica2 = Articulo.builder()
                .denominacion("Pizza Chica Napolitana")
                .precioVenta(4700D)
                .precioCompra(2750D)
                .stockActual(25)
                .stockMaximo(35)
                .imagen(imagen5)
                .unidadMedida(cuatroPorc)
                .build();
        Articulo pizzaChica3 = Articulo.builder()
                .denominacion("Pizza Chica Muzza")
                .precioVenta(3800D)
                .precioCompra(2300D)
                .stockActual(40)
                .stockMaximo(75)
                .imagen(imagen6)
                .unidadMedida(cuatroPorc)
                .build();
        Articulo pizzaGrande1 = Articulo.builder()
                .denominacion("Pizza Grande Hawaiana")
                .precioVenta(8750D)
                .precioCompra(5500D)
                .stockActual(15)
                .stockMaximo(35)
                .imagen(imagen1)
                .unidadMedida(ochoPorc)
                .build();
        Articulo pizzaGrande2 = Articulo.builder()
                .denominacion("Pizza Grande Napolitana")
                .precioVenta(9200D)
                .precioCompra(5500D)
                .stockActual(17)
                .stockMaximo(35)
                .imagen(imagen2)
                .unidadMedida(ochoPorc)
                .build();
        Articulo pizzaGrande3 = Articulo.builder()
                .denominacion("Pizza Grande Muzza")
                .precioVenta(7500D)
                .precioCompra(4600D)
                .stockActual(30)
                .stockMaximo(60)
                .imagen(imagen3)
                .unidadMedida(ochoPorc)
                .build();

        repoArticulo.save(cerveza1);
        repoArticulo.save(cerveza2);
        repoArticulo.save(pizzaChica1);
        repoArticulo.save(pizzaChica2);
        repoArticulo.save(pizzaChica3);
        repoArticulo.save(pizzaGrande1);
        repoArticulo.save(pizzaGrande2);
        repoArticulo.save(pizzaGrande3);

        //cliente 1 realiza un pedido realiza un pedido de una Pizza grande y una cerveza Quilmes.
        DetallePedido detallePedido1 = DetallePedido.builder()
                .cantidad(1)
                .articulo(pizzaGrande1)
                .subTotal(1*pizzaGrande1.getPrecioVenta())
                .build();
        DetallePedido detallePedido2 = DetallePedido.builder()
                .cantidad(1)
                .articulo(pizzaGrande1)
                .subTotal(1*pizzaGrande1.getPrecioVenta())
                .build();
        Pedido pedido1 = Pedido.builder()
                .fechaPedido(LocalDate.now())
                .estado(EstadoPedido.Solicitado)
                .envio(TipoEnvio.A_Domicilio)
                .formaPago(FormaPago.Transferencia)
                .build();

        pedido1.getDetallePedidos().add(detallePedido1);
        pedido1.getDetallePedidos().add(detallePedido2);
        pedido1.setTotal(detallePedido1.getSubTotal() + detallePedido2.getSubTotal());
        pedido1.setTotalCosto(detallePedido1.getArticulo().getPrecioCompra() * detallePedido1.getCantidad()
                + detallePedido2.getArticulo().getPrecioCompra() * detallePedido2.getCantidad());

        System.out.println("Pedido Cliente 1: ");
        mostrarPedido(pedido1);

        //El cliente2 realiza la compra de la 3 cervezas Quilmes y una Pizza Hawaiana chica
        DetallePedido detallePedido3 = DetallePedido.builder()
                .cantidad(1)
                .articulo(pizzaChica1)
                .subTotal(1*pizzaChica1.getPrecioVenta())
                .build();
        DetallePedido detallePedido4 = DetallePedido.builder()
                .cantidad(3)
                .articulo(cerveza2)
                .subTotal(1*cerveza2.getPrecioVenta())
                .build();
        Pedido pedido2 = Pedido.builder()
                .fechaPedido(LocalDate.now())
                .estado(EstadoPedido.En_Preparacion)
                .envio(TipoEnvio.Entrega_en_local)
                .formaPago(FormaPago.MODO)
                .build();

        pedido2.getDetallePedidos().add(detallePedido3);
        pedido2.getDetallePedidos().add(detallePedido4);
        pedido2.setTotal(detallePedido3.getSubTotal() + detallePedido4.getSubTotal());
        pedido2.setTotalCosto(detallePedido3.getArticulo().getPrecioCompra() * detallePedido3.getCantidad()
                + detallePedido4.getArticulo().getPrecioCompra() * detallePedido4.getCantidad());

        System.out.println("Pedido Cliente 2: ");
        mostrarPedido(pedido2);

        //-	El cliente3 compra 1 Pizza grande Hawaiana , 1 pizza chica Muzza , 1 grande Napolitana y 2 cervezas Andes.
        DetallePedido detallePedido5 = DetallePedido.builder()
                .cantidad(1)
                .articulo(pizzaChica1)
                .subTotal(1*pizzaChica1.getPrecioVenta())
                .build();
        DetallePedido detallePedido6 = DetallePedido.builder()
                .cantidad(3)
                .articulo(cerveza2)
                .subTotal(1*cerveza2.getPrecioVenta())
                .build();
        DetallePedido detallePedido7 = DetallePedido.builder()
                .cantidad(1)
                .articulo(pizzaChica1)
                .subTotal(1*pizzaChica1.getPrecioVenta())
                .build();
        DetallePedido detallePedido8 = DetallePedido.builder()
                .cantidad(3)
                .articulo(cerveza2)
                .subTotal(1*cerveza2.getPrecioVenta())
                .build();
        Pedido pedido3 = Pedido.builder()
                .fechaPedido(LocalDate.now())
                .estado(EstadoPedido.En_Preparacion)
                .envio(TipoEnvio.Entrega_en_local)
                .formaPago(FormaPago.MODO)
                .build();

        pedido3.getDetallePedidos().add(detallePedido5);
        pedido3.getDetallePedidos().add(detallePedido6);
        pedido3.getDetallePedidos().add(detallePedido7);
        pedido3.getDetallePedidos().add(detallePedido8);
        pedido3.setTotal(detallePedido5.getSubTotal() + detallePedido6.getSubTotal() + detallePedido7.getSubTotal() + detallePedido8.getSubTotal());
        pedido3.setTotalCosto(detallePedido5.getArticulo().getPrecioCompra() * detallePedido5.getCantidad()
                + detallePedido6.getArticulo().getPrecioCompra() * detallePedido6.getCantidad()
                + detallePedido7.getArticulo().getPrecioCompra() * detallePedido7.getCantidad()
                + detallePedido8.getArticulo().getPrecioCompra() * detallePedido8.getCantidad());

        System.out.println("Pedido Cliente 2: ");
        mostrarPedido(pedido3);




    }

    public static void mostrarPedido(Pedido pedido) {
        System.out.println("DETALLE DEL PEDIDO:");
        System.out.println("Articulos: ");
        for (DetallePedido detallePedido : pedido.getDetallePedidos()) {
            System.out.println(detallePedido.toString() + "\n");
        }
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("-----------------");
    }








}
