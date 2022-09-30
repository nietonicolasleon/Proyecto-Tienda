package tienda;

public class Maquillaje extends Producto {
    private String color;
    private String tipo;
    
    public Maquillaje(String n, double p, String c, String t){
        super(n, p);
        this.color = c;
        this.tipo = t;
    }

    @Override
    public String toString(){
        String s = "Maquillaje: " + this.nombre + "\n Precio: " + this.precio + "\n Color: " + this.color + "\n Tipo: " + this.tipo;
        return s;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
