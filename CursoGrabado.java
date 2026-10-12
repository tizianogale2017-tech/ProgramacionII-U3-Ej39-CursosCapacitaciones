package Ejercicio39_cursosCapacitaciones;

import java.time.LocalDate;

public class CursoGrabado extends Curso {
    private String plataforma;
    private LocalDate fechaLimiteAcceso;

    public CursoGrabado(String nombreCurso, int horasTotales, double precioBase, String plataforma, LocalDate fechaLimiteAcceso) {
        super(nombreCurso, horasTotales, precioBase);
        this.plataforma = plataforma;
        this.fechaLimiteAcceso = fechaLimiteAcceso;
    }

    @Override
    public double calcularCostoFinal() {
        return getPrecioBase() * 0.80;
    }

    @Override
    public boolean inscribirAlumno(String alumno) {
        if (LocalDate.now().isAfter(fechaLimiteAcceso)) {
            System.out.println("  " + alumno + ": el acceso a " + getNombreCurso() + " venció el " + fechaLimiteAcceso + ".");
            return false;
        }
        return super.inscribirAlumno(alumno);
    }
}
