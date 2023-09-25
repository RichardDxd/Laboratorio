package lp.ex.clase.repository;

import lp.ex.clase.model.Empleado;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface EmpleadoRepository {

    Empleado guardar(Empleado empleado);

    Empleado obtenerPorId(String id);

    List<Empleado> obtenerTodos();

    void eliminar(String id);
}
