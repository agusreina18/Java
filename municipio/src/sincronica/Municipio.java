package sincronica;

import java.util.ArrayList;
import java.util.List;

public class Municipio {
    private List<Propiedad> propiedades = new ArrayList<>();

    public Municipio() {
        propiedades= new ArrayList<>();
    }

    public void agregarPropiedades(Propiedad nombre){
        propiedades.add(nombre);
    }

    public void mostrarPropiedad(){
        for (Propiedad propiedade : propiedades) {
            System.out.println(propiedade.toString());
        }
    }
}
