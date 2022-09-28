package jogoTabuleiro;

import jogoXadrez.Excecoes;

public class Posicao {
	public int lin;
	public int col;
	
	public Posicao(Tabuleiro tab, int lin, int col) {
	if(lin>tab.linhas||lin<0||col>tab.colunas||col<0) {
		throw new Excecoes("Posição inválida! Digite uma posição de a1 até h8.");
	}else{	this.lin=lin;
		this.col=col;
	}
	}
}
