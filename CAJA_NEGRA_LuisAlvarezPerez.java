package ExamenSegundoTrimestre;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CAJA_NEGRA_LuisAlvarezPerez {

	
	
	 @Test
	    public void testLimiteMontoMaximo() {
		 Departamento departamento = new Departamento("Biblioteca", 1000.00);
		 
		 boolean resultado = departamento.procesarPedido(1001.00);
	        assertEquals("El monto no puede exceder el presupuesto", resultado);
	    }

	    @Test
	    public void testLimiteMontoMinimo() {
	    	 Departamento departamento = new Departamento("Biblioteca", 1000.00);
			 
			 boolean resultado = departamento.procesarPedido(-1.00);
		        assertEquals("El monto no puede se menor que 0 ", resultado);
		    }

	    @Test
	    public void testMontoIgualPresupuesto() {
	    	 Departamento departamento = new Departamento("Biblioteca", 1000.00);
			 
			 boolean resultado = departamento.procesarPedido(1000.00);
		        assertEquals("Son iguales y es valido", resultado);
		    }
	    public void testLimiteMinimoPresupuesto() {
		 Departamento departamento = new Departamento("Biblioteca", -1000.00);
		 
		 boolean resultado = departamento.procesarPedido(1001.00);
	        assertEquals("El presupuesto no puede ser menor que 0", resultado);
	    }
	    public void testlimiteEntrePresupuestoYMonto() {
		 Departamento departamento = new Departamento("Biblioteca", 1000.00);
		 
		 boolean resultado = departamento.procesarPedido(500.00);
	        assertEquals("El pedido es correcto", resultado);
	    }

}
