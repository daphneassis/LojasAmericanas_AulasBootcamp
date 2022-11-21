import java.util.Scanner;

public class ListaDeLetras {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma frase");
		String frase= sc.nextLine();
		char[] charFrase = frase.toCharArray();
		
		for(int i=0;i<charFrase.length; i++) {
			System.out.println(charFrase[i]);
	
	}
	}

}
