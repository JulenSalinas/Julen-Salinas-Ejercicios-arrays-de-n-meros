public class Ejerciciosiete {

	public static void main(String[] args) {
		//Creamos la tabla y las variables cantidadPares y cantidadImpares inicialemente con valor de 0
		int tabla[] = {6,2,77,3,10,23,14,34};
		
		int cantidadPares = 0;
		int cantidadImPares = 0;

		//Mediante este bucle y las siguientes condiciones, aumentamos cada contador según se cumpla su condición
		for(int i = 0;i<tabla.length;i = i+1) {
			if(tabla[i]%2 == 0)
				cantidadPares++;
			if(tabla[i]%2 != 0)
				cantidadImPares++;	
		}
		//Condiciones para ver si hay más pares, impares o la misma cantidad
		if(cantidadPares>cantidadImPares)
			System.out.println("Hay más pares que impares");
		if(cantidadImPares>cantidadPares)
			System.out.println("Hay más impares que pares");
		if(cantidadPares==cantidadImPares)
			System.out.println("Misma cantidad de pares que de impares");
}
}