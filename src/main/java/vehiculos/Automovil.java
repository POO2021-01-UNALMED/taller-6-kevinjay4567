package vehiculos;

public class Automovil extends Vehiculo{
    int puestos;
    static int automoviles = 0;

    public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos){
        setPlaca(placa);
        setNombre(nombre);
        setPrecio(precio);
        setPeso(peso);
        setFabricante(fabricante);
        setPuertas(4);
        setVelocidadMaxima(100);
        setTraccion("FWD");
        this.puestos = puestos;
        automoviles ++;

    }

}
