package ar.edu.concesionaria.modelo;

public class Auto {
    private String marca;
    private String modelo;
    private String patente;
    private String color;
    private int anioFabricacion;
    private int cantidadPuertas;
    private TipoCombustible tipoCombustible;
    private boolean automatico;
    private boolean descapotable;
    private int kilometraje;

    Auto() {
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPatente() {
        return patente;
    }

    public String getColor() {
        return color;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public boolean isAutomatico() {
        return automatico;
    }

    public boolean isDescapotable() {
        return descapotable;
    }

    public int getKilometraje() {
        return kilometraje;
    }
    void setMarca(String marca) {
        this.marca = marca;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    void setPatente(String patente) {
        this.patente = patente;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }

    void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }

    void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", patente='" + patente + '\'' +
                ", color='" + color + '\'' +
                ", anioFabricacion=" + anioFabricacion +
                ", cantidadPuertas=" + cantidadPuertas +
                ", tipoCombustible=" + tipoCombustible +
                ", automatico=" + automatico +
                ", descapotable=" + descapotable +
                ", kilometraje=" + kilometraje +
                '}';
    }
}
