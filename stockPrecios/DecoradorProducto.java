package stockPrecios;

public abstract class DecoradorProducto extends Producto{
    protected Producto componente;

    public DecoradorProducto(Producto componente){
        super(componente.getNombre());
        this.componente=componente;
    }

    @Override
    public double getPrecio(){
        return componente.getPrecio();
    }

    @Override
    public int getStock(){
        return componente.getStock();
    }

}
