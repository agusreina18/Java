package sincronica;

public class PizzaFactory {
    private static PizzaFactory instance;

    //Patron2
    private PizzaFactory(){

    }
    //Patron3
    public static PizzaFactory getInstance(){
        if(instance==null){
            instance = new PizzaFactory();
        }
        return instance;
    }

    public Pizza creaPizza(String nombrePizza){
        switch (nombrePizza){
            case "comun":
                return new PizzaComun();


            case "pizzaCombinada":
                return new PizzaCombinada();
            default:
                return null;
        }
    }
}
