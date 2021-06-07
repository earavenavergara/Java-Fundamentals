package fizzbuzz;

public class FizzBuzz {
	public String fizzBuzz(int numero) {
		String retorno = "";
		if (numero % 3 == 0 && numero % 5 == 0)
			return ("fizzbuzz");
		else if (numero % 3 == 0)
			return ("fizz");
		else if (numero % 5 == 0)
			return ("buzz");
		else
			retorno += numero;
		return (retorno);
	}
}
