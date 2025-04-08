package domain.validador;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Alumno {
    private String nombre;
    private Integer legajo;
    private List<Materia> aprobadas;
    private List<Materia> seleccionadas;

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.aprobadas = new ArrayList<Materia>();
        this.seleccionadas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }

    public List<Materia> getAprobadas() {
        return aprobadas;
    }

    public List<Materia> getSeleccionadas() {
        return seleccionadas;
    }
    public boolean sePuedeCursar(Materia materia) {
        return  new HashSet<>(this.getAprobadas()).containsAll(materia.getCorrelativas());
    }
}
