package sincronica;

import java.util.Date;

public abstract class Paciente {

    private String fechaNaciemiento;
    private String nombre;
    private String apellido;
    private Boolean primerConsulta;

    public Paciente(String fechaNaciemiento, String nombre, String apellido, Boolean primerConsulta) {
        this.fechaNaciemiento = fechaNaciemiento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.primerConsulta = primerConsulta;
    }

    public Boolean hacerEvaluacionInicial(){
        if (primerConsulta == true){
            return true;
        }
        else {
            return false;
        }
    }
}
