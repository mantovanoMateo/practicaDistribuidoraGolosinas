import Contenedora.Distribuidora;
import Models.Administrador;
import Models.Repartidor;
import Models.Vendedor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Administrador a1=new Administrador(1,"Mateo","Mantovano","La scaloneta 2022",null,"RRHH");
        Vendedor v1=new Vendedor(2,"Agustin","Carnessali","calle falsa 123",null,900.0);
        Distribuidora d1=new Distribuidora();
        Boolean agregado=false;

        agregado=d1.agregarEmpleado(a1);
        if(agregado!=false){
            System.out.println("Agregado exitosamente...");
        }else{
            System.out.println("Ups... algo malo ocurrio");
        }
        agregado=d1.agregarEmpleado(v1);
        if(agregado!=false){
            System.out.println("Agregado exitosamente...");
        }else{
            System.out.println("Ups... algo malo ocurrio");
        }
        agregado=d1.agregarEmpleado(v1);
        if(agregado!=false){
            System.out.println("Agregado exitosamente...");
        }else{
            System.out.println("Ups... algo malo ocurrio (este fue el test cargando uno repetido)");
        }

        if(d1.buscarPorLegajo(2)!=null){
            System.out.println("Existe el empleado del legajo solicitado");
        }

        if(d1.buscarPorLegajo(3)!=null){
            System.out.println("esto anda mal por que ese no existe");
        }else{
            System.out.println("Este empleado no existe por lo tanto no se encuentra en el array");
        }

        int cantidadDeEmpleados= d1.contarEmpleados();
        System.out.println("Cantidad de empleados en la distribuidora: "+ cantidadDeEmpleados);
        System.out.println("\nListado de empleados:");
        System.out.println(d1.devolverListado());
        System.out.println("Eliminiaremos al empleado 2");

        if(d1.eliminarPorLegajo(2)==true){
            System.out.println("Eliminado exitosamente");
        }else{
            System.out.println("Esto anda mal");
        }

        System.out.println("Probamos eliminar un empleado inexistente");
        if(d1.eliminarPorLegajo(19)==false){
            System.out.println("Esto anda bien, el empleado 19 no existe");
        }else{
            System.out.println("Esto anda mal, este empleado no existe y supuestamente se elimino igual F");
        }

        System.out.println("Lista de empleados luego de la eliminacion");
        System.out.println(d1.devolverListado());

        System.out.println("Volvemos a agregar al empleado 2 tan solo por despues calcular el sueldo total ");
        d1.agregarEmpleado(v1);

        System.out.println("Cargamos dos o tres repartidores");
        Repartidor r1=new Repartidor(23,"Lautaro");
        Repartidor r2=new Repartidor(19,"David");
        Repartidor r3=new Repartidor(33,"Franco");

        d1.agregarRepartidor(r1);
        d1.agregarRepartidor(r2);
        d1.agregarRepartidor(r3);

        System.out.println("mostramos los repartidores");
        System.out.println(d1.devuelveListadoRepartidores());
        System.out.println("Ahora calculamos el total a pagar:");
        System.out.println("El total de gastos con respecto a sueldos la empresa debera pagar un total de: $"+d1.getSueldoTotal());


    }
}