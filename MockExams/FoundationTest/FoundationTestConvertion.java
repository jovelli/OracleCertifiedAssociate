import java.util.Arrays;

public class FoundationTestConvertion {

	public static void main ( String ... args ) {
		primeiraParte();
		segundaParte();
	}

	public static void primeiraParte() {
		//QUESTAO 1 - Prestar bastante atencao na pergunta, so responder depois de ler uma 3, 4 vezes se o enunciado for confuso!

		//QUESTAO 3 - O Catch de uma clausula Try pode "pegar" qualquer coisa que seja um Throwable!!!
		try { System.out.println("Catch works for all Throwable instances."); }

	    catch(Exception a) {
			System.out.println("Catch works for all Throwable instances.");
		}
		catch(Throwable e) {
			System.out.println("Catch works for all Throwable instances.");
		}

		//QUESTAO 6 - Prestar atencao na resposta e pergunta. Esssa questao tinha a afirmacao. Nao compila. A resposta era true, realmente o codigo nao compila.
		//Estava tentando sobrescrever a classe String! Não compila. Escolhi a opção false ou inves da true. A resposta era sobre a afirmação não sobre compilar!!


		//QUESTAO 8 - O maior valor de Short cabe em um int!
		//Para char, qualquer valor precisa de casting explícito! Mesmo que caiba, não vai sem casting explícito!
		short s = Short.MAX_VALUE;

		byte b = 123;
		int i = b;

		char c = (char) s;		//Soh converte de forma explicita.

		System.out.println("short s [" + s+ "] c [" + c + "]");

		//QUESTAO 13 - Tomar cuidado com meias afirmações!!! por exemplo, uma classe sobrescritora (PODE) (DEVE) ter retorno diferente da classe sobrescrita (Pai).
		// As palavras PODE, DEVE mudam o sentido da afirmacao. MUITA ATENCAO as palavras Pode e Deve.
		//A pergunta afirmava que o metodo sobrescritor DEVERIA ter o mesmo retorno e parametros do metodo sobrescrito!
		//Resposta: false, o metodo sobrescritor pode ter retorno covariante somente para Objetos de retorno! para tipos primitivo nao vale retorno covariante!


		//QUESTAO 18 - Um int tem limite na casa dos bilhoes, o numero ai embaixo cabe bem em um int! DEZ digitos cabem em um int, 2 bihoes.
		int a = 1234567890;
		float f = a;

		System.out.println(a - (int) f);

		//QUESTAO 24 - Sobre java.util.function.Predicate e uma interface que tem um metodo com a assinatura: public boolean test(T t);
		//Uma interface funcional deve ter SOMENTE 1 metodo abstract! Pode ter metodo default ou static, MAS SOMENTE 1 metodo abstract!


		//QUESTAO 30 - As classes LocalDate, LocalTime e LocalDateTime não tem ligacao nenhuma entre si, muito menos ligacao com as classes antigas de Data, como a classe Date!!!
		//As classes LocalDate, LocalTime e LocalDateTime implementam a interface TemporalAcessor! Essa e uma das unicas coisas que compartilham!


		//QUESTAO 33 - Classes que são de hierarquias diferentes não compilam quando utilizado o ==. O compilador sabe que sao de hierarquias diferentes e que jamais poderao ter referencias iguais!
		Long numero = 1l;
		Integer integer = 1;

		System.out.println( numero.equals(integer) );	// Nao compila numero == integer !!! o equals compila e sempre da false!
														// a comparacao com == nao compila porque sao de classes de hierarquias diferentes.

		//QUESTAO 36 - Tomar cuidado com meias afirmaões!! ler 3, 4 vezes quando a pergunta e respostas estiverem confusas!!!
		//Essa questao afirmava que uma classe que implementa uma interface deve implementar TODOS os seus metodos!
		//Essa resposta era false, pois as interfaces podem ter metodos STATIC e DEFAULT que podem não ser implementadas pelas classe!


		//QUESTAO 37 - Um metodo que sobrescreve outro metodo do pai, pode declarar SOMENTE as excecoes do pai ou não declarar nenhuma excexao.
		//NAO pode declarar exceções mais abrangentes que o pai ou excecoes CHECKED de hierarquias diferentes !! PODE declarar excecoes covariantes!
		//Excecoes de Runtime podem ser declaradas sem nenhuma regra.
	}


