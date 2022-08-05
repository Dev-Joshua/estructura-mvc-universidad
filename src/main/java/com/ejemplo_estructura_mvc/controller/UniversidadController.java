package com.ejemplo_estructura_mvc.controller;

import java.util.ArrayList;

import com.ejemplo_estructura_mvc.model.Universidad;



public class UniversidadController {
  //Atributos
  private ArrayList<Universidad> universidades;

  //Constructor
  public UniversidadController() {
    universidades = new ArrayList<Universidad>();                 //Relacion entre el controlador y el modelo
  }

  //Consultores
  public int getCantidadUniversidades() {
    return universidades.size();
  }

  //Acciones
  public void crearUniversidad(String nit, String nombre, String direccion, String email) {
    //Crear universidad
    Universidad universidad1 = new Universidad(nit, nombre, direccion, email);
    //Almacenar universidad
    universidades.add(universidad1);
  }
}


/*Una vez hecho el Model. Como vamos a crear muchas universidades, el Controller va a instanciar esas universidades(dentro de Model)
 *Se necesita hacer una relacion desde el Controller hacia el Model. Se hace por medio del ArrayList(porque son muchas universidades) 
*/