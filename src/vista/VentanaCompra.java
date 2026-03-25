package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;

import controlador.Coordinador;

public class VentanaCompra extends JDialog implements ActionListener{
	
	Coordinador miCoordinador;
	
	public VentanaCompra(VentanaPrincipal miVentanaPrincipal, boolean b) {
		super(miVentanaPrincipal,b);
		System.out.println("Crea la instancia de Ventana Compra");
	//	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(550, 380);
		setLocationRelativeTo(null);

		iniciarComponentes();
		
		
	}

	private void iniciarComponentes() {
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
	
	public void setMiCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
	}
	


}
