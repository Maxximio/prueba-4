package ec.edu.uce.repository.modelo;

import java.math.BigDecimal;
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
@Table(name="doctor")
public class Doctor {

	@Id
	@Column(name="doc_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_doc")
	@SequenceGenerator(name="seq_doc",sequenceName = "seq_doc",allocationSize = 1)
	private Integer id;
		
	@Column(name="doc_nombre")
	private String nombre;
	
	@Column(name="doc_apellido")
	private String apellido;
	
	@Column(name="doc_cedula")
	private String cedula;
	
	@Column(name="doc_fechaN")
	private LocalDateTime fechaN;
	
	@Column(name="doc_numero_consultorio")
	private Integer numC;
	
	@Column(name="doc_senecyt")
	private String senecyt;
	
	@Column(name="doc_sueldo")
	private BigDecimal sueldo;
	
	@OneToMany(mappedBy = "doctor",cascade=CascadeType.ALL)
	private List<CitaMedica> cita_medica;

	//constructores
	public Doctor() {
		
	}
	
	
	public Doctor(Integer id, String nombre, String apellido, String cedula, LocalDateTime fechaN, Integer numC,
			String senecyt, BigDecimal sueldo, List<CitaMedica> cita_medica) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.fechaN = fechaN;
		this.numC = numC;
		this.senecyt = senecyt;
		this.sueldo = sueldo;
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

	public Integer getNumC() {
		return numC;
	}

	public void setNumC(Integer numC) {
		this.numC = numC;
	}

	public String getSenecyt() {
		return senecyt;
	}

	public void setSenecyt(String senecyt) {
		this.senecyt = senecyt;
	}

	public BigDecimal getSueldo() {
		return sueldo;
	}

	public void setSueldo(BigDecimal sueldo) {
		this.sueldo = sueldo;
	}

	public List<CitaMedica> getCita_medica() {
		return cita_medica;
	}

	public void setCita_medica(List<CitaMedica> cita_medica) {
		this.cita_medica = cita_medica;
	}

	
	
}
