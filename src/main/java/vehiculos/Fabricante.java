package vehiculos;

import java.util.ArrayList;

public class Fabricante {
    private String nombre;
    private Pais pais;
    static ArrayList<Fabricante> fabricantes = new ArrayList<>();
    int venta;

    public Fabricante(String nombre, Pais pais){
        this.nombre = nombre;
        this.pais = pais;
    }
    public Fabricante(){

    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setPais(Pais pais){
        this.pais = pais;
    }

    public String getNombre(){
        return nombre;
    }
    public Pais getPais(){
        return pais;
    }

    public static Fabricante fabricaMayorVentas(){
        int mayor = 0;
        for(Fabricante fabricante : fabricantes){
            if (fabricante.venta > mayor){
                mayor = fabricante.venta;
            }
        }
        Fabricante paisR = new Fabricante();
        for(Fabricante fabricante : fabricantes){
            if(fabricante.venta == mayor){
                paisR = fabricante;
            }
        }
        return paisR;
    }
}
