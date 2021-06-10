package rompecabezas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {

	public ArrayList<Integer> mayoresQue(int[] myArray) {
		ArrayList<Integer> mayor = new ArrayList<Integer>();
		int sum = 0;
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] > 10)
				mayor.add(myArray[i]);
			sum += myArray[i];
		}
		System.out.println(sum);
		return mayor;
	}

	public ArrayList<String> largoNombre(String[] nombres) {
		ArrayList<String> myArray = new ArrayList<String>(Arrays.asList(nombres));
		System.out.println(myArray);
		Collections.shuffle(myArray);
		System.out.println(myArray);
		for (int i = 0; i < myArray.size(); i++) {
			if (myArray.get(i).length() < 6)
				myArray.remove(i);
		}
		return myArray;
	}

	public void arregloABC() {
		ArrayList<Character> myArray = new ArrayList<Character>();
		for (int i = 0; i < 26; i++) {
			myArray.add((char) (97 + i));
		}
		System.out.println(myArray);
		Collections.shuffle(myArray);
		System.out.println(myArray);
		System.out.println(myArray.get(myArray.size() - 1));
		if (myArray.get(0) == 'a' || myArray.get(0) == 'e' || myArray.get(0) == 'i' || myArray.get(0) == 'o'
				|| myArray.get(0) == 'u')
			System.out.println("es vocal");
		else
			System.out.println("no es vocal");
	}

	public int[] arregloRand() {
		Random r = new Random();
		int[] myArray;
		myArray = new int[10];
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = r.nextInt(46) + 55;
		}
		return myArray;
	}

	public ArrayList<Integer> burbuja() {
		Random r = new Random();
		ArrayList<Integer> myArray = new ArrayList<Integer>();
		for (int k = 0; k < 10; k++) {
			myArray.add(r.nextInt(46) + 55);
		}
		System.out.println(myArray);
		Collections.sort(myArray);
		System.out.println(myArray);
		System.out.println("min: " + myArray.get(0) + " max: " + myArray.get(myArray.size() - 1));
		return myArray;

	}

	public void crearCadena() {
		Random r = new Random();
		String palabra = new String();
		for (int i = 0; i < 5; i++)
			palabra += (char) (r.nextInt(26) + 'a');
		System.out.println(palabra);
	}

	public void arregloCadena() {
		Random r = new Random();

		ArrayList<String> myArray = new ArrayList<String>();

		for (int k = 0; k < 10; k++) {
			String palabra = new String();
			for (int i = 0; i < 5; i++)
				palabra += (char) (r.nextInt(26) + 'a');
			myArray.add(palabra);
		}
		System.out.println(myArray);
	}

}
