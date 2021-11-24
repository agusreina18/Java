package asincronica;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Ejercitación String e Integer
        //Ejercicio 1
        //Definir dos cadenas de texto. Comprobar si son iguales o distintas e indicar mediante un
        //mensaje.
        String texto1 = "Agus";
        String texto2 = "Agos";

        if (!texto1.equals(texto2)) {
            System.out.println("Los textos son distintos");
        }
        else {
            System.out.println("Los textos son iguales");
        }
//Ejercicio 2
////Definir dos Integer y determinar cuál es mayor, cuál es menor o si son iguales.
////Informar el resultado obtenido.

        Integer num1=5;
        Integer num2=3;
        int comparar;

        if (num1.equals(num2)){
            System.out.println("Los numeros son iguales");
        }
        else {
            comparar=num1.compareTo(num2);
            if (comparar<0){
                System.out.println("El primer numero es mayor que el segundo");
            }
            else {
                System.out.println("El segundo numero es menor que el primero");
            }
        }
//Ejercitación Ingreso de datos
        //Ejercicio 1
        //Ingresá tu nombre y tu apellido por separado, a partir de estas variables debés obtener en
        //una tercera tus iniciales.

        Scanner scanner;
        scanner= new Scanner(System.in);

        String nombre;
        String apellido;
        char inicialNombre;
        char inicialApellido;
        String iniciales;

        System.out.println("Ingrese su nombre");
        nombre= scanner.nextLine();
        System.out.println("Ingrese su apellido");
        apellido= scanner.nextLine();
        inicialNombre= nombre.charAt(0);
        inicialApellido= apellido.charAt(0);
        iniciales= "" + inicialApellido + inicialNombre;
        System.out.println("Sus iniciales son " + iniciales);
//Ejercitación Funciones
//Ejercicio 1
//Hacer una función que reciba como parámetro dos valores y devuelva un boolean. La
//función debe comprobar si el primer número es divisible por el segundo.
//boolean esDivisible(int n, int divisor)
//NOTA: Que sea divisible quiere decir que al dividir da un valor exacto, es decir, sin
//decimales.
        int n;
        int divisor;
        System.out.println("Ingrese el numero que desee dividir");
        n= scanner.nextInt();
        System.out.println("Ingrese el divisor");
        divisor= scanner.nextInt();
        System.out.println(esDivisible(n,divisor));

    }
    public static boolean esDivisible(int n, int divisor){
        boolean division=false;
        if(n % divisor == 0){
            division=true;
        }
    return division;
    }

}







