package com.ejemplo_estructura_mvc.view;

import java.util.Scanner;

import com.ejemplo_estructura_mvc.controller.UniversidadController;

public class UniversidadView {
  //Atributos
  private UniversidadController controller;

  //Constructor
  public UniversidadView() {
    controller = new UniversidadController();
  }


  public void crearUniversidad() {

  }

  //Interfaz de usuario por consola
  public void menu() {
    String mensaje = "-------------------UNIVERSIDADES CON MVC--------------------";
    mensaje += "1) Crear universidad\n";
    mensaje += "2) Mostrar todas las universidades\n";
    mensaje += "3) Consultar universidad por nit\n";
    mensaje += "4) Actualizar universidad\n";
    mensaje += "5) Eliminar universidad\n";
    mensaje += "-1) Salir\n ";
    mensaje += ">>> ";
  
    int opcion = 0;                                                                       //Variable para almacenar la opcion ingresada por el usuario
    Scanner sc = new Scanner(System.in);                                                  //Scanner es un objeto para solicitar datos por consola.
    try {
      //El while se repetira mientras la opcion diferente a -1
      while(opcion != -1) {
        System.out.println(mensaje);
        opcion = sc.nextInt();
        //Evaluar la opcion ingresada por el usuario y asi ejecutar funcion
        switch(opcion){
          case 1:
            crearUniversidad();
            break;
          case 2:
            break;
          case 3:
            break;
          case 4:
            break;
          case 5:
            break;
          default:
            break;
        }
      }
      //Cuando salga del ciclo cerramos el objeto sc(Secanner)
      sc.close();
    } catch (Exception e) {
      System.out.println("Por favor ingrese valores numericos en las opciones solicitadas");
    } 
  }
}

/*Genero la relacion entre la vista y el controlador, para que view se comunique con controller y viceversa'
 *Una vez creado el flujo vista-><-controlador-><-modelo, se desarrola la interfaz del usuario
*/
