package sincronica;

import java.util.Date;

public class PteObraSocial extends Paciente implements Comparable {

    private String nombreObraSocial;
    private Integer nroAsociado;

    public PteObraSocial(String fechaNaciemiento, String nombre, String apellido, Boolean primerConsulta, String nombreObraSocial, Integer nroAsociado) {
        super(fechaNaciemiento, nombre, apellido, primerConsulta);
        this.nombreObraSocial = nombreObraSocial;
        this.nroAsociado = nroAsociado;
    }

    @Override
    public int compareTo(Object o) {

        PteObraSocial pteObraSocial = (PteObraSocial) o;
        if (nroAsociado > pteObraSocial.nroAsociado){
            return 1;
        }

        if (nroAsociado < pteObraSocial.nroAsociado){
            return -1;
        }

        else {
            return 0;
        }
    }
}
