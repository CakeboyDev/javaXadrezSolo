package aplicativo;

public class UI {

	
	public static void printPeca() {
		for(int i=0;i<Programa.parxad.linhas;i++) {
			System.out.print(8-i+" ");
			for(int j=0;j<Programa.parxad.colunas;j++) {
				if(Programa.parxad.peca[i][j]!=null) {
					System.out.print(Programa.parxad.peca[i][j]);
				}else {
					System.out.print("-");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("  A B C D E F G H");
	}
}
