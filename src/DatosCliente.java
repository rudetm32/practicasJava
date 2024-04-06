import java.util.Scanner;

public class DatosCliente {
    public static void main(String[] args) {

        String nombreUsuario = "Juan Antonio Ruiz";
        String tipoDeCuenta = "corriente";
        double saldo = 4800.76;
        int opcion = 0;

        System.out.println("********************************");
        System.out.println("\nNombre del cliente: " + nombreUsuario);
        System.out.println("El tipo de cuenta es: " + tipoDeCuenta);
        System.out.println("Su saldo es de: " + "$ " + saldo);
        System.out.println("\n********************************");

        String menu = """
                *** Escriba el nombre de la opcion deseada ***
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 9){
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("El saldo actualizado es: " +"$ "+ saldo);
                    break;
                case 2:
                    System.out.println("Cual es el valor a retirar ? ");
                    double valorRetirar = teclado.nextDouble();
                    if( saldo < valorRetirar){
                        System.out.println("saldo insuficiente");
                    }else {
                        saldo = saldo -valorRetirar;
                        System.out.println("El saldo actualizado es: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Cual es el momto que desea depositar ? ");
                    double valorDepositar = teclado.nextDouble();
                    saldo += valorDepositar;
                    System.out.println("El saldo actual de su cuenta es: " + saldo);
                    break;
                case 9:
                    System.out.println("Gracias por su preferencia!");
                    break;
                default:
                    System.out.println("elija una opcion valida");
            }
        }
    }
}
