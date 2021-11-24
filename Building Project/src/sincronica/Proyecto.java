package sincronica;

public abstract class Proyecto {
    private Integer idProyecto;
    private String nombreProyecto;
    private String ciudad;
    private String status;
    private Construccion construccion;

    public Proyecto(Integer idProyecto, String nombreProyecto, String ciudad, String status, Construccion construccion) {
        this.idProyecto = idProyecto;
        this.nombreProyecto = nombreProyecto;
        this.ciudad = ciudad;
        this.status = status;
        this.construccion = construccion;
    }



    public Boolean finalizaEnFecha(){
        //if (construccion.getFechaFinReal().equals(construccion.getFechaFinPrevista()) && status == "FINALIZADO" ){
        //    return true;
        //}
        //else {
        //   return false;

        Integer fechaPrevista = construccion.getFechaFinPrevista();
        Integer fechaReal = construccion.getFechaFinReal();

        return fechaReal.equals(fechaPrevista) && status == "FINALIZADO";
        }
    }

