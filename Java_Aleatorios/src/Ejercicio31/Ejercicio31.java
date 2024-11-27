package Ejercicio31;

public class Ejercicio31 {
    private static int tiradaDados(){
        return (int)(Math.random()*6+1);
    }
    public static void ejercicio31(){
        try{
            System.out.printf("Cuanto dinero queire apostar: ");
            int apuesta = Integer.parseInt(System.console().readLine());
            int ganancia = apuesta*2;
            int dado1 = tiradaDados();
            System.out.printf("Dado 1: %d%n", dado1);
            int dado2 = tiradaDados();
            System.out.printf("Dado 2: %d%n", dado2);
            int suma = dado1+dado2;
            System.out.printf("Suma: %d%n",suma);
            switch (suma) {
                case 7,11:
                    System.out.printf("¡Enhorabuena! ¡Ha ganado otros %d $!", apuesta);
                    break;
                case 2,3,12:
                    System.out.println("Has perdido");
                    break;
                case 4,5,6,8,9,10:
                    System.out.println("Continue jugando");
                    System.out.println("Tiene que seguir tirando.");
                    int sumanecesaria=suma;
                    System.out.printf("Debe conseguir el %d para ganar.\n", suma);
                    System.out.println("Si obtiene un 7, perderá la partida.");
                    System.out.println("Pulse INTRO para tirar los dados.");
                    System.in.read();
                    System.out.println();
                    do {
                        dado1 = tiradaDados();
                        System.out.printf("Dado 1: %d%n", dado1);
                        dado2 = tiradaDados();
                        System.out.printf("Dado 2: %d%n", dado2);
                        suma = dado1+dado2;
                        System.out.printf("Suma: %d%n",suma);
                        if (suma == 7){
                            System.out.println("Ha perdido su dinero");
                            break;
                        }
                        else if (suma == sumanecesaria){
                            System.out.printf("¡Enhorabuena! ¡Ha ganado otros %d $\n",apuesta);
                            System.out.printf("Ahora tiene %d",ganancia);
                            break;
                        } 
                        System.out.println("Continua jugando.");
                        System.out.println("Pulse INTRO para tirar los dados.");
                        System.in.read();
                        System.out.println();
                    } while (suma!=7 || suma != sumanecesaria);
                    break;
                default:
                    break;
            }
        } catch (NumberFormatException e) {
            System.out.println("Debe introducir un numero válido");
        } catch (Exception e) {
            System.out.println("Ocurrio un error inesperado");
        }
    }
}
