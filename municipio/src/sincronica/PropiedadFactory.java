package sincronica;

public class PropiedadFactory {
    //Patron1
    private static PropiedadFactory instance;

    //Patron2
    private PropiedadFactory(){

    }
    //Patron3
    public static PropiedadFactory getInstance(){
        if(instance==null){
            instance = new PropiedadFactory();
        }
        return instance;
    }

    public Propiedad crearPropiedad(String nombrePropiedad){
        switch (nombrePropiedad){
            case "casa":
                return new Casa();


            case "barrioCerrado":
                return new BarrioCerrado();
            default:
                return null;
        }
    }
}
