package ar.edu.concesionaria.modelo;

public interface BuilderAuto {

    BuilderAuto marca(String marca);

    BuilderAuto modelo(String modelo);

    BuilderAuto patente(String patente);

    BuilderAuto color(String color);

    BuilderAuto anioFabricacion(int anioFabricacion);

    BuilderAuto cantidadPuertas(int cantidadPuertas);

    BuilderAuto tipoCombustible(TipoCombustible tipoCombustible);

    BuilderAuto automatico(boolean automatico);

    BuilderAuto descapotable(boolean descapotable);

    BuilderAuto kilometraje(int kilometraje);

    Auto construir();

    BuilderAuto reiniciar();
}
