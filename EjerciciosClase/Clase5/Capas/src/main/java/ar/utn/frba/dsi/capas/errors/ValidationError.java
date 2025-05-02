package ar.utn.frba.dsi.capas.errors;

public class ValidationError extends Error{
  public String name;
  public void ValidationError(){
    this.name = "ValidationError";
  }
}
