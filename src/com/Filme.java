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

}
