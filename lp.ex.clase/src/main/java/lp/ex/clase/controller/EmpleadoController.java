package lp.ex.clase.controller;

import lp.ex.clase.model.Empleado;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmpleadoController {

    private List<Empleado> listaEmpleados = new ArrayList<>();

    @GetMapping("/empleados")
    public String mostrarEmpleados(Model model) {
        model.addAttribute("empleados", listaEmpleados);
        return "listaEmpleados";
    }

    @GetMapping("/registro")
    public String mostrarFormularioRegistro(Model model) {
        model.addAttribute("empleado", new Empleado());
        return "formularioRegistro";
    }

    @PostMapping("/registrar")
    public String registrarEmpleado(@ModelAttribute Empleado empleado, RedirectAttributes redirectAttributes) {
        // Valida y guarda el empleado en la base de datos o lista en memoria
        listaEmpleados.add(empleado);

        // Redirige a la página de lista de empleados con un mensaje de éxito
        redirectAttributes.addFlashAttribute("mensaje", "Empleado registrado con éxito");

        return "redirect:/empleados";
    }
}
