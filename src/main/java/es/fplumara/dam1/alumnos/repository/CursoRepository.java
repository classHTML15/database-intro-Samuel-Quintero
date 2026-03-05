package es.fplumara.dam1.alumnos.repository;

import es.fplumara.dam1.alumnos.model.Curso;

import java.util.List;

public interface CursoRepository {

    void initSchema();

    Curso crearCurso(String nombre, Boolean activo);

    Curso activarCurso(Integer id);

    Curso eliminarSiNombreContiene(String nombre);

    List<Curso> listarPorEstado(Boolean activo);

    List<Curso> listarOrdenadoPor(String campo, String tipoOrden);

}
