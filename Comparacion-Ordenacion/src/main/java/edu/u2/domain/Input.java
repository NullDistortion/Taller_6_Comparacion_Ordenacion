package edu.u2.domain;

public class Input {

    private String id;
    private String nombre;
    private int stock;

    public Input(String id, String nombre, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.stock = stock;
    }

    public int getKey() {
        return stock;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public int getStock() { return stock; }
}
