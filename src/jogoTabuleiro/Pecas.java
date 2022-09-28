package jogoTabuleiro;

import jogoXadrez.CORI;

public abstract class Pecas {
	public String nomi;
	public Posicao pos;
	Tabuleiro tab;
	public CORI cori;
	
	public Pecas(Tabuleiro tabulas, CORI cor, String nom) {
		this.tab=tabulas;
		this.cori=cor;
		this.nomi=nom;
	}
	
	@Override
	public abstract String toString();
	
}
