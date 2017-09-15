package br.com.db1.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.ExerciciosString;

public class ExerciciosStringTest {

	ExerciciosString exerciciosString = new ExerciciosString();

	@Test
	public void exercicio1Test() {
		Assert.assertEquals("ANDRÉ", exerciciosString.paraCaixaAlta("andré"));
	}

	@Test
	public void exercicio2Test() {
		Assert.assertEquals("andré", exerciciosString.paraMinusculo("ANDRÉ"));
	}

	@Test
	public void exercicio3Test() {
		Assert.assertTrue(8 == exerciciosString.contarCaracteres("DB1START"));
		Assert.assertTrue(0 == exerciciosString.contarCaracteres(null));
	}

	@Test
	public void exercicio4Test() {
		Assert.assertTrue(10 == exerciciosString.contarCaracteres(" DB1START "));
		Assert.assertTrue(0 == exerciciosString.contarCaracteres(null));
	}

	@Test
	public void exercicio5Test() {
		Assert.assertEquals("DB1START", exerciciosString.limparEspacos(" DB1START "));
	}

	@Test
	public void exercicio6Test() {
		Assert.assertEquals("Andr", exerciciosString.quatroCaracteres("André Galdino Cardin Teixeira de Carvalho"));
	}

	@Test
	public void exercicio7Test() {
		Assert.assertEquals("dré Galdino Cardin Teixeira de Carvalho",
				exerciciosString.aPartirDeTres("André Galdino Cardin Teixeira de Carvalho"));
	}

	@Test
	public void exercicio8Test() {
		Assert.assertEquals("alho",
				exerciciosString.ultimosQuatroCaracteres("André Galdino Cardin Teixeira de Carvalho"));
	}

	@Test
	public void exercicio9Test() {
		Assert.assertEquals("ALUNO/ALUNA Galdino Cardin Teixeira de Carvalho",
				exerciciosString.primeiroNomeAluno("André Galdino Cardin Teixeira de Carvalho"));
	}

	@Test
	public void exercicio10Test() {
		Assert.assertEquals("banana", exerciciosString.quebraTexto("banana, maçã, melancia")[0]);
		Assert.assertEquals(" maçã", exerciciosString.quebraTexto("banana, maçã, melancia")[1]);
		Assert.assertEquals(" melancia", exerciciosString.quebraTexto("banana, maçã, melancia")[2]);
	}

	@Test
	public void exercicio10TestVersao2() {
		String[] frutas = exerciciosString.quebraTexto("banana, maçã, melancia");
		Assert.assertEquals("banana", frutas[0]);
		Assert.assertEquals(" maçã", frutas[1]);
		Assert.assertEquals(" melancia", frutas[2]);

	}

	@Test
	public void exercicio11Test() {
		Assert.assertTrue(8 == exerciciosString.contarVogais("Beba mais coca-cola."));
	}
	@Test
	public void exercicio12Test() {
		Assert.assertEquals(".azzip siam amoC" , exerciciosString.inverterString("Coma mais pizza."));
	}

}
