package Ejercicio39_cursosCapacitaciones;

public class MentoriaEnVivo extends Curso {
    private String enlaceVideollamada;
    private int cupoMaximo;

    public MentoriaEnVivo(String nombreCurso, int horasTotales, double precioBase, String enlaceVideollamada, int cupoMaximo) {
        super(nombreCurso, horasTotales, precioBase);
        this.enlaceVideollamada = enlaceVideollamada;
        this.cupoMaximo = cupoMaximo;
    }

    @Override
    public boolean inscribirAlumno(String alumno) {
        if (inscriptos >= cupoMaximo) {
            System.out.println("  " + alumno + ": cupo completo en " + getNombreCurso() + " (" + cupoMaximo + " lugares).");
            return false;
        }
        return super.inscribirAlumno(alumno);
    }
}
