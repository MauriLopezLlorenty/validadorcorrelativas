package domain.validador;

import java.util.List;

public class Inscripcion {
    private Alumno alumno;

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public boolean aprobada() {
        return alumno.getSeleccionadas().stream().allMatch(s-> alumno.sePuedeCursar(s));
    }

}
