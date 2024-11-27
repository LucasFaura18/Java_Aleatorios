package Ejercicio12;

public class Ejercicio12 {
    public static void ejercicio12() {
        int filas = 30;  
        int columnas = 100;  

        // Generar una matriz de caracteres aleatorios
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                // Generar un número aleatorio entre 32 y 126
                int codigoAscii = (int)(Math.random() * 95) + 32;
                
                // Convertir el número ASCII en un carácter
                char caracter = (char) codigoAscii;
                
                // Imprimir el carácter en la pantalla
                System.out.print(caracter);
            }
            // Salto de línea después de cada fila
            System.out.println();
        }
    }
}
