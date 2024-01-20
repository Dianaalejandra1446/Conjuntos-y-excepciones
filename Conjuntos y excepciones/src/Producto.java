import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Producto {
    private double precio;
    private int numeroReferencia;
    private int cantidad;
    private Map<Integer, String> categoria;
    private ArrayList<Producto> productos;

    public Producto(double precio, int numeroReferencia, int cantidad) {
        this.precio = precio;
        this.numeroReferencia = numeroReferencia;
        this.cantidad = cantidad;
        this.categoria = new HashMap<>();
        this.productos = new ArrayList<>();
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumeroReferencia() {
        return numeroReferencia;
    }

    public void setNumeroReferencia(int numeroReferencia) {
        this.numeroReferencia = numeroReferencia;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Map<Integer, String> getCategoria() {
        return categoria;
    }

    public void setCategoria(Map<Integer, String> categoria) {
        this.categoria = categoria;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void Categorias() {
        categoria.put(1, "Computadores");
        categoria.put(2, "Celulares");
        categoria.put(3, "Electrodomesticos");
        categoria.put(4, "TV");
        categoria.put(5, "Accesorios");
        categoria.put(6, "Videojuegos");
        categoria.put(7, "Audio y Video");
    }

    public void Mostrar() {
        System.out.println("CATEGORIAS");
        System.out.println(categoria.toString());
    }

    public void EliminarCategoria() {
        Scanner leer = new Scanner(System.in);
        System.out.println("----ELIMINAR----");
        System.out.println("CATEGORIAS: " + categoria.toString());
        System.out.println("Ingrese el numero de categoria a eliminar: ");
        int eliminar = leer.nextInt();
        categoria.remove(eliminar);
        leer.close();
    }

    public void AgregarProductos(Producto producto) {
        productos.add(producto);
    }

    public void restarProductos(Producto producto) {
        productos.remove(producto);
    }
}
