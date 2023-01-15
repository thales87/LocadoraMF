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
	
	public int lerPontosLocadorFrequente() {
		return filme.lerPontosLocadorFrequente(diasAlugados);
	}
	
	public double calculaPreco() {
		return filme.custoLocacao(diasAlugados);
	}
	
}
