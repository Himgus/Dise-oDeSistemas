package ar.edu.concesionaria.sistema;

import ar.edu.concesionaria.modelo.Auto;
import ar.edu.concesionaria.modelo.BuilderAuto;
import ar.edu.concesionaria.modelo.TipoCombustible;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Concesionaria {

    private final String nombre;
    private final ArrayList<Auto> autos;

    public Concesionaria(String nombre) {
        this.nombre = nombre;
        this.autos = new ArrayList<>();
    }

    public void agregarAuto(Auto auto) {
        if (existePatente(auto.getPatente())) {
            throw new IllegalArgumentException("Ya existe un auto con la patente " + auto.getPatente());
        }
        autos.add(auto);
    }

    public List<Auto> getAutos() {
        return Collections.unmodifiableList(autos);
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarAutos() {
        System.out.println("Autos registrados en " + nombre + ":");

        if (autos.isEmpty()) {
            System.out.println("No hay autos registrados.");
            return;
        }

        for (Auto auto : autos) {
            System.out.println("- " + auto);
        }
    }

    public boolean existePatente(String patente) {
        for (Auto auto : autos) {
            if (auto.getPatente().equalsIgnoreCase(patente)) {
                return true;
            }
        }
        return false;
    }
}
