import java.util.Locale;

public class Exercicio2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
			String nomeDoCliente ="Superman";
			int coposDeCafe=1;
			double custoDoCafe=99.9; 
			boolean gorjeta= true;
			
	
		System.out.println("Prezado " + nomeDoCliente + ", obrigado por apoiar nosso neg�cio!"); 
		System.out.println("Copos de caf� comprados: " + coposDeCafe + "."); 
		System.out.println("Custo de 1 x�cara de caf�: $" + custoDoCafe + "."); 
		System.out.println("Seu total �: $ 99,9."); 
		System.out.print("Gorjeta inclu�da? " + gorjeta + ".");
		//String valorTexto = "1000,00";
	//double valor = Double.parseDouble(valorTexto.replace("," , "."));
		
	}

}
