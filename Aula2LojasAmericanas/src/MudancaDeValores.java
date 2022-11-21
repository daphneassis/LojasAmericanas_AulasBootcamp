import java.lang.invoke.ConstantBootstraps;

public class MudancaDeValores {

	public static void main(String[] args) {
		int horasNoDia = 24;
		int horasDeTrabalho = 8;
		int horasDeSono = 8;
		int horasLivres; 
		
		horasLivres= horasNoDia-horasDeTrabalho-horasDeSono;		
		System.out.println("Eu tenho " + horasLivres + " horas livres por dia.");
		//Implementar mudança nos valores
		horasLivres-=6;
		
		System.out.println("Consegui um emprego de meio período.\nAgora tenho apenas " + horasLivres + " horas livres por dia :( " );

  
	}

}
