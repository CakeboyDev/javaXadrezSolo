package jogoXadrez;

import jogoTabuleiro.Posicao;
import jogoTabuleiro.Tabuleiro;

public class PosicaoXadrez {

	int linhas;
	int colunas;
	
	public PosicaoXadrez() {}
	public PosicaoXadrez(int lin, int col) {
		this.linhas=lin;
		this.colunas=col;
	}
	
	public Posicao criarPozi(Tabuleiro parxad, String posi){
		
		String[] pss=posi.split("");
		String ps1=pss[0];
		String ps2=pss[1];
		String xiss = ps1;
		char xis=ps1.charAt(0);
		char yisz=ps2.charAt(0);
		int yis=yisz;
		int xs = 0;
		int ys=yis-48;
		switch(xis) {
			case 'a':xs=0;break;
			case 'b':xs=1;break;
			case 'c':xs=2;break;
			case 'd':xs=3;break;
			case 'e':xs=4;break;
			case 'f':xs=5;break;
			case 'g':xs=6;break;
			case 'h':xs=7;break;
		}
		Posicao popo=new Posicao(parxad, 8-ys,xs);
			return popo;
		}
	}
