package vehiculos;

public class Vehiculo {
    private String placa;
    private int puertas;
    private int velocidadMaxima;
    private String nombre;
    private int precio;
    private int peso;
    private String traccion;
    private Fabricante fabricante;
    public static int cantidadVehiculos;

    public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante){
        this.placa = placa;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.traccion = traccion;
        this.fabricante = fabricante;
        this.fabricante.getPais().venta ++;
        this.fabricante.venta ++;
        cantidadVehiculos ++;
    }

    public Vehiculo() {
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }
    public void setPrecio(int precio){
        this.precio = precio;
    }
    public void setPeso(int peso){
        this.peso = peso;
    }
    public void setFabricante(Fabricante fabricante){
        this.fabricante = fabricante;
    }
    public void setPuertas(int puertas){
        this.puertas = puertas;
    }
    public void setVelocidadMaxima(int velocidadMaxima){
        this.velocidadMaxima = velocidadMaxima;
    }
    public void setTraccion(String traccion){
        this.traccion = traccion;
    }
    public static void setCantidadVehiculos(int cantidadVehiculos1) {
        cantidadVehiculos = cantidadVehiculos1;
    }

    public String getNombre(){
        return nombre;
    }
    public String getPlaca(){
        return placa;
    }
    public int getPrecio(){
        return precio;
    }
    public int getPeso(){
        return peso;
    }
    public int getPuertas(){
        return puertas;
    }
    public int getVelocidadMaxima(){
        return velocidadMaxima;
    }
    public String getTraccion(){
        return traccion;
    }
    public static int getCantidadVehiculos(){
        return cantidadVehiculos;
    }

    public String vehiculosPorTipo(){
        return "Automoviles: " + Automovil.automoviles+ "\n"+
                "Camionetas: " + Camioneta.camionetas + "\n" +
                "Camiones: " + Camion.camiones;
    }
}
