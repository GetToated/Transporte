package Lucas;

public class MainLogistica {
    public static void main (String[] args) {
        EmpleadoLogistica.actualizarCombustible(0.05);
        ConductorCamion camionero1 = new ConductorCamion("Juan", 56, 29, "B y C", 7000);
        System.out.println("Juan tiene un salario de: " + camionero1.calcularSalario() + " al mes");

        CoordinadorRutas coordinador1 = new CoordinadorRutas("Maria", 49, 25, "España", 100, 100 );
        System.out.println("Maria cobra al mes: " + coordinador1.calcularSalario());
    }
}
