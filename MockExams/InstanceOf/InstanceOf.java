
public class InstanceOf extends Super
{
	public static void main ( String [] args )
	{
		//QUESTAO 4 - SE ATENTAR que o operador instanceOf SEMPRE trata o objeto REAL!!! e nao a variavel de referencia!!!
		Super v = new InstanceOf();

		if (v instanceof I1) System.out.println("QUESTAO 4 - " + (v instanceof I1));



		//QUESTAO 6 - tipos primitivos diferentes PODEM SER comparados com ==
		//Um Wrapper passa por unboxing quando comparado com == para primitivos!!!
		int questao6 = 100;
		short questao6short = 100;

		Integer questao6a = 100;

		boolean bool = questao6 == questao6short;  	//Ambos virao INT depois sao comparados!!! PROMOVE para o maior tipo!!!
		boolean bool2 = questao6a == questao6; 		//Unboxing sobre o Wrapper!!! compara os dois ints PRIMITIVOS!!!

		System.out.println("QUESTAO 6 - [" + bool + "] [" + bool2 + "]");	//TRUE   TRUE 

	}

}

class Super implements I1 {}

interface I1 {}