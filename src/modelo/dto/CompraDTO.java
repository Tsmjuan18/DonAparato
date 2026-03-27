package modelo.dto;

public class CompraDTO {
	ClienteDTO miCliente;
	ProductoDTO miProducto;
	
	public CompraDTO() {
		
	}
	
	
	
	
	public ClienteDTO getMiCliente() {
		return miCliente;
	}
	public void setMiCliente(ClienteDTO miCliente) {
		this.miCliente = miCliente;
	}
	public ProductoDTO getMiProducto() {
		return miProducto;
	}
	public void setMiProducto(ProductoDTO miProducto) {
		this.miProducto = miProducto;
	}

}
