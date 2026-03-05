package es.fplumara.dam1.alumnos.service;

import es.fplumara.dam1.alumnos.model.Curso;

import java.util.List;

public class CursoServiceImpl {

    public Curso crearCurso(String nombre, boolean b) {
        Curso nuevoCurso = new Curso();
        return crearCurso(nombre, true);
    }

    public Boolean activar(Boolean b) {
        return activar(b);
    }

    public String eliminarSiNombreContiene(String nombre) {

        ;
    }

    public List<Curso> listarPorEstado(Boolean activo) {
        return null;
    }

}
