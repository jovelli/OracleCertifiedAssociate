public class StringsMethods {

	public static void main ( String ... args ) {
		comparisons();
		//stringBuilderMethods();
		//stringMethods();
	}

	public static void stringMethods() {
		String s = "TesteDeString";
		String s1 = s.substring(4, 10);

		System.out.println("s [" + s + "] s1 [" + s1 + "]");

		s = s.concat("ABC");
		s1 = s.concat("DEF");

		System.out.println("s [" + s + "] s1 [" + s1 + "]");

		System.out.println("s contains A [" + s.contains("A") + "]");

		System.out.println("s1.replace(\"e\", \"X\") [" + s1.replaceAll("e", "X") + "]");

		String novaString = "  NovaStringParaTestes  ";

		System.out.println("\nnovaString.trim() [" + (novaString = novaString.trim()) + "]");
		System.out.println("novaString.toLowerCase().toUpperCase() [" + novaString.toLowerCase().toUpperCase() + "]");

		System.out.println("Same".compareToIgnoreCase("zZZZ"));
		System.out.println("Same".compareTo("Sbzz"));
	}

	public static void stringBuilderMethods() {
		StringBuilder a = new StringBuilder("TESTE");
		StringBuilder b = new StringBuilder("Teste");
		//StringBuilder c1 = new StringBuilder(null);			//COMPILA, mas gera NullPointerException!!!
		//c1.append("fdsa");

		System.out.println(" a.equals(b) [" + a.equals(b)  + "]");
		System.out.println(" a.toString().equalsIgnoreCase(b.toString()) [" + a.toString().equalsIgnoreCase(b.toString())  + "]");

		StringBuilder c = new StringBuilder(" JAva").append(" 08 ");

		StringBuilder d = c;

		d.append(" Certification ").delete(5, 9).reverse().insert( 15 , "MAIS TEXTO.");
		//O insert do StringBuilder insere o texto na posição. No caso 15!

		System.out.println(" c [" + c  + "]");
		System.out.println(" Length c [" + c.length()  + "]");
	}

	public static void comparisons() {
		String string = "10";
		String string2 = "10";
		String string3 = new String("10");

		System.out.println(" string == string2 [" + (string == string2) + "]");
		System.out.println(" string.equals(string2) [" + string.equals(string2)  + "]");

		System.out.println("\n string == string3 [" + (string == string3) + "]");
		System.out.println(" string.equals(string3) [" + string.equals(string3)  + "]");

		StringBuilder sb = new StringBuilder("10");
		Integer i = 10;

		// O equals com Objetos diferentes COMPILA. Sempre exibe false, por mais que os valores sejam iguais, como nas comparacoes abaixo, Integer = 10 e String = "10" sempre serão false.

		System.out.println("\n\nCompare Integer to String === string3.equals(i) === [" + string3.equals(i) + "]");
		System.out.println("Compare StringBuilder to String  === sb.equals(string3) === [" + sb.equals(string3)  + "]");
		System.out.println("Compare StringBuilder.toString() to String  === sb.toString().equals(string3) === [" + sb.toString().equals(string3)  + "]");
	}
}
