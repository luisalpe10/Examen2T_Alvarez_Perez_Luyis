package ExamenSegundoTrimestre;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CAJA_BLANCA_LuisAlvarezPerez {

	
	
	
	@Test 
	void testProcesarPedidos() {
		Departamento departamento = new Departamento("Biblioteca", 1000);
		boolean resultado = departamento.procesarPedido(500);
		assertTrue(resultado, "El presupuesto repsecto al monto esta bien");
	
}
	//En instituto veremos sus metodos
	
	@Test 
	
	void testAgregarDepartamento() {
		Instituto instituto = new Instituto(150);
		        String resultado = instituto.agregarDepartamento("SalonActos", 3000.00);
		        assertEquals(resultado, "Departamento creado");
		
	}
	
	void testRealizarPedido() {
		Instituto instituto = new Instituto(150);
		        boolean resultado = instituto.realizarPedido("SalonActos", 1000.00);
		        assertTrue( resultado, "Departamento encontrado");

	
	}
	//Monto negativo
	
	 @Test
	 
	    public void testMontoNegativo() {
		 Departamento departamento = new Departamento("Biblioteca", 1000);
	 
	        boolean resultado = departamento.procesarPedido(-10.00);
	        assertTrue(resultado, "Monto fuera de rango");
	
	 }
	//PresupuestoNegativo
	 @Test
	 
	    public void testPresupuestoNegativo() {
		 Departamento departamento = new Departamento("Biblioteca", 1000);
	 
	        boolean resultado = departamento.procesarPedido(-10.00);
	        assertTrue(resultado, "Presupuesto fuera de rango");
	 }
	
}
