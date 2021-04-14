package vista;

import control.ControlConversor;

/**
 * Definimos una interfaz con las operaciones que el control
	puede necesitar para manipularla
 * 
 *
 */
public interface InterfazVista {
	
	void setControlador(ControlConversor c);
	void arranca();  //Comienza la visualizacion
	
	double getCantidad();     //Cantidad a convertir
	void escribeCambio(String s); //texto con la conversion
	
	//Constantes que definen las posibles operaciones
	
	static final String AEUROS = "Pesetas a Euros";
	static final String APESETAS = "Euros a Pesetas";
	

 }

