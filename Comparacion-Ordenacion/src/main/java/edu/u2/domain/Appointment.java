package edu.u2.domain;

import java.time.LocalDateTime;

public class Appointment {

    private String id;
    private String apellido;
    private LocalDateTime fechaHora;

    public Appointment(String id, String apellido, LocalDateTime fechaHora) {
        this.id = id;
        this.apellido = apellido;
        this.fechaHora = fechaHora;
    }

    public int getKey() {
        return fechaHora.toLocalTime().toSecondOfDay();
    }

    public String getId() { return id; }
    public String getApellido() { return apellido; }
    public LocalDateTime getFechaHora() { return fechaHora; }
}
