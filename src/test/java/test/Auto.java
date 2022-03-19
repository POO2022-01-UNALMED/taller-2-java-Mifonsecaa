
public class Auto {
	
	static int cantidadCreados;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String modelo;
		
		int precio;
		
		Asiento[] asientos;
		
		String marca;
		
		int registro;
		
	}
	
	int cantidadAsientos() {
		int total;
		for(Asiento i:this.asientos) {

			if(i != null) {
				
				total += 1;
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
