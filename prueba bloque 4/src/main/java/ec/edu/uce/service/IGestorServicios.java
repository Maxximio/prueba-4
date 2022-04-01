package ec.edu.uce.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface IGestorServicios {

	public void agendamientoCitaMedica__2__(String numeroCita, LocalDateTime fechaCita, 
			BigDecimal valorCita, String lugar, String cedulaDoct, String CedulaPac);
	
	
	public void actualizacionCita__3__(String numeroCita, String diagnostico, String Receta, LocalDateTime fechaContr);
	
}
//datetime-local