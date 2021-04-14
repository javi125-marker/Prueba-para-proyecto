package Ejecutable;

import control.ControlConversor;
import modelo.ConversorEurosPesetas;
import vista.InterfazVista;
import vista.VentanaConversor;

public class ProgramaEjecutable {

	public static void main(String[] args) {
	
		//el Modelo
		ConversorEurosPesetas modelo = new ConversorEurosPesetas();
		
		
		//la Vista 
		InterfazVista vista = new VentanaConversor();
		
		//Configura la vista
		
		
		//y el control
		
		ControlConversor control = new ControlConversor(vista, modelo);
		
		//Configura la vista
		
		vista.setControlador(control);
		
		//arranca la interfaz vista
		
		vista.arranca();

	}

}
