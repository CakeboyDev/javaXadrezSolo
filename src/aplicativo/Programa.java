package aplicativo;

import java.util.Scanner;

import jogoTabuleiro.Pecas;
import jogoTabuleiro.Posicao;
import jogoXadrez.CORI;
import jogoXadrez.Excecoes;
import jogoXadrez.PartidaXadrez;
import jogoXadrez.PosicaoXadrez;
import pecasXadrez.Peao;

public class Programa {
	public static PartidaXadrez parxad;
	public static PosicaoXadrez posxad;
	public static Pecas[] controladas=new Pecas[30];
	public static Pecas[] capturadas=new Pecas[30];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		parxad = new PartidaXadrez(8,8);
		posxad= new PosicaoXadrez();
		parxad.posicInicial(parxad);
		int cap=0;
		int turnin=0;
		boolean gameover=false;
		CORI turn=CORI.BRANCO;
		Pecas p= new Peao(parxad, CORI.BRANCO, "Peao");
		capturadas[0]=p;
		while(!gameover) {
			UI.printPeca();
			if(turnin%2==0) {
				System.out.println("Turno: BRANCO");
				turn=CORI.BRANCO;
			}else {
				System.out.println("Turno: PRETO");
				turn=CORI.PRETO;
			}
			System.out.print("Pe�as capturadas: ");
			for(int i=0;i<capturadas.length;i++) {
				if(capturadas[i]!=null&&cap>0) {
					System.out.print(capturadas[i]+" ");
				}
			}
			Posicao po=new Posicao(parxad, 0,0);
			try {
				System.out.println();
				System.out.print("Digite a posi��o da pe�a que deseja mover: ");
				String resp1 = sc.nextLine().toLowerCase();
				po= posxad.criarPozi(parxad, resp1);


				if(parxad.getPeca(po)!=null&&parxad.getPeca(po).cori==turn) {
					controladas[0]=parxad.getPeca(po);
					parxad.removerPeca(po);
					System.out.print("Digite a posi��o para onde deseja mover a pe�a: ");
					String resp2 = sc.nextLine().toLowerCase();
					Posicao po1= posxad.criarPozi(parxad, resp2);
					if(parxad.getPeca(po1)==null) {
						parxad.adicionarPeca(controladas[0], po1);
						turnin++;
					}else if(parxad.getPeca(po1).cori!=controladas[0].cori){
						capturadas[cap]=parxad.getPeca(po1);
						if(parxad.getPeca(po1).nomi.equals("Rei")) {
							System.out.println("O REI FOI CAPTURADO!");
							System.out.println("O LADO "+turn+" VENCE!");
							gameover=true;
						}else {
							parxad.removerPeca(po1);
							parxad.adicionarPeca(controladas[0], po1);
							cap++;
							turnin++;
						}
					}else {
						System.out.println("Posi��o inv�lida!");
						parxad.adicionarPeca(controladas[0], po);
					}
				}else if(parxad.getPeca(po).cori!=turn) {						
					System.out.println("Voc� n�o pode mover esta pe�a pois ela pertence ao advers�rio!");
				}else {
					System.out.println("Posi��o inv�lida!");
				}
				System.out.println();
				}catch(Excecoes e) {
					System.out.println("Posi��o inv�lida! Digite uma posi��o de a1 at� h8.");
				}
			}
		sc.close();
		}
	}
