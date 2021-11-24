package sincronica;

public class Departamento extends Proyecto implements Comparable {
    private Integer cantidadPisos;
    private Integer deptosPorPiso;

    public Departamento(Integer idProyecto, String nombreProyecto, String ciudad, String status, Construccion construccion, Integer cantidadPisos, Integer deptosPorPiso) {
        super(idProyecto, nombreProyecto, ciudad, status, construccion);
        this.cantidadPisos = cantidadPisos;
        this.deptosPorPiso = deptosPorPiso;
    }

    @Override
    public int compareTo(Object o) {
        Departamento departamento = (Departamento) o;
        if (deptosPorPiso*cantidadPisos > departamento.deptosPorPiso*departamento.cantidadPisos) {
            return 1; //mayor
        }
        if (deptosPorPiso*cantidadPisos < departamento.deptosPorPiso*departamento.cantidadPisos){
            return -1; //menor
        }
        else {
            return 0; //son iguales
        }
    }



    public Boolean esRascacielos(){
        if (cantidadPisos > 15){
            return true;
        }
        else {
            return false;
        }
    }
}
