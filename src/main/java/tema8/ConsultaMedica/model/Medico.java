package tema8.ConsultaMedica.model;

import jakarta.persistence.*;

@Entity
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;
    private String apellidos;
    private String especialidad;
    private String numColegiado;
    
	public Medico() {
		super();
	}

	public Medico(Long id, String nombre, String apellidos, String especialidad, String numColegiado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.especialidad = especialidad;
		this.numColegiado = numColegiado;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getNumColegiado() {
		return numColegiado;
	}

	public void setNumColegiado(String numColegiado) {
		this.numColegiado = numColegiado;
	}

	@Override
	public String toString() {
		return "Medico [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", especialidad=" + especialidad
				+ ", numColegiado=" + numColegiado + "]";
	}
	
	
    
    
}