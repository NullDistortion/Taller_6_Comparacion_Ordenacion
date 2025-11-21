package edu.u2.domain;

public class Patient {

    private String id;
    private String apellido;
    private int prioridad;

    public Patient(String id, String apellido, int prioridad) {
        this.id = id;
        this.apellido = apellido;
        this.prioridad = prioridad;
    }

    public int getKey() {
        return prioridad;
    }

    public String getId() { return id; }
    public String getApellido() { return apellido; }
    public int getPrioridad() { return prioridad; }
}
