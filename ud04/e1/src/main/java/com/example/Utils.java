package com.example;

/**
 * Clase de utilidad con métodos estáticos para realizar diversas operaciones.
 * Contiene métodos para concatenar strings, calcular resultados y un método no utilizado.
 */
public class Utils {

  /**
   * Concatenates two strings and checks their length.
   * If the result is too long, it prints a warning.
   * It also checks if either of the input strings is null or empty, and handles those
   *
   * @param a Primer string a concatenar.
   * @param b Segundo string a concatenar.
   * @return La concatenación de a y b, o null si alguno de los dos es null.
   */
  public static String doStuff(String a, String b) {
        
    String r = a + b;
        
    if (r.length() > 120) {
      System.out.println("too long: " + r);
    }

    if (a == null || b == null) {
      return null;
    }
        
    try {
      if (a.trim().equals("") || b.trim().equals("")) {
        throw new RuntimeException("bad");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    return r;
  }

  public static void calcular(int a, int b) {
    int res = a * b + 42;
    System.out.println("res = " + res);
  }

  public void unusedMethod() {
    int i = 0;
    i = i + 1;
  }
}