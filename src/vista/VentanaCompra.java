package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;

import controlador.Coordinador;
import modelo.dto.ClienteDTO;

import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;

public class VentanaCompra extends JDialog implements ActionListener{
	
	Coordinador miCoordinador;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDocumento;
	private JTextField txtEdad;
	private JTextField txtTelefono;
	private JTextField txtTipo;
	private JTextField txtNombreProducto;
	private JTextField txtValorUnidad;
	private JTextField txtCantidadProducto;
	private JButton btnCompraTotal;
	private JButton btnLimpiar;
	private JButton btnConsultar;
	
	public VentanaCompra(VentanaPrincipal miVentanaPrincipal, boolean b) {
		super(miVentanaPrincipal,b);
		System.out.println("Crea la instancia de Ventana Compra");
	//	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(550, 380);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		

		iniciarComponentes();
		
		
	}

	private void iniciarComponentes() {
		
		JLabel lblNomre = new JLabel("Nombre");
		lblNomre.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNomre.setBounds(41, 124, 46, 14);
		getContentPane().add(lblNomre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblApellido.setBounds(274, 70, 46, 14);
		getContentPane().add(lblApellido);
		
		JLabel lblTittle = new JLabel("Calculo de la compra");
		lblTittle.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTittle.setBounds(181, 11, 216, 34);
		getContentPane().add(lblTittle);
		
		JLabel lblDocumento = new JLabel("Documento");
		lblDocumento.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblDocumento.setBounds(41, 70, 59, 14);
		getContentPane().add(lblDocumento);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblEdad.setBounds(274, 124, 46, 14);
		getContentPane().add(lblEdad);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblTelefono.setBounds(41, 179, 46, 14);
		getContentPane().add(lblTelefono);
		
		JLabel lblTipo = new JLabel("Tipo( A,B,C)");
		lblTipo.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblTipo.setBounds(246, 179, 74, 14);
		getContentPane().add(lblTipo);
		
		JLabel lblNombreProducto = new JLabel("Nombre del Producto");
		lblNombreProducto.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNombreProducto.setBounds(10, 229, 105, 14);
		getContentPane().add(lblNombreProducto);
		
		JLabel lblValorUnitario = new JLabel("Valor Unitario");
		lblValorUnitario.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblValorUnitario.setBounds(246, 229, 76, 14);
		getContentPane().add(lblValorUnitario);
		
		JLabel lblCantidadProductos = new JLabel("Cantidad productos");
		lblCantidadProductos.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblCantidadProductos.setBounds(10, 267, 94, 14);
		getContentPane().add(lblCantidadProductos);
		
		JButton btnCompraTotal = new JButton("Compra");
		btnCompraTotal.setBounds(308, 307, 89, 23);
		btnCompraTotal.addActionListener(this);
		getContentPane().add(btnCompraTotal);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(78, 307, 89, 23);
		getContentPane().add(btnLimpiar);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(120, 121, 116, 20);
		getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(329, 67, 116, 20);
		getContentPane().add(txtApellido);
		
		txtDocumento = new JTextField();
		txtDocumento.setColumns(10);
		txtDocumento.setBounds(120, 67, 116, 20);
		getContentPane().add(txtDocumento);
		
		txtEdad = new JTextField();
		txtEdad.setColumns(10);
		txtEdad.setBounds(329, 121, 116, 20);
		getContentPane().add(txtEdad);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(120, 176, 116, 20);
		getContentPane().add(txtTelefono);
		
		txtTipo = new JTextField();
		txtTipo.setColumns(10);
		txtTipo.setBounds(329, 176, 116, 20);
		getContentPane().add(txtTipo);
		
		txtNombreProducto = new JTextField();
		txtNombreProducto.setColumns(10);
		txtNombreProducto.setBounds(120, 226, 116, 20);
		getContentPane().add(txtNombreProducto);
		
		txtValorUnidad = new JTextField();
		txtValorUnidad.setColumns(10);
		txtValorUnidad.setBounds(329, 226, 116, 20);
		getContentPane().add(txtValorUnidad);
		
		txtCantidadProducto = new JTextField();
		txtCantidadProducto.setColumns(10);
		txtCantidadProducto.setBounds(130, 264, 105, 20);
		getContentPane().add(txtCantidadProducto);
		
		JButton btnConsultar = new JButton("Mostrar Datos");
		btnConsultar.setBounds(177, 307, 116, 23);
		getContentPane().add(btnConsultar);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btnCompraTotal) {
			calcularCompra();
			
		}else if(e.getSource()==btnLimpiar) {
			limpiar();
			
		}else if(e.getSource()==btnConsultar) {
			consultarDatos();
			
		}
		
	}
	
	
	private void calcularCompra() {
		ClienteDTO cliente = new ClienteDTO();
		cliente.setDocumento(txtDocumento.getText());
		cliente.setNombre(txtNombre.getText());
		cliente.setApellido(txtApellido.getText());
		cliente.setEdad(Integer.parseInt(txtEdad.getText()));
		cliente.setTelefono(txtTelefono.getText());
		cliente.setTipo(txtTipo.getText());
	}
	private void limpiar() {
		
	}
	private void consultarDatos() {
		
	}



	public void setMiCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
	}
}
