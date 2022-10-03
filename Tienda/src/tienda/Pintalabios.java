
package tienda;


public class Pintalabios extends Producto {
    private String color;
    private boolean isFluor;
    private String tamaño;
    
    public Pintalabios(String n, double p, String c, boolean i, String t){
        super(n,p);
        this.color = c;
        this.isFluor = i;
        this.tamaño = t;
    }

    @Override
    public String toString(){
        String s = "Maquillaje: " + this.nombre + "\n Precio: " + this.precio + "\n Color: " + this.color + "\n Tiene Fluor " + this.isFluor + "\n Tamaño: " + this.tamaño;
        return s;
    }
    
    @Override
    public String getNombre() {
        return nombre;
    }
    
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isIsFluor() {
        return isFluor;
    }

    public void setIsFluor(boolean isFluor) {
        this.isFluor = isFluor;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
    
    
}
