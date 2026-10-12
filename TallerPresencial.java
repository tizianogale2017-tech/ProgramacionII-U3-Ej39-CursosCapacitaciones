package Ejercicio39_cursosCapacitaciones;

public class TallerPresencial extends Curso {
    private String numeroAula;
    private String direccion;
    private int cupoMaximo;

    public TallerPresencial(String nombreCurso, int horasTotales, double precioBase, String numeroAula, String direccion, int cupoMaximo) {
        super(nombreCurso, horasTotales, precioBase);
        this.numeroAula = numeroAula;
        this.direccion = direccion;
        this.cupoMaximo = cupoMaximo;
    }

    @Override
    public double calcularCostoFinal() {
        return getPrecioBase() * 1.10;
    }

    @Override
    public boolean inscribirAlumno(String alumno) {
        if (inscriptos >= cupoMaximo) {
            System.out.println("  " + alumno + ": taller completo (cupo de " + cupoMaximo + " en el aula " + numeroAula + ").");
            return false;
        }
        return super.inscribirAlumno(alumno);
    }
}
