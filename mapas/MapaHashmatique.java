package mapas;

import java.util.HashMap;
import java.util.Set;

public class MapaHashmatique {

	public static void main(String[] args) {
		HashMap<String, String> trackList = new HashMap<String, String>();
		trackList.put("ENTRE DOS TIERRAS",
				"Te puedes vender Cualquier oferta es buena si quieres poder Qué fácil es Abrir tanto la boca para opinar Y si te piensas echar atrás Tienes muchas huellas que borrar");
		trackList.put("LA HERIDA",
				"Siempre es la misma función El mismo espectador El mismo teatro En el que tantas veces actuó");
		trackList.put("MALDITO DUENDE", "He oído que la noche Es toda magia Y que un duende te invita a soñar");
		trackList.put("LA SIRENA VARADA",
				"Y me he enredado siempre entre algas Maraña contra los dedos Cierras la madeja Con el fastidio del destino");
		String letra = trackList.get("LA HERIDA");
		System.out.println("Letra: " + letra);
		Set<String> keys = trackList.keySet();
		System.out.println("Lista completa");
		for (String key : keys) {
			System.out.println(key + ": " + trackList.get(key));
		}

	}

}
