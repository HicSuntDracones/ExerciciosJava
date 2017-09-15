package br.com.db1.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.ExerciciosInteger;

public class ExerciciosIntegerTest {

	ExerciciosInteger exerciciosInteger = new ExerciciosInteger();

	@Test
	public void exercicio1Test() {
		Assert.assertTrue(30 == exerciciosInteger.somar(10, 20));
	}

	@Test
	public void exercicio2Test() {
		Assert.assertTrue(-10 == exerciciosInteger.subtrair(15, 25));
	}

	@Test
	public void exercicio3Test() {
		Assert.assertTrue(9 == exerciciosInteger.multiplicar(3, 3));
	}

	@Test
	public void exercicio4Test() {
		Assert.assertTrue(4 == exerciciosInteger.dividir(8, 2));
	}

	@Test
	public void exercicio5Test() {
		Assert.assertTrue(exerciciosInteger.verificarSePar(22));
	}

	@Test
	public void exercicio6Test() {
		Assert.assertTrue(555 == exerciciosInteger.verificarQualMaior(17, 555));
	}

	@Test
	public void exercicio7Test() {
		Integer[] impares = exerciciosInteger.imparesAteCem(3);
		Assert.assertTrue(impares[0] == 3);
		Assert.assertTrue(impares[1] == 5);
		Assert.assertTrue(impares[2] == 7);
	}
}
