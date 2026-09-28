package stockPrecios;

public class Packaging extends DecoradorProducto{
    private String tipo;
    private double precioPack;
    private int stockPack;

    public Packaging(Producto componente, String tipo, double precioPack, int stockPack){
        super(componente);
        this.tipo=tipo;
        this.precioPack=precioPack;
        this.stockPack=stockPack;
    }

    @Override
    public double getPrecio(){
        return componente.getPrecio()+precioPack;
    }

    @Override
    public int getStock(){
        if(stockPack<componente.getStock()){
        return stockPack;
        }
        return componente.getStock();
    }
}
