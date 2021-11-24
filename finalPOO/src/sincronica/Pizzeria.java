package sincronica;

import java.util.ArrayList;
import java.util.List;

public class Pizzeria {
    private List<Pizza> pizzas = new ArrayList<>();

    public Pizzeria() {
        pizzas= new ArrayList<>();
    }

    public void agregarPizzas(Pizza nombre){
        pizzas.add(nombre);
    }

    public void mostrarPizza(){
        for (Pizza pizza : pizzas) {
            System.out.println(pizza.toString());
        }
    }
}
