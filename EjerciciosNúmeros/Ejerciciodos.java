public class Ejerciciodos {

    public static void main(String[] args) {
		//Creamos la tabla
        int tabla[] = {3, 6, 2, 77, 3, 10, 23, 14, 2, 34};
		//Creamos las variables y les damos los siguientes valores
        int longitud = tabla.length;
        int mitad = longitud / 2;

        int primeraMitad = 0;
        int segundaMitad = 0;

		//Sumamos las dos mitades mediante este bucle
        for (int i = 0; i < longitud; i++) {
            if (i < mitad) 
                primeraMitad = primeraMitad + tabla[i];
             else 
                segundaMitad = segundaMitad + tabla[i];
            
        }

		//Comparamos las mitades mediante condiciones para ver cual es superior a la otra
        if (primeraMitad > segundaMitad) 
            System.out.println("La suma de la primera mitad de la tabla es superior a la segunda");
        
        else 
        	if (segundaMitad > primeraMitad) 
            System.out.println("La suma de la segunda mitad de la tabla es superior a la primera");
         else 
            System.out.println("La suma de las dos mitades de la tabla es igual");
        
    }
}