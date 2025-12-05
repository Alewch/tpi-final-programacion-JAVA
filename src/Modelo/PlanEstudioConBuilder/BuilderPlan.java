package Modelo.PlanEstudioConBuilder;

import Modelo.CondicionesIns.CondicionInscripcion;
import Modelo.Materia;

import java.util.HashMap;

public class BuilderPlan {
    private CondicionInscripcion condicion;
    private int cantMatObligatorias;
    private int cantMatOptativas;
    private int optativasMinimasAprobadas;
    private HashMap<Integer, Materia> materiasObligatorias;
    private HashMap<Integer, Materia> materiasOptativas;


}
