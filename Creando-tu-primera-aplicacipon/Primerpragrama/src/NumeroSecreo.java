import java.util.Random;
import java.util.Scanner;

public class NumeroSecreo {
    public static void main(String[] args) {
        Scanner teclado =  new Scanner(System.in);
        int NumeroGenerdado = new Random().nextInt(100);
        int intento = 0;

        while (intento < 5){
            System.out.println("Introduzca un número entero entre el 1 y el 100");
            int numeroDelUsuario = teclado.nextInt();
            intento ++;

            if (numeroDelUsuario == NumeroGenerdado){
                System.out.println("¡Felicidades!, acertaste en: " + intento  + "intenos.");
                break;
            }else if (numeroDelUsuario < NumeroGenerdado){
                System.out.println("El número secreto es mayor, vuelve a intentarlo, te quedan: " + intento + "intentos.");

            }else{
                System.out.println("El número secreto es menor, vuelve a intentarlo, te quedan: " + intento + "intentos");

            }
            if (intento == 5){
                System.out.println("Lo siento, no conseguiste completar el desafío. El nuero era " + NumeroGenerdado);
            }

        }

    }
}
