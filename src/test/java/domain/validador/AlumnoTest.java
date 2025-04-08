package domain.validador;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlumnoTest {

    @Test
    @DisplayName("Marcos puede cursar sistemas operativos")
    public void puedeCursarOperativos(){
        Materia operativos = new Materia("Operativos");
        Materia algoritmos = new Materia("Algoritmos");
        operativos.getCorrelativas().add(algoritmos);
        Alumno alumno = new Alumno("marcos");
        alumno.setLegajo(112034);
        alumno.setNombre("Marcos");
        alumno.getAprobadas().add(algoritmos);
        alumno.getSeleccionadas().add(operativos);

        Assertions.assertTrue(alumno.sePuedeCursar(operativos));


    }
    @Test
    @DisplayName("Marcos no puede cursar fisica 2 ")
    public void noPuedeCursarFisica2(){
        Materia operativos = new Materia("Operativos");
        Materia algoritmos = new Materia("Algoritmos");
        Materia fisica = new Materia("Fisica 2");
        Materia analisis = new Materia("Analisis");
        operativos.getCorrelativas().add(algoritmos);
        fisica.getCorrelativas().add(analisis);
        Alumno alumno = new Alumno("marcos");
        alumno.setLegajo(112034);
        alumno.setNombre("Marcos");
        alumno.getAprobadas().add(algoritmos);
        alumno.getSeleccionadas().add(fisica);

        Assertions.assertFalse(alumno.sePuedeCursar(fisica));


    }
@Test
    @DisplayName("Se puede cursar porque no tiene correlativas")
    public void noTieneCorrelativas(){
        Materia analisis= new Materia("Analisis");
        analisis.getCorrelativas().clear();
        Alumno marcos = new Alumno("marcos");
        marcos.getAprobadas().clear();
        marcos.getSeleccionadas().add(analisis);

        Assertions.assertTrue(marcos.sePuedeCursar(analisis));
}
}