	public static void segundaParte() {
		//QUESTAO 41 - Tomar muito cuidado com a leitura do enunciado! Nessa pergunta, o enunciado dizia que as linhas de código executavam independentes!!!
		//Na hora de responder considerei que estavam dependentes e respondi errado!
		//O insert de uma string considera a posição exata que foi passada como parâmetro. Exemplo: "abcdef".insert(2, "zzz") vai ter o resultado: abzzzcdef.
		//Considerou a posicao 2 que era c e colocou o texto zzz antes dela.

		//QUESTAO 42 - Se atentar ao código da questão! Coloquei que a resposta era um metodo abstrato que tinha corpo! PRESTAR ATENÇÃO


		//QUESTAO 45 - array[-1] - numero negativo para chamar no indice do array gera ArrayIndexOutOfBoundsException!
										   // new int[-1]; numero negativo para inicializar o Array COMPILA e gera RUNTIMEEXCEPTION NegativeArraySizeException!

		int[] array = new int[3];	   // new int[-1]; numero negativo para inicializar o Array COMPILA!
									   // lanca RuntimeException excecao: NegativeArraySizeException!

		for ( int j = 0 ; j < array.length ; j++ ) {
			array[j] = j;
		}

		System.out.println( array[-0] );	// array[-1] numero negativo para chamar no indice do array gera ArrayIndexOutOfBoundsException!
										// array[-0] compila e mostra a posicao 0 do array.

		System.out.println( Arrays.toString(array));


		//QUESTAO 51 - & eh bitwise AND... compara os bits das variaveis integrais (byte, short, int, etc).
		int value = 10 & 9;		// & eh bitwise AND... compara os bits das variaveis integrais (byte, short, int, etc).
								// Coloca no resultado somente os bits que "batem". Exemplo 10 em bits eh 1010. 9 em bits eh 1001.
								// 10 & 9 = 8 (em bits eh 1000), somente as posicoes dos bits ligados de ambas variaveis se mantem no resultado.
								// 1010 & 1001 = 1000

		System.out.println(value);


		//QUESTAO 51 - O Construtor de uma classe PODE acessar todos os metodos NAO ESTATICOS da classe!

		//QUESTAO 58 - O valor maximo e mínimo cabe na variavel int, desde que venham de outras variaveis! se o valor for literal 2147483650 NAO COMPILA!
		//O valor perde acuracidade! vira outro numero, mas compila e roda!
		//O limite de um int vai de   [-2147483648]   ate   [2147483647].   Sempre o valor negativo tem uma unidade a mais!
		int max = Integer.MIN_VALUE;

		//int valor = 2147483650; //Nao compila "integer number too large"!

		int valor = -max;

		System.out.println("max [" + max + "] valor [" + valor + "]");		//Resultado:   -2147483648    -2147483648


		//QUESTAO 59 - Prestar atenção nas afirmações de cada questão! Errei essa questão por desatenção!
		//Essa questao tinha a ver com É-UM, TEM-UM entre classes que foram fornecidas!


		//QUESTAO 63 - Prestar atenção nas afirmações de cada questão! Errei essa questão por destenção!
		//A afirmacao correta era que a chamada ao construtor da classe pai deve ser o primeiro comando do construtor do filho.


		//QUESTAO 67 - Uma classe sem acesso (acesso DEFAULT) PODE ser sobrescrita por uma classe com acesso PROTECTED.
		//Acesso PROTECTED é mais abrangente que DEFAULT! Uma classe que sobrescreve outra, PODE SIM aumentar a visibilidade do método.


		//QUESTAO 73 - compila, realiza autoboxing e soma os ints.
		int resultado = new Integer(10) + new Integer(5);  //compila, realiza autoboxing e soma os ints.

		System.out.println("Resultado [" + resultado + "]");


		//QUESTAO 74 - Tomar cuidado com meias afirmações!
		//Essa questao afirmava que uma chamada a super() ou this() deve sempre ser fornecida de forma explicita no primeiro comando de um construtor!
		//Falso, pois no construtor padrão, a chamada a super() é implícita e não explícita!

		//QUESTAO 78
		char caracter = 'a';
		float completa = 1000f;

		caracter -= completa; 	// Operadores de atribuicao compostos funcionam para variaveis char e numericos : +=, -=, *= e /=
											// com o operador = eh preciso casting explicito.
	}
}
