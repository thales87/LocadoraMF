package com;

public class PrecoInfantil extends Preco {

	@Override
	public int lerCodigoPreco() {
		return Filme.INFANTIL;
	}

	public double custoLocacao(int diasAlugado) {
		double resultado = 1.5;
		if (diasAlugado > 3)
			resultado += (diasAlugado - 3) * 1.5;
		return resultado;
	}

}
