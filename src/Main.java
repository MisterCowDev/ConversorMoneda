import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CurrecyConverter currecyConverter = new CurrecyConverter();

        while (true){
            try {
                System.out.println("\n****** Bienvenido al corvertidor de monedas ******\n");
                System.out.println("1) Dolar ==>> Peso Chileno");
                System.out.println("2) Peso Chileno ==>> Dolar");
                System.out.println("3) Dolar ==>> Real Brasileño");
                System.out.println("4) Real Brasileño ==>> Dolar");
                System.out.println("5) Dolar ==>> Peso Argentino");
                System.out.println("6) Peso Argentino ==>> Dolar");
                System.out.println("7) Salir");
                System.out.print("Selecciona una de las siguientes opciones con un número: ");
                int option = scanner.nextInt();
                if (option >= 1 && option <= 6) {
                    currecyConverter.menuOption(option);
                } else if (option == 7) {
                    System.out.println("\nGracias por usar el convertidor de monedas");
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("\nDebe ingresar una opción valida");
                scanner.nextLine();
            } catch (Exception  e) {
                throw new RuntimeException(e);
            }
        }



    }
}