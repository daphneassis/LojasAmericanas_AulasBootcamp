import java.util.Arrays;
import java.util.Collections;

public class Array {
public static void main(String[] args) {
	Integer[] ints= {7,9,3,4,5};
	System.out.println("Antes de alterar");
	System.out.println(Arrays.toString(ints));
	
	System.out.println("Lista ordenada");
	Arrays.sort(ints);
	System.out.println(Arrays.toString(ints));
	
	System.out.println("Lista reversa");
	Arrays.sort(ints, Collections.reverseOrder());
	System.out.println(Arrays.toString(ints));

	
}
}
