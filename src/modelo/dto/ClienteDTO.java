package modelo.dto;

public class ClienteDTO {
	
	private String nombre;
	private String apellido;
	private int edad;
	private String telefono;
	private String tipo;
	private String nombreProducto;
	private double valorUnitario;
	private double cantidadProductos;
	private double compraTotal;
	 

	
	
	
	
	public ClienteDTO(String nombre, String apellido, int edad, String telefono, String tipo, String nombreProducto,
			double valorUnitario, double cantidadProductos, double compraTotal) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.telefono = telefono;
		this.tipo = tipo;
		this.nombreProducto = nombreProducto;
		this.valorUnitario = valorUnitario;
		this.cantidadProductos = cantidadProductos;
		this.compraTotal = compraTotal;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
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
	
	@Override
	public String toString() {
		return "ClienteDTO [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", telefono=" + telefono
				+ ", tipo=" + tipo + ", nombreProducto=" + nombreProducto + ", valorUnitario=" + valorUnitario
				+ ", cantidadProductos=" + cantidadProductos + ", compraTotal=" + compraTotal + "]";
	}
	
	
	
	
	

}
