package tienda;

public class Tienda {
    public static void main(String[] args) {
        Pintalabios p1 = new Pintalabios("Avon Rojo Matte", 300, "Rojo", false, "Mediano");
        Pintalabios p2 = new Pintalabios("Avon Verde Fluorescente", 700, "Verde", true, "Chico");
        Maquillaje m = new Maquillaje("Maquillaje Facial", 850, "Marrón Suave", "Rugoso");
        CremasFaciales c1 = new CremasFaciales("Nivea Skin Care", 1600, "500 cm cúbicos", false, "Crema Humectante");
        CremasFaciales c2 = new CremasFaciales("Nivea Protector Facial", 1000, "250 cm cúbicos", true, "Protector Solar");
        Esmalte e1 = new Esmalte("Esmalte Avon Pretty Nails", 750, "Rosa", "Rugoso", true);
        Esmalte e2 = new Esmalte("Esmalte Avon Discreet Violet", 500, "Violeta", "Liso", false);
        
        Venta v = new Venta();
        v.AgregarProducto(p1);
        v.AgregarProducto(p2);
        v.AgregarProducto(m);
        v.AgregarProducto(c1);
        v.AgregarProducto(c2);
        v.AgregarProducto(e1);
        v.AgregarProducto(e2);
        
        v.EmitirRecibo();
    }
}
