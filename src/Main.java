import java.util.Random;
import java.util.Scanner;

public class Main
{
	public static Scanner input = new Scanner(System.in);
	public static String[][] dadosJogo = new String[50][51];
	public static String insertTema;
	public static String insertPalavra;
	
	public static void limparTela() {
		for (int i = 0; i < 30; i++) {
			System.out.printf("\n");
		}
	}
	
	public static char menuExibir()
	{
		char escolha;
		
		System.out.printf(" Menu\n\n");
		System.out.println("     1 - Gerenciar temas");
		System.out.println("     2 - Gerenciar palavras");
		System.out.println("     3 - Jogar");
		System.out.println("     4 - Sair");
		System.out.printf("\n     Escolha uma opcao: ");
			escolha = input.next().charAt(0);
		System.out.printf("\n");
	 
	 return escolha;
	}
	
	public static char menuTemas()
	{
		char opcaoMenu;
		
		System.out.printf(" Gerenciar temas\n\n");
		System.out.println("     1 - Cadastrar");
		System.out.println("     2 - Excluir");
		System.out.println("     3 - Buscar");
		System.out.println("     4 - Voltar");
		System.out.printf("\n     Escolha uma opcao: ");
			opcaoMenu = input.next().charAt(0);
		System.out.println();
	 return opcaoMenu;
	}
	
	public static char menuPalavras()
	{
		char opcaoMenu;
		System.out.printf(" Gerenciar palavras\n\n");
		System.out.println("     1 - Cadastrar");
		System.out.println("     2 - Excluir");
		System.out.println("     3 - Buscar");
		System.out.println("     4 - Listar");
		System.out.println("     5 - Voltar");
		System.out.printf("\n     Escolha uma opcao: ");
			opcaoMenu = input.next().charAt(0);
		System.out.println();
	 return opcaoMenu;
	}
	
	public static void iniciarTemas()
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
	
	public static boolean existirEspacoTemas()
	{
		for ( int i = 0; i < 50; i++ )
		{
			if ( dadosJogo[i][0] == null )
				return true;
		}
	 return false;
	}
	
	public static boolean existirTema(String insertTema)
	{
		for (int i = 0; i < 50; i++)
		{
			if ( dadosJogo[i][0] != null )
			{
				if ( dadosJogo[i][0].equals(insertTema) )
					return true;
			}
		}
	 return false;
	}

	public static void cadastrarTema()
	{
		if ( existirEspacoTemas() )
		{
			limparTela();
			System.out.println(" Cadastrar tema");
			System.out.printf("     Insira o nome do tema a se cadastrar: ");
			
			insertTema = input.next();
			insertTema = insertTema.toUpperCase();
			System.out.println();
			
			if ( !existirTema(insertTema) )
			{
				for ( int i = 0; i < 50; i++ )
				{
					if ( dadosJogo[i][0] == null )
					{
						dadosJogo[i][0] = insertTema;
						
						limparTela();
						System.out.println("	Tema cadastrado com sucesso!");
						break;
					}
					
				}
			}
			else
			{
				limparTela();
				System.out.println("	ERRO! O tema inserido ja existe.");
				System.out.println("	Tente cadastrar um tema diferente.");
			}
		}
		else
		{
			limparTela();
			System.out.println("	ERRO! Sao suportados apenas 50 temas.");
			System.out.println("	Exclua temas para cadastrar novos no menu \"Gerenciar temas\".");
		}
	}
	
	public static int posicaoTema(String insertTema)
	{
		int i;
		
		for ( i = 0; i < 50; i++ )
		{
			if ( dadosJogo[i][0] != null )
			{
				if ( dadosJogo[i][0].compareTo(insertTema) == 0)
					break;
			}
		}
	 return i;
	}
	
	public static boolean existemPalavrasNoTema() {
		
		for ( int i = 0; i < 51; i++ )
		{
			if ( dadosJogo[posicaoTema(insertTema)][i] != null ) {
				return true;
			}
		}
	 return false;
	}
	
