package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    /*
    Escribe una función a la que se le pasen dos enteros y muestre todos los números comprendidos entre ellos.
    Desde el método main() lee los dos números enteros, los cuales deben introducirlos el usuario,
    y pásalos como parámetros de entrada de la función.
     */

    public static void main(String[] args) {
        //Declaramos las varaibles
        int num1;    //Varaible en la que vamos a guardar el primer numero introducido por el usuario
        int num2;    //Varaible en la que vamos a guardar el segundo numero introducido por el usuario

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca dos numeros y los guardamos en las variables num previamente declaradas
        System.out.println("Introduce un numero entero:");
        num1=sc.nextInt();
        System.out.println("Introduce otro numero entero:");
        num2=sc.nextInt();

        //Llamamos al metodo eco y le pasamos el numero introducido por el usuario por parámetro para que se repita ese numero de veces
        listaNumeros(num1, num2);

        //Cerramos el scanner
        sc.close();
    }

    /**
     *
     * @param num1
     * @param num2
     */
    private static void listaNumeros(int num1, int num2) {
        if (num1>num2){
            for (int i = num2; i <= num1; i++) {
                System.out.println(i);
            }
        }else if (num2>num1){
            for (int i = num1; i <= num2; i++) {
                System.out.println(i);
            }
        }else {
            System.out.println("Los numeros son iguales");
        }
    }
}
