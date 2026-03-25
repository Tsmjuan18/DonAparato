package modelo.dto;

public class ProductoDTO {
	private String nombreProducto;
	private double valorUnitario;
	private double cantidadProductos;
	
	
	
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	public double getCantidadProductos() {
		return cantidadProductos;
	}
	public void setCantidadProductos(double cantidadProductos) {
		this.cantidadProductos = cantidadProductos;
	}

}
