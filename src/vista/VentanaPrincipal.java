package vista;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controlador.Coordinador;


public class VentanaPrincipal extends JFrame implements ActionListener {
	
	Coordinador miCoordinador;
	private JPanel contentPane;
	private JButton btnIniciar;
	
	public VentanaPrincipal() {
		System.out.println("Crea la instancia de Ventana Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize( 506, 354);
		setLocationRelativeTo(null);
		
		iniciarComponentes();
	}
	
	

	private void iniciarComponentes() {
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("BIENVENIDO A DON APARATO");
		lblTitulo.setFont(new Font("Rockwell", Font.BOLD, 25));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(6, 12, 494, 46);
		contentPane.add(lblTitulo);
		
		JTextArea txtrEnElSiguiente = new JTextArea();
		txtrEnElSiguiente.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		txtrEnElSiguiente.setWrapStyleWord(true);
		txtrEnElSiguiente.setTabSize(10);
		txtrEnElSiguiente.setLineWrap(true);
		txtrEnElSiguiente.setText("En el siguiente ejercicio gestionaremos el proceso de compra de electrodomésticos con un enfoque orientado a objetos "
									+ "y aplicando el patrón Modelo Vista Controlador");
		txtrEnElSiguiente.setBounds(16, 70, 472, 142);
		contentPane.add(txtrEnElSiguiente);
		
		btnIniciar = new JButton("Iniciar");
		btnIniciar.setBounds(6, 233, 482, 39);
		btnIniciar.addActionListener(this);
		contentPane.add(btnIniciar);
		
	}



	public void setMiCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()== btnIniciar) {
			
			miCoordinador.mostraVentanaCompra();
			
		}
		
	}
}
