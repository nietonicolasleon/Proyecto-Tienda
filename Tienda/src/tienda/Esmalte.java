//Agustin Barcia
package tienda;


public class Esmalte extends Producto {
    private String color ;
    private String tipo ;
    private boolean tieneBrillo ;
    
    public Esmalte(String n, double p, String c, String t, boolean tb){
        super(n, p) ;
        this.color = c ;
        this.tipo = t ;
        this.tieneBrillo = tb ;
    }
    
    @Override
    public String toString(){
        String s = "Esmalte: " + this.nombre + "\n Precio: " + this.precio + "\n Color: " + this.color + "\n Tipo: " + this.tipo + "\n Tiene Brillo: " + this.tieneBrillo;
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

    public boolean isTieneBrillo() {
        return tieneBrillo;
    }

    public void setTieneBrillo(boolean tieneBrillo) {
        this.tieneBrillo = tieneBrillo;
    }
    
    
    
}
