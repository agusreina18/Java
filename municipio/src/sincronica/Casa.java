package sincronica;

public class Casa extends Propiedad{

    private Double montoImpuesto;

    public Double getMontoImpuesto() {
        return montoImpuesto;
    }

    public void setMontoImpuesto(Double montoImpuesto) {
        this.montoImpuesto = montoImpuesto;
    }

    @Override
    public Double calcularImpuesto() {
        if (getCalle().equals("Av. San Martin")) {
            return montoImpuesto + montoImpuesto* 0.1;
        }
        else {
            return montoImpuesto;
        }
    }

    @Override
    public String toString() {
        return "La direccion es: "+ getCalle() + " "+ getNumero() + "y debe pagar: " + getMontoImpuesto();
    }
}
