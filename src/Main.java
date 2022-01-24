import java.util.Scanner;

public class Main {

	public static char menuExibir(Scanner input) {
		char opcaoMenu;
		System.out.printf(" Menu\n\n");
		System.out.println("     1 - Gerenciar temas");
		System.out.println("     2 - Gerenciar palavras");
		System.out.println("     3 - Jogar");
		System.out.println("     4 - Sair");
		System.out.printf("\n     Escolha uma opção: ");
			opcaoMenu = input.next().charAt(0);
		System.out.println();
	 return opcaoMenu;
	}
	
	public static char menuTemas(Scanner input) {
		char opcaoMenu;
		System.out.printf(" Gerenciar temas\n\n");
		System.out.println("     1 - Cadastrar");
		System.out.println("     2 - Excluir");
		System.out.println("     3 - Buscar");
		System.out.println("     4 - Voltar");
		System.out.printf("\n     Escolha uma opção: ");
			opcaoMenu = input.next().charAt(0);
		System.out.println();
	 return opcaoMenu;
	}
	
	public static char menuPalavras(Scanner input) {
		char opcaoMenu;
		System.out.printf(" Gerenciar palavras\n\n");
		System.out.println("     1 - Cadastrar");
		System.out.println("     2 - Excluir");
		System.out.println("     3 - Buscar");
		System.out.println("     4 - Listar");
		System.out.println("     5 - Voltar");
		System.out.printf("\n     Escolha uma opção: ");
			opcaoMenu = input.next().charAt(0);
		System.out.println();
	 return opcaoMenu;
	}
	
