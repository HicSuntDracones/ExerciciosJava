package br.com.db1;

public class ExerciciosDouble {

	public Double puxarMenorValor(Double valor1, Double valor2) {
		return Math.min(valor1, valor2);
	}

	public Double puxarMenorValor2(Double valor1, Double valor2, Double valor3) {
		return Math.min(Math.min(valor1, valor2), valor3);
	}

	public Double calcularMediaDeTresvalores(Double valor1, Double valor2, Double valor3) {
		return ((valor1 + valor2 + valor3) / 3);
	}

	public Double calcularAreaTriangulo(Double alturaTriangulo, Double baseTriangulo) {
		return ((baseTriangulo * alturaTriangulo) / 2);
	}
}
