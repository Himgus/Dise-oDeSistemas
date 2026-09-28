package stockPrecios;

public class Descuento extends DecoradorProducto{
    private double monto;

    public Descuento(Producto componente, double monto){
        super(componente);
        this.monto=monto;
    }

    @Override
    public double getPrecio(){
        return componente.getPrecio()-monto;
    }
}
