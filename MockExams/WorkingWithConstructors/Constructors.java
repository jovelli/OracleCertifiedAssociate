public class Constructors {

	public static void main (String [] args) {

		//QUESTAO 6 - Um metodo de instancia PODE chamar um metodo ESTATICO dentro da mesma classe somente com o NOME do METODO!!! sem o nome da CLASSE!
		new Constructors().questao6();		//Chama metodo de INSTANCIA, que chama metodo ESTATICO e EXIBE     QUESTAO 6!!!


		//QUESTAO 10 - Na criacao de um objeto, a ordem de inicializacao EH:
		// PRIMEIRO - membros e blocos ESTATICOS na ordem que aparecem!!!
		// SEGUNDO  - membros e blocos de INSTANCIA na ordem que aparecem!!!
		// TERCEIRO - Construtor!!!


		//QUESTAO 11 - Pegadinha!!! A pergunta era sobre sobrescricao!!!
		// Na resposta tinha um metodo declarado abstrato para ser inserido em uma classe que NAO era abstrata!!!
		// Esse metodo NAO COMPILA, pois se houver UM metodo abstrato, a classe DEVE SER Abstrata!!!
		// A questao tratava de uma coisa, mas a resposta envolvia outra complementamente diferente!!!


		//QUESTAO 16 - No metodo estatico de MAIN, nao existe nenhuma referencia this!!! THIS SOh EXISTE DENTRO de uma Instancia!!!


		//QUESTAO 19 - A ordem para MATCH de um metodo EH:
		// PRIMEIRO : o primitivo maior mais proximo!!!
		// SEGUNDO  : Wrapper DO primitivo SOMENTE!!! um int NAO VAI entrar em um Wrapper Long !!! SOMENTE em Wrapper Integer!!!
		// TERCEIRA : vargs... do tipo primitivo E DE TIPOS primitivos maiores proximos!!!
		int questao19 = 10;
		Integer questao19a = 11;

		questao19( questao19 );
		questao19( questao19a );
	}

	private static void questao19(Long l)	{}			//Um int JAMAIS cai nessa chamada!!! MESMO QUE SOh exista ela!!!
														//Um int NAO PASSA para long e depois para Long!!! NAO EXISTE!!!
														//Um int PASSA PARA Integer, depois o tipo Integer PODE caber em Number, Object por exemplo!!!

	private static void questao19(int i) {
		System.out.println("QUESTAO 19 - From int - " + i);
	}

	private static void questao19(Integer i) {
		System.out.println("QUESTAO 19 - From Integer - " + i);
	}

	private static void questao19(long... i) {
		System.out.println("QUESTAO 19 - From int... - " + i);
	}

	private void questao6() {
		questao6estatico();
	}

	private static void questao6estatico() {
		System.out.println("QUESTAO 6");
	}
}
