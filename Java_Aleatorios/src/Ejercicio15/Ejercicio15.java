package Ejercicio15;

public class Ejercicio15 {
    public static void ejercicio15(){
        for (int i=1; i<=4; i++){
            for (int j=1; j<=4;j++){
                int num = (int)(Math.random()*7+1);
                switch (num) {
                    case 1:
                        System.out.printf(" do ");
                        break;
                    case 2:
                        System.out.printf(" re ");
                        break;
                    case 3:
                        System.out.printf(" mi ");
                        break;
                    case 4:
                        System.out.printf(" fa ");
                        break;
                    case 5:
                        System.out.printf(" sol ");
                        break;
                    case 6:
                        System.out.printf(" la ");
                        break;
                    case 7:
                        System.out.printf(" si ");
                        break;
                    default:
                        break;
                }
            }
            System.out.print(" |");
        }
        System.out.print(" |");
    }
}
