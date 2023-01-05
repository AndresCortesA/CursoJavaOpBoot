package EjercicioTema9;

public class Trabajador extends Persona{

    private int salario;
    public Trabajador(){

    }

    public Trabajador(int salario, int edad, String nombre, int telefono){
        super(edad, nombre, telefono);
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "salario=" + salario +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}
