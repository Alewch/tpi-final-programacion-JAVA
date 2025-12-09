package Modelo;

import Modelo.CursadaConEstados.Cursada;

import java.util.LinkedList;

public class Materia {
    private String tipo;
    private String nombre;
    private int codigoMateria;
    private int cuatrimestre;
    private LinkedList<Materia> correlativas;
    private Cursada cursada;

    public int getCodigoMateria () {
        return codigoMateria;
    }

    public String getNombre () {
        return nombre;
    }

    public String getTipo () {
        return tipo;
    }
    public void inscribirCursada(Alumno alumno){
        Cursada cursada=new Cursada(this, alumno);
    }
}
