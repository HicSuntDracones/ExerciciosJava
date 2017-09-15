package br.com.db1.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.ExerciciosString;

public class ExerciciosStringTest {

	ExerciciosString exerciciosString = new ExerciciosString();

	@Test
	public void exercicio1Test() {
		Assert.assertEquals("ANDR�", exerciciosString.paraCaixaAlta("andr�"));
	}

	@Test
	public void exercicio2Test() {
		Assert.assertEquals("andr�", exerciciosString.paraMinusculo("ANDR�"));
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
		Assert.assertEquals("Andr", exerciciosString.quatroCaracteres("Andr� Galdino Cardin Teixeira de Carvalho"));
	}

	@Test
	public void exercicio7Test() {
		Assert.assertEquals("dr� Galdino Cardin Teixeira de Carvalho",
				exerciciosString.aPartirDeTres("Andr� Galdino Cardin Teixeira de Carvalho"));
	}

	@Test
	public void exercicio8Test() {
		Assert.assertEquals("alho",
				exerciciosString.ultimosQuatroCaracteres("Andr� Galdino Cardin Teixeira de Carvalho"));
	}

	@Test
	public void exercicio9Test() {
		Assert.assertEquals("ALUNO/ALUNA Galdino Cardin Teixeira de Carvalho",
				exerciciosString.primeiroNomeAluno("Andr� Galdino Cardin Teixeira de Carvalho"));
	}

	@Test
	public void exercicio10Test() {
		Assert.assertEquals("banana", exerciciosString.quebraTexto("banana, ma��, melancia")[0]);
		Assert.assertEquals(" ma��", exerciciosString.quebraTexto("banana, ma��, melancia")[1]);
		Assert.assertEquals(" melancia", exerciciosString.quebraTexto("banana, ma��, melancia")[2]);
	}

	@Test
	public void exercicio10TestVersao2() {
		String[] frutas = exerciciosString.quebraTexto("banana, ma��, melancia");
		Assert.assertEquals("banana", frutas[0]);
		Assert.assertEquals(" ma��", frutas[1]);
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
