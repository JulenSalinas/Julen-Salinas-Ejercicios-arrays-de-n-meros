
public class Ejercicioseis {
	//Función llamada fibonacci para calcular el valor fibonnaci , en este caso en concreto, al tener 20 valores pero inicialmente sin valores,calculara desde la posición 0 a la 19 los valores fibonacci
	static int fibonacci(int x){
		int fibo = 1;
		int fibo1 = 1;
		int fibo2 = 1;
		
		for(int i = 2;i <= x;i++) {
			fibo = fibo * i;
		fibo = fibo1 + fibo2;
		//tiene que ir obligatoriamente en este orden:
		fibo2 = fibo1;
		fibo1 = fibo;
		}
		
		return fibo;
	}
	public static void main(String[] args) {
		//Creación de la tabla
		int tabla[] = new int[20];

		//Bucle para que mientras i sea menor que la longitud de la tabla se inserte el fibonnaci de dicho valor en esa posición, es decir, el resultado del factorial de ese valor se guarde en la posición de de dicho valor en esa posición de tabla[i]
		for(int i=0;i<tabla.length;i++)
			tabla[i] = fibonacci(i);

		//Bucle para mostrar la tabla en pantalla
		for(int i=0;i<tabla.length;i++)
			System.out.print(" " + tabla[i]);
}
}