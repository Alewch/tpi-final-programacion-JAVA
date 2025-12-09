package Modelo.CursadaConEstados;

import Modelo.Alumno;
import Modelo.Materia;

import java.util.LinkedList;

public class Cursada {
    private State estado;
    private Alumno alumnoCursando;
    private Materia materiaEnCurso;

    public Cursada (Materia materiaEnCurso, Alumno alumnoCursando) {
        this.materiaEnCurso = materiaEnCurso;
        this.estado = new StateInscripto();
        this.alumnoCursando = alumnoCursando;
    }
}
