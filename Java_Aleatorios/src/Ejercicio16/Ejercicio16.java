package Ejercicio16;

public class Ejercicio16 {
    public static void ejercicio16(){
        int num1=0;
        int num2=0;
        int num3=0;
        for (int i = 1; i<=1; i++){
                num1 = (int)(Math.random()*5+1);
                num2 = (int)(Math.random()*5+1);
                num3 = (int)(Math.random()*5+1);
                switch (num1) {
                    case 1:
                        System.out.print("corazon ");
                        break;
                    case 2:
                        System.out.print("diamante ");
                        break;
                    case 3:
                        System.out.print("herradura ");
                        break;
                    case 4:
                        System.out.print("campana ");
                        break;
                    case 5:
                        System.out.print("limón ");
                        break;
                    default:
                        break;
                }
                switch (num2) {
                    case 1:
                        System.out.print("corazon ");
                        break;
                    case 2:
                        System.out.print("diamante ");
                        break;
                    case 3:
                        System.out.print("herradura ");
                        break;
                    case 4:
                        System.out.print("campana ");
                        break;
                    case 5:
                        System.out.print("limón ");
                        break;
                    default:
                        break;
                }
                switch (num3) {
                    case 1:
                        System.out.print("corazon ");
                        break;
                    case 2:
                        System.out.print("diamante ");
                        break;
                    case 3:
                        System.out.print("herradura ");
                        break;
                    case 4:
                        System.out.print("campana ");
                        break;
                    case 5:
                        System.out.print("limón ");
                        break;
                    default:
                        break;
                }
            if (num1==num2 && num1==num3){
                System.out.println("\nEnhorabuena, ha ganado");
                i=5;
            }
            else if (num1==num2 || num1==num3){
                System.out.println("\nBien, ha recuperado su moneda");
                i=0;
            }
            else {
                System.out.println("\nLo siento, ha perdido");
                i=5;
            }
        }
    }
}
