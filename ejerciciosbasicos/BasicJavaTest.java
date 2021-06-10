package ejerciciosbasicos;

import java.util.Arrays;

public class BasicJavaTest {

	public static void main(String[] args) {
		BasicJava bj = new BasicJava();
		int[] myArray = { 1, 5, 10, 7, -2 };
		// bj.imprimeNumeros(); //Imprimir 1 - 255
		// bj.imprimeImpares(); //Imprimir los Números Impares Entre 1 - 255
		// bj.imprimeSuma(); //Imprimir la Suma
		// bj.imprimeArreglo(myArray); //Recorrer un Arreglo
		// bj.maxArreglo(myArray); //Encontrar el Máximo
		// bj.avgArreglo(myArray); //Obtener el Promedio
		// bj.arregloImpares(); // Arreglo con Números Impares
		// bj.mayorQueY(myArray, 3); // Mayor que Y
		// bj.arregloCuadrado(myArray); //Valores al Cuadrado
		// bj.eliminaNegativos(myArray);//Eliminar Números Negativos
		// double[] myArray2 = bj.minMaxAvg(myArray);// Mínimo, Máximo y Promedio
		// System.out.println("max: " + myArray2[0] + " min: " + myArray2[1] + " avg: "
		// + myArray2[2]);
		System.out.println(Arrays.toString(bj.cambioArreglo(myArray))); // Cambiando los Valores del Arreglo
	}

}
