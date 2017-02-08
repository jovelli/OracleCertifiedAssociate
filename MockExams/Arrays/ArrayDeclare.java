

public class ArrayDeclare
{
	public static void main (String[] args)
	{
		int  [] a[][][];

		a = new int[10][2][][];

		//NegativeArraySizeException como no exemplo: a = new int[10][-1][][] são RuntimeException

		String [] b []= {{"Palavra1", "Palavra2"}, {"Palavra3"}};

		System.out.println("Saída [" + b[0][1] + "]");

		new ArrayDeclare().method(a);
	}

	public void method (int[] [] i [] [])
	{
		System.out.println("Array i [" + i[4][0].length + "]");
	}

}