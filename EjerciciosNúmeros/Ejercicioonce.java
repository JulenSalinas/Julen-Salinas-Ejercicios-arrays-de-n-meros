public class Ejercicioonce {
    
    // Función que verifica si un número es primo [numero primo = número únicamete divisible entre 1 y si mismo]
    static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;  // Números menores o iguales a 1 no son primos
        }

        // Comprobar divisibilidad hasta la raíz cuadrada de 'numero'
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            // Si 'numero' es divisible entre 'i', no es primo
            if (numero % i == 0) {
                return false;
            }
        }
        return true;  // Si no encuentra divisores, el número es primo
    }

    public static void main(String[] args) {
        int tabla[] = {3, 6, 2, 77, 3, 10, 23, 14};
        int contadorPrimos = 0;

        // Revisr cada número en la tabla
        for (int i = 0; i < tabla.length; i++) {
            // Verificar si el número actual es primo usando la función esPrimo
            if (esPrimo(tabla[i])) {
                contadorPrimos++;  // Incrementar el contador en 1 si el número es primo
            }
        }

        // Mostramos la cantidad de números primos en la tabla
        System.out.println("Cantidad de números primos en la tabla: " + contadorPrimos);
    }
}
