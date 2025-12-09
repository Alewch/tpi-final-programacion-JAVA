package Modelo;

import Modelo.CursadaConEstados.Cursada;
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
    public void agregarAlumno(Alumno nuevoAlumno){
    listaAlumnos.put(nuevoAlumno.getLegajo(),nuevoAlumno);
    }

    public void inscribirAMateriaAlumno(Alumno alumno, Materia materiaAInscribirse) throws Exception{
        plan.evaluarCondicionAlumno(alumno, materiaAInscribirse);
    }

    public boolean verificarAlumnoEnLista(int legajo){ //AGREGAR DIAGRAMA, ESTA VERIFICACION SE HACE UNA SOLA VEZ, LUEGO DEPENDIENDO DEL RESULTADO
        if(listaAlumnos.containsKey(legajo)) {      //SE VAN A PODER INSCRIBIR A LA MATERIAS QUE QUIERA O NO(si es que no esta inscripto a la carrera).
            return true;
        }
        else {
            return false;

        }
    }

    public void mostrarMaterias(){

    }
    public boolean verificarFinCarrera(Alumno alumno){
        return true;
    }

    public String getNombre () {
        return nombre;
    }
}

