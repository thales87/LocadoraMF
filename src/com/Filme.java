package com;

public class Filme {

	public static final int INFANTIL = 2;
	public static final int NORMAL = 0;
	public static final int LANCAMENTO_NOVO = 1;
	private String titulo;
	private int codigoPreco;

	public Filme(String titulo, int codigoPreco) {
		this.titulo = titulo;
		this.codigoPreco = codigoPreco;
	}

	public int lerCodigoPreco() {
		return this.codigoPreco;
	}

	public void gravarCodigoPreco(int arg) {
		this.codigoPreco = arg;
	}

	public String lerTitulo() {
		return this.titulo;
	}

	public double custoLocacao(int diasAlugados) {
		double custo = 0;

		switch (lerCodigoPreco()) {
		case Filme.NORMAL:
			custo += 2;
			if (diasAlugados > 2)
				custo += (diasAlugados - 2) * 1.5;
			break;
		case Filme.LANCAMENTO_NOVO:
			custo += diasAlugados * 3;
			break;
		case Filme.INFANTIL:
			custo += 1.5;
			if (diasAlugados > 3)
				custo += (diasAlugados - 3) * 1.5;
			break;
		}
		return custo;
	}

	public int lerPontosLocadorFrequente(int diasAlugados) {
		if ((lerCodigoPreco() == Filme.LANCAMENTO_NOVO) && diasAlugados > 1) {
			return 2;
		} else {
			return 1;
		}
	}

}
