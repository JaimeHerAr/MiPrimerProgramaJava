import java.util.Scanner;


public class Lectura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el nombre de tu película favorita.");
        String pelicula = teclado.nextLine();
        System.out.println("Ahora escribe la fecha de lanzamiento");
        int fechaDeLanzamiiento = teclado.nextInt();
        System.out.println("Por último dinos que nota le das a esta película");
        double nota = teclado.nextDouble();

        System.out.println(pelicula);
        System.out.println(fechaDeLanzamiiento);
        System.out.println(nota);
    }
}
