package com;

public class Locacao {
	private Filme filme;
	private int diasAlugados;

	public Locacao (Filme filme, int diasAlugados) {
		this.filme = filme;
		this.diasAlugados = diasAlugados;
	}

	public int lerDiasAlugados() {
		return this.diasAlugados;
	}

	public Filme lerFilme() {
		return this.filme;
	}
	
	public double custoLocacao() {
		double custo = 0;

		switch (lerFilme().lerCodigoPreco()) {
		case Filme.NORMAL:
			custo += 2;
			if (lerDiasAlugados() > 2)
				custo += (lerDiasAlugados() - 2) * 1.5;
			break;
		case Filme.LANCAMENTO_NOVO:
			custo += lerDiasAlugados() * 3;
			break;
		case Filme.INFANTIL:
			custo += 1.5;
			if (lerDiasAlugados() > 3)
				custo += (lerDiasAlugados() - 3) * 1.5;
			break;
		}
		return custo;
	}
	
	public int lerPontosLocadorFrequente() {
		if ((lerFilme().lerCodigoPreco() == Filme.LANCAMENTO_NOVO) && lerDiasAlugados() > 1) {
			return 2;
		}else {
			return 1;
		}
			
	}
}
