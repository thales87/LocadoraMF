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
		int pontosLocadorFrequente = 0;
		Enumeration locacoes = _locacoes.elements();
		String resultado = "Registro de locação de " + lerNome() + "\n";
		while (locacoes.hasMoreElements()) {
			Locacao cada = (Locacao) locacoes.nextElement();

			pontosLocadorFrequente++;

			if ((cada.lerFilme().lerCodigoPreco() == Filme.LANCAMENTO_NOVO) && cada.lerDiasAlugados() > 1)
				pontosLocadorFrequente++;
			
			resultado += "\t" + cada.lerFilme().lerTitulo() + "\t" + String.valueOf(cada.custoLocacao()) + "\n";
			quantiaTotal += cada.custoLocacao();
		}

		resultado += "O valor devido é " + String.valueOf(quantiaTotal) + "\n";
		resultado += "Você ganhou " + String.valueOf(pontosLocadorFrequente) + " pontos de locador freqüente";
		return resultado;
	}
}
