package br.com.leo.cm1;

import br.com.leo.cm.modelo.Tabuleiro;
import br.com.leo.cm.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {
		
		Tabuleiro  tabuleiro = new Tabuleiro(6,6, 6);
		
		new TabuleiroConsole(tabuleiro);
		
//		tabuleiro.abrir(3, 3);
//		tabuleiro.alternarMarcacao(4, 5);
//		tabuleiro.alternarMarcacao(4, 4);
//		System.out.println(tabuleiro);
	}
}
