package test;
import java.util.*;
public class Auto {
	
	static int cantidadCreados;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String modelo;
		
		int precio;
		
		ArrayList<Asiento> asientos = new ArrayList<>();
		
		String marca;
		
		int registro;
		
	}
	
	int cantidadAsientos() {
		int total;
		for(Asiento i:asientos) {
			
			boolean verificar = i.getClass() == Asiento.class;
			
			if(verificar == true) {
				
				return total += 1;
			}else {
				
				return total;
			}
			
			
		}
	}
	
	
	String verificarIntegridad() {
		
		for(Asiento x: asientos) {
			
			if(registro == x.registro) {
				
				return "Auto original";
			}else {
				return "Las piezas no son originales";
			}
		}
		
		
	}

}