	public static void excluirTema()
	{
		System.out.println(" Excluir tema");
		System.out.printf("     Qual tema deseja excluir? ");
			insertTema = input.next();
			insertTema = insertTema.toUpperCase();
			System.out.println();
			
		if ( existirTema(insertTema) )
		{
			if ( quantidadePalavras(insertTema) > 0 )
			{
				limparTela();
				System.out.printf("	ERRO! O tema inserido possui " + quantidadePalavras(insertTema) + " palavras cadastradas\n");
				System.out.println("	Exclua todas palavras deste tema para exclui-lo no menu \"Gerenciar palavras\".");
			}
			else
			{
				int posTema = posicaoTema(insertTema);
				dadosJogo[posTema][0] = null;
				limparTela();
				System.out.println("	Tema excluido com sucesso!");
			}
		}
		else
		{
			limparTela();
			System.out.printf("	ERRO! O tema inserido nao foi encontrado.\n");
		}
	}
	
	public static int quantidadePalavras(String insertTema) {
		
		int i, qtd = 0;
		
		int posTema = posicaoTema(insertTema);
		
		for ( i = 1; i < 51; i++ )
		{
			if ( dadosJogo[posTema][i] != null )
			{
				qtd++;
			}
		}
	 return qtd;
	}
	
	public static void buscarTema()
	{
		String insertTema;
		
		System.out.println(" Buscar tema");
		System.out.printf("     Qual tema deseja buscar? ");
			insertTema = input.next();
			insertTema = insertTema.toUpperCase();
		System.out.println();
		
		if ( existirTema(insertTema) )
		{
			limparTela();
			System.out.printf("	O tema \"" + insertTema + "\" existe e possui " + quantidadePalavras(insertTema) + " palavras.\n");
		}
		else
		{
			limparTela();
			System.out.printf("	ERRO! O tema buscado nao foi encontrado.\n");
			System.out.println("	Verifique a ortografia ou cadastre um novo tema no menu \"Gerenciar temas\".");
		}
	}
	
	public static boolean existirEspacoPalavra( int posTema )
	{
		for ( int i = 1; i < 51; i++)
		{
			if ( dadosJogo[posTema][i] == null )
				return true;
		}
	 return false;
	}
	
	public static int posicaoCadastrarPalavra( int posTema )
	{
		int i;
		
		for ( i = 1; i < 51; i++)
		{
			if ( dadosJogo[posTema][i] == null )
				break;
		}
	 return i;
	}
	
	public static boolean existirPalavra( String insertPalavra, int posTema )
	{
		for ( int i = 1; i < 51; i++)
		{
			if ( dadosJogo[posTema][i] != null )
			{
				if ( dadosJogo[posTema][i].compareTo(insertPalavra) == 0 )
					return true;
			}
		}
		
	 return false;
	}
	
	public static void cadastrarPalavra()
	{
		System.out.println(" Cadastrar palavra");
		System.out.printf("     Em qual tema deseja cadastrar a palavra? ");
			insertTema = input.next();
			System.out.println();
			
		if (!existirTema(insertTema))
		{
			int posTema = posicaoTema(insertTema);
			
			if ( !existirEspacoPalavra(posTema) )
			{
				limparTela();
				System.out.println(" Cadastrar palavra");
				System.out.printf("     Qual palavra deseja cadastrar? ");
				insertPalavra = input.next();
				insertPalavra = insertPalavra.toUpperCase();
				System.out.println();
				
				if ( !existirPalavra(insertPalavra, posTema) )
				{
					int posPalavra = posicaoCadastrarPalavra(posTema);
					
					dadosJogo[posTema][posPalavra] = insertPalavra;
					limparTela();
					System.out.println("	Palavra cadastrada com sucesso!");
				}
				else
				{
					limparTela();
					System.out.println("	ERRO! Esta palavra ja esta cadastrada neste tema.");
					System.out.println("	Consulte palavras cadastradas no menu \"Gerenciar palavras\".");
				}
			}
			else
			{
				limparTela();
				System.out.println("	ERRO! Nao existe espaco disponivel neste tema.");
				System.out.println("	Exlcua palavras cadastradas no menu \"Gerenciar palavras\".");
			}
		}
		else
		{
			limparTela();
			System.out.println("	ERRO! O tema nao existe.");
			System.out.println("	Busque temas ou cadastre novos no menu \"Gerenciar temas\".");
		}
	}
	
