package ExamenSegundoTrimestre;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;



public class INTEGRACION_LuisAlvarezPerez {
	 
	//Realizo la prueba de integracion sobre el metodo procesarPedidos
	@Test
	    void testProcesarPedidos() {
	      
	        Departamento departamento = new Departamento("Estacion", 1000);
	        
	        
	       Departamento procesarPedido = new Departamento("Estacion", 150.00);

	       
			boolean resultado = departamento.procesarPedido(150.00);

	    
	        assertTrue(resultado, "La orden debería procesarse correctamente.");
	    }
	//prueba de integracion del metodo realizarPedido
	  @Test
	  void testAgregarDepartamentoYRealizarPedido() {
		  
		  Instituto i = new Instituto(0);
		  
		  Instituto RealizarPedido = new Instituto(200);
		  
		  
		 boolean resultado = i.realizarPedido("Estacion", 200 );
		  
		 assertTrue(resultado, "Departamento encontrado.");
		  }
	  }
