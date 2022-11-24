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
     * Metodo que va a listar los numeros que hay entre los introducidos por el usuario. Se hará de fprma ascendente o descendente
     * según cual de los numeros introducidos es mayor. Si
     * @param num1 es mayor que num2, se hará de forma descendente. Si
     * @param num2 es mayor que num1, se hará de forma ascendente.
     * Si ambos numeros introducidos son iguales se lanzará un mensaje de error
     */
    private static void listaNumeros(int num1, int num2) {
        if (num1>num2){                             //Si num1 es mayor que num2
            for (int i = num1; i >= num2; i--) {    //Inicializamos el bucle en num1, lo terminamos en num2 y lo decrementamos en 1
                System.out.println(i);              //Imprimimos i
            }
        }else if (num2>num1){                       //Si num2 es mayor que num1
            for (int i = num1; i <= num2; i++) {    //Inicializamos el bucle en num1, lo terminamos en 2 y lo incrementamos 2 en 1
                System.out.println(i);              //Imprimimos i
            }
        }else {                                     //Si los numeros introducidos son iguales imprimimos un mensaje indicando este hecho
            System.out.println("Los numeros son iguales");
        }
    }
}
