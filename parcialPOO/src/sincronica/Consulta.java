package sincronica;

import java.util.Date;

public class Consulta {

    private String fechaConsulta;
    private String especialidad;
    private Integer hora;
    private Integer minuto;

    public Consulta(String fechaConsulta, String especialidad, Integer hora, Integer minuto) {
        this.fechaConsulta = fechaConsulta;
        this.especialidad = especialidad;
        this.hora = hora;
        this.minuto = minuto;
    }

    public String getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(String fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }


    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Integer getHora() {
        return hora;
    }

    public void setHora(Integer hora) {
        this.hora = hora;
    }

    public Integer getMinuto() {
        return minuto;
    }

    public void setMinuto(Integer minuto) {
        this.minuto = minuto;
    }
}
