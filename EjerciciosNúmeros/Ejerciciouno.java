public class Ejerciciouno {

	public static void main(String[] args) {
		//Creación de la tabla
		int tabla[] = {3,6,2,77,3,10,23,14};
		//Creación y asignación de la variable contadorCantidad
		int contadorCantidad = 0;

		//Bucle para que el contador suma 1 al ver el valor 3 en la posicion tabla[i]
		for(int i = 0;i<tabla.length;i = i+1) {
			if(tabla[i]==3)
			contadorCantidad++;
	    }
		System.out.println("La tabla tiene " + contadorCantidad + " de valores 3");
	}
}