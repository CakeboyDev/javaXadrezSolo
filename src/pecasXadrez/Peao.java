package pecasXadrez;

import jogoTabuleiro.Pecas;
import jogoTabuleiro.Tabuleiro;
import jogoXadrez.CORI;

public class Peao extends Pecas{
	public Peao(Tabuleiro tabulas, CORI cor, String nomi) {
		super(tabulas, cor, nomi);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "P";
	}

}
