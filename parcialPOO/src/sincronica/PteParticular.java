package sincronica;

import java.util.Date;

public class PteParticular extends Paciente {

    private Double precioConsulta;
    private String dni;

    public PteParticular(String fechaNaciemiento, String nombre, String apellido, Boolean primerConsulta, Double precioConsulta, String dni) {
        super(fechaNaciemiento, nombre, apellido, primerConsulta);
        this.precioConsulta = precioConsulta;
        this.dni = dni;
    }
}
