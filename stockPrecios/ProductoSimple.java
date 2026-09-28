package stockPrecios;

public class ProductoSimple extends Producto{
    private double precioBase;
    private int stock;

    public ProductoSimple(String nombre, double precioBase, int stock){
        super(nombre);
        this.precioBase=precioBase;
        this.stock=stock;
    }

    @Override
    public double getPrecio(){
        return precioBase;
    }

    @Override
    public int getStock(){
        return stock;
    }
}
