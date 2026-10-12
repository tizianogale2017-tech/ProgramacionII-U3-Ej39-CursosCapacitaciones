package Ejercicio39_cursosCapacitaciones;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        CursoGrabado grabado = new CursoGrabado("Java desde cero", 40, 50000.0, "Campus Virtual", LocalDate.of(2099, 12, 31));
        CursoGrabado vencido = new CursoGrabado("Curso antiguo", 10, 20000.0, "Campus Virtual", LocalDate.of(2020, 1, 1));
        MentoriaEnVivo mentoria = new MentoriaEnVivo("Mentoría de carrera IT", 6, 30000.0, "https://meet.ejemplo.com/ment", 2);
        TallerPresencial taller = new TallerPresencial("Taller de robótica", 12, 45000.0, "Aula 3", "Belgrano 721", 1);

        System.out.println("Inscripciones:");
        grabado.inscribirAlumno("Ana");
        vencido.inscribirAlumno("Beto");
        mentoria.inscribirAlumno("Carla");
        mentoria.inscribirAlumno("Dani");
        mentoria.inscribirAlumno("Eli");
        taller.inscribirAlumno("Fede");
        taller.inscribirAlumno("Gabi");

        System.out.println("\nOferta académica:");
        Curso[] oferta = {grabado, mentoria, taller};
        for (Curso c : oferta) {
            c.mostrarEstado();
        }
    }
}
