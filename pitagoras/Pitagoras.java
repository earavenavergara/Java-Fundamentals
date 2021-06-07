package pitagoras;

public class Pitagoras {
	public double calcularHipotenusa(int catetoA, int catetoB) {
		double resultado = 0;
		resultado = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));
		return resultado;
	}
}
