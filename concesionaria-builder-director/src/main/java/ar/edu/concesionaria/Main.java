package ar.edu.concesionaria;

import ar.edu.concesionaria.modelo.Auto;
import ar.edu.concesionaria.modelo.AutoBuilderConcreto;
import ar.edu.concesionaria.modelo.AutoUsadoBuilderConcreto;
import ar.edu.concesionaria.modelo.TipoCombustible;
import ar.edu.concesionaria.sistema.Concesionaria;

public class Main {

    public static void main(String[] args) {
        Concesionaria concesionaria = new Concesionaria("Concesionaria Central");
        AutoBuilderConcreto builder = new AutoBuilderConcreto();
        AutoUsadoBuilderConcreto usadoBuilder= new AutoUsadoBuilderConcreto();

        System.out.println("===== CASOS CORRECTOS =====");


        Auto auto = builder
                .marca("Ford")
                .modelo("Fiesta")
                .patente("AB923CD")
                .anioFabricacion(2023)
                .construir();
        concesionaria.agregarAuto(auto);

        Auto auto1 = builder
                .marca("Ford")
                .modelo("Fiesta")
                .patente("AB123CD")
                .color("Rojo")
                .anioFabricacion(2020)
                .cantidadPuertas(5)
                .tipoCombustible(TipoCombustible.NAFTA)
                .automatico(false)
                .descapotable(false)
                .kilometraje(45000)
                .construir();
        concesionaria.agregarAuto(auto1);

        Auto auto2 =builder
                .marca("Toyota")
                .modelo("Corolla")
                .patente("AC456DF")
                .anioFabricacion(2022)
                .construir();



        concesionaria.agregarAuto(auto2);

        Auto autoUsado1=usadoBuilder
                .marca("Volkswagen")
                .modelo("Up!")
                .patente("AB123CE")
                .color("Blanco")
                .anioFabricacion(1960)
                .cantidadPuertas(5)
                .tipoCombustible(TipoCombustible.NAFTA)
                .automatico(false)
                .descapotable(false)
                .kilometraje(200000)
                .construir();
        concesionaria.agregarAuto(autoUsado1);

        concesionaria.mostrarAutos();

        System.out.println();
        System.out.println("===== CASOS CON ERROR =====");

        probarCasoConError("Patente inválida", () -> {
            Auto autoInvalido = builder
                    .marca("Volkswagen")
                    .modelo("Gol")
                    .patente("A1")
                    .anioFabricacion(2015)
                    .construir();
            concesionaria.agregarAuto(autoInvalido);
        });

        probarCasoConError("Año inválido", () -> {
            Auto autoInvalido =builder
                    .marca("Fiat")
                    .modelo("Cronos")
                    .patente("AE123IJ")
                    .anioFabricacion(1998)
                    .kilometraje(1)
                    .construir();
            concesionaria.agregarAuto(autoInvalido);
        });

        probarCasoConError("Marca vacía", () -> {
            Auto autoInvalido = builder
                    .marca("")
                    .modelo("208")
                    .patente("AF123KL")
                    .anioFabricacion(2021)
                    .construir();
            concesionaria.agregarAuto(autoInvalido);
        });

        probarCasoConError("Kilometraje negativo", () -> {
            Auto autoInvalido =builder
                    .marca("Chevrolet")
                    .modelo("Onix")
                    .patente("AG123MN")
                    .color("Blanco")
                    .anioFabricacion(2023)
                    .cantidadPuertas(5)
                    .tipoCombustible(TipoCombustible.NAFTA)
                    .automatico(false)
                    .descapotable(false)
                    .kilometraje(-100)
                    .construir();
            concesionaria.agregarAuto(autoInvalido);
        });

        probarCasoConError("Patente repetida", () -> {
            Auto autoRepetido = builder
                    .marca("Honda")
                    .modelo("Civic")
                    .patente("AB123CD")
                    .anioFabricacion(2021)
                    .kilometraje(0)
                    .construir();
            concesionaria.agregarAuto(autoRepetido);
        });
        probarCasoConError("Patente con caracteres invalidos", ()->{
            Auto autoPatenteInvalida=usadoBuilder
                    .marca("Volkswagen")
                    .modelo("Up!")
                    .patente("AAAAAAA")
                    .color("Blanco")
                    .anioFabricacion(1960)
                    .cantidadPuertas(5)
                    .tipoCombustible(TipoCombustible.NAFTA)
                    .automatico(false)
                    .descapotable(false)
                    .kilometraje(200000)
                    .construir();
            concesionaria.agregarAuto(autoPatenteInvalida);
        });
    }

    private static void probarCasoConError(String descripcion, Runnable caso) {
        try {
            caso.run();
            System.out.println(descripcion + ": no falló, pero debería haber fallado.");
        } catch (RuntimeException e) {
            System.out.println(descripcion + ": " + e.getMessage());
        }
    }
}
