package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
    /*
    Diseña la función eco() a la que se le pasa como parámetro de entrada un número n, y muestra por pantalla
    n veces el mensaje “Eco…”. Desde el método main() lee un número introducido por el usuario por teclado y
    pasa este número como parámetro en la llamada a la función.
     */

    public static void main(String[] args) {

        //Declaramos las varaibles
        int numRepeticiones;    //Varaible en la que vamos a guardar cuantas veces quiere el usuario que se repita el eco

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca cuantas veces quiere que se repita el eco y lo guardamos en la variable numRepeticiones
        System.out.println("Cuantas veces quieres que se repita la frase?");
        numRepeticiones=sc.nextInt();

        //Llamamos al metodo eco y le pasamos el numero introducido por el usuario por parámetro para que se repita ese numero de veces
        eco(numRepeticiones);

        //Cerramos el scanner
        sc.close();
    }

    /**
     * Metodo que va a imprimir por pantalla la frase "Eco..." el numero de veces que le pasemos por
     * parámetro.
     * @param repeticiones numero de veces que el usuario quiere que se repita la frase eco
     */
    private static void eco(int repeticiones) {
        for (int i = 0; i < repeticiones; i++) {    //Inicializamos el bucle en 0, lo acabamos en el numero de repeticiones y lo incrementamos en 1
            System.out.println("Eco...");           //Imprimimos el mensaje
        }
    }
}
