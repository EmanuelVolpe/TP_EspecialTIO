
public class VerificarMultiplicidad extends IngresoDatos{
	
	public  static void sonMultiplos() 
	{
		int num1 = pedirEntero();
		int num2 = pedirEntero();
					
		if ((num1 != 0) && (num2 != 0))
		{	
			if (((num1 % num2 == 0) || (num2 % num1 == 0)) && (num1 != num2))
			{
				System.out.println("---------------------------------------------------------");
				System.out.println("Uno de los números es múltiplo del otro.");
				System.out.println("---------------------------------------------------------");
			}
			else if (num1 == num2)
			{
				System.out.println("--------------------------------------------------------------------------------------------------");
				System.out.println("Ha ingresado el mismo número. Todo número es múltiplo de si mismo.");
				System.out.println("--------------------------------------------------------------------------------------------------");
			}
			else
			{
				System.out.println("---------------------------------------------------------------");
				System.out.println("Ninguno de los números es múltiplo del otro.");
				System.out.println("---------------------------------------------------------------");
			}
		}
		else if ((num1 == 0) || (num2 == 0))
		{
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("Por definición, 0 (cero) es múltiplo de cualquier número.");
			System.out.println("-------------------------------------------------------------------------------");
		}
	}
}
