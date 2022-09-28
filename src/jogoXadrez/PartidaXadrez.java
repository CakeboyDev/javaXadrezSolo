package jogoXadrez;

import jogoTabuleiro.Pecas;
import jogoTabuleiro.Posicao;
import jogoTabuleiro.Tabuleiro;
import pecasXadrez.Peao;
import pecasXadrez.Rei;

public class PartidaXadrez extends Tabuleiro{

	public PartidaXadrez(int lin, int col) {
		super(lin,col);
	}
	
	
	public void posicInicial(Tabuleiro parxad) {
		Pecas p = new Peao(parxad, CORI.BRANCO, "Peao");
		Pecas p1 = new Rei(parxad, CORI.BRANCO, "Rei");
		Pecas p2 = new Peao(parxad, CORI.PRETO, "Peao");
		Pecas p3 = new Rei(parxad, CORI.PRETO, "Rei");
		Posicao poos = new Posicao(parxad, 7,1);
		Posicao poos1 = new Posicao(parxad, 7,4);
		Posicao poos2 = new Posicao(parxad, 0,1);
		Posicao poos3 = new Posicao(parxad, 0,3);
		parxad.adicionarPeca(p, poos);
		parxad.adicionarPeca(p1, poos1);
		parxad.adicionarPeca(p2, poos2);
		parxad.adicionarPeca(p3, poos3);
	}
}
