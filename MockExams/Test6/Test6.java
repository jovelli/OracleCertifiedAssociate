

import java.time.format.*;
import java.time.*;
import java.util.*;


public class Test6
{

	static {
			//int i = 0;				//ExceptionInInitializerError
			int i = 1;	
			int j = 10 / i;	
	}


	public static void main ( String [] args )
	{
		//QUESTAO 1 - StringBuilder tem metodo setLength() e length() !!!
		StringBuilder sb = new StringBuilder("StringBuilder");

		sb.setLength(10);

		System.out.println("QUESTAO 1 - length [" + sb.length() + "] sb [" + sb + "]");			//SAIDA: StringBuil



		//QUESTAO 3 - NENHUMA classe da API de Data pode ser instanciada!!! NAO EXISTE new para Period, Duration, LocalDateTime, etc!!!
		//Os metodos da classe Period SAO ESTATICOS!!!  Period.ofMonths(1).ofDays(1)  vai retornar somente a parte de ofDays(1)!!!
		//NAO CONSIDERA a referencia de ofMonths(1)!!!



		//QUESTAO 4 - metodo main DEVE SER public!!! Private ou default compilam MAS DA RUNTIME EXCEPTION!!!



		//QUESTAO 13 - RUNTIME Exceptions NAO PRECISAM ser declaradas ou tratadas!!! SOMENTE CHECKED Exceptions!!!



		//QUESTAO 15 - QUALQUER Excecao que ocorra dentro de um bloco estatico IRA GERAR ExceptionInInitializerError!!!
		//CHECKED Exceptions DENTRO de bloco de instancia ou bloco estatico DEVEM ESTAR DENTRO de TRY CATCH!!! throw new Exception() NAO COMPILA!!!



		//QUESTAO 21 - Metodo de instancia DIZ RESPEITO ao objeto REAL!!!
		//Se fizer ((A) c).metodo()... IRA ACESSAR o metodo do objeto REAL e NAO da classe A!!!



		//QUESTAO 23 - As classes da API de data SAO IMUTAVEIS!!! quando sao alteradas, elas criam NOVOS Objetos!!!



		//QUESTAO 27 - SE ATENTAR que LocalDate NAO TEM a parte da hora!!!
		//A questao perguntava o que acontecia com o codigo:

		//LocalDate.of(2015, Month.JANUARY, 01).format(DateTimeFormatter.ISO_DATE_TIME);	
		//ISO_DATE_TIME  DA RUNTIME Exception, pois EH UM LOCAL DATE --- NAO TEM a parte de TIME!!!

		System.out.println("QUESTAO 27 - " + LocalDate.of(2015, Month.JANUARY, 01).format(DateTimeFormatter.ISO_DATE) );	



		//QUESTAO 31 - Loop For.
		// PRIMEIRA PARTE : 0 ou N expressoes.
		// SEGUNDA PARTE  : 0 ou 1 expressao, resultado em booleano!!!  se nao tiver expressao, resultado eh TRUE!!!
		// TERCEIRA PARTE : 0 ou N expressoes.

		//for (int questao31 = 0, System.out.println("QUESTAO 31a") ; ; )			//NAO COMPILA!!! A declaracao do int faz o compilador pensar
																					//que o comando de out eh um int tb!!!

		//for (System.out.println("QUESTAO 31a"), System.out.println("QUESTAO 31b") , int questao31 = 0 ; ; );			NAO COMPILA!!!
		//A declaracao do int acima NAO COMPILA!!! declaracao de variaveis NAO PODE estar junto com outros comandos!!!
		//Se soh houver OUTs sem a criacao de variavel COMPILA e RODA!!!
		int questao31;

		for (System.out.println("QUESTAO 31a"), System.out.println("QUESTAO 31b") , questao31 = 0 ; ; )
		{
			break;
		}



		//QUESTAO 33 - PRESTAR ATENCAO!!! No enunciado citava classes WRAPPERS para uso do equals()!!! 
		// Sendo    a    um Wrapper      a.equals(a)     SERA SEMPRE TRUE!!!
		


		//QUESTAO 34 - remove do ArrayList remove A PRIMEIRA OCORRENCIA na lista e somente UMA OCORRENCIA!!!  
		//Retorna TRUE caso tenha conseguido remover. Retorna FALSE caso o item NAO EXISTA na lista!!!  
		ArrayList al = new ArrayList();
		al.add("1");
		al.add("2");
		al.add("3");
		al.add("1");

		System.out.println("QUESTAO 34 - remove item from ArrayList al.remove(\"2\"): " + al.remove("1"));
		System.out.println("QUESTAO 34 - remove item from ArrayList al.remove(\"2\"): " + al.remove("2"));
		System.out.println("QUESTAO 34 - remove item from ArrayList al.remove(\"4\"): " + al.remove("4"));	

		System.out.println("QUESTAO 34 - " + al);



		//QUESTAO 37 - PRESTAR ATENCAO no ENUNCIADO!!! A questao pedia a criacao de um array que comportasse o formato array[2][3]!!!
		// Como arrays comecam pela posicao 0, entao a primeira dimensao tinha tamanho 3 e a segunda tamanho 4!!!
		// Errei por indicar opcoes que tinham tamanho 2 na primeira dimensao e tamanho 3 na segunda!!!
		// LER e RELER CADA enunciado !!!



		//QUESTAO 46 - metodo length() de String mostra a quantidade de caracteres na String!!!



		//QUESTAO 56 - Com questoes que envolvem VARIAVEIS SEM VALORES DEFINIDOS, SEMPRE colocar no papel valores para testar as expressoes!!!



		//QUESTAO 59 - Se a excecao que for colocada na direita do throw for null, estoura NullPointerException!!!
		
		// Exception ex = null;
		// throw ex;	

		//MESMO DENTRO de um try catch!!! Estoura NullPointerException!!!



		//QUESTAO 60 - Se dentro de um try ou dentro de um catch lancar excecao e no finally TAMBEM lancar excecao... 
		//a excecao de finally SOBREPOE a do try ou a do catch!!!
		//Atribuicao de valores nas variaveis TAMBEM!!! se uma variavel recebe um valor no catch e no finally a mesma variavel recebe outro
		// PREVALECE o valor atribuido no finally!!!



		//QUESTAO 63 - Um LocalDate, LocalDateTime NAO TRATAM de zone!!! A questao pedia para dizer qual seria o resultado do comando:

		//DateTimeFormatter.ISO_ZONED_DATE_TIME.format( LocalDateTime.now() );					//COMPILA e DA RUNTIME Exception!!!

		//LocalDateTime.now()   NAO TEM informacao de zone!!!  o metodo format acima DA RUNTIME EXCEPTION!!!



		//QUESTAO 64 - Na chamada de Metodos Sobrecarregados, FIXAR as seguintes regras de prioridade do metodo que sera chamado:
		//Prioridade:
		// 1 - Tipos primitivos sao promovidos entre tipos primitivos!!!  metodo(1)    -->	   metodo(long l);		1 EH PROMOVIDO a long!!!
		// 2 - O valor passa por boxing nos Wrappers!!!     			  metodo(1)	   -->     metodo(Integer i);   1 EH BOXED em um Integer!!!
		// 3 - Metodo com parametro varargs !!!							  metodo(1)    -->     metodo(int...)		1 entra no varargs!!!

	}

}



