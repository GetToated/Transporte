package Lucas;

public class ConductorCamion extends EmpleadoLogistica{
    private String tipoLicencia;
    private int kmRecorridos;
    public ConductorCamion(String nombre, int edad, int nivelExperiencia, String tipoLicencia, int kmRecorridos) {
        super(nombre, edad, nivelExperiencia);
        this.tipoLicencia = tipoLicencia;
        this.kmRecorridos = kmRecorridos;
    }

    public int calcularSalario() {
        int salarioBase = 1300;
        int bono = kmRecorridos / 20 ;
        return salarioBase + bono - (int) (kmRecorridos * costoCombustible);
    }
}
