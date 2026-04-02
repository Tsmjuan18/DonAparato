package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import controlador.Coordinador;
import modelo.dto.ClienteDTO;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class VentanaCliente extends JFrame implements ActionListener{
	
	Coordinador miCoordinador;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDocumento;
	private JTextField txtTelefono;
	private JTextField txtEdad;
	
	JLabel lblTipo;
	JComboBox comboBox;
	private JButton btnContinuar;
	JButton btnEliminar;
	JButton btnActualizar;
	JButton btnConsultar;
	JButton btnCrearCliente;
	private JButton btnLimpiar;
	public VentanaCliente() {
		 setSize(558, 448);                                   
		 setLocationRelativeTo(null);                          
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
		 iniciarComponentes();
		
		
	}
	

	private void iniciarComponentes() {
		getContentPane().setLayout(null);
		
		JLabel lblTitle = new JLabel("REGISTRO DEL CLIENTE");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblTitle.setBounds(208, 29, 220, 26);
		getContentPane().add(lblTitle);
		
		JLabel lblNombre = new JLabel("NOMBRE");
		lblNombre.setBounds(10, 72, 60, 14);
		getContentPane().add(lblNombre);
		
		JLabel lblApellido = new JLabel("APELLIDO");
		lblApellido.setBounds(162, 72, 60, 14);
		getContentPane().add(lblApellido);
		
		JLabel lblDocumento = new JLabel("DOCUMENTO");
		lblDocumento.setBounds(328, 69, 86, 14);
		getContentPane().add(lblDocumento);
		
		JLabel lblEdad = new JLabel("EDAD");
		lblEdad.setBounds(220, 136, 46, 14);
		getContentPane().add(lblEdad);
		
		JLabel lblTelefono = new JLabel("TELEFONO");
		lblTelefono.setBounds(21, 136, 60, 14);
		getContentPane().add(lblTelefono);
		
		 lblTipo = new JLabel("TIPO");
		lblTipo.setBounds(398, 136, 46, 14);
		getContentPane().add(lblTipo);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(72, 69, 86, 20);
		getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(232, 68, 86, 20);
		getContentPane().add(txtApellido);
		
		txtDocumento = new JTextField();
		txtDocumento.setColumns(10);
		txtDocumento.setBounds(424, 66, 108, 20);
		getContentPane().add(txtDocumento);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(82, 133, 117, 20);
		getContentPane().add(txtTelefono);
		
		txtEdad = new JTextField();
		txtEdad.setColumns(10);
		txtEdad.setBounds(289, 133, 86, 20);
		getContentPane().add(txtEdad);
		
		 comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Seleccione", "A", "B", "C"}));
		comboBox.setBounds(443, 133, 89, 21);
		getContentPane().add(comboBox);
		
		btnContinuar = new JButton("CONTINUAR");
		btnContinuar.setBounds(187, 307, 155, 49);
		btnContinuar.addActionListener(this);
		getContentPane().add(btnContinuar);
		
		btnCrearCliente = new JButton("Registrar");
		btnCrearCliente.setBounds(388, 216, 89, 23);
		getContentPane().add(btnCrearCliente);
		btnCrearCliente.addActionListener(this);
		
		 btnConsultar = new JButton("Consultar");
		 btnConsultar.addActionListener(this);
		btnConsultar.setBounds(171, 216, 89, 23);
		getContentPane().add(btnConsultar);
		
		 btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(275, 216, 89, 23);
		getContentPane().add(btnActualizar);
		btnActualizar.addActionListener(this);
		
		 btnEliminar = new JButton("Eliminar");
		 btnEliminar.addActionListener(this);
		btnEliminar.setBounds(229, 273, 89, 23);
		getContentPane().add(btnEliminar);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(52, 216, 89, 23);
		getContentPane().add(btnLimpiar);
		btnLimpiar.addActionListener(this);
	}	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()== btnCrearCliente) {
			crearCliente();			
		}else if (e.getSource()== btnConsultar) {
			Consultar();
		}else if(e.getSource()== btnActualizar) {
			Actualizar();
		}else if(e.getSource()== btnEliminar) {
			Eliminar();
		}else if(e.getSource()== btnContinuar) {
			miCoordinador.mostraVentanaCompra();
		}else if(e.getSource()== btnLimpiar) {
			limpiar();
		}
	}


	private void limpiar() {
		txtNombre.setText("");
		txtDocumento.setText("");
		txtApellido.setText("");
		txtEdad.setText("");
		txtTelefono.setText("");
		comboBox.setSelectedItem("Seleccione");		
	}


	private void Eliminar() {
		
		miCoordinador.getMiCompra().getMiCliente();
		miCoordinador.eliminarCliente(miCoordinador.getMiCompra().getMiCliente());
	}


	private void Actualizar() {
		String nombre = txtNombre.getText();
		String apellido= txtApellido.getText();
		String documento= txtDocumento.getText();
		String telefono= txtTelefono.getText();
		int edad= Integer.parseInt(txtEdad.getText());
		String tipo = (String) comboBox.getSelectedItem();		
		if (tipo.equals("Seleccione")) {
			lblTipo.setText("Seleccione una opcion");
			return;
		}
		miCoordinador.setDatosCliente(nombre, apellido, documento, edad, telefono, tipo);
		miCoordinador.actualizarCliente(miCoordinador.getMiCompra().getMiCliente());
	}


	private void Consultar() {
		
		String doc= txtDocumento.getText();
		 ClienteDTO cliente=miCoordinador.leerCliente(doc);
		 
		if (cliente!=null) {
			
			txtNombre.setText(cliente.getNombre());
			txtApellido.setText(cliente.getApellido());
			txtEdad.setText(cliente.getEdad()+"");
			txtTelefono.setText(cliente.getTelefono());
			comboBox.setSelectedItem(cliente.getTipo());
			
		}
		else {
			JOptionPane.showInputDialog("cliente no encontrado");
		}
		
	}


	private void crearCliente() {
		
		
		String nombre = txtNombre.getText();
		String apellido= txtApellido.getText();
		String documento= txtDocumento.getText();
		String telefono= txtTelefono.getText();
		int edad= Integer.parseInt(txtEdad.getText());
		String tipo = (String) comboBox.getSelectedItem();
		miCoordinador.setDatosCliente(nombre, apellido, documento, edad, telefono, tipo);
		String respuesta=miCoordinador.crearCliente();
		
		JOptionPane.showMessageDialog(null, respuesta, "Resultado", JOptionPane.INFORMATION_MESSAGE);
		
	}


	public Coordinador getMiCoordinador() {
		return miCoordinador;
	}
	
	public void setMiCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
	}
}
