package controlador;

import logica.Procesos;
import modelo.dto.ClienteDTO;
import modelo.dto.CompraDTO;
import vista.VentanaCompra;
import vista.VentanaPrincipal;
import vista.VentanaProducto;

public class Coordinador {
	
	VentanaPrincipal miVentanaPrincipal;
	VentanaCompra miVentanaCompra;
	VentanaProducto miVentanaProducto;

	Procesos miProcesos;
	CompraDTO miCompra;
	
	
	
	public void mostrarVentanaPrincipal() {	
		
		miVentanaPrincipal.setVisible(true);
	}
	public void mostrarVentanaProducto() {
		//miVentanaProducto.setVisible(true);
	}
	
	public void mostraVentanaCompra() {
		miVentanaCompra.setVisible(true);
		
	}
	
	public void calcularCompra() {
		miProcesos.calcular(miCompra);
		
	}
	
	
	public void setDatosCliente(String nombre, String apellido, String documento,int edad, String telefono, String tipo) {
		
		miCompra.getMiCliente().setNombre(nombre);
		miCompra.getMiCliente().setApellido(apellido);
		miCompra.getMiCliente().setDocumento(documento);
		miCompra.getMiCliente().setEdad(edad);
		miCompra.getMiCliente().setTelefono(telefono);
		miCompra.getMiCliente().setTipo(tipo);
		
	}
	
	public void setDatosProducto(double descuento, String nombreProducto, double valorUnitario, double cantidadProductos,
			double compraTotal) {
		
	}
	
	
	
	
	
	
	
	
	public void setMiVentanaPrincipal(VentanaPrincipal miVentanaPrincipal) {
		this.miVentanaPrincipal = miVentanaPrincipal;
	}
	
	public void setMiVentanaCompra(VentanaCompra miVentanaCompra) {
		this.miVentanaCompra = miVentanaCompra;
	}
	
	public void setMiProcesos(Procesos miProcesos) {
		this.miProcesos = miProcesos;
	}
	
	public VentanaProducto getMiVentanaProducto() {
		return miVentanaProducto;
	}
	
	public void setMiVentanaProducto(VentanaProducto miVentanaProducto) {
		this.miVentanaProducto = miVentanaProducto;
	}

}
