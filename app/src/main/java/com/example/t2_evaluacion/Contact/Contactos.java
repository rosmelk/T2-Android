package com.example.t2_evaluacion.Contact;

public class Contactos {
    public String nombre;
    public String number;

    public Contactos(String nombre, String number) {
        this.nombre = nombre;
        this.number = number;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
