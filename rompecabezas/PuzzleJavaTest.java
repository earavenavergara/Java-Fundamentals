package rompecabezas;

public class PuzzleJavaTest {

	public static void main(String[] args) {
		PuzzleJava pj = new PuzzleJava();
		/*
		 * 1. Crear un arreglo con los siguientes valores: 3,5,1,2,7,9,8,13,25,32.
		 * Imprimir la suma de todos los n�meros en el arreglo. El m�todo tambi�n debe
		 * retornar un arreglo que incluya solo los n�meros que son mayores a 10 (Por
		 * ejemplo cuando env�a el arreglo anterior, debe retornar un arreglo con los
		 * valores de 13,25,32).
		 */
		/*
		 * int[] myArray = { 3, 5, 1, 2, 7, 8, 7, 13, 25, 32 };
		 * System.out.println(pj.mayoresQue(myArray));
		 */
		/*
		 * 2. Crear un arreglo con los siguientes valores: Nancy, Jinichi, Fujibayashi,
		 * Momochi, Ishikawa. Mezcle el arreglo e imprima el nombre de cada persona.
		 * Haga que el m�todo tambi�n devuelva un arreglo con los nombres que tienes m�s
		 * de 5 caracteres.
		 */

		// String[] nombres = { "Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"
		// };
		// System.out.println(pj.largoNombre(nombres));

		/*
		 * 3. Crear un arreglo que contiene las 26 letras del alfabeto (este arreglo
		 * debe tener 26 valores). Mezcle el arreglo y, despu�s de mezclarlo, imprima la
		 * �ltima letra del arreglo. Tambi�n debe imprimir la primera letra del arreglo.
		 * Si la primera letra del arreglo es una vocal, haga que muestre un mensaje.
		 */

		// pj.arregloABC();

		/* 4. Generar y devolver un arreglo con 10 n�meros aleatorios entre 55 - 100. */

		// System.out.println(Arrays.toString(pj.arregloRand()));

		/*
		 * 5. Generar y devolver un arreglo con 10 n�meros aleatorios entre 55 - 100 y
		 * hacer que est�n ordenados (mostrar el n�mero m�s peque�o en el principio del
		 * arreglo). Imprimir todos los n�meros del arreglo. Luego, Imprimir el valor
		 * m�nimo del arreglo, as� como el valor m�ximo.
		 */

		// pj.burbuja();

		/* 6. Crear una cadena aleatoria con 5 caracteres de longitud. */

		// pj.crearCadena();

		/*
		 * 7. Generar un arreglo con 10 cadenas aleatorias y cada una con 5 caracteres
		 * de longitud.
		 */

		pj.arregloCadena();

	}

}
