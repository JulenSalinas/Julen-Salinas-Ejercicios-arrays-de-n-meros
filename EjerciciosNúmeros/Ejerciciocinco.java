public class Ejerciciocinco {
	//Función llamada factorial, la cual nos calcula el número factorial y para este ejercicio en concteto, al ser una tabla de 10 valores pero inicialmente sin valores,calculara desde la posición 0 a la 9 los valores factoriales
	static int factorial(int x){
		int fact = 1;
		for(int i = 2;i <= x;i++)
			fact = fact * i;
		return fact;
	}
	public static void main(String[] args) {
		//Creación de la tabla
		int tabla[] = new int[10];
		
		//Bucle para que mientras i sea menor que la longitud de la tabla,se inserte el factorial de dicho valor en esa posición,es decir, el resultado del factorial de ese valor se guarde en la posición de tabla[i]
		for(int i=0;i<tabla.length;i++)
			tabla[i] = factorial(i);
		//Bucle para mostrar la tabla en pantalla
		for(int i=0;i<tabla.length;i++)
			System.out.print(" " + tabla[i]);
}
}