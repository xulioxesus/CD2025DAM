package com.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Conferencia {
    public String nome;
    public String lugar;
    public LocalDate dataInicio;
    public LocalDate dataFin;

    private List<Participante> participantes = new ArrayList<>();
    private List<Sesion> sesions = new ArrayList<>();

    public Conferencia(String nome, String lugar, LocalDate dataInicio, LocalDate dataFin) {
        this.nome = nome;
        this.lugar = lugar;
        this.dataInicio = dataInicio;
        this.dataFin = dataFin;
    }

    public void inscribir(Participante participante) {
        this.participantes.add(participante);
    }

    public void cancelar(Participante participante) {
        this.participantes.remove(participante);
    }

    public void engadirSesion(LocalDate data, String horaInicio, String titulo) {
        this.sesions.add(new Sesion(data, horaInicio, titulo));
    }
}
