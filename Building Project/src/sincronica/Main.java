package sincronica;

public class Main {

    public static void main(String[] args) {
	Construccion construccion = new Construccion("Las Heras 1464", 2020, 2020, 2020);
    Departamento departamento1 = new Departamento(1, "Departamento1", "San Luis", "FINALIZADO", construccion, 4, 7);
    Departamento departamento2 = new Departamento(1, "Departamento1", "San Luis", "FINALIZADO", construccion, 4, 4);

    System.out.println(departamento1.compareTo(departamento2));
    System.out.println(departamento1.esRascacielos());
    System.out.println(departamento1.finalizaEnFecha());
    }
}
