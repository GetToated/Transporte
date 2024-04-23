package Lucas;

public class EmpleadoLogistica {
    protected static double costoCombustible;
    private String nombre;
    private int edad;
    private int nivelExperiencia;
    public EmpleadoLogistica(String nombre, int edad, int nivelExperiencia) {
        this.nombre = nombre;
        this.edad = edad;
        this.nivelExperiencia = nivelExperiencia;
    }
    public static void actualizarCombustible(double nuevoCoste) {
        costoCombustible = nuevoCoste;
    }

    public int calcularSalario() {
        return 0;
    }
}