	public static void iniciarTemas(String[][] dadosJogo){
		
		dadosJogo[0][0] = "OBJETOS";
			dadosJogo[0][1] = "AGULHA";
			dadosJogo[0][2] = "CANUDO";
			dadosJogo[0][3] = "ESMALTE";
			dadosJogo[0][4] = "ESPELHO";
			dadosJogo[0][5] = "QUADRO";
			dadosJogo[0][6] = "SAPATO";
			dadosJogo[0][7] = "SABONETE";
			dadosJogo[0][8] = "TESOURA";
			dadosJogo[0][9] = "TECLADO";
			dadosJogo[0][10] = "VENTILADOR";
			
		dadosJogo[1][0] = "NOMES";
			dadosJogo[1][1] = "AMANDA";
			dadosJogo[1][2] = "BRUNO";
			dadosJogo[1][3] = "CAMILA";
			dadosJogo[1][4] = "DOUGLAS";
			dadosJogo[1][5] = "EMILIA";
			dadosJogo[1][6] = "FERNANDO";
			dadosJogo[1][7] = "HUGO";
			dadosJogo[1][8] = "LUANA";
			dadosJogo[1][9] = "MARIANA";
			dadosJogo[1][10] = "RONALDO";
			
		dadosJogo[2][0] = "PAISES";
			dadosJogo[2][1] = "ARGENTINA";
			dadosJogo[2][2] = "BRASIL";
			dadosJogo[2][3] = "CHILE";
			dadosJogo[2][4] = "ESPANHA";
			dadosJogo[2][5] = "GRECIA";
			dadosJogo[2][6] = "ESPANHA";
			dadosJogo[2][7] = "INDIA"; //ARGENTINA\nBRASIL\nCHILE\nESPANHA\nGRECIA\nINDIA\nJAPAO\nMARROCOS\nPORTUGAL\nRUSSIA\nTUNISIA\n
			dadosJogo[2][8] = "JAPAO";
			dadosJogo[2][9] = "PORTUGAL";
			dadosJogo[2][10] = "RUSSIA";
			
		dadosJogo[3][0] = "ESPORTES";
			dadosJogo[3][1] = "BOXE";
			dadosJogo[3][2] = "BASQUETE";
			dadosJogo[3][3] = "CICLISMO";
			dadosJogo[3][4] = "CANOAGEM";
			dadosJogo[3][5] = "ESGRIMA";
			dadosJogo[3][6] = "FUTEBOL";
			dadosJogo[3][7] = "GINASTICA";
			dadosJogo[3][8] = "HANDEBOL";
			dadosJogo[3][9] = "JUDO";
			dadosJogo[3][10] = "VOLEI";
			
		dadosJogo[4][0] = "FRUTAS";
			dadosJogo[4][1] = "AMANDA";
			dadosJogo[4][2] = "BRUNO";
			dadosJogo[4][3] = "CAMILA";
			dadosJogo[4][4] = "DOUGLAS";
			dadosJogo[4][5] = "EMILIA";
			dadosJogo[4][6] = "FERNANDO";
			dadosJogo[4][7] = "HUGO";
			dadosJogo[4][8] = "";
			dadosJogo[4][9] = "";
			dadosJogo[4][10] = "";
		
		/*
		try {
			
			FileWriter temas = new FileWriter("TEMAS.bin");
				temas.write("OBJETOS\nNOMES\nPAIS\nESPORTE\nFRUTA\n");
			
			FileWriter objetos = new FileWriter("OBJETOS.bin");
				objetos.write("AGULHA\nCANUDO\nESMALTE\nESPELHO\nQUADRO\nSAPATO\nSABONETE\nTESOURA\nTECLADO\nVENTILADOR\n");
			FileWriter nomes = new FileWriter("NOMES.bin");
				nomes.write("AMANDA\nBRUNO\nCAMILA\nDOUGLAS\nEMILIA\nFERNANDO\nHUGO\nLUANA\nMARIANA\nRONALDO\n");
			FileWriter pais = new FileWriter("PAIS.bin");
				pais.write("ARGENTINA\nBRASIL\nCHILE\nESPANHA\nGRECIA\nINDIA\nJAPAO\nMARROCOS\nPORTUGAL\nRUSSIA\nTUNISIA\n");
			FileWriter esporte = new FileWriter("ESPORTE.bin");
				esporte.write("BOXE\nBASQUETE\nCICLISMO\nCANOAGEM\nESGRIMA\nFUTEBOL\nGINASTICA\nHANDEBOL\nJUDO\nVOLEI\n");
			FileWriter fruta = new FileWriter("FRUTA.bin");
				fruta.write("ACEROLA\nABACAXI\nBANANA\nCAJU\nDAMASCO\nGOIABA\nGRAVIOLA\nLIMAO\nMORANGO\n");
			
			System.out.println("Feito!");
			temas.close(); objetos.close(); nomes.close(); pais.close(); esporte.close(); fruta.close();
			return true;
		} catch(Exception ex) {
			System.out.println("Erro! Nao foi possivel iniciar temas");
			return false;
		}
		*/
		
	}
	
	public static boolean verificaTema( String[][] dadosJogo, String insertTema ) {
		
		boolean existe = false;
		
		for (int i = 0; i < 50; i++) {
			
			if ( dadosJogo[i][0] == insertTema ) {
				existe = true;
				break;
			}
			
		}
	 return existe;
	}
	
	public static boolean verificaPalavra() {
		// i do tema
		// j das palavras a partir de 1
	 return true;
	}
	
	public static void escolhaTema() {
		
	}
	
	public static void jogar() {
		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		boolean repeat;
		char opcao;
		
		String[][] dadosJogo = new String[50][50];
		
			iniciarTemas(dadosJogo);
		
		do {
			
			do {
				repeat = false;
				opcao = menuExibir(input);
				
				if ( opcao < '1' || opcao > '3') {
					repeat = true;
					System.out.printf("\n	Insira uma opção válida!\n");
				}
				
			} while ( repeat == true );
			
			switch ( opcao ){
				case 1: {
					menuTemas(input);
					break;
					
				}
				case 2: {
					menuPalavras(input);
					break;
				}
				case 3: {
					jogar();
					break;
				}
			}
			
		} while ( repeat == true );
			
		
		input.close();
	}

}

// toUpperCase()
