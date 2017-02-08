public class Test {

	public static void main(String [] args) {
		for (int i = 0; i <= 10;) {
			i++;
			System.out.println("Saida da Classe.");
		}

		byte a = 40, b = 50;
		byte sum = (byte) (a + b);

		Short s = 100;
		Long l = (long) s;		//COMPILA e RODA!!!
	}
}
