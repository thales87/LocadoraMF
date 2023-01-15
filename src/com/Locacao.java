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
}
