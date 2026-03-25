package logica;

import controlador.Coordinador;
import modelo.dto.ClienteDTO;

public class Procesos {
	
	Coordinador miCoordinador;
	

	public Procesos() {
		
		System.out.println("Crea la instancia de proceso");
		
	}
	
	public void calcularCompra(ClienteDTO cliente) {
		
		Double compra;
		double porcentaje;
		double precioTotal;
		double descuento;	
		
		
		switch(cliente.getTipo()) {
		
		 case "A":
			 	porcentaje= 0.40;
				precioTotal= cliente.getValorUnitario()*cliente.getCantidadProductos();
				descuento= precioTotal*porcentaje;				
				compra= precioTotal-descuento;
				cliente.setCompraTotal(compra);
		        break;
		
		
		case "B":
			 porcentaje= 0.20;
			 precioTotal= cliente.getValorUnitario()*cliente.getCantidadProductos();
			 descuento= precioTotal*porcentaje;
			
			compra= precioTotal-descuento;
			cliente.setCompraTotal(compra);
	        break;
	
	
		case "C":
			porcentaje= 0.10;
			precioTotal= cliente.getValorUnitario()*cliente.getCantidadProductos();
			descuento= precioTotal*porcentaje;
			
			compra= precioTotal-descuento;
			cliente.setCompraTotal(compra);
		      break;
		      
		 default:
			 
			System.out.println("No se le realiza descuento");			
			precioTotal= cliente.getValorUnitario()*cliente.getCantidadProductos();
			cliente.setCompraTotal(precioTotal);
			break;
		
		}
		
		
		
		
		
	}

	public void setMiCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
	}
}
