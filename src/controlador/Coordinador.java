package controlador;

import logica.Procesos;
import modelo.dto.ClienteDTO;
import vista.VentanaCompra;
import vista.VentanaPrincipal;

public class Coordinador {
	
	VentanaPrincipal miVentanaPrincipal;
	VentanaCompra miVentanaCompra;
	Procesos miProcesos;
	
	
	public void setMiVentanaPrincipal(VentanaPrincipal miVentanaPrincipal) {
		this.miVentanaPrincipal = miVentanaPrincipal;
	}
	
	public void setMiVentanaCompra(VentanaCompra miVentanaCompra) {
		this.miVentanaCompra = miVentanaCompra;
	}
	
	public void setMiProcesos(Procesos miProcesos) {
		this.miProcesos = miProcesos;
	}
	
	public void mostrarVentanaPrincipal() {	
		
		miVentanaPrincipal.setVisible(true);
	}
	
	public void mostraVentanaCompra() {
		
	}
	
	public void calcularCompra(ClienteDTO cliente) {
		miProcesos.calcularCompra(cliente);
		
	}
	
	

}
