package ec.edu.uce;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.time.Month;

import javax.transaction.Transactional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;

import ec.edu.uce.repository.modelo.Paciente;
import ec.edu.uce.service.IPacienteService;

@SpringBootTest
@Rollback(true)
@Transactional
class PaWebU4ApplicationTest {

	@Autowired
	private IPacienteService iPacienteService;

	@Test
	void insercicionTest1() {
		
		Paciente paci=this.iPacienteService.buscarService(1);
		
		
		assertEquals("Carlos", paci.getNombre());

	}

	@Test
	void insercicionTest2() {
		
		Paciente paci=this.iPacienteService.buscarService(2);
		
		assertEquals("2342342", paci.getIess());
	}
	
	@BeforeEach
	void datos() {
		
		Paciente paci1 = new Paciente();
		paci1.setCedula("123");
		paci1.setNombre("Carlos");
		paci1.setApellido("Montalvo");
		LocalDateTime fechaL = LocalDateTime.of(1999, Month.AUGUST, 8, 12, 45);
		paci1.setFechaN(fechaL);
		paci1.setIess("4312");
		paci1.setEstatura(171);
		paci1.setPeso(75);
		paci1.setEdad(22);
		
		Paciente paci2 = new Paciente();
		paci2.setCedula("12333");
		paci2.setNombre("Patricio");
		paci2.setApellido("Salas");
		LocalDateTime fechaS = LocalDateTime.of(1999, Month.OCTOBER, 8, 12, 45);
		paci2.setFechaN(fechaS);
		paci2.setIess("2342342");
		paci2.setEstatura(180);
		paci2.setPeso(76);
		paci2.setEdad(40);
		
		iPacienteService.InsertarService(paci1);
		
		iPacienteService.InsertarService(paci2);
	}
	
}
