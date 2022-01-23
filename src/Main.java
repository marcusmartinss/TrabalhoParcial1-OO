import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {

	public static int menuExibir(Scanner input) {
		int opcaoMenu;
		System.out.printf(" Menu\n\n");
		System.out.println("     1 - Gerenciar temas");
		System.out.println("     2 - Gerenciar palavras");
		System.out.println("     3 - Jogar");
		System.out.println("     4 - Sair");
		System.out.printf("\n     Escolha uma opção: ");
			opcaoMenu = input.nextInt();
		System.out.println();
	 return opcaoMenu;
	}
	
	public static int menuTemas(Scanner input) {
		int opcaoMenu;
		System.out.printf(" Gerenciar temas\n\n");
		System.out.println("     1 - Cadastrar");
		System.out.println("     2 - Excluir");
		System.out.println("     3 - Buscar");
		System.out.println("     4 - Voltar");
		System.out.printf("\n     Escolha uma opção: ");
			opcaoMenu = input.nextInt();
		System.out.println();
	 return opcaoMenu;
	}
	
	public static int menuPalavras(Scanner input) {
		int opcaoMenu;
		System.out.printf(" Gerenciar palavras\n\n");
		System.out.println("     1 - Cadastrar");
		System.out.println("     2 - Excluir");
		System.out.println("     3 - Buscar");
		System.out.println("     4 - Listar");
		System.out.println("     5 - Voltar");
		System.out.printf("\n     Escolha uma opção: ");
			opcaoMenu = input.nextInt();
		System.out.println();
	 return opcaoMenu;
	}
	
	public static boolean existemTemas() {
		File arquivo = new File("TEMAS.bin");
		if ( arquivo.length() > 0 )
			return true;
		else
			return false;
	}
	
	public static boolean iniciarTemas(){
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
		
	}
	
	public static boolean verificaTema() {
		
	 return true;
	}
	
	public static boolean verificaPalavra() {
		
	 return true;
	}
	
	public static void escolhaTema() {
		
	}
	
	public static void jogar() {
		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		boolean repeat;
		int opcao;
		
		
		if( existemTemas() == false ) {
			iniciarTemas();
		}
			
		
		do {
			
			do {
				repeat = false;
				opcao = menuExibir(input);
				
				if ( opcao < 1 || opcao > 3) {
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
