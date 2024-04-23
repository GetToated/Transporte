package Lucas;

public class CoordinadorRutas extends EmpleadoLogistica{
    private String areaGeograficaResponsable;
    private int eficienciaTiempoPlanificacion;
    private int puntualidadEntregas;

    public CoordinadorRutas (String nombre, int edad, int nivelExperiencia, String areaGeograficaResponsable, int eficienciaTiempoPlanificacion, int puntualidadEntregas) {
        super(nombre, edad, nivelExperiencia);
        this.areaGeograficaResponsable = areaGeograficaResponsable;
        this.eficienciaTiempoPlanificacion = eficienciaTiempoPlanificacion;
        this.puntualidadEntregas = puntualidadEntregas;
    }

    public int calcularSalario() {
        int salarioBase = 1500;
        int prima = eficienciaTiempoPlanificacion + puntualidadEntregas * 10;
        return salarioBase + prima;
    }

}