	public static int posicaoPalavra( int posTema )
	{
		int i;
		
		for (i = 1; i < 51; i++)
		{
			if ( dadosJogo[posTema][i].compareTo(insertPalavra) == 0)
				break;
		}
	 return i;
	}
	
	public static void excluirPalavra()
	{
		System.out.println(" Excluir palavra");
		System.out.printf("     Em qual tema deseja excluir a palavra? ");
			insertTema = input.next();
			insertTema = insertTema.toUpperCase();
		System.out.println();
		
		if (existirTema(insertTema))
		{
			int posTema = posicaoTema(insertTema);
			limparTela();
			System.out.println(" Excluir palavra");
			System.out.printf("     Qual palavra deseja excluir? ");
			insertPalavra = input.next();
			insertPalavra = insertPalavra.toUpperCase();
			System.out.println();
			
			if ( existirPalavra(insertPalavra, posTema) )
			{
				int posPalavra = posicaoPalavra(posTema);
				
				dadosJogo[posTema][posPalavra] = null;
				limparTela();
				System.out.println("	Palavra excluida com sucesso!");
			}
			else
			{
				limparTela();
				System.out.println("	ERRO! A palavra inserida nao esta cadastrada.");
				System.out.println("	Cadastre novas palavras no menu \"Gerenciar palavras\".");
			}
		}
		else
		{
			limparTela();
			System.out.println("	ERRO! O tema nao existe.");
			System.out.println("	Busque temas ou cadastre novos no menu \"Gerenciar temas\".");
		}
	}
	
	public static void buscarPalavra() {
		System.out.println(" Buscar palavra");
		System.out.printf("     Qual palavra deseja pesquisar? ");
			insertPalavra = input.next();
			insertPalavra = insertPalavra.toUpperCase();
		System.out.println();
		
		boolean buscarExistePalavra = false;
		int i, j = 1;
		
		for (i = 0; i < 50; i++)
		{
			for (j = 1; j < 51; j++)
			{
				if ( dadosJogo[i][j] != null && dadosJogo[i][j].compareTo(insertPalavra) == 0 )
				{
					buscarExistePalavra = true;
					break;
				}
			}
			if ( buscarExistePalavra )
				break;
		}
		
		if ( buscarExistePalavra )
		{
			limparTela();
			System.out.printf("	Palavra encontrada no tema " + dadosJogo[i][0] + ".\n");
		}
		else
		{
			limparTela();
			System.out.println("	ERRO! Palavra nao encontrada.");
			System.out.println("	Liste as palavras cadastradas em um tema no menu \"Gerenciar palavras\".");
		}
	}
	
	public static void listarPalavras()
	{
		System.out.println(" Listar palavras");
		System.out.printf("     Deseja listar as palavras cadastradas em qual tema? ");
			insertTema = input.next();
			insertTema = insertTema.toUpperCase();
		System.out.println();
		
		if ( existirTema(insertTema) )
		{
			int i, posTema = posicaoTema(insertTema);
			System.out.println(" Listar palavras");
			System.out.printf("        Estas sao as palavras contidas no tema:\n\n");
			for (i = 1; i < 51; i++)
			{
				if ( dadosJogo[posTema][i] != null )
				{
					System.out.println("          - " + dadosJogo[posTema][i]);
				}
			}
			System.out.println();
		}
		else
		{
			System.out.println("	ERRO! O tema nao existe.");
			System.out.println("	Busque temas ou cadastre novos no menu \"Gerenciar temas\".");
		}
	}
	
	public static int posicaoPalavraAleatoria(int posTema)
	{
		Random aleatorio = new Random();
		int num;
		
		do {
			num = aleatorio.nextInt(50);
			if ( num != 0 ) {
				if ( dadosJogo[posTema][num] != null )
					break;
			}
		} while ( true );
		
	 return num;
	}
	
