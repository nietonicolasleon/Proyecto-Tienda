//Nieto Nicolas
package tienda;

public abstract class Producto {
    protected String nombre;
    protected double precio;
    
    public Producto(String n, double p){
        this.nombre = n;
        this.precio = p;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
