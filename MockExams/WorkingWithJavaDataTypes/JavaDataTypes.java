
public class JavaDataTypes 
{
	public static void main ( String [] args )
	{
	
		//QUESTAO 4 - NENHUMA classe de Wrapper tem construtor sem argumentos!!! Não existe new Long(), new Integer()... existe new Long("122"), new Long(122)
		
		//QUESTAO 10 - O valor que cabe em um byte vai de -128 a 127. Sempre o número negativo tem UMA unidade a mais do que o valor positivo. O mesmo vale para as outras variaveis numericas!
		System.out.println("MIN : " + Integer.MIN_VALUE);
		System.out.println("MAX : " + Integer.MAX_VALUE);
		
		System.out.println("new Float ( 23 ) : " +  new Float ( 23 ) );
		System.out.println("new Integer(\"-10\") : " + Integer.toBinaryString( new Integer("-10") )) ;
		System.out.println("127 : " + Integer.toBinaryString( new Integer("127") )) ;
		
		//QUESTAO 11 - se remover o else do if abaixo, NAO COMPILA, dá que a variavel numero não foi inicializada! Com o ELSE compila! 
		//O compilador consegue "VER" que a variavel numero sera inicializada no IF ou no ELSE.
		int numero;
		
		if ( args[0].equals("A") ) numero = 0; else numero = 1;
		
		System.out.println("\n numero [" + numero + "]");
		
		//QUESTAO 13 - Essa atribuição de varias variaveis funciona! Compila, executa e atribui com sucesso.
		//int i = j = k = l = 10;  //NAO COMPILA, primeiro cria variavel, depois inicializa!
		int i, j, k, l = 10;		
		
		i = j = k = l = 1000;
		
		System.out.println("\n i [" + i + "]  j [" + j + "]  k [" + k + "]  l [" + l + "]");
		
		//QUESTAO 17 - byte b = 320. NAO COMPILA! 320 não cabe em um byte e o compilador sabe disso!
		
		//QUESTAO 20 - PRESTAR muita atenção em classes que declaram um Construtor com argumentos!  
		//SEMPRE lembrar que ao colocar um argumento, a classe perde o construtor padrão sem argumentos!
		//Muitas perguntas não parecem tratar de construtor, SEMPRE prestar muita atenção NISSO. 
		//Colocou um novo construtor com argumento, o padrão sai!
		//No meio de algum código pode aparecer uma instanciação de um objeto de uma classe que NAO TEM o construtor padrão sem ARGUMENTOS!
		
	}

}







