package Modelo;

import Modelo.CursadaConEstados.Cursada;

import java.util.HashMap;

public class Alumno {
    private Carrera carrera;
    private int legajo;
    private int dni;
    private String nombreCompleto;
    private HashMap<Integer,Cursada> cursadas;
    private HashMap<Integer,Materia> materiasDisponibles;

    public Alumno (String nombreCompleto, int legajo, int dni, Carrera carrera) {
        this.nombreCompleto = nombreCompleto;
        this.legajo = legajo;
        this.dni = dni;
        this.carrera = carrera;
    }

    public int getLegajo () {
        return legajo;
    }

    public Carrera getCarrera () {
        return carrera;
    }
}
