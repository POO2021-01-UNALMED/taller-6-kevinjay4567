package vehiculos;
import java.util.ArrayList;

public class Pais {
    private String nombre;
    static ArrayList<Pais> paises = new ArrayList<>();
    public int venta;

    public Pais(String nombre){
        this.nombre = nombre;
        paises.add(this);
    }
    public Pais(){

    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public static Pais paisMasVendedor(){
        int mayor = 0;
        for(Pais pais : paises){
            if (pais.venta > mayor){
                mayor = pais.venta;
            }
        }
        Pais paisR = new Pais();
        for(Pais pais : paises){
            if(pais.venta == mayor){
                paisR = pais;
            }
        }
        return paisR;
    }
}
