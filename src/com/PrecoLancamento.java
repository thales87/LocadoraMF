package com;

public class PrecoLancamento extends Preco {

	@Override
	public int lerCodigoPreco() {
		return Filme.LANCAMENTO;
	}

	public double custoLocacao(int diasAlugado) {
		return diasAlugado * 3;
	}

	public int lerPontosLocadorFrequente(int diasAlugados) {
		return (diasAlugados > 1)? 2:1;
	}
	
}
