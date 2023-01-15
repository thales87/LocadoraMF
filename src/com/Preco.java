package com;

public abstract class Preco {
	public abstract int lerCodigoPreco();

	public abstract double custoLocacao(int diasAlugados);

	public int lerPontosLocadorFrequente(int diasAlugados) {
		return 1;
	}
}
