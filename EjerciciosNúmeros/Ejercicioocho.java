
public class Ejercicioocho {
    public static void main(String[] args) {
	
    //Creación de tabla y variable capicua asignanada como verdadero
    int tabla[] = {2,6,6,2};
    boolean capicua=true;
    
        //Este bucle con condición compara tabla [i] con el último valor de la tabla - el número de vueltas de i 
        for(int i=0;i<tabla.length/2;i++)
             if(tabla[i]!=tabla[tabla.length-1-i])
                capicua=false; //Devuelve falso si lo anterior se cumple
    
        //Mostramos la condición para que nos muestre en pantalla si los valores se leen igual de los dos sentidos o no
            if(capicua)
            System.out.println("Los valores se leen igual de izquierda a derecha que de derecha a izquierda");
            else
            System.out.println("Los valores no se leen igual de izquierda a derecha que de derecha a izquierda");
    }

}
