package HerenciaPolimorfismo;

public class SmartWatch extends SmartDevice {
    String marca;
    boolean pulsosMinuto;
    boolean pasosMetro;
    boolean medidorDeTiempo;

    public SmartWatch(String modelo, int id, boolean bluetooth, boolean tactilPantalla, String OSsystem
            ,String marca, boolean pulsosMinuto, boolean pasosMetro, boolean medidorDeTiempo){

        super(modelo, id, bluetooth, tactilPantalla, OSsystem);
        this.marca = marca;
        this.pulsosMinuto = pulsosMinuto;
        this.pasosMetro = pasosMetro;
        this.medidorDeTiempo = medidorDeTiempo;
    }


    @Override
    public String toString() {
        return "SmartWatch{" +
                "marca='" + marca + '\'' +
                ", pulsosMinuto=" + pulsosMinuto +
                ", pasosMetro=" + pasosMetro +
                ", medidorDeTiempo=" + medidorDeTiempo +
                ", modelo='" + modelo + '\'' +
                ", id=" + id +
                ", bluetooth=" + bluetooth +
                ", tactilPantalla=" + tactilPantalla +
                ", OSsystem='" + OSsystem + '\'' +
                '}';
    }
}
