package HerenciaPolimorfismo;

public abstract class SmartDevice {

    //atributos
    String modelo;
    int id;
    boolean bluetooth;
    boolean tactilPantalla;
    String OSsystem;


    //Constructor
    public SmartDevice(){}
    public SmartDevice(String modelo, int id, boolean bluetooth, boolean tactilPantalla, String OSsystem) {
        this.modelo = modelo;
        this.id = id;
        this.bluetooth = bluetooth;
        this.tactilPantalla = tactilPantalla;
        this.OSsystem = OSsystem;
    }

}
