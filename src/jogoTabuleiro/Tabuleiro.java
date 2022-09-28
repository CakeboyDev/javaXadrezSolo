package jogoTabuleiro;

public abstract class Tabuleiro {
	public int linhas;
	public int colunas;
	public Pecas[][] peca;
	
	public Tabuleiro(int lin, int col) {
		this.linhas=lin;
		this.colunas=col;
		this.peca= new Pecas[lin][col]; 
	}
	
	public Pecas getPeca(Posicao pos) {
		return peca[pos.lin][pos.col];
	}
	
	public void adicionarPeca(Pecas peca, Posicao pos) {
		this.peca[pos.lin][pos.col]=peca;
	}
	public void removerPeca(Posicao pos) {
		this.peca[pos.lin][pos.col]=null;
	}
	

}
