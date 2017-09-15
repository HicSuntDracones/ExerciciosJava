package br.com.db1;

public class ExerciciosInteger {

	public Integer somar(Integer valor1, Integer valor2) {
		return valor1 + valor2;
	}

	public Integer subtrair(Integer valor1, Integer valor2) {
		return valor1 - valor2;
	}

	public Integer multiplicar(Integer valor1, Integer valor2) {
		return valor1 * valor2;
	}

	public Integer dividir(Integer valor1, Integer valor2) {
		return valor1 / valor2;
	}

	public Integer verificarQualMaior(Integer valor1, Integer valor2) {
		if ((valor1 > valor2) || (valor1 == valor2)) {
			return valor1;
		} else {
			return valor2;
		}
	}

	public Boolean verificarSePar(Integer valor1) {
		return valor1 % 2 == 0;
	}

	public Boolean verificarSeImpar(Integer valor1) {
		return valor1 % 2 != 0;
	}

	public Integer[] imparesAteCem(Integer valor1) {
		Integer[] impares = new Integer[50];
		Integer contador = 0;
		while (valor1 < 100) {
			if (verificarSeImpar(valor1) == true) {
				impares[contador] = valor1;
				contador++;
			}
			valor1++;
		}
		return impares;
	}
}
