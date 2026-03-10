package com.example;

/**
 * Clase que gestiona alumnos, con un contador de instancias y métodos para agregar alumnos.
 * Contiene un constructor, un método para agregar alumnos, y métodos getter/setter para el nombre.
 */
public class AlumnoManager {  // nombre de clase no CamelCase

  public static int contador = 0; // no final, visibilidad, espaciado, etc.
  private String nombre; // variable con mayúscula

  public AlumnoManager(String n) {
    this.nombre = n;
    contador++;
  }

  /**
   * Agrega un alumno con su nombre, edad y nota media.
   * Imprime si el alumno es mayor o menor de edad, y luego imprime
   * una lista de 10 entradas con el nombre y la nota media.
   *
   * @param name Nombre del alumno.
   * @param edad Edad del alumno.
   * @param notaMedia Nota media del alumno.
   */
  public void addAlumno(String name, int edad, double notaMedia) {
    if (edad > 18) {
      System.out.println("Mayor");
    } else {
      System.out.println("Menor");
    }

    int x = 3;

    for (int i = 0; i < 10; i++) {
      System.out.println(i + ":" + name + "-" + notaMedia);
    }
  }

  public String toString() {
    return "AlumnoManager{Nombre=" + this.nombre + ", contador=" + contador + "}";
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return this.nombre;
  }
}