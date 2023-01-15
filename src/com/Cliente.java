package com;

import java.util.Enumeration;
import java.util.Vector;

public class Cliente {
	private String _nome;
	private Vector _locacoes = new Vector();

	public Cliente(String nome) {
		_nome = nome;
	}

	public void adicionarLocação(Locacao arg) {
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
			double estaQuantia = 0;
			Locacao cada = (Locacao) locacoes.nextElement();
			// determinar quantias para cada linha
			switch (cada.lerFilme().lerCodigoPreco()) {
			case Filme.NORMAL:
				estaQuantia += 2;
				if (cada.lerDiasAlugados() > 2)
					estaQuantia += (cada.lerDiasAlugados() - 2) * 1.5;
				break;
			case Filme.LANCAMENTO_NOVO:
				estaQuantia += cada.lerDiasAlugados() * 3;
				break;
			case Filme.INFANTIL:
				estaQuantia += 1.5;
				if (cada.lerDiasAlugados() > 3)
					estaQuantia += (cada.lerDiasAlugados() - 3) * 1.5;
				break;
			}
			// adicionar os pontos do locador freqüente
			pontosLocadorFrequente++;
			// adicionar bônus para uma locação de lançamentos por dois dias
			if ((cada.lerFilme().lerCodigoPreco() == Filme.LANCAMENTO_NOVO) && cada.lerDiasAlugados() > 1)
				pontosLocadorFrequente++;
			// mostrar valores para esta locação
			resultado += "\t" + cada.lerFilme().lerTitulo() + "\t" + String.valueOf(estaQuantia) + "\n";
			quantiaTotal += estaQuantia;
		}
		// adicionar linhas de rodapé
		resultado += "O valor devido é " + String.valueOf(quantiaTotal) + "\n";
		resultado += "Você ganhou " + String.valueOf(pontosLocadorFrequente) + " pontos de locador freqüente";
		return resultado;
	}
}
