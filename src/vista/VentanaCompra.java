package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFrame;

import controlador.Coordinador;
import modelo.dto.ClienteDTO;
import modelo.dto.CompraDTO;
import modelo.dto.ProductoDTO;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class VentanaCompra extends JFrame implements ActionListener{
	
	Coordinador miCoordinador;
	private JTextField txtNombreProducto;
	private JTextField txtValorUnidad;
	private JTextField txtCantidadProducto;
	private JButton btnCompraTotal;
	private JButton btnLimpiar;
	private JButton btnConsultar;
	JButton btnActualizar;
	JLabel lblRespuesta;
	JButton btnCalcular;
	JLabel lblRespuestaDesc;
	private JTextField txtId;
	private JButton btnRegistrar;
	private JButton btnEliminar;
	private JComboBox comboBoxCliente;
	
	
	
	public VentanaCompra() {
		
	
		
		 setSize(600, 550);                                    // ← agregar
		    setLocationRelativeTo(null);                          // ← agregar
		    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       // ← agregar
		    iniciarComponentes();

		
		
		
	}

	private void iniciarComponentes() {
		
		setSize(550, 380);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		JLabel lblTittle = new JLabel("Calculo de la compra");
		lblTittle.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTittle.setBounds(181, 11, 216, 34);
		getContentPane().add(lblTittle);
		
		JLabel lblNombreProducto = new JLabel("Nombre del Producto");
		lblNombreProducto.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNombreProducto.setBounds(235, 119, 105, 14);
		getContentPane().add(lblNombreProducto);
		
		JLabel lblValorUnitario = new JLabel("Valor Unitario");
		lblValorUnitario.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblValorUnitario.setBounds(268, 162, 76, 14);
		getContentPane().add(lblValorUnitario);
		
		JLabel lblCantidadProductos = new JLabel("Cantidad productos");
		lblCantidadProductos.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCantidadProductos.setBounds(12, 167, 94, 14);
		getContentPane().add(lblCantidadProductos);
		
		 btnLimpiar = new JButton("Limpiar");
		 btnLimpiar.addActionListener(this);
		btnLimpiar.setBounds(10, 231, 116, 34);
		getContentPane().add(btnLimpiar);
		
		txtNombreProducto = new JTextField();
		txtNombreProducto.setColumns(10);
		txtNombreProducto.setBounds(369, 116, 116, 20);
		getContentPane().add(txtNombreProducto);
		
		txtValorUnidad = new JTextField();
		txtValorUnidad.setColumns(10);
		txtValorUnidad.setBounds(366, 156, 116, 20);
		getContentPane().add(txtValorUnidad);
		
		txtCantidadProducto = new JTextField();
		txtCantidadProducto.setColumns(10);
		txtCantidadProducto.setBounds(116, 163, 115, 20);
		getContentPane().add(txtCantidadProducto);
		
		 btnConsultar = new JButton("Consultar");
		 btnConsultar.addActionListener(this);
		btnConsultar.setBounds(152, 231, 116, 34);
		getContentPane().add(btnConsultar);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(293, 296, 148, 34);
		btnCalcular.addActionListener(this);
		getContentPane().add(btnCalcular);
		
		JLabel lblResultado = new JLabel("Resultado: ");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblResultado.setBounds(267, 206, 61, 14);
		getContentPane().add(lblResultado);
		
		 lblRespuesta = new JLabel("");
		lblRespuesta.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblRespuesta.setBounds(352, 206, 172, 14);
		getContentPane().add(lblRespuesta);
		
		JLabel lblTittleDescuento = new JLabel("Descuento:");
		lblTittleDescuento.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblTittleDescuento.setBounds(11, 205, 61, 14);
		getContentPane().add(lblTittleDescuento);
		
		 lblRespuestaDesc = new JLabel("");
		lblRespuestaDesc.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblRespuestaDesc.setBounds(74, 206, 183, 14);
		getContentPane().add(lblRespuestaDesc);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(74, 122, 24, 14);
		getContentPane().add(lblId);
		
		txtId = new JTextField();
		txtId.setBounds(108, 119, 80, 20);
		getContentPane().add(txtId);
		txtId.setColumns(10);
		
		 btnActualizar = new JButton("Actualizar");
		 btnActualizar.addActionListener(this);
		btnActualizar.setBounds(278, 231, 104, 34);
		getContentPane().add(btnActualizar);
		
		 btnRegistrar = new JButton("Registrar producto");
		 btnRegistrar.addActionListener(this);
		btnRegistrar.setBounds(398, 231, 126, 34);
		getContentPane().add(btnRegistrar);
		
		 btnEliminar = new JButton("Eliminar");
		 btnEliminar.addActionListener(this);
		btnEliminar.setBounds(152, 296, 116, 34);
		getContentPane().add(btnEliminar);
		
		 comboBoxCliente = new JComboBox();
		comboBoxCliente.setBounds(130, 64, 101, 22);
		getContentPane().add(comboBoxCliente);
		
		JLabel lblCliente = new JLabel("Cliente: ");
		lblCliente.setBounds(74, 68, 46, 14);
		getContentPane().add(lblCliente);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btnRegistrar) {
		crearProducto();		
	 	}
		else if(e.getSource()==btnConsultar) {
			consultar();			
		}			
		else if(e.getSource()==btnActualizar) {
			actualizar();
		}else if(e.getSource()==btnEliminar) {
			Eliminar();
		}else if(e.getSource()==btnLimpiar) {
			limpiar();			
		}else if(e.getSource()==btnCalcular) {
			calcular();
		}
		
	}
	
	public void AgregarCliente() {
		 comboBoxCliente.removeAllItems();
		    for (ClienteDTO c : miCoordinador.getTodosLosClientes()) {
		        comboBoxCliente.addItem(c.getNombre() + " - " + c.getApellido());
		    }
	}

	private void calcular() {
		 String seleccion = (String) comboBoxCliente.getSelectedItem();

		    if (seleccion == null) {
		        JOptionPane.showMessageDialog(null, "No hay clientes registrados", "Error", JOptionPane.ERROR_MESSAGE);
		        return;
		    }

		    // buscar el cliente en la lista de la BD
		    for (ClienteDTO c : miCoordinador.getTodosLosClientes()) {
		        if ((c.getNombre() + " - " + c.getApellido()).equals(seleccion)) {
		            miCoordinador.getMiCompra().setMiCliente(c);
		            break;
		        }
		    }

		    String id = txtId.getText().trim();
		    String nombreProducto = txtNombreProducto.getText();
		    double valorUnidad = Double.parseDouble(txtValorUnidad.getText());
		    double cantidadProducto = Double.parseDouble(txtCantidadProducto.getText());

		    miCoordinador.setDatosProducto(id, nombreProducto, valorUnidad, cantidadProducto);
		    miCoordinador.calcularCompra();

		
		
		
		
	}

	public void crearProducto() {
		String id= txtId.getText();
		String nombreProduc= txtNombreProducto.getText();
		double valorUnidad = Double.parseDouble(txtValorUnidad.getText());
		double cantidad = Double.parseDouble(txtCantidadProducto.getText());
		
		miCoordinador.setDatosProducto(id,nombreProduc, valorUnidad, cantidad);
		String res=miCoordinador.crearProducto();
		JOptionPane.showMessageDialog(null, res, "Registro Producto", JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	
	
	private void Eliminar() {
		
		 String id = txtId.getText().trim();
		    
		    if (id.isEmpty()) {
		        JOptionPane.showMessageDialog(null, "Ingrese un ID", "Error", JOptionPane.ERROR_MESSAGE);
		        return;
		    }
		    
		    String nombreProduc = txtNombreProducto.getText();
		    double valorUnidad = Double.parseDouble(txtValorUnidad.getText());
		    double cantidad = Double.parseDouble(txtCantidadProducto.getText());
		    
		    miCoordinador.setDatosProducto(id, nombreProduc, valorUnidad, cantidad);
		    miCoordinador.eliminarProducto(id);
		    
		    JOptionPane.showMessageDialog(null, "Producto eliminado", "Eliminar", JOptionPane.INFORMATION_MESSAGE);
		    limpiar();
	}

	public void limpiar() {
		txtId.setText("");
		txtNombreProducto.setText("");
		txtValorUnidad.setText("");
		txtCantidadProducto.setText("");
	}
	
	
	
	
	public void consultar() {
		
		String id = txtId.getText().trim();
	    ProductoDTO prod = miCoordinador.leerProducto(id);
	    if (prod != null) {
	        txtNombreProducto.setText(prod.getNombreProducto());
	        txtValorUnidad.setText(prod.getValorUnitario() + "");
	        txtCantidadProducto.setText(prod.getCantidadProductos() + "");
	    } else {
	        JOptionPane.showMessageDialog(null, "Producto no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
	    }
	}


	public void actualizar() {
		String id= txtId.getText();
		String nombreProduc= txtNombreProducto.getText();
		double valorUnidad = Double.parseDouble(txtValorUnidad.getText());
		double cantidad = Double.parseDouble(txtCantidadProducto.getText());
		
		miCoordinador.setDatosProducto(id,nombreProduc, valorUnidad, cantidad);
		miCoordinador.actualizarProducto(miCoordinador.getMiCompra().getMiProducto());		
	}

	
	
	public void mostrarResultado(CompraDTO miCompra) {
		double descuento = miCompra.getMiProducto().getDescuento();
		double total= miCompra.getMiProducto().getCompraTotal();
		String nombre = miCompra.getMiCliente().getNombre();
		String apellido = miCompra.getMiCliente().getApellido();
		String tipo= miCompra.getMiCliente().getTipo();
		
		if(descuento== 0) {
			 lblRespuestaDesc.setText("No se realiza descuento");
			 lblRespuestaDesc.setForeground(Color.red);
		}
		else {
			lblRespuestaDesc.setText("Tipo: "+tipo+" recibe el "+descuento*100+" % de descuento ");
			lblRespuestaDesc.setForeground(Color.blue);
		}
		
		lblRespuesta.setText(nombre+" "+apellido+" paga: $ "+String.format("%.2f",total));
		lblRespuestaDesc.setForeground(Color.blue);
		
	}

	
	


	public void setMiCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
	}
}
