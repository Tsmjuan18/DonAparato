package controlador;

import logica.Procesos;
import vista.VentanaCompra;
import vista.VentanaPrincipal;


public class Relaciones {
	
	public Relaciones() {
		VentanaPrincipal miVentanaPrincipal = new VentanaPrincipal();
		VentanaCompra miVentanaCompra = new VentanaCompra(miVentanaPrincipal, true);
		Procesos miProcesos = new Procesos();
		Coordinador miCoordinador = new Coordinador();
		
		miVentanaPrincipal.setMiCoordinador(miCoordinador);;
		miVentanaCompra.setMiCoordinador(miCoordinador);
		miProcesos.setMiCoordinador(miCoordinador);
		
		miCoordinador.setMiProcesos(miProcesos);
		miCoordinador.setMiVentanaCompra(miVentanaCompra);
		miCoordinador.setMiVentanaPrincipal(miVentanaPrincipal);
		
		miCoordinador.mostrarVentanaPrincipal();
	}
	
	
	
	
	
	

	
	
	

}
