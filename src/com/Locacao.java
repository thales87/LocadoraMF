package com;

public class Locacao {
	private Filme _filme;
	private int _diasAlugados;

	public Locacao (Filme filme, int diasAlugados) {
	_filme = filme;
	_diasAlugados = diasAlugados;
	}

	public int lerDiasAlugados() {
		return _diasAlugados;
	}

	public Filme lerFilme() {
		return _filme;
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
