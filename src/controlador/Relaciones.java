package controlador;

import java.sql.Connection;

import Conexion.ConexionDB;
import DAO.ClienteDAO;
import DAO.CompraDAO;
import DAO.ProductoDAO;
import logica.Procesos;
import modelo.dto.CompraDTO;
import vista.VentanaCliente;
import vista.VentanaCompra;
import vista.VentanaPrincipal;


public class Relaciones {
	
	public Relaciones() {
		Connection conexion = ConexionDB.getConexion();

		ClienteDAO clienteDAO = new ClienteDAO(conexion);
		ProductoDAO productoDAO = new ProductoDAO(conexion);
		CompraDAO compraDAO = new CompraDAO(conexion);

		VentanaPrincipal miVentanaPrincipal = new VentanaPrincipal();
		VentanaCliente miVentanaCliente = new VentanaCliente();
		VentanaCompra miVentanaCompra = new VentanaCompra();
		Procesos miProcesos = new Procesos();
		Coordinador miCoordinador = new Coordinador();
		CompraDTO miCompra = new CompraDTO();
		
		miCoordinador.setMiClienteDAO(clienteDAO);
		miCoordinador.setMiProductoDAO(productoDAO);
		miCoordinador.setMiCompraDAO(compraDAO);
		miVentanaPrincipal.setMiCoordinador(miCoordinador);
		miVentanaCliente.setMiCoordinador(miCoordinador);
		miVentanaCompra.setMiCoordinador(miCoordinador);
		miProcesos.setMiCoordinador(miCoordinador);
	
		
		miCoordinador.setMiProcesos(miProcesos);
		miCoordinador.setMiVentanaCompra(miVentanaCompra);
		miCoordinador.setMiVentanaPrincipal(miVentanaPrincipal);
		miCoordinador.setMiVentanaCliente(miVentanaCliente);
		miCoordinador.setMiCompra(miCompra);
		
		miCoordinador.mostrarVentanaPrincipal();
	}
	
	
	
	
	
	

	
	
	

}
