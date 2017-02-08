
import java.io.*;

public class FoundationFather
{
	
	public void someMethod ( String s ) throws IOException
	{
		if (s.equals("E")) throw new IOException("String s equals E ");
	}

}