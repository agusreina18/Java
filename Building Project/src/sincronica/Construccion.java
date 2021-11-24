package sincronica;

public class Construccion {

    private String direccion;
    private Integer fechaInicio;
    private Integer fechaFinPrevista;
    private Integer fechaFinReal;

    public Construccion(String direccion, Integer fechaInicio, Integer fechaFinPrevista, Integer fechaFinReal) {
        this.direccion = direccion;
        this.fechaInicio = fechaInicio;
        this.fechaFinPrevista = fechaFinPrevista;
        this.fechaFinReal = fechaFinReal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Integer fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Integer getFechaFinPrevista() {
        return fechaFinPrevista;
    }

    public void setFechaFinPrevista(Integer fechaFinPrevista) {
        this.fechaFinPrevista = fechaFinPrevista;
    }

    public Integer getFechaFinReal() {
        return fechaFinReal;
    }

    public void setFechaFinReal(Integer fechaFinReal) {
        this.fechaFinReal = fechaFinReal;
    }
}
