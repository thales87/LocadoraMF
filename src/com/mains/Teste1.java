package com.mains;

import com.Cliente;
import com.Filme;
import com.Locacao;

public class Teste1 {

	public static void main(String[] args) {
		Filme oSenhorDoAnel2 = new Filme("O Senhor dos Aneis: As Duas Torres", 0);
		Filme oSenhorDoAnel3 = new Filme("O Senhor dos Aneis: O Retorno do Rei", 1);
		Filme frozen = new Filme("Frozen: Só o Branco", 2);
		
		Locacao primeiraLocacaoCliente1 = new Locacao(frozen, 2);
		Locacao segundaLocacaoCliente1 = new Locacao(oSenhorDoAnel3, 2);
		Locacao terceiraLocacaoCliente1 = new Locacao(oSenhorDoAnel2, 2);
		
		Cliente cliente1 = new Cliente("Astolfo");
		
		cliente1.adicionarLocacao(primeiraLocacaoCliente1);
		cliente1.adicionarLocacao(segundaLocacaoCliente1);
		cliente1.adicionarLocacao(terceiraLocacaoCliente1);
		
		System.out.println(cliente1.conta());
	}
	
}
