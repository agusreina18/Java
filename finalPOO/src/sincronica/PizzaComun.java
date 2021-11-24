package sincronica;

public class PizzaComun extends Pizza {
    private Double precioBase;
    private String tamaño;

    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public Double calcularPrecio() {
        if(tamaño=="grande"){
            return precioBase*2;
        }
        else {
            return precioBase;
        }
    }

    @Override
    public String toString() {
        return "La pizza es " + getNombre() +" "+ getTamaño() + " y cuesta " + calcularPrecio();
    }
}
