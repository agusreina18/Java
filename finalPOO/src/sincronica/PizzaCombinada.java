package sincronica;

import java.util.ArrayList;
import java.util.List;

public class PizzaCombinada extends Pizza{

    private List<Pizza> combinaciones = new ArrayList<>();


    public List<Pizza> getCombinaciones() {
        return combinaciones;
    }

    public void setCombinaciones(List<Pizza> combinaciones) {
        this.combinaciones = combinaciones;
    }

    public void agregarVariedad(Pizza variedad){
        combinaciones.add(variedad);
    }

    @Override
    public Double calcularPrecio() {
        Double precioTotal= 0.0;
        for (Pizza combinacione : combinaciones) {
            precioTotal += combinacione.calcularPrecio();
        }
        return precioTotal= precioTotal/combinaciones.size();
    }

    @Override
    public String toString() {
        return "Pizza" + getNombre()+ " que es mitad " + getCombinaciones().get(0)+ " y mitad "+ getCombinaciones().get(1)+ " y cuesta "+ calcularPrecio();
    }
}
