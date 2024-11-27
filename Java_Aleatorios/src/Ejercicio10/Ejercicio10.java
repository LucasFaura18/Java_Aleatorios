package Ejercicio10;

public class Ejercicio10 {
    public static void ejercicio10(){
        for (int i=1; i<=10; i++){
            int caracter = (int)(Math.random()*6+1);
            int longitud = (int)(Math.random()*40+1);
            for (int j=1; j<=longitud; j++){
                switch (caracter) {
                    case 1:
                        System.out.print("*");
                        break;
                    case 2:
                        System.out.print("-");
                        break;
                    case 3:
                        System.out.print("=");
                        break;
                    case 4:
                        System.out.print(".");
                        break;
                    case 5:
                        System.out.print("|");
                        break;
                    case 6:
                        System.out.print("@");
                        break;
                    default:
                        break;
                }
            }
            System.out.println("");
        }
    }
}
