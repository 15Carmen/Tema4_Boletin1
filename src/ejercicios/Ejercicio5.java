package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    /*
    Crear una función que devuelva un tipo booleano que indique si el carácter que se pasa como parámetro
    de entrada corresponde con una vocal. Diseña un método main() que pruebe el funcionamiento de dicha función.
     */

    public static void main(String[] args) {
        //Declaramos las varaibles
        String letra;

        //Declaramos el scanner
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca una letra y la guardamos en la variable previamente declarada
        System.out.println("Introduzca una letra: ");
        letra=sc.next();

        //Mostramos por pantalla el metodo esVocal y le pasamos por parametros la variable letra
        System.out.println(esVocal(letra));

    }

    /**
     *
     * @param letra
     * @return
     */
    private static boolean esVocal(String letra) {

        //Declaramos las varaibles
        boolean esVocal=false;

        switch (letra){
            case "a", "e", "i", "o", "u" :
                esVocal=true;
                System.out.println("Es una vocal");
                break;
            default:
                System.out.println("No es una vocal");
                break;
        }

        return esVocal;
    }
}
