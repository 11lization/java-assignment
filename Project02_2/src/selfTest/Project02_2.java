package selfTest;

public class Project02_2 {

	public static void main(String[] args) {

		int intVal1, intVal2;
		
		for(intVal1 = 1; intVal1 < 6; intVal1++ )
			for(intVal2 = 5; intVal2 > 0; intVal2--)
				System.err.println(intVal1 + " multiplied by " + intVal2 + " = " + intVal1 * intVal2);
		
	}
}
