package sincronica;

public class Main {

    public static void main(String[] args) {
        Consulta consulta = new Consulta("13/03/2022", "Endocrinologia", 8, 30);
        PteObraSocial pteObraSocial1 = new PteObraSocial("13/03/1991", "Agustina", "Orozco Reina",true,"OSDE", 1318);
        PteObraSocial pteObraSocial2 = new PteObraSocial("22/06/1991", "Aldana", "Orozco Reina",false,"OSDE", 1322);

        System.out.println(pteObraSocial1.hacerEvaluacionInicial());
        System.out.println(pteObraSocial2.hacerEvaluacionInicial());
        System.out.println(pteObraSocial1.compareTo(pteObraSocial2));

    }
}
