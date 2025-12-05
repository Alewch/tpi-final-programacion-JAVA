package Modelo;

import Modelo.PlanEstudioConBuilder.PlanEstudio;

import java.util.HashMap;

public class Carrera {
private String nombre;
private PlanEstudio plan;
private HashMap<Integer,Alumno> listaAlumnos;

    public Carrera (String nombre, PlanEstudio planEstudio) {
        this.nombre = nombre;
        this.plan=planEstudio;
    }
    public void inscribirAlumno(){

    }
    public boolean verificarFinCarrera(Alumno alumno){
    return true;
    }
    public void inscribirAMateria(Alumno alumno){

    }
    public void mostrarMaterias(){

    }

    public String getNombre () {
        return nombre;
    }
}

