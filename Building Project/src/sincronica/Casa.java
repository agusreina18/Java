package sincronica;

public class Casa extends Proyecto {
    private Double superficieTerreno;
    private Integer cantidadBanios;
    private Integer cantidadDormitorios;

    public Casa(Integer idProyecto, String nombreProyecto, String ciudad, String status, Construccion construccion, Double superficieTerreno, Integer cantidadBanios, Integer cantidadDormitorios) {
        super(idProyecto, nombreProyecto, ciudad, status, construccion);
        this.superficieTerreno = superficieTerreno;
        this.cantidadBanios = cantidadBanios;
        this.cantidadDormitorios = cantidadDormitorios;
    }
}
