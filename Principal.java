import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Principal  extends VerificarParidad{

	public static void main(String[] args) {
		
		int num = 1;
		char caracter = '0';
		
		while(num == 1) 
		{
			try 
			{
				BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("-------------------------------------------------------------------------");
				System.out.println("Ingrese a,para saber si los numeros a ingresar son impares");
				System.out.println("Ingrese b,para saber si uno de los numeros a ingresar es multiplo de otro");
				System.out.println("Ingrese s,para salir del programa");
				System.out.println("-------------------------------------------------------------------------");
				caracter = entrada.readLine().charAt(0);
				
				switch(caracter) 
				{
					case 'a':sonPares();break;
					case 'b':sonMultiplos();break;
					case 's':
						System.out.println("------------------------------------");
						System.out.println("PROGRAMA TERMINADO");
						System.out.println("------------------------------------");
						break;
					default :
						System.out.println("------------------------");
						System.out.println("Caracter Inválido");
						System.out.println("------------------------");
						break;
				}
				if((caracter == 'a')||(caracter == 'b')||(caracter != 's')) 
				{
					num = 1;
				}else {
					num = 0;
				}
			}
			catch(Exception exc)
			{
				System.out.println(exc);
				num = 1;
			}			
		}
	}
}
