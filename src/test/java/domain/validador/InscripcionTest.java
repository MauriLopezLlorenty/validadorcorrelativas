package domain.validador;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {
    @Test
    @DisplayName("La inscripcion se rechaza por fisica")
    public void sePuedeRechazaPorFisica() {
        Inscripcion inscripcion = new Inscripcion();
        Alumno marcos = new Alumno("Marcos");
        inscripcion.setAlumno(marcos);
        marcos.setLegajo(112034);
        Materia operativos = new Materia("Operativos");
        Materia algoritmos = new Materia("Algoritmos");
        Materia fisica = new Materia("Fisica 2");
        Materia analisis = new Materia("Analisis");
        Materia algebra= new Materia("Algebra");
        operativos.getCorrelativas().add(algoritmos);
        fisica.getCorrelativas().add(analisis);
        fisica.getCorrelativas().add(algebra);

        marcos.getAprobadas().add(algoritmos);
        marcos.getAprobadas().add(analisis);
       marcos.getSeleccionadas().add(fisica);
       marcos.getSeleccionadas().add(operativos);

        Assertions.assertFalse(inscripcion.aprobada());



    }

}