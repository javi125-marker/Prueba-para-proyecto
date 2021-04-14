package vista;

import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import control.ControlConversor;

public class InterfazTextualConversor implements InterfazVista {
	
	private ControlConversor controlador;
	
	//Gestion de la entrada por teclado
	
	private BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	private int leeOpcion() {
		String s = null;
		try {
			s = in.readLine();
			return Integer.parseInt(s);
			
		} catch (Exception e) {
			operacionIncorrecta(); 
			return 0;
			
		}
		
		
		}
	private double leeCantidad() {
		
		String s = null;
		try {
			s = in.readLine();
			return Double.parseDouble(s);
			
		} catch (Exception e) {
			System.out.println("Error en formato del numero, tiene que ser 99.99");
			return leeCantidad();
		}
		
		
	}
	
	private void solicitaOperacion() {
		
		System.out.println("Indica la operación que quiere realizar");
		System.out.println("1: Convertir euror a euros");
		System.out.println("2: Convertir pesetas a pesetas");
		System.out.println("0: Salir");
		
	}
	
	private void procesaNuevaOperacion() {
		
		int operacion;
		solicitaOperacion();
		operacion = leeOpcion();
		
		if(operacion == 0) {
			System.out.println("Adiós");
			System.exit(0);
			
		}
		if(operacion == 1) {
			controlador.actionPerformed(new ActionEvent(this, operacion, AEUROS));
			
		
		}
		if(operacion == 2) {
			controlador.actionPerformed(new ActionEvent(this, operacion, APESETAS));
			
			
		}
		operacionIncorrecta();

	
	}
	
	private void operacionIncorrecta() {
		System.out.println("Operación incorrecta");
		procesaNuevaOperacion();
	}
	
	//Metodos
	
	public void setControlador(ControlConversor c) {
		
		controlador = c;
		
	}
	
	
	public void escribeCambio(String s) {
		
		//escribe el resultado
		System.out.println(s);
		//vuelve a solicitar al usuario una operacion
		procesaNuevaOperacion();
	}
	
	public double getCantidad() {
		
		System.out.println("Cantidad a convertir (formato 99.99");
		return leeCantidad();
	}
	@Override
	public void arranca() {
		// TODO Auto-generated method stub
		procesaNuevaOperacion();
	}

}
