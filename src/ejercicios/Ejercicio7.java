package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
    /*
    Escribe una función a la que se le pase como parámetro un número entero y devuelva el número de divisores
    primos que tiene. Utiliza para ello la función que definiste en el ejercicio anterior, esPrimo().
    Diseña un método main() que pruebe el funcionamiento de dicha función.
     */

    public static void main(String[] args) {

        //Declaramos las variables
        int num;

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca un numero entero ylo guardamos en la varaible num
        System.out.println("Introduzca un numero entero: ");
        num = sc.nextInt();

        System.out.println("El numero tiene " + divisoresPrimos(num) + " divisores primos");
    }

    public static boolean esPrimo(int n) {
        //Declaramos las variables
        boolean esPrimo = true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                esPrimo = false;
                break;
            }
        }
        return esPrimo;
    }

    /**
     *
     * @param n
     * @return
     */
    public static int divisoresPrimos(int n) {
        int contadorDivisoresPrimos = 0;

        for (int divisor = 1; divisor <= n; divisor++) {
            if (n % divisor == 0) {
                if (esPrimo(divisor) == true) {
                    contadorDivisoresPrimos++;
                }
            }
        }
        return contadorDivisoresPrimos;
    }


}
