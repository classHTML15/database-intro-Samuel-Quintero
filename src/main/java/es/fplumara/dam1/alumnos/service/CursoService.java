package es.fplumara.dam1.alumnos.service;

import es.fplumara.dam1.alumnos.model.Curso;

import java.util.List;


public interface CursoService {

    void initSchema();

    Curso crearCurso(String nombre, Boolean activo);

    Curso activarCurso(Integer id);

    Curso eliminarSiNombreContiene(String nombre);

    List<Curso> listarPorEstado(Boolean activo);

    List<Curso> listarOrdenadoPor(String campo, String tipoOrden);
}
