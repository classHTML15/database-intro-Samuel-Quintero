package es.fplumara.dam1.alumnos.service;

import es.fplumara.dam1.alumnos.model.Curso;
import es.fplumara.dam1.alumnos.repository.CursoRepository;

import java.util.List;
import java.util.Optional;

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

        boolean estadoActivo;
        if (activo != null) {
            estadoActivo = activo;
        } else {
            estadoActivo = true;
        }

        Curso nuevoCurso = new Curso(null, estadoActivo, nombre);

        return cursoRepository.insert(nuevoCurso);
    }

    @Override
    public Curso activarCurso(Integer id) {
        Optional<Curso> curso = cursoRepository.findById(id);
        if (curso.isPresent()) {
            Curso cursoActivado = curso.get();
            cursoActivado.setActivo(true);
            return cursoRepository.update(cursoActivado);
        }
        return null;
    }

    @Override
    public Curso eliminarSiNombreContiene(String nombre) {
        if ()
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
