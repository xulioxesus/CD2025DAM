package com.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sesion {
    public LocalDate data;
    public String horaInicio;
    public String titulo;

    private List<Participante> participantes = new ArrayList<>();
    private List<Artigo> artigos = new ArrayList<>()   ;

    public Sesion(LocalDate data, String horaInicio, String titulo) {
        this.data = data;
        this.horaInicio = horaInicio;
        this.titulo = titulo;
    }

    public void participar(Participante participante) {
        this.participantes.add(participante);
    }

    public void eliminar(Participante participante) {
        this.participantes.remove(participante);
    }

    public void presentar(Artigo artigo) {
        this.artigos.add(artigo);
    }

    public void noPresentar(Artigo artigo) {
        this.artigos.remove(artigo);
    }
}
