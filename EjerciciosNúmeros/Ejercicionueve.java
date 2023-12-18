
public class Ejercicionueve {

	static int aleatorio(){
		// Función para generar un número aleatorio entre 0 y 39
		int numAleatorio = (int)Math.floor(Math.random()* 40);
		return numAleatorio;
	}
	 // Función para verificar si un número ya existe en la tabla
	static boolean existeTabla(int x, int t[], int cantidad) {
		for(int i=0;i<cantidad;i++)
			if(t[i]==x)
				return true;
		return false;
	}
	
	public static void main(String[] args) {
		//Creamos una tabla de tamaño 8 para almacenar los números aleatorios
		int tabla[] = new int[8];

		// Genera y asigna números aleatorios sin duplicar en la tabla
		for(int i=0;i<tabla.length;i++) {
			int candidato=aleatorio();
			// Verifica si el número ya existe en la tabla, y generar otro si es necesario
			while (existeTabla(candidato, tabla, i))
				candidato=aleatorio();
			// Asignar el número aleatorio no duplicado a la tabla
			tabla[i]=candidato;
		}
			
		//Bucle para mostrar la tabla
		for(int i=0;i<tabla.length;i++)
			System.out.print(" " + tabla[i]);
}

}
