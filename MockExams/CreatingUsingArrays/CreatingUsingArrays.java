
public class CreatingUsingArrays 
{
	public static void main (String [] args)
	{

		//QUESTAO 2 - Primeiro a atribuicao sera feita no index!!! depois chama o metodo e lanca excecao!!!
		int index = 0;

		try 
		{
			questao2()[index = 1]++;	//- Primeiro a atribuicao sera feita no index!!! depois chama o metodo e lanca excecao!!!
		}
		catch ( Exception ex )
		{}

		System.out.println("QUESTAO 2 - " + index );	//EXIBE 1!!! 



		//QUESTAO 10 - Um array eh tratado exatamente como um objeto!!! 
		//Ao passar um array para um metodo, passa a referencia do array!! se o array for alterado dentro do metodo reflete no objeto real!!!
		int array[] = new int [10];

		questao10(array);

		System.out.println("QUESTAO 10 - " + array[0]);		//SERA EXIBIDO 1!!!!

	}

	public static int[] questao2 ()
	{
		return null;
	}
	
	public static void questao10(int[] i)
	{
		i[0]++;		//REFLETE no objeto de array de int REAL!!!
	}

}


