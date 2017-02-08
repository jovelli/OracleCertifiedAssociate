
import java.time.*;
import java.util.ArrayList;
import static java.util.Collections.sort;
import java.time.temporal.*;

public class Test5 extends SubClass
{

	static char questao17;

	static String questao29;
	
	public static void main ( String [] args ) 
	{

		//QUESTAO 1 - Uma excecao PODE ser lancada de um CATCH ou FINALLY!!! MAS ela DEVE ser tratada por um try ou throws!!!!
		try 
		{
		try 
		{
			new RuntimeException();
		
		} catch (RuntimeException ex) 
		{
			throw new RuntimeException();  	//Se remover o try catch externo, o codigo NAO COMPILA!!!!
		
		} finally 
		{
			throw new RuntimeException();
		} 

		} catch (RuntimeException ex) 		//Se remover este catch a excecao do finally INTERNO NAO SERA TRATADA e NAO COMPILA!!!
		{}	



		//QUESTAO 2 - Valores integrais PODEM SER comparados com == entre tipos primitivos!!!!
		int i = 10;
		short s = 10;
		byte b = 127;
		char c = 127;

		boolean questao2 = i == s;
		boolean questao2a = b == c;

		System.out.println("QUESTAO 2 - [" + questao2 + "][" + questao2a + "]");		//retorna  TRUE  TRUE !!!!



		//QUESTAO 12 - ArrayList PRECISA ter a posicao que foi passada no parametro de add para PDOER ADICIONAR!!!
		ArrayList al = new ArrayList();

		al.add(12);			//OK - posicao 0!!!
		al.add(1, 100);		//OK - posicao 1!!!
		//al.add(3, 200);		//COMPILA!! RUNTIME EXCEPTION!!! Ainda NAO existe posicao 3 no ArrayList!!!



		//QUESTAO 15 - QUESTAO FODA!!! 
		//SOMENTE os blocos estaticos de SUPER sao executados NA CHAMADA ABAIXO!!! o da sub classe NAO!!!
		//As regras sao:
		//So executa bloco estatico da Sub classe quando: um objeto da SubClasse for instanciado!!
		//Quando um membro estatic da Sub classe for chamado!!!

		System.out.println("QUESTAO 15 - " + SubClass.ID );		//NAO executa bloco estatico da Sub Classe!!! ID EH DA Super classe!!! 
																//apesar de ser chamada a partir da Sub Classe!!!
		Super questao15 = new SubClass();						//Executa bloco estatico da Sub Classe!!!
		 


		//QUESTAO 17 - Uma variavel de instancia char NAO inicializada tem o valor padrao ZERO para numericos!!!
		System.out.println("QUESTAO 17 - " + questao17 );				//SAIDA  		""		string vazia
		System.out.println("QUESTAO 17 - " + (int) questao17 );			//SAIDA 		0 		numero ZERO!!!



		//QUESTAO 18 - DIFICIL!! A variavel char recebe normalmente valores!! o char do switch abaixo EH COMO NUMERICO INTEGRAL!!!
		//Quando questao18 for ZERO NAO VAI entrar no case '0'!!!
		//Mas quando questao18 for 65 VAI entrar no case 'A', porque A Eh 65 na ASCII  !!!
		char questao18;

		System.out.print("QUESTAO 18 - ");

		for ( questao18 = 65; questao18 < 70; questao18++ )
		{
			switch ( questao18++ )	
			{
				case 'A':  System.out.print("A");					//65 eh A na ASCII !!!
				case 1 :   System.out.print("B"); break;
				case 2 :   System.out.print("C"); break;		
				case 3 :   System.out.print("D"); break;
				case 4 :   System.out.print("E");				
				case 'E':  System.out.println("F"); break;			//ESTA NA SAIDA !!!
			}
		}



		//QUESTAO 23 - Quando replace NAO altera nada, ele retorna a referencia da primeira String!!!
		//Quando replace ALTERA ele retorna uma nova referencia de String!!!
		boolean questao23 = ("String".replace('g', 'G') == "StrinG");		//FALSE	- alterou a string retorna NOVA referencia que NAO EH StrinG!!
																			//StrinG NAO ESTA no pool de String!!! Eh um novo Objeto String!!!

		boolean questao23a = ("String".replace('g', 'g') == "String"); 		//TRUE  - nao alterou a referencia da string!!! 
																			//Ambas strings ESTAO NO pool de String!!! como literais! 
																			//NAO CRIOU NOVO Objeto String!!!				

		System.out.println("QUESTAO 23 - " + questao23 + " " + questao23a);
		

		
		//QUESTAO 25 - Operacoes de atribuicao COMPOSTA fazem o casting IMPLICITO!!!
		//TODAS variaveis integrais: byte, short, char SAO PROMOVIDAS para INT quando estao em UMA OPERACAO!!!

		//byte variavelByte = 1;
		//short questao25short = variavelByte + variavelByte;			//variavelByte PRIMEIRO se torna um INT, depois eh somada a ela mesma!!!! 

		//NAO COMPILA, pois variavelByte se tornou INT foi somada a ELA MESMA, e o valor de resultado EH UM INT, NAO CABE no short!!! 
		
		int questao25 = 10;
		byte questao25Byte = 0;
		short questao25Short = 0;

		questao25Byte  += questao25; 	//CASTING IMPLICITO
		questao25Short *= questao25; 	//CASTING IMPLICITO

		System.out.println("QUESTAO 25 - int[" + questao25 + "] byte[" + questao25Byte + "] short[" + questao25Short + "]");



		//QUESTAO 27 - StringBuilder NAO TEM metodo trim()!!! nem remove(), removeAll(), deleteAll() !!!
		//StringBuilder TEM metodo ensureCapacity(), setLength(), delete()!!!



		//QUESTAO 29 - Nao existe this dentro do metodo main, POIS ele EH ESTATICO!!! NAO TEM objeto da classe na qual esta inserido!!! 
		//System.out.println("QUESTAO 29 - " + this.questao29);		//this.questao29  NAO COMPILA!!! this NAO EH considerado estatico!!!



		//QUESTAO 32 - PRESTAR MUITA ATENCAO!!! nessa questao a condicao de um for era 10 < 0!!! eh FALSE, NUNCA entrara no loop.
		//Dentro do loop haviam varios calculos!!! Esses calculos NAO SERIAM feitos!!!
		//Errei por desatencao para a condicao do loop!!! Os loops tinham labels para CONFUNDIR!!!



		//QUESTAO 33 - Uma variavel char pode receber sem conversao um numero CONSTANTE TEMPO COMPILACAO!!! 
		//Uma variavel char NAO PODE receber o valor de outra variavel que seja MAIOR que ela!!!
		int questao33a = 6;
		char questao33 = 6;

		questao33 = (char) questao33a;			//Sem ESSE CASTING EXPLICITO, NAO COMPILA!!!

		System.out.println("QUESTAO 33 - [" + questao33 + "]");



		//QUESTAO 35 - import static SOH PODE importar membros ESTATICOS!!!! membros de instancia NAO PODE!!!
		// import static java.util.Collections.*; 		IMPORTA TODOS os membros ESTATICOS de Collections!!!



		//QUESTAO 36 - Bloco de instancia PODE alterar variavel static!!!! o que NAO PODE eh alterar variavel static final!!!!
		//Variavel static final SOh PODE ser alterada por Bloco Estatico!!!



		//QUESTAO 37 - Variaveis primitivas PODEM ser comparadas com == !!! os tipos sao PROMOVIDOS para o maior tipo da expressao!!!
		int questao37 = 10;
		float questao37a = 10.0F;

		boolean questao37bool = questao37 == questao37a;	//int EH PROMOVIDO para float 10.0!!!

		System.out.println("QUESTAO 37 - " + questao37bool);



		//QUESTAO 43 - Variaveis de Instancia SOh PODEM ser usadas pela classe FILHO depois que o construtor do PAI foi executado!!!
		//Antes disso NAO COMPILA!!!



		//QUESTAO 46 - A palavra unsigned NAO EH PALAVRA RESERVADA!!!! antes de fazer a prova Ver e Rever as palavras reservadas do Java!!!
		//int const = 9; 				//const EH PALAVRA RESERVADA!!!
		//int goto = 9; 				//TB EH UMA PALAVRA RESERVADA!!!

		

		//QUESTAO 51 - A classe TemporalAdjusters faz todo tipo de calculo com data!
		//Essa questao dava formas de calcular a proxima terca-feira. Acertei por eliminacao e chute!
		//LocalDate, LocalDateTime NAO PODEM ser instanciadas!!!
		LocalDate ld = LocalDate.now().with( TemporalAdjusters.next(DayOfWeek.TUESDAY) );

		Temporal ld2 = TemporalAdjusters.next(DayOfWeek.TUESDAY).adjustInto(LocalDate.now());

		System.out.println("QUESTAO 51 - [" + ld + "][" + ld2 + "]");



		//QUESTAO 54 - Se dentro do construtor do PAI for chamado um metodo de instancia que o Pai e o filho tiverem
		//a versao sobrescrita do filho sera chamada!!! Sera chamado o metodo do objeto REAL, no caso do Filho!!!
		
		//Vale a regra do Pai v = new Filho()!!!!  variavel de instancia, variavel estatica, metodo estatico SERA CHAMADO a versao do PAI!!!
		//metodo de instancia SERA CHAMADO a versao do FILHO!!!



		//QUESTAO 55 - PRESTAR ATENCAO!! era uma questao de || curto circuito!!!



		//QUESTAO 63 - Pode haver DOIS UNDERSCORES seguidos em um numero literal!!! O UNDERSCORE NAO PODE ser o primeiro digito nem o ultimo
		//NAO PODE ESTAR tambem antes ou do depois de PONTO.
		int questao63 = 322___932932;

		//float questao63float = 2332._3;			//NAO COMPILA!!
		//float questao63float = _2332.3;			//NAO COMPILA!!
		//float questao63float = 2332.3_;			//NAO COMPILA!!

		System.out.println("QUESTAO 63 - " + questao63);



		//QUESTAO 69 - Metodos SOBRECARREGADOS em que os parametros sejam da mesma hierarquia ACEITAM parametro null!!!
		//O parametro null vai para o metodo que tiver o menor parametro da hierarquia!!!
		//Se os parametros NAO FOREM da mesma hierarquia NAO COMPILA!!!  

		questao69(null);		//metodo questao69 eh SOBRECARREGADO com parametros da mesma hierarquia!!!
								//Se nao fossem da mesma Hierarquia, NAO COMPILA!!!



		//QUESTAO 70 - O valor 100_00_00_00  	EH IGUAL A     100000000!!!
		System.out.println("QUESTAO 70 - " + (100_00_00_00 == 100000000));



		//QUESTAO 77 - Classe Period EH PARA DATA, DIA MES ANO!!!
		//Classe Duration EH PARA HORA, HORA MINUTO SEGUNDO!!!

	}	

