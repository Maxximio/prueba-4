package ec.edu.uce.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="cita_medica")
public class CitaMedica {

	@Id
	@Column(name="cita_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cita")
	@SequenceGenerator(name="seq_cita",sequenceName = "seq_cita",allocationSize = 1)
	private Integer id;
	
	@Column(name="cita_numero")
	private String numero;
	
	@Column(name="cita_fecha")
	private LocalDateTime fecha;
	
	@Column(name="cuba_valor")
	private BigDecimal valor;
	
	@Column(name="cuba_lugar")
	private String lugar;
	
	@Column(name="cuba_diagnostico")
	private String diagnostico;
	
	@Column(name="cuba_receta")
	private String receta;
	
	@Column(name="cuba_fecha_control")
	private LocalDateTime fechaControl;
	
	@ManyToOne
	@JoinColumn(name="doc_cedula")
	private Doctor doctor;
	
	@ManyToOne
	@JoinColumn(name="paci_cedula")
	private Paciente paciente;
	
	//constructores
	public CitaMedica() {
		
	}
		
	
	
	public CitaMedica(Integer id, String numero, LocalDateTime fecha, BigDecimal valor, String lugar,
			String diagnostico, String receta, LocalDateTime fechaControl, Doctor doctor, Paciente paciente) {
		super();
		this.id = id;
		this.numero = numero;
		this.fecha = fecha;
		this.valor = valor;
		this.lugar = lugar;
		this.diagnostico = diagnostico;
		this.receta = receta;
		this.fechaControl = fechaControl;
		this.doctor = doctor;
		this.paciente = paciente;
	}

	//set y get

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getReceta() {
		return receta;
	}

	public void setReceta(String receta) {
		this.receta = receta;
	}

	public LocalDateTime getFechaControl() {
		return fechaControl;
	}

	public void setFechaControl(LocalDateTime fechaControl) {
		this.fechaControl = fechaControl;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	
	
	
	
}
