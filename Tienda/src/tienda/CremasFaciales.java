//Marmol Sofia
package tienda;

public class CremasFaciales extends Producto {
    
    private String contenido;
    private boolean tieneUV;
    private String tipo;
    
    public CremasFaciales(String n, double p, String c, boolean tv, String t){
        super(n, p);
        this.contenido = c;
        this.tieneUV = tv;
        this.tipo = t;
    }
    
    @Override
    public String toString(){
        String s = "\n Crema: " + this.nombre + "\n Precio: " + this.precio + "\n Contenido: " + this.contenido + "\n ¿Protección contra rayos UV? " + this.tieneUV + "\n Tipo: " + this.tipo;
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

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public boolean isTieneUV() {
        return tieneUV;
    }

    public void setTieneUV(boolean tieneUV) {
        this.tieneUV = tieneUV;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
    
}
