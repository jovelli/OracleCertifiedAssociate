
public abstract class Test1
{
	public static void main ( String [] args )
	{

		//QUESTAO 1 - System.out.println(ex);	//Printar a excexao NAO printa o stack trace! Printa somente o nome da excecao e a mensagem! 
					//Somente ex.printStackTrace() printa o stack trace!
		try 
		{
			throw new Exception("Texto da Excecao.");
		}

		catch ( Exception ex ) 
		{
			System.out.println("QUESTAO 1 - " + ex);	//Printar a excexao NAO printa o stack trace! Printa somente o nome da excecao e a mensagem.
		}



		//QUESTAO 11 - Uma variavel local String apontando para null pode fazer += !!! o valor da String será null + <valorSerAtribuido>
			//NAO confundir String str; com String str = null;  sao diferentes, o primeiro NAO compila, da Variavel nao inicializada. 
			//O segundo compila e mostra nullMaisTexto
		
		String str = null;
		//String str;   NAO COMPILA

		str += "MaisTexto";

		System.out.println("QUESTAO 11 - " + str);			//SAIDA nullMaisTexto



		//QUESTAO 16 - Se atentar sempre ao (passar por valor) na chamada do metodo com Wrappers!
		Integer i = 10;
		Integer j = 15;

		metodoQuestao16( i++, ++j ); // Por ser Wrapper aconteceu o seguinte: j = new Integer( j.intValue() + 1 ); 
		//O ponto em questao eh que a referencia de i foi passada ao metodo e entao uma nova referencia foi criada: i = new Integer( i.intValue() + 1 );
        //Com a variavel j NAO, primeiro foi criado uma nova referencia de j e entao depois foi passado ao metodo essa nova referencia!
        //Ao exibir na tela, a NOVA referencia de i eh utilizada e NAO a referencia que foi passada ao metodo!

        System.out.println("QUESTAO 16 - i [" + i + "] j[" + j + "]");  // i[11] j[16] 



        //QUESTAO 19 - Prestar bastante atencao no acesso do construtor! Errei essa questao, pois haviam duas classes em pacotes diferentes.
        //Em cada classe havia um construtor declarado explicitamente! O acesso do construtor do pai era DEFAULT, assim o filho nao era capaz de acessar
        //o construtor do pai, pois estava em um pacote diferente! PS.: os 2 novos construtores nao tinham parametros como o no-arg construtor padrao.
        //justamente para confundir!!! O acesso eh que nao fazia compilar!



        //QUESTAO 22 - Excecoes que extendem RuntimeException: java.lang.SecurityException, java.lang.ClassCastException
        // java.lang.NullPointerException, java.lang.IndexOutOfBoundsException. 
        // Excecao java.lang.CloneNotSupportedException NAO extende RuntimeException!



        //QUESTAO 24 - As expressoes sao avaliadas da esquerda para direita sempre! se uma variavel for usada na esquerda e na mesma expressao 
        //tiver seu valor modificado mais na direita, o valor da esquerda PERMANECE, nao se altera
        String string1 = "aaa";
        String string2 = "bbb";

        System.out.println("QUESTAO 24 - " + string1.equals(string1 = string2)); //printa false. 
        //A expressao fica "aaa".equals("bbb");


        //QUESTAO 27 - Acertei essa questao, mas o arredondamento ficou confuso na hora
        System.out.println("QUESTAO 27 - " + Math.round(0.1)); //Arredonda para baixo fica 0.
		System.out.println("QUESTAO 27 - " + Math.round(0.5)); //Na metade SEMPRE Arredonda para cima fica 1.

		System.out.println("QUESTAO 27 - " + Math.round(-0.9)); //Arredonda para -1, esta mais proximo de -1 do que 0!
		System.out.println("QUESTAO 27 - " + Math.round(-0.5)); //Na metade SEMPRE Arredonda para cima fica 0.

		//QUESTAO 28 - Uma classe abstrata PODE ter um main e PODE executar sem problemas!! Errei essa questao, coloquei que nao compilava.
		//Era uma classe abstrata com um main nela. Classe abstrata com main compila e roda sem problemas!



		//QUESTAO 29 - variaveis SAO SOMBREADAS e metodos SAO SOBRESCRITOS! 
		//Variaveis de instancia, variaveis estaticas e metodos estaticos dependem do tipo da variavel declarada!
		//Metodos de instancia dependem do objeto real. 
		/*Exemplo:    

		Pai v = new Filho();
		v.metodoInstancia();   //Metodo INSTANCIA do filho!
		v.metodoEstatico();	   //Metodo ESTATICO  do PAI!
		v.variavelInstancia;   //Variavel Instancia do PAI!	
		v.variavelEstatica;    //Variavel Estatica do PAI!

		*/



		//QUESTAO 31 - Expressoes sao sempre analisadas pelo compilador da esquerda para direita! 
		//Quando uma variavel eh usada no inicio da expressao e depois seu valor eh alterado, o valor inicial NAO muda.
		//O resultado de uma condicao DEVE ser um boolean true ou false, false = true NAO retorna nada, NAO COMPILA
		//
		// boolean bool1 = false, bool2 = false;
		//
		// if ( bool1 != bool2 = !bool1)	NAO COMPILA
		// PRIMEIRO: (( false != false ) = !bool1
		// SEGUNDO: false = !false 						//NAO COMPILA
		// TERCEIRO: false = true 						//NAO COMPILA




		//QUESTAO 33 - Classe StringBuilder e StringBuffer implementam sua propria versao de toString()!
		//
		// System.out.println("[Texto " + new StringBuilder("fromStringBuilder") + "]");
		//
		// Resultado: [Texto fromStringBuilder] - NAO exibe o hash da classe, mas sim a string, pois StringBuiler implementa versao de toString()
		// passando o valor correto da string!

		System.out.println("QUESTAO 33 - [Texto " + new StringBuilder("fromStringBuilder") + "]");
		System.out.println(new StringBuilder("fromAnotherStringBuilder\n"));			//Chama toString do StringBuilder, SAIDA: fromStringBuilder




		//QUESTAO 35 - Variavel de uma interface pode ser chamada no formato NomeInterface.nomeVariavel!
		//Compila e roda sem problemas, a variavel eh publica, estatica e final COMPILA e RODA.




		//QUESTAO 37 - arrayList.subList(1, 1);	- Retorna um arrayList vazio!! ZERO elementos!
		// Se lembrar que o segundo indice NAO se inclui na lista que eh retornada!
		// 
		// arrayList.subList(1, 2); retorna UMA string, a que esta na posiacao 1 do arrayList!




		//QUESTAO 42 - A divisao de dois ints resulta em um valor int INTEIRO, o resto se perde! Exemplo: 
		int integer = 11 / 3;
		System.out.println("QUESTAO 42 - " + integer);		// resultado 3

		


		//QUESTAO 43 - Lambda Expressions 

		// A expressao lambda de Predicate PRECISA retornar um boolean! 
		// Se utilizar return, precisa utilizar chaves {} !!! O ponto e virgula ;  PODE OU NAO ser usado, quando tem chaves!!!
		// quando NAO TEM chaves NAO PODE ser utilizado!!! 
		//
		// Ex.: 	checkList( new ArrayList(), al ->   {   return al.size > 0  ;  }   )
		//
		// Se utilizar o tipo do parametro, PRECISA colocar parenteses! 
		//
		// Ex.: 	checkList( new ArrayList(),   (   ArrayList   al   )  ->  al.isEmpty()     ) )
		//
		// O tipo do parametro PRECISA ser igual ao tipo declarado na interface!!! checklist PRECISA declarar que recebe parametro ArrayList!!!
		//
		// O metodo add do ArrayList retorna um BOOLEANO! quando o add altera a lista!




		//QUESTAO 45 - Retorno covariante funciona para Objetos! NAO funciona para retorno de primitivos!
		// Um metodo da classe Pai, com a assinatura  public short metodo(){}  NAO pode ser sobrescrito pelo 
		// metodo do filho public byte metodo() {}  -- Na sobrescricao NAO funciona retorno covariante de primitivos!
		// Retorno do Pai Short e no filho short TB NAO COMPILA!!!!  o tipo primitivo short no filho NAO SOBRESCREVE o wrapper Short do PAI!!!!



		//QUESTAO 52 - Lambda Expressions
		// A expressao lambda NAO pode declarar o nome de uma variavel que ja tenha sido declarada no mesmo escopo anterior a expressao!



		//QUESTAO 55 - FOR EACH NAO itera sobre um Map! 
		// For each itera sobre colecoes que implementam interface Iterable! Map nao implementa Iterable! 
		// Collection implementa Iterable, Map herda de Collection, eh possivel utilizar keySet() ou values() sobre o Map para pegar uma Collections
		// e entao iterar sobre ela!



		//QUESTAO 59 - Dentro de um switch case, uma variavel declarada dentro de um case TEM escopo para os outros cases!

		int numeroSwitch = 0;
		String txtSwitch = "texto";

		switch (numeroSwitch)
		{
			case 0: 
				boolean b;
				txtSwitch += "doCase0"; 
				//System.out.println(b); // NAO compila, variavel b nao inicializada.
				
				break;

			case 1:
				b = true;				//COMPILA, b que foi declarado no case 0 vale para o escopo do switch inteiro! de todos outros cases!
				txtSwitch += "doCase1";
				break;	
		}

		System.out.println("QUESTAO 59 - [" + txtSwitch + "]");     //b nao vale fora do switch, tentar utilizar b aqui, NAO compila!




		//QUESTAO 72 - Se atentar nas expressoes, errei por desatencao de uma expressao se retornaria false ou true!


		//Ler https://docs.oracle.com/javase/specs/jls/se7/html/jls-3.html#jls-3.10.5 sobre Literais String.

	}

	public static int metodoQuestao16(int a, int b)
	{
		a += 4;
		b = a;

		return (byte) 10;
	}

}


