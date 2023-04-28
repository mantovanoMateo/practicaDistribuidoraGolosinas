package Models;

import java.util.Date;

public class Administrador extends Empleado{
        private String area;

        //region Constructores
    public Administrador(String area) {
        this.area = area;
    }

    public Administrador(int legajo, String nombre, String apellido, String direccion, Date fechaDeNacimiento, String area) {
        super(legajo, nombre, apellido, direccion, fechaDeNacimiento);
        this.area = area;
        this.setSueldo(15.0);
    }

    //endregion

        //region Getters y Setters
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    //endregion



    @Override
    public String toString() {
        return "Administrador{" +
                "area='" + area + '\'' +
                "} " + super.toString();
    }
}
