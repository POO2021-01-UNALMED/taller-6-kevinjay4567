package vehiculos;

public class Camioneta extends Vehiculo{
    boolean volco;
    static int camionetas;

    public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco){
        setPlaca(placa);
        setPuertas(puertas);
        setNombre(nombre);
        setPrecio(precio);
        setPeso(peso);
        setFabricante(fabricante);
        this.volco = volco;
        camionetas ++;

    }
}
