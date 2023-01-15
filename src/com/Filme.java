package com;

public class Filme {

	public static final int INFANTIL = 2;
	public static final int NORMAL = 0;
	public static final int LANCAMENTO_NOVO = 1;
	private String _titulo;
	private int _codigoPreco;

	public Filme(String titulo, int codigoPreco) {
		_titulo = titulo;
		_codigoPreco = codigoPreco;
	}

	public int lerCodigoPreco() {
		return _codigoPreco;
	}

	public void gravarCodigoPreco(int arg) {
		_codigoPreco = arg;
	}

	public String lerTitulo() {
		return _titulo;
	}

}
