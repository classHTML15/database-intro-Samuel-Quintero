package es.fplumara.dam1.alumnos.service;

import es.fplumara.dam1.alumnos.model.Curso;
import es.fplumara.dam1.alumnos.repository.CursoRepository;

import java.util.List;

public class CursoServiceImpl implements CursoService {

    private final CursoRepository cursoRepository;

    public CursoServiceImpl(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    @Override
    public void initSchema() {

    }

    @Override
    public Curso crearCurso(String nombre, Boolean activo) {

        return null;
    }

    @Override
    public Curso activarCurso(Integer id) {
        return null;
    }

    @Override
    public Curso eliminarSiNombreContiene(String nombre) {
        return null;
    }

    @Override
    public List<Curso> listarPorEstado(Boolean activo) {
        return List.of();
    }

    @Override
    public List<Curso> listarOrdenadoPor(String campo, String tipoOrden) {
        return List.of();
    }
}
