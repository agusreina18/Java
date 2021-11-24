package sincronica;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // DESAFIO 1- PIEDRA PAPEL O TIJERA
        //Desafío 1
        //Hacé un programa que te permita jugar a “Piedra, papel o tijera”. En primer lugar, la
        //aplicación solicita el nombre de cada gamer, después empieza el juego. El juego consiste
        //en pedir qué opción elije cada uno y sumar puntos al winner —si lo hay—. Definí y utilizá
        //una función llamada cualGana con dos parámetros con las jugadas de cada uno, que
        //devuelve 0 en caso de empate, 1 si gana el primero, 2 si gana el segundo. El juego termina
        //cuando el primero elije “*” como indicador de final.
        String idJugador1;
        String idJugador2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Que el jugador 1 ingrese su nombre:");
        idJugador1 = scanner.nextLine();
        System.out.println("Que el jugador 2 ingrese su nombre:");
        idJugador2 = scanner.nextLine();

        System.out.println("Instrucciones: Dadas las opciones Piedra(1), Papel(2) y Tijera(3), " +
                "que cada jugador en su turno ingrese la opción correspondiente.");
        System.out.println("Que comience el juego!");

        int opcionJ1;
        int opcionJ2;
        Scanner scanner1 = new Scanner(System.in);
        do {
            System.out.println("Que " + idJugador1 + " ingrese su opcion:");
            opcionJ1 = scanner1.nextInt();
            System.out.println("Que " + idJugador2 + " ingrese su elección:");
            opcionJ2 = scanner1.nextInt();
            System.out.println(cualGana(opcionJ1, opcionJ2));
        } while (opcionJ1 == 1||opcionJ1==2||opcionJ1==3);
        if (opcionJ1 != 1 ||opcionJ1!=2||opcionJ1!=3){
            System.out.println("Ha terminado el juego.");
        }
    }
    public static String cualGana(int eleccionJ1, int eleccionJ2) {
        int respuesta;

        if (eleccionJ1 == eleccionJ2) {
            respuesta = 0;
        }

        else if (
                (eleccionJ1 == 1 && eleccionJ2 == 3) ||
        (eleccionJ1 == 3 && eleccionJ2 == 2) ||
                (eleccionJ1 == 2 && eleccionJ2 == 1) ||
                (eleccionJ1 == 5 && eleccionJ2 == 3)
        ){ respuesta = 1;
        }

        else { respuesta= 2;
        }
        return "Gana " + respuesta;
    }
}


