
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
        String s = "Crema: " + this.nombre + "\n Precio: " + this.precio + "\n Contenido: " + this.contenido + "\n ¿Protección contra rayos UV? " + this.tieneUV + "\n Tipo: " + this.tipo;
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
