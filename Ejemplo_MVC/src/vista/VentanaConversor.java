package vista;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import control.ControlConversor;

public class VentanaConversor extends JFrame implements InterfazVista {
	
	/**
	 * Una ventana (JFrame) con:
		Un campo de texto (JTextField) para indicar la entrada
		 Una etiqueta (JLabel) para indicar el resultado de la
		conversión
		 Dos botones (JButton) para las dos operaciones
	 */
	private static final long serialVersionUID = 1L;
	
	private JButton convertirApesetas;
	private JButton convertirAeuros;
	private JTextField cantidad;
	private JLabel resultado;
	
	public VentanaConversor() {
		
		super("Conversor de Euros y Pesetas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setLayout(new BorderLayout(10,10));
		
		cantidad = new JTextField(8);
		JPanel panelaux = new JPanel();
		panelaux.add(cantidad);
		panelPrincipal.add(panelaux, BorderLayout.NORTH);
		
		resultado = new JLabel("Indique una cantidad y pulse uno de los botones");
		JPanel panelaux2 = new JPanel(); 
		panelaux2.add(resultado);
		panelPrincipal.add(panelaux2, BorderLayout.CENTER);
		
		convertirApesetas = new JButton("A pesetas");
		convertirApesetas.setActionCommand(APESETAS);
		convertirAeuros = new JButton("A euros");
		convertirAeuros.setActionCommand(AEUROS);
		JPanel botonera = new JPanel();
		botonera.add(convertirApesetas); 
		botonera.add(convertirAeuros);
		panelPrincipal.add(botonera, BorderLayout.SOUTH);
		getContentPane().add(panelPrincipal);
		
		
	}
	
	//Metodos 
	
	@Override
	public void escribeCambio(String s) {
		resultado.setText(s);
	}
	
	@Override
	public double getCantidad() {
		
		try {
			return  Double.parseDouble(cantidad.getText());
		} catch (NumberFormatException e) {
			
			return 0.0D;
		}
		
	}

	@Override
	public void setControlador(ControlConversor c) {
		// TODO Auto-generated method stub
		convertirApesetas.addActionListener(c);
		convertirAeuros.addActionListener(c);	
	}
	
	@Override
	public void arranca() {
		// TODO Auto-generated method stub
		pack(); //Colocamos los componentes
		setLocationRelativeTo(null); //Centra la ventana en la pantalla
		setVisible(true); //Visualiza la ventana
		
	}


	
}
