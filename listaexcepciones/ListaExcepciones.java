package listaexcepciones;

import java.util.ArrayList;

public class ListaExcepciones {

	public static void main(String[] args) {
		ArrayList<Object> myList = new ArrayList<Object>();
		myList.add("13");
		myList.add("Hola Mundo");
		myList.add(48);
		myList.add("Adios Mundo");
		for (int i = 0; i < myList.size(); i++) {
			try {
				int castedValue = Integer.parseInt(myList.get(i).toString());
				System.out.println(castedValue);
			} catch (Exception e) {
				System.out.println(e.getMessage()+", myList.get("+i+") = "+myList.get(i));
			}
		}

	}

}
