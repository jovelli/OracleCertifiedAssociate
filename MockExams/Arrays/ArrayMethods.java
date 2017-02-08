import java.util.*;

public class ArrayMethods {

	public static void main (String[] args) {
		arrayAsList();
		arrayComparison();
		arrayFill();
	}

	public static void arrayFill() {
		long l[] = new long[10];
		//double d[] = (double[]) l;       Arrays de tipos primitivos não fazem o casting.

		Arrays.fill(l, 3, 9, 12l);
		List list = Arrays.asList(l);     //List não aceita parâmetro de tipo primitivo, int não funciona, só Integer. list<Integer> OK    list<int> NOK

		System.out.println(" l " + Arrays.toString(l));
	}

	public static void arrayComparison() {
		String a[] = {"A", "B"};
		String b[] = {"A", "B"};

		System.out.println("a == b [" + (a == b) + "] a equals b [" + a.equals(b) + "] Arrays.equals(a, b) [" + Arrays.equals(a, b) + "]");

		ArrayList la = new ArrayList();	la.add("A");
		ArrayList lb = new ArrayList(); lb.add("A");

		System.out.println("\nla == lb [" + (la == lb) + "] la equals lb [" + la.equals(lb) + "]");
	}

	public static void arrayAsList() {
		String[] a = new String[10];

		double randNumber = 0;

		for (int i = 0; i < a.length; ++i)
		{
			a[i] = "" + (randNumber = Math.random());
		}

		List<String> list = Arrays.asList(a); // "ffdsa", "fdsaa" , "aaaa");

		for (int i = 0; i < a.length; ++i)
		System.out.println("Array Saída [" + a[i] + "]");

		System.out.println("\nLista Saída [" + list + "]");
		System.out.println("\n randNumber [" + randNumber + "]");
	}
}
