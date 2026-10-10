Práctica 1 de ICC: Implementación de programas en Java que interactúan con el usuario mediante la terminal para simular una sesión de terapia (Psicologo.java) y generar claves al estilo del RFC (RFC.java).

Contenido del Repositorio

La practica se divide en dos programas principales escritos en Java:

    Psicologo.java Un programa interactivo que simula una sesión de terapia conversacional básica a través de la terminal. Funcionamiento:

    Solicita y captura el nombre del usuario.
    Pide al usuario que describa un problema personal.
    Procesa la entrada y responde de manera estructurada en varias líneas intercalando el texto del usuario entre comillas mediante (\").

    RFC.java Un programa diseñado para generar una clave simulada al estilo del Registro Federal de Contribuyentes (RFC) a partir de los datos personales de un usuario. Funcionamiento:

    Solicita el nombre completo (Considerando casos con solamente un nombre y los apellidos) y la fecha de nacimiento en formato específico (dd/mm/aa).
    Separa el nombre completo en palabras individuales (nombre, apellido paterno y apellido materno) utilizando métodos de división de cadenas.
    Extrae caracteres específicos:
        Las dos primeras letras del apellido paterno (substring).
        La inicial del apellido materno (charAt).
        La inicial del nombre (charAt).
        Los componentes de la fecha de nacimiento (año, mes y día).
    Concatena todos los elementos en minúsculas (toLowerCase()) para generar y mostrar la clave final del RFC.
