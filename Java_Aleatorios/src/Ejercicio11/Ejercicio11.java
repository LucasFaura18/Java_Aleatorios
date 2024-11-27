package Ejercicio11;

public class Ejercicio11 {
    public static void ejercicio11(){
        int suspensos=0;
        int suficientes=0;
        int bienes=0;
        int notables=0;
        int sobresalientes=0;
        for (int i=1; i<=20; i++){
            int nota = (int)(Math.random()*5+1);
                switch (nota) {
                    case 1:
                        System.out.print("suspenso ");
                        suspensos = suspensos+1;
                        break;
                    case 2:
                        System.out.print("suficiente ");
                        suficientes = suficientes+1;
                        break;
                    case 3:
                        System.out.print("bien ");
                        bienes = bienes+1;
                        break;
                    case 4:
                        System.out.print("notable ");
                        notables = notables+1;
                        break;
                    case 5:
                        System.out.print("sobresaliente ");
                        sobresalientes = sobresalientes+1;
                        break;
                    default:
                        break;
                }
        }
        System.out.printf("\nNº de suspensos: %d%n", suspensos);
        System.out.printf("Nº de suficientes: %d%n", suficientes);
        System.out.printf("Nº de bienes: %d%n", bienes);
        System.out.printf("Nº de notables: %d%n", notables);
        System.out.printf("Nº de sobresalientes: %d", sobresalientes);

    }
}
