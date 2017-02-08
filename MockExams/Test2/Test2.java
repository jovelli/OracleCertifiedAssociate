import java.util.*;

public class Test2 {

	public static void main (String [] args) {
		//QUESTAO 1 - EXISTE somente IMPORT STATIC!!! nunca o contrario! IMPORT primeiro SEMPRE!

		//QUESTAO 11 - SE ATENTAR que a tabulacao nao EH A REGRA. Essa questao tinha dois IFs aninhados como abaixo:
		int numeroDivididoPorZero = 0;

		if ("OK".equals("NOK"))
			if ("OK2".equals("OK2"))
				System.out.println("From OK2");
		else
			numeroDivididoPorZero = 10/0;	//NAO sera lancada excecao! ELSE se refere ao SEGUNDO IF e nao ao PRIMEIRO

		//O ELSE debaixo se refere ao IF de dentro!!! IF do OK2!!! A tabulacao engana para pensar que se refere ao Primeiro IF !!!
		//MUITA Atencao que quando nao ha chaves os comandos se referem imediamente ao superiores a eles!!!


		//QUESTAO 12 - Saber o que sera impresso quando se trata de Excecoes!
		try { throw new Exception("Mensagem Questao 12"); }
		catch( Exception ex) {
			System.out.println(ex);  // Printa Nome da Excecao e Mensagem SOMENTE!
			ex.printStackTrace();  // Printa Nome da Excecao, Mensagem da Excecao e StackTrace!
		}


		//QUESTAO 14 - QUESTAO FODA! O WHILE abaixo da Code Unreachable!!!
		// O Do sera executado, pois executa pelo menos uma vez, o for compila e executa, pois o compilador em tempo de compilacao nao sabe que
		// a expressao i < 0 sera sempre false! se fosse     for(int i = 0; false; i++) x = 3      daria CODE UNREACHABLE como o while da!!!
		// O IF eh uma excecao a regra!!! definido pela linguagem!!! o if pode ter esse false na condicao que compila e roda sem problemas!
		// O While NAO, esse while (false) da CODE UNREACHABLE!

		int x = 0;

		//while (false) x = 3; 		//unreachable statement!

		if (false) x = 3;		//if (false) eh a unica excecao a regra !

		do { x = 3; } while(false);

		for (int i = 0; i < 0; i++) x = 3;	//se fosse for(int i = 0; false; i++) x = 3      daria CODE UNREACHABLE como o while da!!!


		//QUESTAO 16 - SE HOUVER UM METODO abstract em uma classe, a classe DEVE SER Abstract TB!!!
		//Um metodo concreto PODE SER sobrescrito no Filho como abstract!!! NAO PODE ter corpo e a classe Filho DEVE SER Abstract!!!


		//QUESTAO 19 - O escopo de um LABEL funciona somente para a estrutura imediatamente apos o label! para FOR, IF, WHILE, etc.
		//Compila SE declarar o LABEL para comandos como System.out.println(), mas se houver um break para o nome do Label NAO COMPILA!
		//fica fora de escopo!

		nomeFor:
		for (int i = 0; i < 1; i++) {
			outroNomeFor:
			System.out.println("QUESTAO 19");
			//break outroNomeFor;					NAO COMPILA! O nome do LABEL deve estar antes de uma estrutura!
												//  Se descomentar o break NAO COMPILA, se comentar o break, COMPILA!
			outroNomeForIF:
			if (true) {
				break outroNomeForIF;
			}

			System.out.println("QUESTAO 19");
		}

		//QUESTAO 28 - Fixar os seguintes pontos em relacao a Boolean!
		System.out.println("\n QUESTAO 28 - " + Boolean.parseBoolean("TRuE"));		//O parseBoolean e o construtor de Boolean IGNORA o CASE!!!

		//True, tRue, tRUe e true SAO TODOS IGUAIS!
		//Qualquer outra coisa que seja passada como parametro cria um Boolean de false!!!! mesmo parametro null, tb cria false!

		//Se SOMENTE um de dois operandos Boolean for primitivo, entao acontece o unboxing do Wrapper.
		//Se os dois forem Wrappers entao compara a referencia dos dois objetos!!!

		System.out.println("QUESTAO 28 - " + (Boolean.parseBoolean("TRuE") == new Boolean("true")));
		//parseBoolean RETORNA Boolean.TRUE!!!! e NAO um novo objeto! entao acontece o unboxing!

		System.out.println("QUESTAO 28 - " + (new Boolean("TRuE") == new Boolean("true")));
		//Dois objetos sao criados, o == age sobre as duas referencias e retorna FALSE!!!!


		//QUESTAO 29 - Fixar os seguintes pontos em relacao a Foreach
		//Dentro de um foreach, a variavel que itera NAO pode ter sido declarada anteriormente ao loop!!!!

		int n = 0;
		//for (n : new ArrayList()){}		//NAO COMPILA! O n deve ser declarado dentro do Foreach, Essa regra vale SOMENTE para foreach!
		for (; n < 1; n++) System.out.println("\nQUESTAO 29");		//COMPILA e executa para For!

		//final eh o UNICO modificador que pode ser utilizado na declaracao de um Foreach!!!!
		for (final int a : new int[]{1, 2, 3}) {}


		//QUESTAO 39 - o metodo getClass() SEMPRE retorna a classe do OBJETO!!!!
		System.out.println("QUESTAO 39 - " + new Test2().getClass());		//printa class Test2

		List<String> lst = new ArrayList<String>();
		System.out.println("QUESTAO 39 - " + lst.getClass());				//printa java.util.ArrayList



		//PRESTAR MUITA ATENCAO nas expressoes booleanas das estruturas while, if, for, etc!!!
		//Se dentro dessas expressoes houver chamada a metodos, entao verificar com cautela CADA CHAMADA!!!
		//Nessa questao, na expressao de um while chamava um metodo que retornava uma variavel de instancia para comparacao!
		//dentro do metodo do While existia uma variavel com o mesmo nome da variavel de instancia!!! Ocorreu shadowing!
		//o valor era decrementado da variavel LOCAL! na expressao do while chamava o metodo que retornava o valor da variavel de INSTANCIA!
		//A variavel de INSTANCIA nunca era alterada, logo a expressao do While nunca mudava e sempre permanecia true!!!!!


		//QUESTAO 45 - Se uma variaval LOCAL nao for inicializada e tambem NAO for utilizada, entao a classe compila e roda sem problemas!
		// Se a variavel NAO for inicializada e for UTILIZADA, entao NAO COMPILA !


		//QUESTAO 49 - Uma classe pode IMPLEMENTAR duas interfaces que tenham uma mesma variavel constante dentro delas!!!
		//Se a classe NAO utiliza-las COMPILA e roda!!! Se a classe tentar utiliza-las NAO COMPILA!!!
		//Eh a mesma situacao de variavel local nao inicializada, se houver comando que use NAO COMPILA, mas se nao houver COMPILA e RODA!!


		//QUESTAO 56 - MUITA ATENCAO! Na construcao de um objeto, se na execucao do construtor do PAI houver uma chamada a um metodo de instancia
		//O metodo do filho sera executado!!!!! e nao do proprio pai!!!


		//QUESTAO 58 - Um LABEL pode ser utilizado em blocos sozinho!!!!
		//O Finally SEMPRE executa, mesmo com o break abaixo!!!
		//Somente System.exit() NAO executa finally!!!
		label: {
			try {
				System.out.println("QUESTAO 58");
				break label;
			} finally {
				System.out.println("QUESTAO 58 - finally SEMPRE Executa!!!");
			}
		}

		//QUESTAO 63 - Classes que implementam a mesma interface nao podem ser atribuidas umas as outras!!!!
		//Exemplo:   C1 --> I1     C2 --> I1    ( classes C1 e C2 implementam Interface I1 ).
		//C1 c1 = new C1();
		//C2 c2 = c1;			NAO COMPILA, ambas classes implementam a interface I1, mas c1 NAO eh um C2!!

		//I1 var = c1; 			COMPILA, c1 eh um I1.


		//QUESTAO 65 - Para switch, SOMENTE String, byte, short, int e char podem ser utilizados na condicao, seus Wrappers e ENUMS!!!!!
		//O tipo dos cases PRECISAM ser do tipo da condicao!
		//O valor do case precisa CABER na variavel de condicao do switch!!! Uma condicao do tipo byte NAO consegue ter case com o valor 128!!!!!
		//Errei essa questao dizendo que o tipo byte caberia na condicao, um case era de 128! logo nao compilava! NAO cabe!
		//No maximo um default deve ser usado!
		//Todos os valores dos cases PRECISAM ser constantes de tempo de compilacao!


		//QUESTAO 66 - o for abaixo compila e roda!!!
		//Ja o foreach PRECISA que a variavel que itera seja declarada dentro do foreach!!! NAO Pode ser antes!
		// for(;;){}	//COMPILA e RODA -- causa um loop infinito


		//QUESTAO 71 - Essa questao tratava sobre unreachable code!! Errei!!
		//Finally SEMPRE executa! se houver um return dentro do finally e mais codigo apos o finally.
		//Esse codigo depois do finally sera UNREACHABLE!!! pois finally sempre executa e o compilador sabe disso!


		//QUESTAO 72 - StringBuilder tem um metodo chamado ensureCapacity(int capacity)!!!
		//Esse metodo garante espaco para a quantidade em CARACTERES passada como argumento!
		//StringBuilder tb tem um construtor que aceita int que representa a capacidade!  new StringBuiler(int capacity)
		//EM CARACTERES!


		//QUESTAO 74 - O metodo toString() de um objeto DateTime exibe a data no formato ISO 8601 !!!
		//O metodo   dt.format(java.time.format.DateTimeFormatter.ISO_DATE_TIME);    exibe a data no formato ISO 8601 tb!!!


		//QUESTAO 77 - Na expressao do lambda quando nao houver chaves {}, nao pode colocar o ponto-e-virgula ;
		// Se houver chaves DEVE COLOCAR o ponto-e-virgula ;
		// Se o metodo na interface RETORNA um valor, se usar chaves {}  eh obrigatorio a palava return !!!
		// O tipo do parametro declarado no metodo da interface DEVE SER o mesmo tipo na hora de chamar!!! NAO PODE ser covariante!!!
		// Ex.: na interface  public boolean test (List<Data> lst)
		// Na hora de chamar NAO PODE chamar com   (new ArrayList(), (ArrayList al) -> true )		al EH UM ArrayList e NAO UM List!!!
		// NAO COMPILA!!! NAO PODE ser covariante!!! DEVE SER List !!! ou pode-se OCULTAR o tipo do parametro!!!
	}
}
