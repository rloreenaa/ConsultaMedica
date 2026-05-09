package tema8.ConsultaMedica;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tema8.ConsultaMedica.model.Medico;
import tema8.ConsultaMedica.model.Paciente;
import tema8.ConsultaMedica.repository.MedicoRepository;
import tema8.ConsultaMedica.repository.PacienteRepository;

import java.time.LocalDate;
import java.util.Arrays;

@Component
public class DataInitializer implements CommandLineRunner {

    private final MedicoRepository medicoRepo;
    private final PacienteRepository pacienteRepo;

    public DataInitializer(MedicoRepository medicoRepo, PacienteRepository pacienteRepo) {
        this.medicoRepo = medicoRepo;
        this.pacienteRepo = pacienteRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        if (medicoRepo.count() == 0) {
            Medico m1 = crearMedico("Carlos", "Sánchez", "Cardiología", "2828123");
            Medico m2 = crearMedico("Lucía", "Gómez", "Pediatría", "2828456");
            Medico m3 = crearMedico("Jorge", "Ruiz", "Dermatología", "2828789");
            Medico m4 = crearMedico("Elena", "Martín", "Traumatología", "2828012");
            Medico m5 = crearMedico("Pablo", "Hernández", "Ginecología", "2828345");
            Medico m6 = crearMedico("Marta", "Jiménez", "Neurología", "2828678");
            Medico m7 = crearMedico("Diego", "Álvarez", "Oftalmología", "2828901");
            Medico m8 = crearMedico("Sofía", "Moreno", "Psiquiatría", "2828234");
            Medico m9 = crearMedico("Andrés", "Castro", "Urología", "2828567");
            Medico m10 = crearMedico("Raquel", "Ortiz", "Digestivo", "2828890");

            medicoRepo.saveAll(Arrays.asList(m1, m2, m3, m4, m5, m6, m7, m8, m9, m10));
        }

        if (pacienteRepo.count() == 0) {
            pacienteRepo.saveAll(Arrays.asList(
                crearPaciente("Juan", "Pérez", LocalDate.of(1985, 5, 20), "SS12345"),
                crearPaciente("María", "Rodríguez", LocalDate.of(1990, 8, 12), "SS67890"),
                crearPaciente("Pedro", "López", LocalDate.of(1978, 3, 5), "SS11223"),
                crearPaciente("Laura", "García", LocalDate.of(2000, 11, 30), "SS44556"),
                crearPaciente("Miguel", "Torres", LocalDate.of(1965, 12, 15), "SS77889"),
                crearPaciente("Isabel", "Vázquez", LocalDate.of(1995, 1, 25), "SS99001"),
                crearPaciente("Alberto", "Ramírez", LocalDate.of(1982, 7, 10), "SS22334"),
                crearPaciente("Carmen", "Serrano", LocalDate.of(1950, 9, 18), "SS55667"),
                crearPaciente("Raúl", "Blanco", LocalDate.of(2010, 6, 22), "SS88990"),
                crearPaciente("Rosa", "Molina", LocalDate.of(1988, 2, 14), "SS33445")
            ));
        }
    }

    private Medico crearMedico(String nom, String ape, String esp, String num) {
        Medico m = new Medico();
        m.setNombre(nom);
        m.setApellidos(ape);
        m.setEspecialidad(esp);
        m.setNumColegiado(num);
        return m;
    }

    private Paciente crearPaciente(String nom, String ape, LocalDate fecha, String ss) {
        Paciente p = new Paciente();
        p.setNombre(nom);
        p.setApellidos(ape);
        p.setFechaNacimiento(fecha);
        p.setNumSeguridadSocial(ss);
        return p;
    }
}