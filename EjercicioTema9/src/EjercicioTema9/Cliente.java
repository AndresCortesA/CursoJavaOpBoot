package EjercicioTema9;

public class Cliente extends Persona{
    private String credito;

    public Cliente(){
    }

    public Cliente(String credito, int edad, String nombre, int telefono){
        super(edad,nombre,telefono);
        this.credito = credito;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "credito=" + credito +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}
