package Models;

public class Repartidor {
    private static final int sueldoPorHora=3;
    private Integer horasTrabajadas;
    private String nombre;

    public Repartidor(Integer horasTrabajadas, String nombre) {
        this.horasTrabajadas = horasTrabajadas;
        this.nombre = nombre;
    }

    public double calcularSueldoRepartidor(){
        double aPagar=(double)this.horasTrabajadas*this.sueldoPorHora;
        return aPagar;
    }

    @Override
    public String toString() {
        return "Repartidor{" +
                "horasTrabajadas=" + horasTrabajadas +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null){
            return false;
        } else if (this==obj) {
            return true;
        }else{
            Repartidor repartidor=(Repartidor) obj;
            return this.nombre.equals(((Repartidor) obj).nombre);
        }
    }
}
