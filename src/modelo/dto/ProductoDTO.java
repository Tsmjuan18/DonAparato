package modelo.dto;

public class ProductoDTO {
	
	private double descuento;
	private String id;
	private String nombreProducto;
	private double valorUnitario;
	private double cantidadProductos;
	private double compraTotal;
	
	
	
	
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
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
	public double getCompraTotal() {
		return compraTotal;
	}
	public void setCompraTotal(double compraTotal) {
		this.compraTotal = compraTotal;
	}
	public double getDescuento() {
		return descuento;
	}
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	@Override
	public String toString() {
		return "ProductoDTO [descuento=" + descuento + ", id=" + id + ", nombreProducto=" + nombreProducto
				+ ", valorUnitario=" + valorUnitario + ", cantidadProductos=" + cantidadProductos + ", compraTotal="
				+ compraTotal + ", getId()=" + getId() + ", getNombreProducto()=" + getNombreProducto()
				+ ", getValorUnitario()=" + getValorUnitario() + ", getCantidadProductos()=" + getCantidadProductos()
				+ ", getCompraTotal()=" + getCompraTotal() + ", getDescuento()=" + getDescuento() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	

}
