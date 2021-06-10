package stringmanipulator;

public class StringManipulator {

	public String trimAndConcat(String string, String string2) {
		return string.trim().concat(string2.trim());
	}

	public int getIndexOrNull(String string, char letter) {
		return string.indexOf(letter);
	}

	public int getIndexOrNull(String word, String string) {
		return word.indexOf(string);
	}

	public String concatSubstring(String string, int i, int j, String string2) {
		return string.substring(i, j).concat(string2);
	}

}
