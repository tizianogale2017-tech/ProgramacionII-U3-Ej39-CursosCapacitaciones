package Ejercicio39_cursosCapacitaciones;

public class Curso {
    private String nombreCurso;
    private int horasTotales;
    private double precioBase;
    protected int inscriptos = 0;

    public Curso(String nombreCurso, int horasTotales, double precioBase) {
        this.nombreCurso = nombreCurso;
        this.horasTotales = horasTotales;
        this.precioBase = precioBase;
    }

    public double calcularCostoFinal() {
        return precioBase;
    }

    public boolean inscribirAlumno(String alumno) {
        inscriptos++;
        System.out.println("  " + alumno + " inscripto en " + nombreCurso + ".");
        return true;
    }

    public void mostrarEstado() {
        System.out.printf("%s (%d h) - inscriptos: %d - costo: %.2f%n", nombreCurso, horasTotales, inscriptos, calcularCostoFinal());
    }

    protected double getPrecioBase() {
        return precioBase;
    }

    protected String getNombreCurso() {
        return nombreCurso;
    }
}
