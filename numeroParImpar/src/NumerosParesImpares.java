import java.util.Scanner; 
public class NumerosParesImpares {
	
	public NumerosParesImpares() {
		
	}

	public static void main(String[] args) {
		String par_o_impar=null;
		String continuar="S";
		
		while(continuar!="N"){
			System.out.println("Ingrese un numero (0 para finalizar)");
			
			par_o_impar = EvaluaNumero();
			continuar = par_o_impar;
			
			if (continuar!="N")
				System.out.println("El número es de tipo: "+par_o_impar);
			else 
				System.out.println("Gracias por usar nuestro sistema");			
		}
	}
	
	
	public static String EvaluaNumero(){
		int num = 0;
		
		Scanner leeEntero=new Scanner(System.in);
		
		num = leeEntero.nextInt();
		
		if (num == 0)
			return "N";
		
		if(num % 2 == 0)
		{
			return "Par";
		}else
		{
			return "Impar";
		}
		
	}

}
