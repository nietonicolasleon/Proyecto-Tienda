//Nieto Nicolas
package tienda;

import java.util.ArrayList;

public class Venta {
    private ArrayList<Producto> lProductos = new ArrayList();
    private int nroVenta;
    private static int cantVentas;
    
    public Venta(){
        Venta.cantVentas++;
        this.nroVenta = Venta.cantVentas;
    }
    
    public void AgregarProducto(Producto p){
        this.lProductos.add(p);
    }
    
    public void EliminarProducto(int index){
        this.lProductos.remove(index);
    }
    
    public String ListarProductos(){
        String s = "";
        for (int i = 0; i < this.lProductos.size(); i++) {
            s += this.lProductos.get(i).toString();
        }
        return s;
    }
}
