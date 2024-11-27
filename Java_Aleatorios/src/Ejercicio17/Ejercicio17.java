package Ejercicio17;

public class Ejercicio17 {
    public static void ejercicio17(){
        System.out.printf("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
        int altura = Integer.parseInt(System.console().readLine());
        System.out.printf("Ahora introduzca la anchura (como mínimo 4): ");
        int anchura = Integer.parseInt(System.console().readLine());
        int xpez = (int)(Math.random()*(anchura-2)+2);
        int ypez = (int)(Math.random()*(altura-2)+2);
        for (int i = 1; i<=altura; i++){
            System.out.printf("* ");
            for (int j=1; j<=anchura-2; j++){
                if (i==1 || i==altura){
                    System.out.printf("* ");
                } else if (i==ypez && j==xpez) {
                    System.out.printf("& ");
                }
                else{
                    System.out.printf("  ");
                }
            }
            System.out.printf("*");
            System.out.println("");
        }
    }
}
