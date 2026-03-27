package logica;

import controlador.Coordinador;
import modelo.dto.ClienteDTO;
import modelo.dto.CompraDTO;

public class Procesos {
	
	Coordinador miCoordinador;
	

	public Procesos() {
		
		System.out.println("Crea la instancia de proceso");
		
	}
	
	public void calcular(CompraDTO compra) {
		
		
		double descuento;
		
		
		
		switch(compra.getMiCliente().getTipo()) {
		
		case "A":
			descuento = 0.40;
			compra.getMiProducto().setDescuento(descuento);
			
	        break;	
		
		case "B":
			descuento = 0.20;
			compra.getMiProducto().setDescuento(descuento);
			 
	        break;	
	
		case "C":
			descuento= 0.10;
			compra.getMiProducto().setDescuento(descuento);
		      break;
		      
		 default:
			descuento = 0;
			compra.getMiProducto().setDescuento(descuento);
			System.out.println("No se le realiza descuento");			
			
			break;		
		}
		calcularCompra(compra);
	}
	
	
	
		
		public void calcularCompra(CompraDTO compra) {				
			
			double venta= compra.getMiProducto().getValorUnitario()*compra.getMiProducto().getCantidadProductos();			
			double porcentaje = compra.getMiProducto().getDescuento()*venta;				
			double totalVenta= venta-porcentaje;
			compra.getMiProducto().setCompraTotal(totalVenta);;
		}
		
		
		
		

	public void setMiCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
	}
}
