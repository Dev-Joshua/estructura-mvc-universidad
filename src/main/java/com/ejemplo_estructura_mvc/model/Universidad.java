package com.ejemplo_estructura_mvc.model;

//La clase Universidad pertenece al paquete modelo.
public class Universidad {
  //Atributos
  private String nit;
  private String nombre;
  private String direccion;
  private String email;

  //Constructor
  public Universidad(String nit, String nombre, String direccion, String email) {
    this.nit = nit;
    this.nombre = nombre;
    this.direccion = direccion;
    this.email = email;
  }

  //Consultores y modificadores
  public String getNit() {
    return nit;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}

/*El paquete MODEL va a contener la estructura de la clase. Es la representacion de la entidad 
 *Esta clase puede contener algunos metodos(acciones) que hagan parte de esta clase. 
*/
