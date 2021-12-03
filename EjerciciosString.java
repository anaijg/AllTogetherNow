package evaluacion2;

import java.util.Scanner;

public class EjerciciosString {
    // Declaramos aquí el Scanner con la palabra clave static, para que se pueda utilizar el objeto sc en toda la clase
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Todos los ejercicios menos el 16 piden una cadena de texto por teclado
        // La pedimos aquí mismo, y después le pasaremos la cadena al método como parámetro
        System.out.println("Introduce una cadena de texto: ");
        String cadena = sc.nextLine();
        // Ejemplo: ejercicio01(cadena);

        // Escribir aquí un menú en que preguntamos al usuario qué ejercicio quiere realizar
        // A continuación según la opción elegida se invoca al método correspondiente al ejercicio seleccionado

    }





    public static void ejercicio01(String cadena) {
        /*
        Ejercicio 1
Escribir por pantalla cada carácter de una cadena introducida por teclado.
         */

    }

    public static void ejercicio02(String cadena) {
        /*
        Ejercicio 2
Realizar un programa que comprueba si una cadena leída por teclado comienza por una
subcadena introducida por teclado.
         */

    }

    public static void ejercicio03(String cadena) {
        /*
        Ejercicio 3
Reemplazar caracteres: escribe un programa que lea una cadena de texto y reemplace
todas las ocurrencias de la letra ‘a’ con la letra ‘b’. A continuación debe imprimir la cadena
resultante.
         */
    }

// etc...
}
