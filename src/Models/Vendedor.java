package Models;

import java.util.Date;

public class Vendedor extends Empleado{
    private Double montoMensual;

    public Vendedor(Double montoMensual) {
        this.montoMensual = montoMensual;
    }

    public Vendedor(int legajo, String nombre, String apellido, String direccion, Date fechaDeNacimiento, Double montoMensual) {
        super(legajo, nombre, apellido, direccion, fechaDeNacimiento);
        this.montoMensual = montoMensual;
        this.setSueldo((this.montoMensual*0.3));
    }

    public Double getMontoMensual() {
        return montoMensual;
    }

    public void setMontoMensual(Double montoMensual) {
        this.montoMensual = montoMensual;
    }


    @Override
    public String toString() {
        return "Vendedor{" +
                "montoMensual=" + montoMensual +
                "} " + super.toString();
    }
}
