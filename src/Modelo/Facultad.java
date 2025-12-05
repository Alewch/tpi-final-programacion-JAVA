package Modelo;

import java.util.HashMap;

public class Facultad {
    private HashMap<String, Carrera> carreras;
    private HashMap<Integer, Alumno> alumnos;

    public void agregarCarrera(Carrera carrera){
        carreras.put(carrera.getNombre(), carrera);
    }
    public void agregarAlumno(Alumno alumno){
        alumnos.put(alumno.getLegajo(),alumno);
    }

}
