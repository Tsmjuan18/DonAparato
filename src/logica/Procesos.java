package logica;

import controlador.Coordinador;
import modelo.dto.ClienteDTO;
import modelo.dto.CompraDTO;

public class Procesos {
	
	Coordinador miCoordinador;
	double descuento;
	

	public Procesos() {
		
		System.out.println("Crea la instancia de proceso");
		
	}
	
	public void calcular(CompraDTO compra) {
		
		
		
		
		
		
		switch(compra.getMiCliente().getTipo()) {
		
		case "A": descuento = 0.40;
			
			
	        break;	
		
		case "B":
			descuento = 0.20;
			
			 
	        break;	
	
		case "C":
			descuento= 0.10;
			
		      break;
		      
		 default:
			descuento = 0;
			
			System.out.println("No se le realiza descuento");			
			
			break;		
		}
		calcularCompra(compra);
	}
	
	
	
		
		public void calcularCompra(CompraDTO compra) {				
			
			double venta= compra.getMiProducto().getValorUnitario()*compra.getMiProducto().getCantidadProductos();			
			double porcentaje = descuento*venta;				
			double totalVenta= venta-porcentaje;
			compra.getMiProducto().setDescuento(descuento);
			compra.getMiProducto().setCompraTotal(totalVenta);
		}
		
		
		
		

	public void setMiCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
	}
}
