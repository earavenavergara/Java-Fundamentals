package mapas;

import java.util.HashMap;
import java.util.Set;

public class MapaHashmatique {

	public static void main(String[] args) {
		HashMap<String, String> trackList = new HashMap<String, String>();
		trackList.put("ENTRE DOS TIERRAS",
				"Te puedes vender Cualquier oferta es buena si quieres poder Qu� f�cil es Abrir tanto la boca para opinar Y si te piensas echar atr�s Tienes muchas huellas que borrar");
		trackList.put("LA HERIDA",
				"Siempre es la misma funci�n El mismo espectador El mismo teatro En el que tantas veces actu�");
		trackList.put("MALDITO DUENDE", "He o�do que la noche Es toda magia Y que un duende te invita a so�ar");
		trackList.put("LA SIRENA VARADA",
				"Y me he enredado siempre entre algas Mara�a contra los dedos Cierras la madeja Con el fastidio del destino");
		String letra = trackList.get("LA HERIDA");
		System.out.println("Letra: " + letra);
		Set<String> keys = trackList.keySet();
		System.out.println("Lista completa");
		for (String key : keys) {
			System.out.println(key + ": " + trackList.get(key));
		}

	}

}
