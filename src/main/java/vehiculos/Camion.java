package vehiculos;

public class Camion extends Vehiculo{
    int ejes;
    static int camiones;

    public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes){
        setNombre(nombre);
        setPlaca(placa);
        setPrecio(precio);
        setPeso(peso);
        setFabricante(fabricante);
        setPuertas(2);
        setVelocidadMaxima(80);
        setTraccion("4X2");
        this.ejes = ejes;
        camiones++;
    }

    public void setEjes(int ejes){
        this.ejes = ejes;
    }
}