	public static boolean erroOpcaoJogo(boolean reiniciar)
	{
		char opcao;
		
		reiniciar = false;
		do
		{
			System.out.println("	ERRO! O tema inserido nao esta cadastrado.");
			System.out.printf("	Busque temas ou cadastre novos no menu \"Gerenciar temas\".\n\n");
			
			System.out.println("	1 - Tentar inserir novamente");
			System.out.println("	2 - Voltar ao menu principal");
			
			System.out.printf("\n	    Desejo: ");
			opcao = input.next().charAt(0);
			System.out.println();
		} while ( opcao != '1' && opcao != '2' );
		
		if (opcao == '1')
			reiniciar = true;
		return reiniciar;
	}
	
	public static boolean letraCorresponde(char palavra[], int i, char[] tentativas, String palavraEscolhida)
	{
		for (int j = 0; j != palavraEscolhida.length(); j++) {
			if ( palavra[i] == tentativas[j] )
			{
				return true;
			}
		}
	 return false;
	}
	
	public static boolean vitoriaJogo(String palavraEscolhida, char[] tentativas, char[] palavra)
	{
		int contador = 0;
		
		for (int i = 0; i < palavraEscolhida.length(); i++)
		{
			for (int j = 0; j < palavraEscolhida.length(); j++)
			{
				if ( tentativas[i] == palavra[j] )
				{
					contador++;
				}
			}
		}
		
		if ( contador == palavraEscolhida.length() )
			return true;
		else
			return false;
	}
	
	public static void mensagemDerrota()
	{
		System.out.println();
		System.out.println("  FIM DE JOGO! VOCE PERDEU :(");
		System.out.println("          ______");
		System.out.println("         |      |");
		System.out.println("         |      O");
		System.out.println("         |     /|\\");
		System.out.println("         |     / \\");
		System.out.println("         |");
		System.out.println();
	}
	
	public static void mensagemVitoria()
	{
		System.out.println();
		System.out.println("  FIM DE JOGO! VOCE GANHOU!");
		System.out.println("       ' * ' * ' *");
		System.out.println("       * ' * ' * ' ");
		System.out.println("       ' * \\O/ ' *");
		System.out.println("       * ' *|* ' *");
		System.out.println("       ' * / \\ ' *");
		System.out.println();
	}
	
	public static void layoutJogo( String palavraEscolhida, int posTema ) {
		
		char[] palavra = palavraEscolhida.toCharArray();
		char tentativas[] = new char[(palavraEscolhida.length() )];
		char teste;
		
		boolean fimDeJogo = false;
		int erros = 0, i = 0, j = 0, k = 0;
		
		System.out.printf("");
		
		do
		{
			limparTela();
			System.out.println(" " + dadosJogo[posTema][0]);
			System.out.println("     Erros: " + erros + "\n");
			System.out.printf("	");
			for ( i = 0; i < palavraEscolhida.length(); i++)
			{
				if( letraCorresponde(palavra, i, tentativas, palavraEscolhida) )
					System.out.printf( palavra[i] + " ");
				else
					System.out.printf("_ ");
			}
			System.out.println();
			
			System.out.printf("     Sua tentativa: ");
				teste = input.next().charAt(0);
				teste = Character.toUpperCase(teste);
				System.out.println();
				limparTela();
				
			for ( k = 0; k < palavraEscolhida.length(); k++)
			{
				if ( palavra[k] == teste )
				{
					tentativas[j] = teste;
					j++;
					break;
				}
			}
			
			if ( j == 0)
			{
				if ( tentativas[j] != teste )
					erros++;
			}
			else
			{
				if ( tentativas[j-1] != teste ) {
					erros++;
				}
			}
			
			if ( erros == 5 || vitoriaJogo(palavraEscolhida, tentativas, palavra) ) {
				limparTela();
				
				System.out.println(" " + dadosJogo[posTema][0]);
				System.out.println("     Erros: " + erros);
				System.out.println();
				System.out.printf("	");
				for ( i = 0; i < palavraEscolhida.length(); i++)
				{
					if( letraCorresponde(palavra, i, tentativas, palavraEscolhida) )
						System.out.printf( palavra[i] + " ");
					else
						System.out.printf("_ ");
				}
				fimDeJogo = true;
				System.out.println();
			}
		} while ( !fimDeJogo );
		
		if ( erros == 5 )
			mensagemDerrota();
		
		if ( vitoriaJogo(palavraEscolhida, tentativas, palavra) ) 
			mensagemVitoria();
		
	}
	
