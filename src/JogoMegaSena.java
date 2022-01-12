import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class JogoMegaSena {

	public static void main(String[] args) {

		List<Integer> numeros = new ArrayList<> ();
		
		for (int i = 1; i <= 60; i++) {
			numeros.add(i);
		}
		
		Collections.shuffle(numeros);
		List<Integer> escolhidos = numeros.subList(0, 6);
		
		System.out.println(escolhidos);
	}

}
