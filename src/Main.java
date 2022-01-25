import java.util.Scanner;

public class Main
{
	public static char menuExibir(Scanner input)
	{
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
	
	public static char menuTemas(Scanner input)
	{
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
	
	public static char menuPalavras(Scanner input)
	{
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
	
	public static void iniciarTemas(String[][] dadosJogo)
	{
		
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
			dadosJogo[2][7] = "INDIA";
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
			dadosJogo[4][1] = "ACEROLA";
			dadosJogo[4][2] = "ABACAXI";
			dadosJogo[4][3] = "BANANA";
			dadosJogo[4][4] = "CAJU";
			dadosJogo[4][5] = "DAMASCO";
			dadosJogo[4][6] = "GOIABA";
			dadosJogo[4][7] = "GRAVIOLA";
			dadosJogo[4][8] = "LIMAO";
			dadosJogo[4][9] = "MORANGO";
			dadosJogo[4][10] = "TOMATE";
		
	}
	
	public static boolean existirEspacoTemas( String[][] dadosJogo )
	{
		for ( int i = 0; i < 50; i++ )
		{
			if ( dadosJogo[i][0] == null )
				return true;
		}
	 return false;
	}
	
	public static boolean existirTema( String insertTema, String[][] dadosJogo )
	{
		for (int i = 0; i < 50; i++)
		{
			if ( dadosJogo[i][0].compareTo(insertTema) == 0 )
				return true;
		}
	 return false;
	}

	public static void cadastrarTema( String dadosJogo[][] )
	{
		if ( existirEspacoTemas(dadosJogo) )
		{
			Scanner input = new Scanner(System.in);
			
			System.out.printf("Insira o nome do tema a se cadastrar:\n	");
			
			String insertTema = input.nextLine();
				insertTema = insertTema.toUpperCase();
			
			if ( existirTema(insertTema, dadosJogo) )
			{
				System.out.println("	ERRO! O tema inserido ja existe.");
				System.out.println("	Tente cadastrar um tema diferente.");
			}
			else
			{
				System.out.println("1");
				for ( int i = 0; i < 50; i++ )
				{
					if ( dadosJogo[i][0] == null )
					{
						dadosJogo[i][0] = insertTema;
						break;
					}
					
				}
			}
			input.close();
		}
		else
		{
			System.out.println("	ERRO! Sao suportados apenas 50 temas.");
			System.out.println("	Exclua temas para cadastrar novos.");
		}

	}
	
	public static void excluirTema( String[][] dadosJogo, Scanner input )
	{
		String insertTema;
		
		System.out.print("Qual tema deseja excluir? ");
			insertTema = input.nextLine();
			insertTema = insertTema.toUpperCase();
			
		if ( existirTema(insertTema, dadosJogo) )
		{
			for (int i = 0; i < 50; i++)
			{
				if ( dadosJogo[i][0] == insertTema )
					dadosJogo[i][0] = null;
			}
			System.out.println("Tema excluido com sucesso!");
		}
		else
		{
			System.out.println("ERRO! O tema inserido nao foi encontrado.");
		}
	}
	
	public static int quantidadePalavras( String[][] dadosJogo, String insertTema ) {
		
		int i, qtd = 0, posicaoTema;
		
		for ( i = 0; i < 50; i++)
		{
			if ( dadosJogo[i][0] == insertTema )
				break;
		}
		
		posicaoTema = i;
		
		for ( i = 1; i < 51; i++ )
		{
			if ( dadosJogo[posicaoTema][i] != null )
			{
				qtd++;
			}
		}
	 return qtd;
	}
	
	public static void buscarTema( String[][] dadosJogo, Scanner input )
	{
		String insertTema;
		
		System.out.print("Qual tema deseja buscar? ");
		insertTema = input.nextLine();
		insertTema = insertTema.toUpperCase();
		
		if ( existirTema(insertTema, dadosJogo) )
		{
			System.out.printf("O tema \"" + insertTema + "\" existe e possui " + quantidadePalavras(dadosJogo, insertTema) + " palavras.\n");
		}
		else
		{
			System.out.println("O tema buscado não foi encontrado.");
		}
	}
	
	public static boolean existirEspacoPalavra( String[][] dadosJogo, char temaEscolhido )
	{
		int tema = temaEscolhido - '0';
		
		for ( int i = 1; i < 51; i++)
		{
			if ( dadosJogo[tema][i] == null )
				return true;
		}
	 return false;
	}
	
	public static boolean existirPalavra( String insertPalavra, String[][] dadosJogo, char temaEscolhido )
	{
		int tema = temaEscolhido - '0';
		
		for ( int i = 1; i < 51; i++)
		{
			if ( dadosJogo[tema][i] == insertPalavra )
				return true;
		}
	 return false;
	}
	
	public static void cadastrarPalavra( String[][] dadosJogo, Scanner input )
	{
		/*
		String temaEscolhido;
		do
		{
			System.out.println("Em qual tema deseja cadastrar a palavra?");
			temaEscolhido = input.nextLine();
			
		} while(  ); */
	}
	
	public static void escolherTema()
	{
		
	}
	
	public static void jogar()
	{
		
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		boolean repeat;
		char opcao;
		
		String[][] dadosJogo = new String[50][51];
		
			iniciarTemas(dadosJogo);
		
		do
		{
			
			do
			{
				repeat = false;
				opcao = menuExibir(input);
				
				if ( opcao < '1' || opcao > '3')
				{
					repeat = true;
					System.out.printf("\n	Insira uma opção válida!\n");
				}
				
			} while ( repeat == true );
			
			switch ( opcao )
			{
				case '1': {
					
					do {
						repeat = false;
						
						switch ( menuTemas(input) )
						{
							case '1':
								cadastrarTema(dadosJogo);
								break;
							case '2':
								excluirTema(dadosJogo, input);
								break;
							case '3':
								buscarTema(dadosJogo, input);
								break;
							case '4':
								repeat = true;
								break;
							default:
								System.out.println("ERRO! Opcao invalida.");
								repeat = true;
						}
					} while ( repeat );
					
					break;
				}
				case '2': {
					menuPalavras(input);
					break;
				}
				case '3': {
					jogar();
					break;
				}
			}
			
		} while ( repeat == true );
			
		
		input.close();
	}

}

// toUpperCase()
