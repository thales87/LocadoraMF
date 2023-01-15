package com;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nome;
	private List<Locacao> locacoes = new ArrayList<Locacao>();

	public Cliente(String nome) {
		this.nome = nome;
	}

	public void adicionarLocacao(Locacao arg) {
		this.locacoes.add(arg);
	}

	public String lerNome() {
		return this.nome;
	}

	public String conta() {
		String resultado = "Registro de locação de " + lerNome() + "\n";
		for (Locacao locacao : locacoes) {
			resultado += "\t" + locacao.lerFilme().lerTitulo() + "\t" + String.valueOf(locacao.custoLocacao()) + "\n";
		}

		resultado += "O valor devido é " + String.valueOf(calculaDebito()) + "\n";
		resultado += "Você ganhou " + String.valueOf(calculaPontosLocadorFrequente()) + " pontos de locador freqüente";
		return resultado;
	}

	private double calculaDebito() {
		double resultado = 0;
		for (Locacao locacao : locacoes) {
			resultado += locacao.custoLocacao();
		}
		return resultado;
	}

	private int calculaPontosLocadorFrequente() {
		int resultado = 0;
		
		for (Locacao locacao : locacoes) {
			resultado += locacao.lerPontosLocadorFrequente();
		}
		return resultado;
	}
}
