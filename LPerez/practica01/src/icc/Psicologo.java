/**
*El objetivo de esta práctica es que el alumno se familiarice con la creación y uso de objetos de la clase String utilizando algunos metodos de dicha clase en la elaboración de un programa.
+@autor Lesly Elizabeth Pérez Facio
*Version 1.0
**/
import java.util.Scanner;

public class Psicologo{
  public static void main (String [] args){ 
    Scanner in = new Scanner(System.in);
    
    //Dar bienvenida y solicitar el nombre 
    System.out.println("Bienvenido a esta tu primera sesión");
    System.out.println("¿Cuál es tu nombre?");
    
    //Recabar el nombre
    String nombre = in.nextLine();
    
    //Saludar al paciente y preguntar el problema
    System.out.println("Buenas tardes " +nombre+ ", cuentanos lo qué sucede ");
    
    // Leer el problema
    String problema = in.nextLine();
    
    //Contestar en múltiples líneas e incluir el texto entre comillas
    System.out.println("mmm... ya veo ");
    System.out.println("Y digame...");
    System.out.println("¿Por qué dice \"" +problema + "\"?");
    
    
    //Leer la respuesta
    String razon = in.nextLine();
    
    //Despedida
    System.out.println("Muy interesante!!, Hablaremos de ello con más detalle en la siguiente sesión, te espero!!");
    
    
   } 
    
    
}
