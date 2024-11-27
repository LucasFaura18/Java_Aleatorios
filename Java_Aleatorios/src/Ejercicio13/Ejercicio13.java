package Ejercicio13;

public class Ejercicio13 {
    public static void ejercicio13(){
        int num1=0;
        int num2=1;
        while (num1!=num2){
            num1 = (int)(Math.random()*6+1);
            num2 = (int)(Math.random()*6+1);
            System.out.printf("%d %d",num1,num2);
            System.out.println("");
        }
    }
}
