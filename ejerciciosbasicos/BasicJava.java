package ejerciciosbasicos;

import java.util.ArrayList;

public class BasicJava {

	public void imprimeNumeros() {
		for (int i = 1; i < 256; i++)
			System.out.println(i);
	}

	public void imprimeImpares() {
		for (int i = 1; i < 256; i++)
			if (i % 2 == 1)
				System.out.println(i);
	}

	public void imprimeSuma() {
		int sum = 0;
		for (int i = 0; i < 256; i++) {
			sum += i;
			System.out.println("Nuevo numero: " + i + " Suma: " + sum);
		}
	}

	public void imprimeArreglo(int[] myArray) {
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
	}

	public void maxArreglo(int[] myArray) {
		int max = myArray[0];
		for (int i = 1; i < myArray.length; i++) {
			if (max < myArray[i])
				max = myArray[i];
		}
		System.out.println(max);
	}

	public void avgArreglo(int[] myArray) {
		int sum = 0;
		double prom = 0;
		for (int i = 0; i < myArray.length; i++) {
			sum += myArray[i];
		}
		prom = (double) sum / myArray.length;
		System.out.println(prom);
	}

	public void arregloImpares() {
		ArrayList<Integer> y = new ArrayList<Integer>();
		for (int i = 1; i < 256; i++)
			if (i % 2 == 1)
				y.add(i);
		System.out.println(y);
	}

	public void mayorQueY(int[] myArray, int max) {
		int sum = 0;
		for (int i = 1; i < myArray.length; i++) {
			if (max < myArray[i])
				sum++;
		}
		System.out.println(sum);
	}

	public void arregloCuadrado(int[] myArray) {
		ArrayList<Integer> myArray2 = new ArrayList<Integer>();
		for (int i = 0; i < myArray.length; i++) {
			myArray2.add((int) Math.pow(myArray[i], 2));
		}
		System.out.println(myArray2);
	}

	public void eliminaNegativos(int[] myArray) {
		ArrayList<Integer> myArray2 = new ArrayList<Integer>();
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] < 0)
				myArray2.add(0);
			else
				myArray2.add(myArray[i]);
		}
		System.out.println(myArray2);
	}

	public double[] minMaxAvg(int[] myArray) {
		int max = myArray[0], min = myArray[0], sum = 0;
		double avg = 0;
		for (int i = 0; i < myArray.length; i++) {
			if (max < myArray[i])
				max = myArray[i];
			if (min > myArray[i])
				min = myArray[i];
			sum += myArray[i];
		}
		avg = (double) sum / myArray.length;
		return new double[] { max, min, avg };

	}

	public int[] cambioArreglo(int[] myArray) {
		for (int i = 0; i < myArray.length - 1; i++) {
			myArray[i] = myArray[i + 1];
		}
		myArray[myArray.length - 1] = 0;
		return myArray;
	}

}
