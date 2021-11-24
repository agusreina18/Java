package sincronica;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	String nombreCan;
    double cantidadCan;

        Scanner scanner= new Scanner(System.in);

        System.out.println("Ingrese el nombre del can:");
        nombreCan= scanner.nextLine();
        System.out.println("Ingrese la cantidad de comida:");
        cantidadCan= scanner.nextDouble();

        System.out.println();
    }

    public static int cuantosPaquetes (double totalKg){
        int cantidadPaquetes=0;

        Scanner scanner= new Scanner(System.in);

        double kgPaquete;

        while (totalKg>0){
            System.out.println("Ingrese el siguiente paquete:");
            kgPaquete= scanner.nextDouble();
            totalKg -= kgPaquete;
            cantidadPaquetes++;

            System.out.println("Total de kgs restantes: "+ totalKg );
        }

        return cantidadPaquetes;
    }
}
