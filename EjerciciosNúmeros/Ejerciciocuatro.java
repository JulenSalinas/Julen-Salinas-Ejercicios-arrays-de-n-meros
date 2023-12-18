public class Ejerciciocuatro {

	public static void main(String[] args) {
		//Creamos la tabla
    	int tabla[] = {3, 6, 2, 77, 3, 10, 23, 14};

        // Mostramos la tabla original
        System.out.println("Tabla original:");
        for (int i = 0; i < tabla.length; i++) {
            System.out.print(tabla[i] + " ");
        }
        System.out.println();

        // Realizamos la rotación a la derecha
        if (tabla.length > 1) {
            int ultimoElemento = tabla[tabla.length - 1];

            for (int i = tabla.length - 1; i > 0; i = i - 1) {
                tabla[i] = tabla[i - 1];
            }

            tabla[0] = ultimoElemento;
        }

        // Mostramos la tabla después de la rotación
        System.out.println("\n" + "Tabla rotada:");
        for (int i = 0; i < tabla.length; i++) {
            System.out.print(tabla[i] + " ");
        }
      
        
    }
}