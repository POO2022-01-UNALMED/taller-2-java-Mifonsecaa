package test;

public class Auto{
	String modelo;
	
	int precio;
		
	Asiento asientos[];
		
	String marca;
		
	int registro;
	
	static int cantidadCreados;
		

	
	int cantidadAsientos() {
		int total;
		for(Asiento i:this.asientos) {

			if(i != null) {
				
				total ++;
			}
			
			
		}
		return total;
	}
	
	
	String verificarIntegridad() {
		
		for(Asiento x: this.asientos) {
			
			if(x != null) {
				
				if(this.registro == x.registro && this.registro == this.motor.registro) {
					
					return "Auto original";
				}
			}else {
				
				return "Las piezas no son originales";
			}
		}
	}

}
