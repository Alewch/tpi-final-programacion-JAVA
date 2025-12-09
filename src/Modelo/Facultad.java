package Modelo;

import java.util.HashMap;

public class  Facultad {
    private static Facultad instance;
    private HashMap<String, Carrera> carreras;
    private HashMap<Integer, Alumno> alumnos;

    private Facultad () {
        carreras=new HashMap<>();
        alumnos=new HashMap<>();
    }

    public void agregarCarrera(Carrera carrera) {
        carreras.put(carrera.getNombre(), carrera);
    }

    public Alumno buscarAlumno(int legajo) {
        if (alumnos.containsKey(legajo)){
            return alumnos.get(legajo);
        }
        return null;
    }

    public String inscribirAlumnoFacuYCarre(Alumno nuevoAlumno, String nombreCarrera) throws Exception{//inscribe alumnos a la facultad y obligatoriamente a una carrera
        if (alumnos.containsKey(nuevoAlumno.getLegajo())){//verificacion por si ya esta inscripto
            return "El alumno ya esta inscripto en la facultad e inscripto en la carrera:"+nuevoAlumno.getCarrera().getNombre();
        }else {//no esta inscripto entonces lo inscribimos
            inscribirACarrera(nuevoAlumno,nombreCarrera);
            alumnos.put(nuevoAlumno.getLegajo(), nuevoAlumno);
            return "¡Inscripcion realizada con exito!";
        }
    }
    private void inscribirACarrera(Alumno nuevoAlumno,String nombreCarrera) throws Exception{
       nombreCarrera=nombreCarrera.trim().toLowerCase();
        if (carreras.containsKey(nombreCarrera)) {//agregamos un alumno a la carrera y a alumno le seteamos su carrera
            Carrera carreraDeInscripcion = carreras.get(nombreCarrera);
            carreraDeInscripcion.agregarAlumno(nuevoAlumno);
            nuevoAlumno.setCarrera(carreraDeInscripcion);
        }
        else throw new Exception(nombreCarrera+" Nombre de carrera mal escrito o no existe");
    }

    public static Facultad getInstance () {
        if (instance == null)
            instance = new Facultad();
        return instance;
    }

}
