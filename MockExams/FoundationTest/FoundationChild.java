import java.io.IOException;

public class FoundationChild extends FoundationFather {

	public void someMethod(String a) throws IOException {
		System.out.println("From someMethod Child.");

		if (a.equals("a")) throw new IOException();
		//return 1;
	}

	public static void main(String [] s) {
		FoundationFather fc = new FoundationChild();

		try { fc.someMethod("d"); }
		catch(Exception e) {}
	}
}
