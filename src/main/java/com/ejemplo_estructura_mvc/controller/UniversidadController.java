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
    return universidades.size();                                 //Con el tamaño puedo iterar mi ciclo for en universidadview y mostrar las universidades en el metodo mostrarUni.
  }

  //Acciones

  //Metodo para crear una universidad
  public void crearUniversidad(String nit, String nombre, String direccion, String email) {
    //Crear universidad
    Universidad universidad = new Universidad(nit, nombre, direccion, email);
    //Almacenar universidad
    universidades.add(universidad);
  }


  //Metodo para consultar universidades y retorna un String(xq'la view va a llamar al controller y este retornara en forma de String las universidades)
  public String obtenerUniversidadXIndex(int index) {
    Universidad universidad = universidades.get(index);                                 //Obtener universidad por index
    return universidad.toString();                                                      //Retornar universidad
  }
}


/*Una vez hecho el Model. Como vamos a crear muchas universidades, el Controller va a instanciar esas universidades(dentro de Model)
 *Se necesita hacer una relacion desde el Controller hacia el Model. Se hace por medio del ArrayList(porque son muchas universidades) 
*/