import java.util.Scanner;

public class DesafioAppBancaria {
    public static void main(String[] args) {
        String nombreCliente = "Tony Stark";
        String tipoDecUENTA = "Cuenta Corriente";
        Double saldo = 1599.99;
        int opcionCliente = 0;

        System.out.println("**************");
        System.out.println("\nNombre del cliente: " + nombreCliente);
        System.out.println("Tipo de cuenta: " + tipoDecUENTA);
        System.out.println("Saldo disponible: " + saldo);
        System.out.println("\n**************");

        Scanner teclado = new Scanner(System.in);
        System.out.println("\nPor favor elija entre una de las opciones siguientes: \n1.-Consulta de saldo \n2.-Retiro \n3.-Depósito \n4.-Salir");

        while (opcionCliente != 4){
            opcionCliente = teclado.nextInt();
            if (opcionCliente == 1){
                System.out.println("Su saldo actual es: " + saldo);
                System.out.println("\n****Por favor elija entre una de las opciones siguientes: **** \n1.-Consulta de saldo \n2.-Retiro \n3.-Depósito \n4.-Salir");

            } else if (opcionCliente == 2) {
                System.out.println("Ingrese el monto a retirar");
                double valorRetirado = teclado.nextDouble();
                if (valorRetirado > saldo){
                    System.out.println("Saldo insuficiente.");
                }else{
                    saldo = (saldo - valorRetirado);
                    System.out.println("Su saldo restante es: " + saldo);
                    System.out.println("\nPor favor elija entre una de las opciones siguientes: \n1.-Consulta de saldo \n2.-Retiro \n3.-Depósito \n4.-Salir");

                }
            } else if (opcionCliente == 3) {
                System.out.println("Ingrese el monto a ingresar:");
                double valorDepositado = teclado.nextDouble();
                saldo = (saldo + valorDepositado);
                System.out.println("Su saldo actual es: " + saldo);
                System.out.println("\nPor favor elija entre una de las opciones siguientes: \n1.-Consulta de saldo \n2.-Retiro \n3.-Depósito \n4.-Salir");

            }else {
                System.out.println("Gracias por utilizar su banca electrónica, vuelva pronto.");
                break;
            }
        }

    }
}
