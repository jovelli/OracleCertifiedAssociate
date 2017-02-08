
import java.io.IOException;

public class FoundationTestException
{
	
	public static void main ( String ... args )
	{

		try 
		{
			System.out.println("Catch works for all Throwable instances.");
			throw new IOException();
		} 

		catch(IOException | RuntimeException e)     // | ArrayIndexOutOfBoundsException se colocar essa excecao DA ERRO!!! 
													// pois eh subclasse de RuntimeException!!! NAO PODE!!!
		{
			System.out.println("Catch works for all Throwable instances.");	
		}

	    catch(Throwable a)
		{
			System.out.println("Catch works for all Throwable instances.");	
		}

		
	}

}

