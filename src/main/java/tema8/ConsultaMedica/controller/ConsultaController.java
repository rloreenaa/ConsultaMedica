package tema8.ConsultaMedica.controller;

import tema8.ConsultaMedica.model.Medico;
import tema8.ConsultaMedica.model.Paciente;
import tema8.ConsultaMedica.repository.MedicoRepository;
import tema8.ConsultaMedica.repository.PacienteRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ConsultaController {

    private final MedicoRepository medicoRepo;
    private final PacienteRepository pacienteRepo;

    public ConsultaController(MedicoRepository medicoRepo, PacienteRepository pacienteRepo) {
        this.medicoRepo = medicoRepo;
        this.pacienteRepo = pacienteRepo;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/medicos")
    public String listarMedicos(Model model) {
        model.addAttribute("medicos", medicoRepo.findAll());
        return "medicos-lista";
    }

    @GetMapping("/medicos/nuevo")
    public String formMedico(Model model) {
        model.addAttribute("medico", new Medico());
        return "medicos-form";
    }

    @PostMapping("/medicos/guardar")
    public String guardarMedico(@ModelAttribute Medico medico) {
        medicoRepo.save(medico);
        return "redirect:/medicos";
    }

    @GetMapping("/pacientes")
    public String listarPacientes(Model model) {
        model.addAttribute("pacientes", pacienteRepo.findAll());
        return "pacientes-lista";
    }

    @GetMapping("/pacientes/nuevo")
    public String formPaciente(Model model) {
        model.addAttribute("paciente", new Paciente());
        return "pacientes-form";
    }

    @PostMapping("/pacientes/guardar")
    public String guardarPaciente(@ModelAttribute Paciente paciente) {
        pacienteRepo.save(paciente);
        return "redirect:/pacientes";
    }
}