	//Os parametros abaixo do metodo questao69 sao todos da mesma hierarquia, entao aceitam o null!!!
	//Se nao fossem da mesma hierarquia NAO COMPILARIA com o null de parametro!!!
	public static void questao69 (Super t) { System.out.println("QUESTAO 69 - Super"); }
	public static void questao69 (SubClass t) { System.out.println("QUESTAO 69 - SubClass"); }
	public static void questao69 (Test5 t) { System.out.println("QUESTAO 69 - Test5 - menor da hierarquia."); }
	
}

class Super 
{
 	static String ID = "From Super";
	static { ID = "From Super Static Block"; }

	String questao43 = "Questao43";

	String questao54 = "Questao54_PAI";

	public void metodoQuestao54()
	{
		System.out.println("QUESTAO54 do PAI");	
	}

	Super()
	{
		metodoQuestao54();
		System.out.println( questao54 );
	}
}

class SubClass extends Super
{
	static { System.out.println("From SubClass!!!"); }		

	String questao54 = "Questao54_FILHO";

	public void metodoQuestao54()
	{
		System.out.println("QUESTAO54 do FILHO");	
	}

	SubClass()
	{
		//super(questao43);			//Cannot reference questao43 before supertype constructor has been called!!!! NAO COMPILA!!!
	}
}





