package HerenciaPolimorfismo;

public class SmartPhone extends SmartDevice {
    String marcaTelefono;
    boolean camara;
    boolean mensajes;
    double ampBateria;
    String cargador;
    boolean audifonos;

    public SmartPhone(){}
    public SmartPhone(String modelo, int id, boolean bluetooth, boolean tactilPantalla, String OSsystem,
                      String marcaTelefono, boolean camara, boolean mensajes, double ampBateria,
                      String cargador, boolean audifonos) {

        super(modelo, id, bluetooth, tactilPantalla, OSsystem);

        this.marcaTelefono = marcaTelefono;
        this.camara = camara;
        this.mensajes = mensajes;
        this.ampBateria = ampBateria;
        this.cargador = cargador;
        this.audifonos = audifonos;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "marcaTelefono='" + marcaTelefono + '\'' +
                ", camara=" + camara +
                ", mensajes=" + mensajes +
                ", ampBateria=" + ampBateria +
                ", cargador='" + cargador + '\'' +
                ", audifonos=" + audifonos +
                ", modelo='" + modelo + '\'' +
                ", id=" + id +
                ", bluetooth=" + bluetooth +
                ", tactilPantalla=" + tactilPantalla +
                ", OSsystem='" + OSsystem + '\'' +
                '}';
    }
}
