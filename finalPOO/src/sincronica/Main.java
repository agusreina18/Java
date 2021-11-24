package sincronica;

public class Main {

    public static void main(String[] args) {
        Pizzeria pizzeria = new Pizzeria();

        Pizza pizza1 = PizzaFactory.getInstance().creaPizza("comun");
        Pizza pizza2 = PizzaFactory.getInstance().creaPizza("comun");
        Pizza pizza3 = PizzaFactory.getInstance().creaPizza("comun");
        Pizza pizza4 = PizzaFactory.getInstance().creaPizza("pizzaCombinada");

        pizza1.setNombre("muzzarella");
        ((PizzaComun)pizza1).setTamaño("chica");
        ((PizzaComun)pizza1).setPrecioBase(700.0);

        pizza2.setNombre("especial");
        ((PizzaComun)pizza2).setTamaño("chica");
        ((PizzaComun)pizza2).setPrecioBase(850.0);

        pizza3.setNombre("de Ananá ");
        ((PizzaComun)pizza3).setTamaño("chica");
        ((PizzaComun)pizza3).setPrecioBase(950.0);

        pizza4.setNombre("combinada Loca");
        ((PizzaCombinada)pizza4).agregarVariedad(pizza2);
        ((PizzaCombinada)pizza4).agregarVariedad(pizza3);

        pizzeria.agregarPizzas(pizza1);
        pizzeria.agregarPizzas(pizza2);
        pizzeria.agregarPizzas(pizza3);
        pizzeria.agregarPizzas(pizza4);

        pizzeria.mostrarPizza();

    }
}
