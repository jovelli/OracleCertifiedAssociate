
import java.util.*;
import java.time.*;
import java.time.format.*;
 
public class Test3
{
	public static void main(String [] args) throws Exception
	{

		//QUESTAO 4 - CUIDADO COM code UNREACHABLE!!! como o RETURN //3 abaixo!!!
		//Os returns foram comentados para prosseguirmos com as outras questoes!
		//SE os returns //1 e //2 estiverem descomentados, o return //3 DEVE estar COMENTADO, senao DA CODE UNREACHABLE!!!
		//O compilador SABE que se o try nao lancar excecao, ira retornar OU se lancar excecao e CAIR no catch, o catch tb vai retornar!
		//Assim, o return  //3 se TORNA UNREACHABLE!!
		//SE o return //1 ou o return //2, OU um OU outro estiver descomentado, o return //3 PODE estar descomentado, ele PODE ser executado!!
		//e o compilador libera!!!
		try 
		{
			int a = 100;
			//return;		//1
		}

		catch ( Exception ex )
		{
			System.out.println("QUESTAO 4 - Caiu na Exception");
			//return;		//2
		}

		finally 
		{
			System.out.println("QUESTAO 4 - Finally");
		}

		//return;		//3



		//QUESTAO 6 - Uma LocalDate quando colocada para ser exibida, EXIBE no formato da ISO 8601!!!   YYYY-MM-DD
		LocalDate ld = LocalDate.of(2015, 2, 2);
		LocalDate ld1 = LocalDate.parse("2015-02-02", DateTimeFormatter.ISO_DATE);
		LocalDate ld2 = LocalDate.now();

		System.out.println("QUESTAO 6 - " + ld);		//PRINTA 2015-02-02
		System.out.println("QUESTAO 6 - " + ld1);		//PRINTA 2015-02-02
		System.out.println("QUESTAO 6 - " + ld2);		//PRINTA YYYY-MM-DD  com a data corrente!!!



		//QUESTAO 7 - PRESTAR ATENCAO no tamanho das dimensoes passadas na criacao do Array!!!
		//O array aI tem 4 espacos na PRIMEIRA DIMENSAO! tem 3 espacos na SEGUNDA DIMENSAO! e tem 3 espacos na TERCEIRA DIMENSAO!!!
		int i = 4;

		int[][][] aI = new int[i][i=3][i];	

		System.out.println("QUESTAO 7 - " + aI.length + " - " + aI[0].length + " - " + aI[0][0].length );		//EXIBE 4 3 3 



		//QUESTAO 8 - OutOfMemoryError acontece quando cria-se tantos objetos ate acabar a memoria do HEAP!!
		//			- StackOverFlowError acontece quando chama-se tantos metodos (recursao por exemplo) que acaba o espaco de memoria para o STACK! 



		//QUESTAO 12 - Dava um for com dois parametros sem valores definidos! Era para verificar quais opcoes resultariam na mesma saida do for dado!!!
		//ERREI por um detalhe! nenhuma opcao dava a mesma saida! PARA AVALIAR MELHOR, escrever dois valores no papel e aplicar nas opcoes!!!
		//Dai sim verificar se as saida serao iguais ou nao!!!



		//QUESTAO 13 - Se declarar 		Pai v = new Filho()    NAO podemos chamar os metodos que EXISTAM no FILHO e NAO EXISTAM no PAI!!!
		//Mesmo que exista no filho, o compilador verifica no Pai e nao acha e NAO COMPILA!!! Os metodos (que podem ser herdados) 
		//do Pai SAO HERDADOS no Filho!! O Filho TEM os metodos do PAI, um metodo que SOH EXISTA no Filho NAO COMPILA se chamado na declaracao ACIMA!!!
		


		//QUESTAO 17 - ArrayList TEM metodo size() e NAO length. length eh de ARRAY!! NAO DE ArrayList!!!
		//O parametro de um ArrayList DEVE ser Wrapper SEMPRE. NAO aceita tipo primitivo!!!
		ArrayList<Double> al = new ArrayList();

		System.out.println("QUESTAO 17 - " + al.contains("string"));	//o ArrayList EH de Double, mas contains ACEITA essa string e retorna FALSE!!



		//QUESTAO 20 - Um nome de classe PODE ser usado como nome de variavel!!!!
		//Se o metodo String.substring receber indice negativo ou o indice final for menor que o inicial lanca StringIndexOutOfBoundsException!!!
		String Integer = "texto20String";
		Double Test3 = .3;

		System.out.println("QUESTAO 20 - " + Integer.substring(5,7) );		//EXIBE 20

		//Integer.parseInt(Integer.substring(4,6))     ---    NAO COMPILA!!! O compilador se perde com o nome da classe e da variavel Integer!!!



		//QUESTAO 22 - Object PODE ser instanciado     Object obj = new Object();



		//QUESTAO 36 - O metodo toString() da classe Object, retorna o nome da classe + @ + XXXX (codigo hash da classe)!!!
		//Se a classe nao sobrescrever o metodo toString() SERA EXIBIDO o formato acima!!!
		//Se a classe Sobrescrever o metodo toString() SERA EXIBIDO a versao da classe!!!
		Test3 t = new Test3();

		System.out.println("QUESTAO 36 - " + t);		//EXIBE Test3@<hashCode>



		//QUESTAO 37 - Na instanciacao de um OBJETO ARRAY, SE HOUVER calculo para o indice do array e lancar alguma excecao.
		//NAO executa o calculo do indice do array mais a direita. EX.:
		int j = 0;

		try 
		{
			int[][][] questao37 = new int[metodoQuestao37()][j=3][];		//metodoQuestao37 LANCA EXCECAO!! j = 3 NAO SERA EXECUTADO!
		
		} catch (Exception ex) {}

		System.out.println("QUESTAO 37 - " + j);		//EXIBE J = 0

		//VERIFIQUE a questao 2 da classe CreatingUsingArrays!!!! Nela existe o calculo do indice, MAS o nome do array eh uma chamada a um metodo
		//O metodo LANCA excecao, MAS o calculo do indice EH feito antes de chamar o metodo!!! entao altera o valor da variavel no calculo!!!

		// metodo()[j = 3]++		//A chamada ao metodo() EH FEITA DEPOIS da atribuicao j = 3!!!



		//QUESTAO 43 - Todo array EH UM Object!!!!  NAO SE confundir com array de Object!! Ex.:
		Object   questao43a = new int[10];				//COMPILA!!!		array de int EH UM Object!!!
		Object[] questao43b = new int[10][2];			//COMPILA!!!		array de array de int EH UM array de Object!!! 
		//Object[] questao43a = new int[10];  			//NAO COMPILA!!! 	array de int NAO EH um array de Object!!! array de int EH UM Object!!!



		//QUESTAO 44 - EM UMA OPERACAO, os operandos numericos SAO PROMOVIDOS para o maior tipo das variaveis!!!
		char c = 'a' + 1;					//'a' EH PROMOVIDO para int, no valor 97 somado com 1 e CONVERTIDO para char, TEM O VALOR  'b'  !!!
		System.out.println("QUESTAO 44 - " + c);			//EXIBE   'b'   !!!
		System.out.println('a' + 1);		//'a' EH PROMOVIDO para int, no valor 97 somado com 1 e exibido pelo metodo println. EXIBE   98  !!!



		//QUESTAO 45 - O metodo charAt de uma String pode aceitar um char como parametro, ele ira ser promovido para int e FUNCIONARA!
		String questao45 = "textoQuestao45 Essa String TEM MAIS DE trinta e dois caracteres";

		char indiceQuestao45 = questao45.charAt(' ');      //espaco na tabela ASCII esta na posicao 32, A = 65 e a = 97

		System.out.println("QUESTAO 45 - " + indiceQuestao45);		//EXIBE   'A'   da palava MAIS.



		//QUESTAO 46 - Prestar muita atencao no texto das alternativas!!!
		// Eram duas alternativas corretas! 
		// PRIMEIRA dizia para descomentar a linha 1 iria dar erro.
		// SEGUNDA  dizia se descomentar ambas as linhas 1 e 2 iria dar erro.
		// E uma terceira alternativa dizia que somente a alternativa PRIMEIRA estava correta!
		// Errei, coloquei a PRIMEIRA e TERCEIRA alternativa... A palavra AMBAS na alternativa SEGUNDA muda tudo!!!
		// Se a linha 2 fosse descomentada NAO DARIA erro, mas se AMBAS, linha 1 e 2 forem descomentadas, DA ERRO, POIS a linha 1 DA ERRO!!!
		// Um metodo ESTATICO NAO PODE sobrescrever um metodo de INSTANCIA! Somente shadow em metodo ESTATICO!
		// Um metodo de INSTANCIA NAO PODE sobrescrever um metodo ESTATICO! Somente sobrescrever metodo de INSTANCIA!



		//QUESTAO 48 - Os metodos: metodo1 e metodo2 DEVEM estar declarados NO PAI! O compilador VERIFICA na variavel de REFERENCIA se o metodo EXISTE!
		// Se o metodo so existe no filho, o compilaodr NAO acha no pai e NAO COMPILA!!!

		//Pai v = new Filho();
		//v.metodo1();
		//v.metodo2();



		//QUESTAO 50 - O compilador CONSIDERA SOMENTE valores de variaveis se forem CONSTANTES em tempo de COMPILACAO!!!
		// Se nao forem constantes em tempo de compilacao, o compilaodr NAO assume seus valores e NAO valida o flow considerando esses valores!!!
		// EX.: dentro de um metodo 
		int a, b = 0;
		final int questao50 = 0;		//questao50 EH FINAL, CONSTANTE EM TEMPO DE COMPILACAO, o compilador considera o valor dela e o if da TRUE!!

		if (questao50 == 0 )
				a = 200;

		b = a + 100;			//EXIBE variaval not initialized SE questao50   NAO FOR   FINAL!!!  SE   FOR FINAL   COMPILA E EXECUTA!!!



		//QUESTAO 51 - VOCE PODE instanciar uma EXCECAO como ABAIXO!!!
		//LEMBRAR que o metodo deve TRATAR com try ou LANCAR com throws a excecao, SE NAO, NAO COMPILA!!!
		//Se for tratado, COMPILA!!! 

		//Exception e = new Exception("fdsa");
		//throw e;  



		//QUESTAO 57 - SOMENTE String obriga os demais operandos a concatenar!!!
		//Boolean NAO obriga e NAO COMPILA!!!
		String questao57 = null;

		System.out.print("QUESTAO 57 - ");
		//System.out.print(null + true);		//NAO COMPILA!
		//System.out.print(true + null);		//NAO COMPILA!
		//System.out.print(null + null); 		//NAO COMPILA!

		System.out.print(questao57 + true);			//IMPRIMI nulltrue!!!
		System.out.println(true + questao57);		//IMPRIMI truenull!!!



		//QUESTAO 61 - TODOS OS CASES de um switch DEVEM SER CONSTANTES DE TEMPO DE COMPILACAO!!!
		// NAO PODE ter dois cases iguais em um switch!!!
		// SOh pode TER UM default em um switch!!!



		//QUESTAO 63 - StringBuilder SOH TEM o metodo delete para APAGAR seus caracteres!!! SOMENTE DELETE!!!
		// Nao existe deleteAll, remove, removeAll!!! SOMENTE DELETE!!!			delete(int indexBegin, int indexEnd);



		//QUESTAO 65 - PRIMEIRA PARTE do loop FOR, pode ter 0, 1 OU MAIS declaracoes!!!
		//SEGUNDA PARTE, pode ter 0 OU 1 declaracoes!!!		
		//Se NAO HOUVER nenhuma declaracao na SEGUNDA PARTE, entao a condicao SERA TRUE!!!
		//TERCEIRA PARTE, pode ter 0, 1 OU MAIS declaracoes!!!



		//QUESTAO 72 - Operador TERNARIO deve retornar VALOR e NAO COMANDOS!!!!
		
		//(true) ? System.out.println("true") : System.out.println("false"); 			//NAO COMPILA!!! 



	}

	public static int metodoQuestao37()
	{
		throw new RuntimeException();
	}

}



