package mercadogestion;

/**
 *
 * @author barah
 */
public class Lista {
    String tipo;
    String nombre;
    String cantidad;

    public Lista(String tipo, String nombre, String cantidad) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCantidad() {
        return cantidad;
    }
    
    
       
    
}
