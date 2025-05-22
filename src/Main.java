import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("USD =>> Peso Chileno: ");
        Scanner scanner = new Scanner(System.in);
        int usd = scanner.nextInt();


        try {
            ExchangeRateService service = new ExchangeRateService();
            ExchangeRateResponse data = service.getExchangeRateResponse();
            System.out.println(data.getConversionRates());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}