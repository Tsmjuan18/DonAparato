package modelo.dto;

public class ClienteDTO {
	
	private String nombre;
	private String apellido;
	private String documento;
	private int edad;
	private String telefono;
	private String tipo;
	
	
	
	public ClienteDTO() {
		
	}
	 

	
	
	
	
	public ClienteDTO(String nombre, String apellido, String documento,int edad, String telefono, String tipo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento= documento;
		this.edad = edad;
		this.telefono = telefono;
		this.tipo = tipo;
		
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
	
	
	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
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
	
	
	
	

	@Override
	public String toString() {
		return "ClienteDTO [nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento + ", edad=" + edad
				+ ", telefono=" + telefono + ", tipo=" + tipo;
	}
	
	
	
	
	
	
	

}
