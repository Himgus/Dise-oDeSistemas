package stockPrecios;

import java.util.ArrayList;
import java.util.List;

public class Combo extends Producto{
    private List<Producto> componentes=new ArrayList<>();

    public Combo(String nombre){
        super(nombre);
    }

    public void agregar(Producto p){
        componentes.add(p);
    }

    public void quitar(Producto p){
        componentes.remove(p);
    }

    @Override
    public double getPrecio(){
        double total=0;
        for(Producto p:componentes){
            total+=p.getPrecio();
        }
        return total;
    }

    @Override
    public int getStock(){
        int minimo=Integer.MAX_VALUE;
        for(Producto p:componentes){
            if(p.getStock()<minimo){
                minimo=p.getStock();
            }
        }
        return minimo;
    }

}
