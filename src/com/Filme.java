package com;

public class Filme {

	public static final int INFANTIL = 2;
	public static final int NORMAL = 0;
	public static final int LANCAMENTO = 1;
	private String titulo;
	private Preco preco;

	public Filme(String titulo, int codigoPreco) {
		this.titulo = titulo;
		gravarCodigoPreco(codigoPreco);
	}

	public int lerCodigoPreco() {
		return preco.lerCodigoPreco();
	}

	public void gravarCodigoPreco(int arg) {
		switch (arg) {
		case NORMAL:
			preco = new PrecoNormal();
			break;
		case INFANTIL:
			preco = new PrecoInfantil();
			break;
		case LANCAMENTO:
			preco = new PrecoLancamento();
			break;
		default:
			throw new IllegalArgumentException("Código de Preço Incorreto");
		}
	}

	public String lerTitulo() {
		return this.titulo;
	}

	public double custoLocacao(int diasAlugados) {
		return preco.custoLocacao(diasAlugados);
	}
	
	public int lerPontosLocadorFrequente (int diasAlugados) {
		return preco.lerPontosLocadorFrequente (diasAlugados);
		}
}
