package modelo;

public class ConversorEurosPesetas extends ConversorEuros {
	
	//Adaptador de clase
	public ConversorEurosPesetas() {
		
		super(166.386D);
	}
	
	public double eurosApesetas(double cantidad) {
		
		
		return eurosAmoneda(cantidad);
	}
	
	public double pesetasAeuros(double cantidad) {
		
		return monedaAeruos(cantidad);
	}
	
	public class ConversorEurosPesetass{
		//Adaptador de objetos
		private ConversorEuros conversor;
		
		public void ConversorEurosPesetas() {
			
			conversor = new ConversorEuros(166.386D);
		}
		
		public double eurosApesetas(double cantidad) {
			
			return conversor.eurosAmoneda(cantidad);
		}
		
		public double pesetasAeruos(double cantidad) {
			
			return conversor.monedaAeruos(cantidad);
			
		}
		
	}

}
