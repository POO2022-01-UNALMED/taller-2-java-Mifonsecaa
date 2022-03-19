package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	int cantidadAsientos() {
		int numeroAsientos = 0;
		for (Asiento asiento : this.asientos) {
			if (asiento != null) {
				numeroAsientos++;
			}
		}
		return numeroAsientos;
	}
	
	String verificarIntegridad() {
		for (Asiento asiento : this.asientos) {
			if (asiento != null && (asiento.registro != this.registro)) {
				return "Las piezas no son originales";
			}
		}
		if (this.motor.registro != this.registro) {
			return "Las piezas no son  originales";
		}
		return "Auto original";
	}
}
