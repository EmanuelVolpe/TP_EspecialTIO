import java.io.BufferedReader;
import java.io.InputStreamReader;

public class VerificarParidad  extends VerificarMultiplicidad{
	
	public static void sonPares() 
	{
		int num = 0;
		int contador = 0;
		boolean control = true;
		
		while(control) 
		{
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			for(int i = 1; i<= 3;i++) 
			{
				try 
				{
					System.out.println("--------------------------");
					System.out.println("Ingrese un entero:");
					System.out.println("--------------------------");
					num = new Integer(entrada.readLine()); 
					if (num % 2 != 0) 
					{
						contador++;
					}					
				}
				catch(Exception exc)
				{
					System.out.println("--------------------------------------");
					System.out.println("No ha ingresado un entero.");
					System.out.println("--------------------------------------");
					i = i - 1;
					control = true;
				}
			}
			if (contador == 2) 
			{
				System.out.println("--------------------------------------------------------");
				System.out.println("La mayoria de los números son impares.");
				System.out.println("--------------------------------------------------------");
			}
			else if (contador == 3)
			{
				System.out.println("--------------------------------------------");
				System.out.println("Todos los números son impares.");
				System.out.println("--------------------------------------------");
			}
			else 
			{
				System.out.println("----------------------------------------------------");
				System.out.println("La mayoria de los números son pares.");
				System.out.println("----------------------------------------------------");
			}
			control = false;
		}
	}
}
