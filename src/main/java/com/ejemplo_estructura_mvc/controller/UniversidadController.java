package com.ejemplo_estructura_mvc.controller;

import java.util.ArrayList;

import com.ejemplo_estructura_mvc.model.Universidad;
//El paquete controller va a contener y manipular todas las universidades(objetos de tipo universidad)/
//El controlador interactua con la vista(view) y el modelo(Universidad). Controla toda la informacion, maneja toda la logica del programa 
//Si el usuario solicita un dato mediante(vista), esta se lo pide al controller y controller lo trae de model


public class UniversidadController {
  //Atributos
  private ArrayList<Universidad> universidades;

  //Constructor
  public UniversidadController() {
    universidades = new ArrayList<Universidad>();                 //Relacion entre el controlador y el modelo.Inicializao el atributo
  }

  //Consultores
  public int getCantidadUniversidades() {
    return universidades.size();                                 //Con el tamaño puedo iterar mi ciclo for en universidadview y mostrar las universidades en el metodo mostrarUni.
  }



  //Acciones
  //1) Metodo para crear una universidad
  public void crearUniversidad(String nit, String nombre, String direccion, String email) {
    //Crear universidad
    Universidad universidad = new Universidad(nit, nombre, direccion, email);
    //Almacenar universidad en ArrayList(universidades)
    universidades.add(universidad);
  }


  //2) Metodo para consultar universidades y retorna un String(xq'la view va a llamar al controller y este retornara en forma de String las universidades)
  public String obtenerUniversidadXIndex(int index) {
    Universidad universidad = universidades.get(index);                                 //Obtener universidad por index
    return universidad.toString();                                                      //Retornar universidad
  }


  //3) Metodo que retornara un String(informacion de esa universidad) mediante el Nit
  //Para buscar la universidad hay que iterar el arrayList<Universidad> => universidades
  //En cada iteracion hacer un get para capturar el objeto que esta en cada posicion del arreglo
  public String obtenerUniversidadXNit(String nit) {
    String info = "";
    //Iterar universidad.
    for (Universidad universidad : universidades) {
      //El objeto(universidad) que esta en esa interacion que vaya el ciclo, le vamos a obtener el nit(getNit)
      //SI! el nit del objeto(universidad) en cada iteracion  es igual al nit que recibo como parametro entonces:
      if(universidad.getNit().equalsIgnoreCase(nit)) {
        info = universidad.toString();                                                   //Obtengo la informacion por medio de un toString() 
        break;                                                                           //Rompo el ciclo si ya encontre la universidad por nit
      }
    }
    return info;                                                                        //Si encuentra la universidad(nit) que solicita el if(), la asigna a info.  
  }
}

  


/*Una vez hecho el Model. Como vamos a crear muchas universidades, el Controller va a instanciar esas universidades(dentro de Model)
 *Se necesita hacer una relacion desde el Controller hacia el Model. Se hace por medio del ArrayList(porque son muchas universidades) 

 *El foreach en cada iteracion va obteniendo el valor. 
 *Para este caso va obtener cada objeto(universidad) que esta en cada posicion del ArrayList(universidades)
 *El foreach esta compuesto de 2 secciones: 1)La variable que va almacenar el valor(universidad) 
                                            2)El arreglo que voy a iterar(universidades)
*/