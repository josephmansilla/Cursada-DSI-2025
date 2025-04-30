package org;

import domain.catalogo.Album;
import domain.catalogo.Cancion;

public class App {
  public static void main(String[] args) {
    System.out.println("Hello World");
    Album album = new Album();
    Cancion unaCancion = new Cancion("...", album, 2001);
  }
}
