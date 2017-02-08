import java.io.IOException;

public class EasyTest extends Pai
{
	int questao1;
	final static boolean questao27Estatica;
	final boolean questao27Instancia;
 
 	static
	{
		questao27Estatica = false;
		//questao27Instancia = true; 		//NAO COMPILA, bloco estatico NAO ACESSA variavel de instancia!!!
	} 

	{
		//questao27Instancia = true;		//JA SETA valor no construtor, NAO pode ser nos dois lugares!!! EH FINAL!! Soh seta UMA VEZ!!!
	}

	public EasyTest ()
	{
		//questao27Estatica = true;			//Construtor NAO PODE setar valor para variavel ESTATICA FINAL!!
									//PODE setar valor para variavel de INSTANCIA ou ESTATICA,  ESTATICA e FINAL NAO PODE!!!

		questao27Instancia = true;
	}

	public static void main (String [] args) throws Exception
	{

		//QUESTAO 1 - O shadowing de uma variavel NAO deixa acessar ou atribuir valor na variaval de instancia!!!
		EasyTest e = new EasyTest();
		e.questao1();

		System.out.println("QUESTAO 1 - " + e.questao1);		//Exibe 0!!! o 10 foi abribuido a variaval questao1 LOCAL e nao de instancia!!!
																//Se o THIS tivesse sido usado, atribuiria a variavel de instancia!!!!


		//QUESTAO 4 - Dentro de um try pode haver chamada a metodo que NAO lanca CHECKED exception!!! O compilador ACEITA!!!
		//o try PODE ate nao ter comandos!!!
		//O contrario NAO PODE!!! se um metodo lancar excecao ele DEVE estar dentro de um try!!! OU o metodo que chama DEVE fazer throws Exception!!!!
		try {
		} catch(Exception ex)	//se fosse catch(IOException ex)  NAO COMPILA!!!  compilador reclama que o try nunca lancara essa CHECKED exception!!!
		{}



		//QUESTAO 14 - Na mesma classe NAO pode haver um metodo de instancia e um metodo estatico com mesmo nome!!!
		//O compilador acusa que o metodo ja foi declarado!!!



		//QUESTAO 15 - Se um metodo no PAI declarar que lanca excecao, o filho ao sobrescrever pode ou nao declarar que lanca a excecao!
		//Se o tipo da variavel for do Pai...   Ex.:    Pai q = new EasyTest();
		//ENTAO, o compilador EXIJE que haja o try ou que o method main lance Exception!!!
		//Se o tipo da variavel for do FILHO, ENTAO, o compilador NAO EXIJE try ou lancamento de excecao!!!		
		EasyTest q = new EasyTest();		
		//Pai q = new EasyTest();			NAO COMPILA!! compilador EXIJE try ou throws Exception do main para o metodo!!!!
		q.questao15();



		//QUESTAO 16 - Uma variavel de referencia EH UMA variavel de referencia mesmo sem apontar para um objeto!!!
		//Soh a declaracao JA EH suficiente para criar a variavel de referencia!!!



		//QUESTAO 25 - Um objeto que NAO SEJA o que esta no casting DA ClassCastException em Runtime!!!
		//Sempre se perguntar a pergunta do EH UM!!!  No exemplo EasyTest EH UM Pai, mas Pai NAO EH UM EasyTest!!!!
		try {

			Pai p0 = new Pai(); 
			Pai p = new Pai();
			EasyTest easy = new EasyTest();

			p0 = easy;					//easy EH UM pai!!!  NAO PRECISA de conversor!!! 
			easy = (EasyTest) p0;		//p0 aponta na VDD para um objeto EasyTest!!!! por isso esse casting FUNCIONA!!!
			easy = (EasyTest) p;		//DA ClassCastingException!!!! pois o objeto de p NAO EH EasyTest!!!!! 
	
		} catch(Exception ex)
		{}
		


		//QUESTAO 27 - Uma variavel final de instancia DEVE ser inicializada em um Bloco de instancia ou NO Construtor!!!
		//Caso contrario NAO COMPILA!!! Nao existe valor padrao para variavel final!!!
		//Bloco estatico NAO tem acesso as variaveis de INSTANCIA de FINAL!!!
		//Bloco estatico ACESSA as variaveis ESTATICAS de FINAL SOMENTE!!!

		//STATIC (bloco) para STATIC (variavel)
		//INSTANCIA (bloco) para INSTANCIA (variavel) 

		//STATIC (bloco) NAO ACESSA INTANCIA FINAL (variavel)
		//INTANCIA (bloco) NAO ACESSA STATIC FINAL (variavel)

		//NAO PODE setar valor para variavel FINAL de INSTANCIA no Construtor e no Bloco de Instancia!!! 
		//TEM que ser OU em um OU em outro!!!
		System.out.println("QUESTAO 27 - Variavel estatica [" + EasyTest.questao27Estatica 
									+ "] Variavel de instancia [" + new EasyTest().questao27Instancia + "]");
		 


		//QUESTAO 29 - PRESTAR ATENCAO!!! Errei essa questao pois coloquei que um metodo sem a palavra abstract e que estava sem corpo era correto!!
		//Se nao houver o corpo do metodo DEVE haver a palavra abstract tambem antes do nome do metodo!!! SENAO NAO COMPILA!
		//A alternativa correta incluia um ponto-e-virgula depois do corpo do metodo!!! Um ponto-e-virgula NAO FAZ diferenca no codigo!!!
		
		;	//Esse ; eh ignorao pelo compilador!!!

	}	

	; //Esse ; tb eh ignorao pelo compilador!!!



	public void questao1()
	{
		int questao1 = 10;	
		questao1 = questao1;
	}

	public void questao15()
	{
		System.out.println("QUESTAO 15");
	}

}

class Pai
{
	public void questao15() throws java.io.IOException
	{
		throw new java.io.IOException();
	}

}