	public static void jogar()
	{
		char opcao; 
		boolean reiniciar;
		
		do
		{
			reiniciar = false;
			System.out.println(" Bem vindo(a) ao jogo!");
			System.out.println("      instrucoes");
			System.out.printf("\n     Em qual tema voce de deseja jogar? ");
			insertTema = input.next();
			insertTema = insertTema.toUpperCase();
			System.out.println();
			
			if ( existirTema(insertTema) )
			{
				if ( quantidadePalavras(insertTema) > 0 )
				{
					int posTema = posicaoTema(insertTema);
					int posPalavra = posicaoPalavraAleatoria(posTema);
					
					String palavraEscolhida = dadosJogo[posTema][posPalavra]; 
					
					layoutJogo(palavraEscolhida, posTema);
					
					do
					{
						System.out.println("	1 - Jogar novamente");
						System.out.println("	2 - Voltar ao menu principal");
						
						System.out.printf("\n	    Desejo: ");
						opcao = input.next().charAt(0);
						switch ( opcao )
						{
						case '1':
						{
							reiniciar = true;
							limparTela();
							break;
						}
						case '2':
						{
							reiniciar = false;
							break;
						}
						default:
							System.out.println("	ERRO! Insira um valor valido.");
						}
					} while ( opcao != '1' && opcao != '2');
					
				}
				else
				{
					reiniciar = erroOpcaoJogo(reiniciar);
				}
			}
			else
			{
				reiniciar = erroOpcaoJogo(reiniciar);
			}
		} while ( reiniciar );
	}
	
	
	public static void main(String[] args)
	{
		boolean repeat, voltar = false;
		char opcao;
			iniciarTemas();
			
		do
		{
			do
			{
				repeat = false;
				opcao = menuExibir();
				
				if ( opcao < '1' || opcao > '4')
				{
					repeat = true;
					limparTela();
					System.out.println("	Insira uma opcao valida!");
				}
				
			} while ( repeat );
			
			limparTela();
			
			switch ( opcao )
			{
				case '1':
				{
					do
					{
						voltar = false;
						repeat = false;
						
						opcao = menuTemas();
						limparTela();
						
						switch ( opcao )
						{
							case '1':
								
								cadastrarTema();
								voltar = true;
								break;
							case '2':
								excluirTema();
								voltar = true;
								break;
							case '3':
								buscarTema();
								voltar = true;
								break;
							case '4':
								voltar = true;
								break;
							default:
								System.out.println("	ERRO! Opcao invalida.");
								repeat = true;
						}
					} while ( repeat );
					
					break;
				}
				case '2':
				{
					do
					{
						voltar = false;
						repeat = false;
						
						opcao = menuPalavras();
						limparTela();
						
						switch (opcao)
						{
							case '1':
								cadastrarPalavra();
								voltar = true;
								break;
							case '2':
								excluirPalavra();
								voltar = true;
								break;
							case '3':
								buscarPalavra();
								voltar = true;
								break;
							case '4':
								listarPalavras();
								voltar = true;
								break;
							case '5':
								voltar = true;
								break;
							default:
								System.out.printf("	ERRO! Opcao invalida.\n\n");
								repeat = true;
								break;
						}
					} while ( repeat );
					break;
				}
				case '3':
				{
					jogar();
					repeat = true;
					break;
				}
				case '4':
				{
					repeat = false;
					voltar = false;
					limparTela();
					System.out.println("	Muito obrigado por jogar!");
					input.close();
					break;
				}
			}
			
		} while ( repeat || voltar );
		
	}

}


// toUpperCase()
