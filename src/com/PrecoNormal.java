package com;

public class PrecoNormal extends Preco {

	@Override
	public int lerCodigoPreco() {
		return Filme.NORMAL;
	}

	public double custoLocacao(int diasAlugados) {
		double resultado = 2;
		if (diasAlugados > 2)
			resultado += (diasAlugados - 2) * 1.5;
		return resultado;
	}

}
