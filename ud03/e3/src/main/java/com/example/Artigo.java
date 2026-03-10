package com.example;

import java.util.ArrayList;
import java.util.List;

public class Artigo {
    public String titulo;
    public String tema;

    private List<Autor> autores = new ArrayList<>();

    public Artigo(String titulo, String tema) {
        this.titulo = titulo;
        this.tema = tema;
    }

    public void agregarAutor(Autor autor) {
        this.autores.add(autor);
    }

    public void eliminarAutor(Autor autor) {
        this.autores.remove(autor);
    }
}
