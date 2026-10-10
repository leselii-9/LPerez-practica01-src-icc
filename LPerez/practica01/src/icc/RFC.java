import java.util.Scanner;

/**
 * Programa para generar el RFC de una persona a partir de su nombre y fecha.
 * Objetivo: Trabajar con objetos de las clases Scanner y String.
 * @author Lesly Elizabeth Pérez Facio
 * @version 1.0
 */
public class RFC {
    public static void main(String[] pps) {
        Scanner in = new Scanner(System.in);
        String nombreCompleto;
        String fecha;
        // Solicitar y recabar el nombre completo en una sola linea
        System.out.println("Dame el nombre completo");
        nombreCompleto = in.nextLine();
        nombreCompleto = nombreCompleto.trim();

        // Solicitar la fecha de nacimiento en formato dd/mm/aa
        System.out.println("ingresa la fecha de nacimiento en formato dd/mm/aa");
        
        //Recabar los datos
        fecha = in.nextLine();
        fecha = fecha.trim();

        // Descomposición del nombre completo (Nombre ApellidoPaterno ApellidoMaterno)
        // Buscamos el primer espacio que separa el nombre del apellido paterno
        int pos1 = nombreCompleto.indexOf(" ");
        String nombre = nombreCompleto.substring(0, pos1);
        // Resto de la cadena: "ApellidoPaterno ApellidoMaterno"
        String resto = nombreCompleto.substring(pos1 + 1).trim();
        // Buscamos el espacio que separa el apellido paterno del materno
        int pos2 = resto.indexOf(" ");
        String aPaterno = resto.substring(0, pos2);
        String aMaterno = resto.substring(pos2 + 1).trim();

        // Extraer la inicial del nombre
        String inicialNombre = nombre.substring(0, 1);

        // Extraer las dos primeras letras del apellido paterno
        String dosLetrasPaterno = aPaterno.substring(0, 2);

        // Extraer la inicial del apellido materno
        String inicialMaterno = aMaterno.substring(0, 1);

        // Formar la parte alfabetica del RFC
        String rfcLetras = dosLetrasPaterno + inicialMaterno + inicialNombre;

        // Manipular la fecha de nacimiento en formato dd/mm/aa
        // Posiciones: dd (índices 0 a 2), mm (índices 3 a 5), aa (índices 6 a 8)
        String dia = fecha.substring(0, 2);
        String mes = fecha.substring(3, 5);
        String año = fecha.substring(6, 8);

        // Concatenar en el orden del RFC: año + mes + día
        String rfc = rfcLetras + año + mes + dia;
       
       // Convertir a mayúsculas
        rfc = rfc.toUpperCase();

        // Imprimir el resultado
        System.out.println("El RFC de " + nombreCompleto + " es: " + rfc);
    }
}
