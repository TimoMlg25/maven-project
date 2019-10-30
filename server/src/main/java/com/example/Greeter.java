package com.example;

/**
*Classe Greeter.
*/
public class Greeter {

  /**
  *Constructeur vide Greeter.
  */
  public Greeter() {

  }
  /**
  *methode.
  @return someone
  */
  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
