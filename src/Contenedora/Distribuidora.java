package Contenedora;

import Models.Empleado;
import Models.Repartidor;

import java.util.ArrayList;

public class Distribuidora {
    private ArrayList<Empleado> empleados;
    private ArrayList<Repartidor> repartidores;

    public Distribuidora(){
        empleados=new ArrayList<>();
        repartidores=new ArrayList<>();
    }

    public Boolean agregarEmpleado(Empleado empleado){
        Boolean agregado=false;
        if(buscarPorLegajo(empleado.getLegajo())==null){
            agregado=true;
            empleados.add(empleado);
        }

        return agregado;
    }

    public Boolean agregarRepartidor(Repartidor repartidor){
        Boolean agregado=false;
        if(buscarRepartidor(repartidor)==false){
            repartidores.add(repartidor);
            agregado=true;
        }
        return agregado;
    }

    public Boolean buscarRepartidor(Repartidor repartidor){
        Boolean encontrado=false;
        int i=0;
        while(encontrado==false && i<repartidores.size()){
            if(repartidor.equals(repartidores.get(i))){
                encontrado=true;
            }else{
                i++;
            }
        }
        return encontrado;
    }

    public Empleado buscarPorLegajo(int legajo){

        Empleado encontrado=null;
        int i=0;
        while(i<empleados.size() && encontrado==null){
            if(empleados.get(i).getLegajo() == legajo){
                encontrado=empleados.get(i);
            }else{
                i++;
            }
        }
        return encontrado;
    }

    public Integer contarEmpleados(){
        int i=0;
        for(Empleado empleado: empleados){
            i++;
        }
        return i;
    }

    public String devolverListado(){
        String listado="Aun no hay empleados cargados en sistema o no hay empleados en la empresa";
        if(!empleados.isEmpty()){
            listado="";
            for (Empleado empleado: empleados){
                listado+=empleado.toString()+"\n";
            }
        }

        return listado;
    }

    public String devuelveListadoRepartidores(){
        String listado="Aun no hay repartidores cargados en sistema o no hay repartidores en la empresa";
        if(!repartidores.isEmpty()){
            listado="";
            for (Repartidor repartidor: repartidores){
                listado+=repartidor.toString()+"\n";
            }
        }

        return listado;
    }


    public Boolean eliminarPorLegajo(int legajo){
        Boolean eliminado=false;
        Empleado buscado=null;
        buscado=buscarPorLegajo(legajo);
        if(buscado!=null){
            empleados.remove(buscado);
            eliminado=true;
        }
        return eliminado;
    }

    public Double getSueldoTotal(){
        Double totalAPagar=0.0;
        for(Empleado empleado: empleados){
            totalAPagar+=empleado.getSueldo();
        }
        for (Repartidor repartidor: repartidores){
            totalAPagar+=repartidor.calcularSueldoRepartidor();
        }
        return totalAPagar;
    }
}
