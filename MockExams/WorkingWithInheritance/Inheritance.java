import java.io.*;

public class Inheritance extends Filho {
	String questao4 = "QUESTAO 4 ";

	public static void main ( String [] args ) {
		//QUESTAO 1
		//System.out.println("QUESTAO 1 - " + new Filho().i);		//NAO COMPILA, i em Filho eh PRIVATE!!! do pai eh public, mas do FIlho SOBREPOE!!!

		//QUESTAO 4 - Variavel de instancia de uma classe SOH EH inicializada APOS a execucao do construtor do PAI!!! APOS a chamada a super()
		// as variaveis recebem os valores!!!
		Inheritance i = new Inheritance();

		//QUESTAO 12 - Uma variavel declarada DENTRO de uma Interface, EH SEMPRE   public  static  final  !!!
		// NAO COMPILA, se declarar uma variavel private ou protected DENTRO de uma interface!!!

		//QUESTAO 18 - FileNotFoundException EH UM IOException!!!
		IOException ex = new FileNotFoundException();
	}

	Inheritance () {
		System.out.println(questao4);		//EXIBE  "QUESTAO 4"
	}
}

class Filho extends Pai {
	private int i = 10;		//Esse i aqui faz SHADOW no i do PAI!!! A classe filho NAO TEM i visivel para outras classes!!!
						//Mesmo que o i no Pai seja publico, vai valer a visibilidade do Filho!!!
}

class Pai {
	public int i = 100;
}
