public class Ejerciciodiez {
	
	public static void main(String[] args) {
		//Creación de la tabla
		int tabla[] = {6,2,77,3,10,23,14,34};
		//Creación y asignación de variables
		int Divisible = 0;
		int noDivisible = 0;
		
		//Bucle y condición para que el contador de Divisible entre 7 se incremente en 1 al ser dividsible entre 7
		for(int i = 0;i<tabla.length;i = i+1) {
			if(tabla[i]%7 == 0)
				Divisible++;	
		}
		//Bucle y condición para que el contador de noDivisible entre 7 se incremente en 1 suba al no ser dividsible entre 7
		for(int i = 0;i<tabla.length;i = i+1) {
	
			if(tabla[i]%7 != 0)
				noDivisible++;
		}
		//Mostramos en pantalla la cantidad de valores divsibles y no divisible entre 7
		System.out.println("La cantidad de valores divisibles entre 7 son  " + Divisible);
		System.out.println("La cantidad de valores no divisibles entre 7 son " + noDivisible);
}
}