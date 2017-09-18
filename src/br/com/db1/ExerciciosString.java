package br.com.db1;

public class ExerciciosString {

	public String paraCaixaAlta(String string) {
		return string.toUpperCase();
	}

	public String paraMinusculo(String string) {
		return string.toLowerCase();
	}

	public Integer contarCaracteres(String string) {
		if (string == null) {
			return 0;
		}
		return string.length();
	}

	public String limparEspacos(String string) {
		return string.trim();
	}

	public String quatroCaracteres(String string) {
		return string.substring(0, 4);
	}

	public String aPartirDeTres(String string) {
		return string.substring(2);
	}

	public String ultimosQuatroCaracteres(String string) {
		return string.substring(string.length() - 4);
	}

	public String primeiroNomeAluno(String string) {
		String aluno = null;
		if (string.contains(" ")) {
			aluno = string.substring(0, string.indexOf(" "));
		} else {
			aluno = string;
		}
		return string.replace(aluno, "ALUNO/ALUNA");
	}

	public String[] quebraTexto(String string) {
		return string.split(",");
	}

	public Integer contarVogais(String string) {
		Integer contadorPosicoes = 0;
		Integer contadorVogais = 0;
		while (contadorPosicoes < string.length()) {

			if ("a".equals(string.substring(contadorPosicoes, contadorPosicoes + 1))
					|| "e".equals(string.substring(contadorPosicoes, contadorPosicoes + 1))
					|| "i".equals(string.substring(contadorPosicoes, contadorPosicoes + 1))
					|| "o".equals(string.substring(contadorPosicoes, contadorPosicoes + 1))
					|| "u".equals(string.substring(contadorPosicoes, contadorPosicoes + 1))

			) {
				contadorVogais++;
			}

			contadorPosicoes++;
		}
		return contadorVogais;
	}

	public String inverterString(String string) {
		return new StringBuffer(string).reverse().toString();
	}
}
