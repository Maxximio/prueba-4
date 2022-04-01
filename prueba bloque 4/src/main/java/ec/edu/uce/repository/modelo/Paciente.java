package ec.edu.uce.repository.modelo;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="paciente")
public class Paciente {

	@Id
	@Column(name="paci_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_paci")
	@SequenceGenerator(name="seq_paci",sequenceName = "seq_paci",allocationSize = 1)
	private Integer id;
		
	@Column(name="paci_nombre")
	private String nombre;
	
	@Column(name="paci_apellido")
	private String apellido;
	
	@Column(name="paci_cedula")
	private String cedula;
	
	@Column(name="paci_fechaN")
	private LocalDateTime fechaN;
	
	@Column(name="paci_iess")
	private String iess;
	
	@Column(name="paci_estatura")
	private Integer estatura;
	
	@Column(name="paci_peso")
	private Integer peso;
	
	@Column(name="paci_edad")
	private Integer edad;
	
	@OneToMany(mappedBy = "paciente",cascade=CascadeType.ALL)
	private List<CitaMedica> cita_medica;

	//constructores
	public Paciente() {
		
	}
		
	
	public Paciente(Integer id, String nombre, String apellido, String cedula, LocalDateTime fechaN, String iess,
			Integer estatura, Integer peso, Integer edad, List<CitaMedica> cita_medica) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.fechaN = fechaN;
		this.iess = iess;
		this.estatura = estatura;
		this.peso = peso;
		this.edad = edad;
		this.cita_medica = cita_medica;
	}

	//set y get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public LocalDateTime getFechaN() {
		return fechaN;
	}

	public void setFechaN(LocalDateTime fechaN) {
		this.fechaN = fechaN;
	}

	public String getIess() {
		return iess;
	}

	public void setIess(String iess) {
		this.iess = iess;
	}

	public Integer getEstatura() {
		return estatura;
	}

	public void setEstatura(Integer estatura) {
		this.estatura = estatura;
	}

	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public List<CitaMedica> getCita_medica() {
		return cita_medica;
	}

	public void setCita_medica(List<CitaMedica> cita_medica) {
		this.cita_medica = cita_medica;
	}

	
}
