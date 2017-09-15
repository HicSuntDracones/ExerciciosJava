package br.com.db1.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.ExerciciosDouble;

public class ExerciciosDoubleTest {

	ExerciciosDouble exerciciosDouble = new ExerciciosDouble();

	@Test
	public void exercicio1Test() {
		Assert.assertTrue(8d == exerciciosDouble.puxarMenorValor(8d, 16d));
	}

	@Test
	public void exercicio2Test() {
		Assert.assertTrue(1d == exerciciosDouble.puxarMenorValor2(1d, 2d, 3d));
	}

	@Test
	public void exercicio3Test() {
		Assert.assertTrue(20d == exerciciosDouble.calcularMediaDeTresvalores(15d, 15d, 30d));
	}

	@Test
	public void exercicio4TEst() {
		Assert.assertTrue(4d == exerciciosDouble.calcularAreaTriangulo(2d, 4d));

	}
}
