import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IngresoDatos {
	
	public  static int pedirEntero() 
	{
		int num = 0;
		boolean control = true;

		while(control) 
		{
			try 
			{
				BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("------------------");
				System.out.println("Ingrese un entero:");
				System.out.println("------------------");
				num = new Integer(entrada.readLine());
				control=false;
			}
			catch(Exception exc)
			{
				System.out.println(exc);
				System.out.println("--------------------------");
				System.out.println("No ha ingresado un entero.");
				System.out.println("--------------------------");
				control = true;
			}	
		}
		return 	num;
	}
}
