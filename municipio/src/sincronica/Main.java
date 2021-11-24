package sincronica;

public class Main {

    public static void main(String[] args) {
	Municipio municipio = new Municipio();

    Propiedad propiedad1 = PropiedadFactory.getInstance().crearPropiedad("casa");
    Propiedad propiedad2 = PropiedadFactory.getInstance().crearPropiedad("casa");
    Propiedad barrioCerrado = PropiedadFactory.getInstance().crearPropiedad(barrioCerrado);

    propiedad1.setCalle("Av. San Martin");
    propiedad1.setNumero(130);
        ((Casa)propiedad1).setMontoImpuesto(550d);

    propiedad2.setCalle("Mitre");
    propiedad1.setNumero(233);
        ((Casa)propiedad2).setMontoImpuesto(700d);

        barrioCerrado.setNumero(330);
        barrioCerrado.setCalle("Gutierrez");
        ((BarrioCerrado)barrioCerrado).agregarPropiedades(propiedad1);
        ((BarrioCerrado)barrioCerrado).agregarPropiedades(propiedad2);

    municipio.agregarPropiedades(barrioCerrado);
    municipio.agregarPropiedades(propiedad1);
    municipio.agregarPropiedades(propiedad2);


    }
}
