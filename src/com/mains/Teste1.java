package com.mains;

import com.Cliente;
import com.Filme;
import com.Locacao;

public class Teste1 {

	public static void main(String[] args) {
		Filme oSenhorDoAnel = new Filme("O Senhor dos Aneis: A Sociedade do Anel",0);
		Filme oSenhorDoAnel2 = new Filme("O Senhor dos Aneis: As Duas Torres", 0);
		Filme oSenhorDoAnel3 = new Filme("O Senhor dos Aneis: O Retorno do Rei", 1);
		Filme frozen = new Filme("Frozen: Só o Branco", 2);
		
		Locacao primeiraLocacaoCliente1 = new Locacao(frozen, 2);
		Locacao segundaLocacaoCliente1 = new Locacao(oSenhorDoAnel3, 1);
		
		Cliente cliente1 = new Cliente("Astolfo");
		
		cliente1.adicionarLocação(primeiraLocacaoCliente1);
		cliente1.adicionarLocação(segundaLocacaoCliente1);
		
		System.out.println(cliente1.conta());
	}
	
}
