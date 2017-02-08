public class UsingOperators {

	public static void main ( String [] args) {
		//QUESTAO 2 - Na execucao de um programa, se nao passar argumentos no main, o args SERA um array de String com 0 elementos!
		//Se tentar passar um indice, retornara ArrayIndexOutOfBoundsException!!!
		//Um array de ZERO elementos DA ARRAY INDEX OUT OF BOUNDS EXCEPTION se tentar acessar algum indice!!!!


		//QUESTAO 7 - Se um dos operandos eh uma STRING, entao os outros SAO CONVERTIDOS para String. Tanto na esquerda quanto direita!!!
		//Caso contrario NAO SERAO CONVERTIDOS para String!


		//QUESTAO 8 - Um double PODE SER atriuido sem o numero da esquerda, SERA 0. alguma coisa!
		//Por exemplo:  	double d = 0.3;		   eh a mesma coisa que   	  double d = .3;


		//QUESTAO 11 - Na expressao de um if (bool = bool2 != bool).
		//PRIMEIRO sera feito a comparacao de 		(bool2 != bool)
		//SEGUNDO sera atribuido o resultado a bool!
		//TERCEIRO bool eh verificado como condicao no if!!!


		//QUESTAO 13 - O compilador sabe que no case do switch abaixo NAO TEM break!
		//Por isso, o compilador NAO RECLAMA de variable not initialized!!!
		//O compilador NAO verifica o valor de i!!! e sim se existe break dentro do case!!!
		//Se o valor de i for 5 e soh houver case para o valor 4, o default sera executado, o compilador NAO SABE disso!!!!
		//O compilador verifica se NAO HA break e soh!
		int i = 5;
		String val;

		switch ( i ) {
			case 4:				//break; 	Se colocar esse break o compilador RECLAMA de variaval NAO INICIALIZADA!!!
			default :
			val = "QUESTAO 13";
		}

		System.out.println(val);


		//QUESTAO 16 - Essa questao tinha uma serie de incrementos e decrementos em tres variaveis!!!
		//Acompanhei certo ate parar na expressao:		int x3 = ++x1;
		//Incrementei certo e atribui certo para x3.
		//Mas esqueci que aumentar 1 para x1!!!!
		//A conta final deu errado!!!
		//Fazer com cuidado, ATENCAO e com PAPEL e CANETA essas questoes!!!


		//QUESTAO 17 - TODOS os caracteres (maiusculos e minusculos) em char cabem ate 127 dentro de um byte!!!
		//Essa questao tinha um tipo byte na expressao do switch e um case com o valor 'b'.
		//COMPILA e EXECUTA, char 'b' cabe dentro de um byte!!! assim como char 'B' e TODOS os caracteres de a-z e A-Z!!!


		//QUESTAO 18 - PRESTAR ATENCAO!!! Essa questao tinha um if (expressao) { comandos } { comandos} identados como se fosse um ELSE!!!
		//PRESTAR ATENCAO! que NAO TEM else.
		//Se for true a expressao do if vai executar os comandos de true e do bloco abaixo do if que PARECE ser do FALSE, MAS NAO EH!!!
		//EH NA VERDADE um bloco sozinho somente!!!
	}
}
