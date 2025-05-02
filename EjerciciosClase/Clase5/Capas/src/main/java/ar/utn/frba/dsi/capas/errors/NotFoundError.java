package ar.utn.frba.dsi.capas.errors;

public class NotFoundError extends Error{

  public String name;
  private void ValidationError(){
    this.name = "NotFoundError";
  }

}
