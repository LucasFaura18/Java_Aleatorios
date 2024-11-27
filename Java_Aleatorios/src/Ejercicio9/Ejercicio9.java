package Ejercicio9;

public class Ejercicio9 {
    public static void ejercicio9(){
        int num = 0;
        int aux = 0;
        while (num !=24){
            num = (int)(Math.random()*100+1);
            if (num%2==0){
                System.out.printf("%d ",num);
                aux = aux+1;
            }
        }
        System.out.printf("\nSe han generado %d números", aux);
    }
}
