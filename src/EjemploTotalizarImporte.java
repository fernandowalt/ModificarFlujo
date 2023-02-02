import modelos.Producto;
import java.util.ArrayList;
import java.util.List;

public class EjemploTotalizarImporte {

public static void main (String[] args) {

    List<Producto> listaProductos = new ArrayList<>();

    listaProductos.add(new Producto("Telefono", 124, 5));
    listaProductos.add(new Producto("Bicicleta", 85, 8));
    listaProductos.add(new Producto("Casco", 62, 3));

    Double total = listaProductos.stream().mapToDouble(Producto::getTotal).sum();
    System.out.println(total);


}
}
