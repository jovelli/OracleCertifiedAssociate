


public class Final 
{
	static char questao21char;

	public static void main ( String [] args )
	{
		//QUESTAO 2 - valor binario EH    0b    ou    0B   !!!! 



		//QUESTAO 10 - ArrayList TEM SUB CLASSES!!! RoleList, AttributeList!!!



		//QUESTAO 14 - O ByteCode pode ser gerado apartir de qualquer compilador!!!
		// O que importa para executar o ByteCode eh a JRE!!! Se a JRE esta instalada no computador, o Byte Code NAO TEM relacao alguma com 
		// a arquitetura do computador!!! A JRE transforma o ByteCode em instrucoes para execucao no computador!!!



		//QUESTAO 17 - switch NAO PODE ter instrucoes QUE NAO ESTEJAM DENTRO de um case ou default!!! 
		// switch PODE NAO TER case ou default!!! Se nao ter case ou default, NAO PODE ter nenhuma instrucao!!!
		boolean questao17 = false;

		switch(5) 
		{
			//questao17 = true;					//NAO COMPILA!!!
		}



		//QUESTAO 19 - Operadores de COMPARACAO executam DEPOIS dos operadores matematicos!!!

		boolean questao19 = 2 + 3 < 3 + 5; 		//PRIMEIRO soma as partes, DEPOIS compara os dois LADOS!!!	fica 5 < 8 !!! 

		System.out.println("QUESTAO 19 - " + questao19);



		//QUESTAO 21 - Uma variavel de instancia char EH INICIALIZADA com ZERO!!!
		int[] questao21 = new int[]{2, 3, 2, 5};

		System.out.println("QUESTAO 21 - " + questao21 [ questao21char ] ); 		//questao21char EH INICIALIZADA com ZERO!!!



		//QUESTAO 23 - Metodos de interface que sao DEFAULT sao chamados em relacao ao PAI!!!
		//
		// Pai v = new Filho();
		// v.metodoDefaultInterface()			//vai chamar em relacao AO PAI!!!
		//
		// Um metodo default de interface TEM O MESMO comportamento que um metodo static!!!!



		//QUESTAO 31 - Chamada de metodo virtual EH DEFINIR o metodo que sera chamado em tempo de EXECUCAO!!!



		//QUESTAO 36 - ArrayList tem metodos add e remove!!! Remove retorna TRUE ou FALSE!!!



		//QUESTAO 43 - Se um ERROR for lancado, ele sera lancado para fora de MAIN!!! Nenhum catch PEGA um ERROR!!!!
		//
		//throw new AssertionError();			vai ser lancada PARA FORA de MAIN!!!



		//QUESTAO 54 - Um numero literal binario NAO PODE ser atribuido a uma variavel float ou double!!!! Somente para tipos INTEGRAIS!!!



		//QUESTAO 65 - O operador == EXECUTA ANTES DO operador = !!!
		boolean b = false;
		int i1 = 0, i2 = 1;

		boolean questao65 = b = i1 == i2;			//PRIMEIRO compara i1 == i2, DEPOIS atribui em b!!!

		System.out.println("QUESTAO 65 - " + questao65);  	



		//QUESTAO 67 - O operador == retorna TRUE para todos os Wrappers que tenham valores entre 0 e 127!!!
		// Java REUSA os valores entre 0 e 127 para economizar memoria!!! Todos os Wrappers com valores entre 0 e 127 retornam TRUE !!!
		// WRAPPERS entre ELES MESMOS!!! Integer com Integer, Short com Short, etc... Integer com Short, Byte com Long, etc... SEMPRE SERA FALSE!!!
		Integer i = 12;
		Integer s = 12;

		i++; i--;

		System.out.println("QUESTAO 67 - " + (s == i)) ;		//EXIBE TRUE!!! se houver INSTANCIA de OBJETO Integer entao retorna FALSE 

	}	
}


