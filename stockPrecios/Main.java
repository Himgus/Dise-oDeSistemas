package stockPrecios;

public class Main{
    public static void main(String[] args){
        Producto guantes=new ProductoSimple("Guantes",5000,10);
        Producto casco=new ProductoSimple("Casco",30000,4);
        Producto chaleco=new ProductoSimple("Chaleco",15000,7);
        Producto piloto=new ProductoSimple("Piloto",20000,6);

        Combo comboSimple=new Combo("Combo simple");
        comboSimple.agregar(guantes);
        comboSimple.agregar(casco);
        comboSimple.agregar(chaleco);

        Producto paquete=new Packaging(comboSimple,"Paquete",1000,3);

        Combo comboRecargado=new Combo("Combo recargado");
        comboRecargado.agregar(paquete);
        comboRecargado.agregar(piloto);

        Producto caja=new Packaging(comboRecargado,"Caja mas grande",2500,8);
        Producto descuento100=new Descuento(caja, 100);
        Producto descuento50=new Descuento(descuento100, 50);

        System.out.println(comboSimple.getNombre()+" $"+comboSimple.getPrecio()+" stock "+comboSimple.getStock());
        System.out.println(comboRecargado.getNombre()+" $"+comboRecargado.getPrecio()+" stock "+comboRecargado.getStock());
        System.out.println(descuento50.getNombre()+" final $"+descuento50.getPrecio()+" stock "+descuento50.getStock());
    }
}
