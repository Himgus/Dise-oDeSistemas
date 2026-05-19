package ar.edu.concesionaria.modelo;

import java.time.Year;

public class AutoUsadoBuilderConcreto implements BuilderAuto{
    private Auto auto;


    public AutoUsadoBuilderConcreto() {
        reiniciar();
    }

    @Override
    public BuilderAuto reiniciar() {
        this.auto = new Auto();

        this.auto.setColor("Sin especificar");
        this.auto.setCantidadPuertas(5);
        this.auto.setTipoCombustible(TipoCombustible.NAFTA);
        this.auto.setAutomatico(false);
        this.auto.setDescapotable(false);
        this.auto.setKilometraje(0);

        return this;
    }

    @Override
    public BuilderAuto marca(String marca) {
        this.auto.setMarca(marca);
        return this;
    }

    @Override
    public BuilderAuto modelo(String modelo) {
        this.auto.setModelo(modelo);
        return this;
    }

    @Override
    public BuilderAuto patente(String patente) {
        this.auto.setPatente(patente);
        return this;
    }

    @Override
    public BuilderAuto color(String color) {
        this.auto.setColor(color);
        return this;
    }

    @Override
    public BuilderAuto anioFabricacion(int anioFabricacion) {
        this.auto.setAnioFabricacion(anioFabricacion);
        return this;
    }

    @Override
    public BuilderAuto cantidadPuertas(int cantidadPuertas) {
        this.auto.setCantidadPuertas(cantidadPuertas);
        return this;
    }

    @Override
    public BuilderAuto tipoCombustible(TipoCombustible tipoCombustible) {
        this.auto.setTipoCombustible(tipoCombustible);
        return this;
    }

    @Override
    public BuilderAuto automatico(boolean automatico) {
        this.auto.setAutomatico(automatico);
        return this;
    }

    @Override
    public BuilderAuto descapotable(boolean descapotable) {
        this.auto.setDescapotable(descapotable);
        return this;
    }

    @Override
    public BuilderAuto kilometraje(int kilometraje) {
        this.auto.setKilometraje(kilometraje);
        return this;
    }

    @Override
    public Auto construir() {
        validarAuto();

        Auto autoConstruido = this.auto;

        reiniciar();

        return autoConstruido;
    }

    private void validarAuto() {
        validarTextoObligatorio(auto.getMarca(), "La marca es obligatoria");
        validarTextoObligatorio(auto.getModelo(), "El modelo es obligatorio");
        validarTextoObligatorio(auto.getPatente(), "La patente es obligatoria");
        validarPatenteLargo();
        validarAnioFabricacion();
        validarPuertas();
        validarTipoCombustible();
        validarKilometraje();
    }

    private void validarKilometraje() {
        if (auto.getKilometraje() <= 0) {
            throw new IllegalArgumentException("El kilometraje no puede ser negativo ni 0");
        }
    }

    private void validarTipoCombustible() {
        if (auto.getTipoCombustible() == null) {
            throw new IllegalArgumentException("El tipo de combustible es obligatorio");
        }
    }

    private void validarPuertas() {
        if (auto.getCantidadPuertas() <= 0) {
            throw new IllegalArgumentException("La cantidad de puertas debe ser mayor a 0");
        }
    }

    private void validarAnioFabricacion() {
        int anioActual = Year.now().getValue();
        if (auto.getAnioFabricacion() > anioActual) {
            throw new IllegalArgumentException("El año de fabricación debe estar entre 2000 y " + anioActual);
        }
    }

    private void validarPatenteLargo() {
        if (auto.getPatente().length() < 6 || auto.getPatente().length() > 7) {
            throw new IllegalArgumentException("La patente debe tener 6 o 7 caracteres");
        }
    }

    private void validarTextoObligatorio(String texto, String mensajeError) {
        if (texto == null || texto.isBlank()) {
            throw new IllegalArgumentException(mensajeError);
        }
    }

}
