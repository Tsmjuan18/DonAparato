package controlador;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import DAO.ClienteDAO;
import DAO.CompraDAO;
import DAO.ProductoDAO;
import logica.Procesos;
import modelo.dto.ClienteDTO;
import modelo.dto.CompraDTO;
import modelo.dto.ProductoDTO;
import vista.VentanaCliente;
import vista.VentanaCompra;
import vista.VentanaPrincipal;


public class Coordinador {
	
	VentanaPrincipal miVentanaPrincipal;
	VentanaCompra miVentanaCompra;
	VentanaCliente miVentanaCliente;
	//HashMap<String, ClienteDTO>mapaCliente;
	//HashMap<String, ProductoDTO>mapaProducto;
	ClienteDAO miClienteDAO;
	ProductoDAO miProductoDAO;
	CompraDAO miCompraDAO;
	
	Procesos miProcesos;
	CompraDTO miCompra;
	
	public Coordinador() {
	//	mapaCliente= new HashMap<String, ClienteDTO>();
	//	mapaProducto = new HashMap<String, ProductoDTO>();
	}
	
	//crear cliente
	public String crearCliente() {
		
		 return miClienteDAO.crear(miCompra.getMiCliente());
		
	}
	
	//leer cliente
	public ClienteDTO leerCliente(String documento) {
	    return miClienteDAO.leer(documento);
	}
	
	//Actualizar cliente
	public void actualizarCliente(ClienteDTO cliente) {
	    miClienteDAO.actualizar(cliente);
	}
	
	//ELiminar cliente
	public void eliminarCliente(ClienteDTO cliente) {
	    miClienteDAO.eliminar(cliente.getDocumento());
	}
	
	//crear producto
	public String crearProducto() {
	    return miProductoDAO.crear(miCompra.getMiProducto());
	}
	
	//leer producto
	public ProductoDTO leerProducto(String id) {
	    return miProductoDAO.leer(id);
	}	
	
	//actualizar producto
	public void actualizarProducto(ProductoDTO p) {
	    miProductoDAO.actualizar(p);
	}
	// eliminar producto
	public void eliminarProducto(String id) {
	    miProductoDAO.eliminar(id);
	}
	
	
	
	
	public void mostrarVentanaPrincipal() {			
		miVentanaPrincipal.setVisible(true);
	}
	
	public void mostraVentanaCliente() {
		miVentanaPrincipal.setVisible(false);
		miVentanaCliente.setVisible(true);
		
	}
	
	
	
	public void mostraVentanaCompra() {
		miVentanaCliente.setVisible(false);
		miVentanaCompra.AgregarCliente();
		miVentanaCompra.setVisible(true);
		
	}
	
	public void calcularCompra() {
		miProcesos.calcular(miCompra);
		 miCompraDAO.registrarCompra(miCompra);
		miVentanaCompra.mostrarResultado(miCompra);
		
	}
	
	
	public void setDatosCliente(String nombre, String apellido, String documento,int edad, String telefono, String tipo) {
		
		miCompra.getMiCliente().setNombre(nombre);
		miCompra.getMiCliente().setApellido(apellido);
		miCompra.getMiCliente().setDocumento(documento);
		miCompra.getMiCliente().setEdad(edad);
		miCompra.getMiCliente().setTelefono(telefono);
		miCompra.getMiCliente().setTipo(tipo);
		
	}
	
	public void setDatosProducto( String id,String nombreProducto, double valorUnitario, double cantidadProductos
			) {
		
		miCompra.getMiProducto().setId(id);
		miCompra.getMiProducto().setNombreProducto(nombreProducto);
		miCompra.getMiProducto().setValorUnitario(valorUnitario);
		miCompra.getMiProducto().setCantidadProductos(cantidadProductos);
		
		
	}
	
	
	public void setMiClienteDAO(ClienteDAO miClienteDAO) {
	    this.miClienteDAO = miClienteDAO;
	}
	public void setMiProductoDAO(ProductoDAO miProductoDAO) {
	    this.miProductoDAO = miProductoDAO;
	}
	public void setMiCompraDAO(CompraDAO miCompraDAO) {
	    this.miCompraDAO = miCompraDAO;
	}
	
	
	
	
	
	public void setMiVentanaPrincipal(VentanaPrincipal miVentanaPrincipal) {
		this.miVentanaPrincipal = miVentanaPrincipal;
	}
	
		public void setMiVentanaCliente(VentanaCliente miVentanaCliente) {
		this.miVentanaCliente = miVentanaCliente;
	}
	public void setMiVentanaCompra(VentanaCompra miVentanaCompra) {
		this.miVentanaCompra = miVentanaCompra;
	}
	
	public void setMiProcesos(Procesos miProcesos) {
		this.miProcesos = miProcesos;
	}
	
	
	public void setMiCompra(CompraDTO miCompra) {
		this.miCompra = miCompra;
	}

	public VentanaPrincipal getMiVentanaPrincipal() {
		return miVentanaPrincipal;
	}

	public VentanaCompra getMiVentanaCompra() {
		return miVentanaCompra;
	}

	public VentanaCliente getMiVentanaCliente() {
		return miVentanaCliente;
	}

	

	public Procesos getMiProcesos() {
		return miProcesos;
	}

	public CompraDTO getMiCompra() {
		return miCompra;
	}

	public ArrayList<ClienteDTO> getTodosLosClientes() {
	    return miClienteDAO.listarTodos();
	}

	
	
	
	
	

}
