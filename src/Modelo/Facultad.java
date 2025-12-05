package Modelo;

import java.util.HashMap;

public class Facultad {
    private Facultad instance;
    private HashMap<String, Carrera> carreras;
    private HashMap<Integer, Alumno> alumnos;

    private Facultad () {
        carreras=new HashMap<>();
        alumnos=new HashMap<>();
        instance=this;
    }

    public void agregarCarrera(Carrera carrera) {
        carreras.put(carrera.getNombre(), carrera);
    }

    public String inscribirAlumno(Alumno nuevoAlumno, String nombreCarrera){
        if (alumnos.containsKey(nuevoAlumno.getLegajo())){
            return "El alumno ya esta inscripto en la facultad e inscripto en la carrera:"+nuevoAlumno.getCarrera().getNombre();
        }else {
            alumnos.put(nuevoAlumno.getLegajo(), nuevoAlumno);
            inscribirACarrera(nuevoAlumno,nombreCarrera);
            return "¡Inscripcion realizada con exito!";
        }
    }
    private void inscribirACarrera(Alumno nuevoAlumno,String nombreCarrera){
        Carrera carreraDeInscripcion=carreras.get(nombreCarrera);
        carreraDeInscripcion.agregarAlumno(nuevoAlumno);
    }


}
