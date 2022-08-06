package com.ejemplo_estructura_mvc.view;

import java.util.Scanner;

import com.ejemplo_estructura_mvc.controller.UniversidadController;
//El paquete view(vista) va a contener todo lo que tenga que ver con informacion que se mostrara o solicitara  al usuario
//En vista coloco toda la interfaz de usuario, vista estara en constante comunicacion con controller.

public class UniversidadView {
  //Atributos
  private UniversidadController controller;              //Relacion. La vista esta instanciando al controller y el controlador al modelo

  //Constructor
  public UniversidadView() {
    controller = new UniversidadController();           //Inicializo mi atributo
  }


  //para crear una universidad solicitamos nit,nombre,etc. Por ende podemos manejar
  //un solo objeto Scanner en todas la interfaz de usuario y no crear multiples objetos de tipo scanner
  //Metodo crear una universidad
  public void crearUniversidad(Scanner sc) {
    //Encabezado
    System.out.println("\n\n----------------CREAR UNIVERSIDAD------------------");
    System.out.println("Por favor ingrese la siguiente informacion: ");

    //Solicitud de datos
    //Solicitar nit
    System.out.println("Nit: ");
    String nit = sc.next();
    sc.nextLine();
    //Solicitar nombre
    System.out.println("Nombre: ");
    String nombre = sc.next();
    sc.nextLine();
    //Solicitar direccion
    System.out.println("Direccion: ");
    String direccion = sc.next();
    sc.nextLine();
    //Solicitar email
    System.out.println("Email: ");
    String email = sc.next();
    sc.nextLine();
    
    //Crear universidad. (no podemos crearla directamente desde la vista, romperiamos el patron MVC.)
    //Toca decirle al controlador que cree una universidad
    controller.crearUniversidad(nit, nombre, direccion, email);
    System.out.println("\nUniversidad creada con exito\n\n");
  }



  //Metodo para mostrar las universidades. Iteramos universidad x universidad...Este for itera y trae la posicion
  public void mostrarUniversidades() {
    for(int i=0; i<controller.getCantidadUniversidades(); i++) {                    //obtenemos el tamaño del array universidades por medio de controller. Para iterar ese array
      String universidad = controller.obtenerUniversidadXIndex(i);                  //Obtengo la universidad(String) por cada iteracion mediante el index i(posicion)
      System.out.println(universidad);                                              //Muestro la universidad
    }
  }


  //Metodo para capturar y mostar el nit(universidad)
  public void mostraruniversidadXNit(Scanner sc) {
    System.out.println("--------------CONSULTAR UNIVERSIDAD--------------");    //Encabezado. Informacion que se mostrara al usuario por consola
    System.out.println("Por favor ingrese la siguiente informacion");
    //Solicitar nit
    System.out.println("Nit: ");
    String nit = sc.next();
    sc.nextLine();
    //Mostrar universidad
    System.out.println(controller.obtenerUniversidadXNit(nit));                   //Llamo al controlador, al metodo obtenerUni.. y le paso el nit que capturamos al usuario
    
  }

  //Metodo para mostrar el menu
  //Interfaz de usuario por consola 
  public void menu() {
    String mensaje = "-------------------UNIVERSIDADES CON MVC--------------------\n";
    mensaje += "1) Crear universidad\n";
    mensaje += "2) Mostrar todas las universidades\n";
    mensaje += "3) Consultar universidad por nit\n";
    mensaje += "4) Actualizar universidad\n";
    mensaje += "5) Eliminar universidad\n";
    mensaje += "-1) Salir\n";
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
            crearUniversidad(sc);
            break;
          case 2:
            mostrarUniversidades();
            break;
          case 3:
          mostraruniversidadXNit(sc);
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
