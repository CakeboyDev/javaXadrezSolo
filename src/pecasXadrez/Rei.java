package pecasXadrez;

import jogoTabuleiro.Pecas;
import jogoTabuleiro.Tabuleiro;
import jogoXadrez.CORI;

public class Rei extends Pecas{
	public Rei(Tabuleiro tabulas, CORI cor, String nomi) {
		super(tabulas, cor, nomi);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "R";
	}

}
