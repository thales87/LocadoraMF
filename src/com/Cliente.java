package com;

import java.util.Enumeration;
import java.util.Vector;

public class Cliente {
	private String _nome;
	private Vector _locacoes = new Vector();

	public Cliente(String nome) {
		_nome = nome;
	}

	public void adicionarLocacao(Locacao arg) {
		_locacoes.addElement(arg);
	}

	public String lerNome() {
		return _nome;
	}

	public String conta() {
		double quantiaTotal = 0;
		Enumeration locacoes = _locacoes.elements();
		String resultado = "Registro de locação de " + lerNome() + "\n";
		while (locacoes.hasMoreElements()) {
			Locacao cada = (Locacao) locacoes.nextElement();
			resultado += "\t" + cada.lerFilme().lerTitulo() + "\t" + String.valueOf(cada.custoLocacao()) + "\n";
		}

		resultado += "O valor devido é " + String.valueOf(calculaDebito()) + "\n";
		resultado += "Você ganhou " + String.valueOf(calculaPontosLocadorFrequente()) + " pontos de locador freqüente";
		return resultado;
	}

	private double calculaDebito() {
		double resultado = 0;
		Enumeration locacoes = _locacoes.elements();
		while (locacoes.hasMoreElements()) {
			Locacao cada = (Locacao) locacoes.nextElement();
			resultado += cada.custoLocacao();
		}
		return resultado;
	}

	private int calculaPontosLocadorFrequente() {
		int resultado = 0;
		Enumeration locacoes = _locacoes.elements();
		while (locacoes.hasMoreElements()) {
			Locacao cada = (Locacao) locacoes.nextElement();
			resultado += cada.lerPontosLocadorFrequente();
		}
		return resultado;
	}
}
