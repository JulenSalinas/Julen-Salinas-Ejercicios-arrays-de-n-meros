public class Ejerciciotres {
	
	public static void main(String[] args) {
		//Creamos la tabla y la variable hayRepetidos inicialmente asignada como un boolean false
        int tabla[] = {3, 6, 2, 77, 3, 10, 23, 14};
        boolean hayRepetidos = false;
		
		//Bucle para comparar cada elemento con los elementos siguientes en la tabla
        for (int i = 0; i < tabla.length - 1; i++) {
            for (int j = i + 1; j < tabla.length; j++) {
				// Si encontramos dos elementos iguales, establecemos hayRepetidos como true
                if (tabla[i] == tabla[j]) {
                	hayRepetidos = true;
                }
            }
        }
		//Mostramos mediante la condición de hayRepetidos si hay algún elemento repetido en la tabla o no
        if (hayRepetidos) 
            System.out.println("Hay elementos duplicados en la tabla");
         else 
            System.out.println("Todos los valores de la tabla son diferentes");
        
    }
}