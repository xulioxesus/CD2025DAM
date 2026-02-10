package com.example;

public class Alumno extends Persona {
    private float notaMedia;
    public Alumno(float notaMedia, String nombre, String direccion, String telefono, String alias, String correoElectronico) {
        super(nombre, direccion, telefono, alias, correoElectronico);
        this.notaMedia = notaMedia;
    }
    public float getNotaMedia() {
        return notaMedia;
    }
    public void setNotaMedia(float notaMedia) {
        this.notaMedia = notaMedia;
    } 
}