import java.time.*;
import java.util.*;

public class Test4 extends Pai {
	String questao2Instancia = "QUESTAO 2 - variavelInstancia FILHO ";
	static String questao2Estatica = "QUESTAO 2 - variavelEstatica FILHO ";

	public static void main ( String [] args ) {
		//QUESTAO 2 - Quando houver uma conversao de filho para pai VALE a mesma regra do       Pai v = new Filho();
		//Ex.:
		Test4 f = new Test4();

		((Pai) f).questao2Instancia();							//Versao do FILHO  - metodo instancia

		System.out.println( ((Pai) f).questao2Instancia );		//Versao do PAI - variavel instancia
		System.out.println( ((Pai) f).questao2Estatica );		//Versao do PAI	- variavel estatica
		((Pai) f).questao2Estatica();							//Versao do PAI - metodo estatico


		//QUESTAO 3 - O compilador SABE que o QUE VIER depois do if no seguinte codigo SERA CODE UNREACHABLE!!!!
		int questao3 = 0;

		for ( int i = 0; i < 10; i++) {
			if ( questao3 == 3 ) {
				break;
			} else {
				continue;
			}

			//questao3++;							//O if NAO DEIXA o for seguir em frente JAMAIS, O COMPILADOR SABE!!!
			//System.out.println("QUESTAO 3");      //Da CODE UNREACHABLE nessas duas linhas!!!

			//Observar que o for NAO IRA executar ate o fim !!! o compilador NAO DEIXA JAMAIS um codigo passar caso ele NUNCA possa ser executado!!!!
		}


		//QUESTAO 14 - Nomes de classes podem ser usadas como nomes de variaveis!!! e como labels!!!
		String String = "QUESTAO 14";
		Double: for ( int i = 0; i < 5; i++ ) { break Double; }

		System.out.println(String);


		//QUESTAO 18 - ArrayList
		//ArrayList HERDA de AbstractList!
		//ArrayList IMPLEMENTA interface RandomAcess!
		//ArrayList IMPLEMENTA interface Iterable!
		//ArrayList TEM SubClasses!!!


		//QUESTAO 21 - Uma interface pode EXTENDER outra interface e sobrescrever um metodo que era default e torná-lo abstract!!!

		//Interface I1 tem um metodo   default void metodo (){}
		//Interface I2 extends I1 	   void metodo();					//TORNOU metodo Abstrct!!!   de defatul para abstract!

		//A implementacao default se PERDE para a classe que implementa a interface I2!!!
		//UMA interface NAO pode chamar um metodo default de sua super interface com a sintaxe     ===	 SuperInterface.this.metodo()	===
		//Uma classe PODE chamar um metodo default somente das interfaces que IMPLEMENTA com a sintaxe ===	 SuperInterface.this.metodo()	===


		//QUESTAO 37 - Um filho pode SOBRESCREVER um metodo do PAI e torna-lo ABSTRACT!!!! O metodo sobrescrito VIRA abstract!!!
		//Se existe um metodo abstract na classe, a classe TB deve ser abstract!!!


		//QUESTAO 49 - Um array NAO pode ter outro array se o primeiro NAO FOR declarado como array de array!!!
		Object[] questao49 = { new String("Test"), new Test4(), 10, Double.valueOf(10.3)};   //OK  -- int 10 passa por autoboxing!!!

		//Object[] questao49a = { new Integer(10), new Test4(), {} };   //NAO COMPILA!!! o ultimo elemento EH UM ARRAY!!!
		   															    //a variavel questao49a NAO EH um array de array!!!
		System.out.println("QUESTAO 49 - " + Arrays.toString(questao49));


		//QUESTAO 59
		int questao59 = (questao59 = 3) * 12;		//COMPILA e RODA!!!   SAIDA 36
		System.out.println("QUESTAO 59 - " + questao59);


		//QUESTAO 64 - Um LocalDateTime PRECISA receber a parte da hora TB!!! sem a hora DA erro de RuntimeException!!!
		//LocalDateTime questao64 = LocalDateTime.parse("2016-02-01");		//RuntimeException!!! NAO TEM A PARTE DA HORA!!!
		LocalDate questao64 = LocalDate.parse("2016-02-01");

		System.out.println("QUESTAO 64 - " + questao64);


		//QUESTAO 72 - O construtor de Short DEVE ser uma String ou numero Short!!!
		//Short questao72 = new Short(2);   //NAO COMPILA - 2 EH UM int!!!
		Short questao72 = new Short((short) 2);   //COMPILA!!
	}

	void questao2Instancia() {
		System.out.println("QUESTAO 2 - metodoInstancia FILHO ");
	}

	static void questao2Estatica() {
		System.out.println("QUESTAO 2 - metodoEstatica FILHO ");
	}

	//public abstract Short metodo();
}

class Pai {
	String questao2Instancia = "QUESTAO 2 - variavelInstancia PAI ";
	static String questao2Estatica = "QUESTAO 2 - variavelEstatica PAI ";

	void questao2Instancia() {
		System.out.println("QUESTAO 2 - metodoInstancia PAI ");
	}

	static void questao2Estatica() {
		System.out.println("QUESTAO 2 - metodoEstatica PAI ");
	}

	public Short metodo() {
		return new Short( (short) 9 );
	}
}
