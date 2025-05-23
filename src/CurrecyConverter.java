import java.util.Scanner;
import java.util.SimpleTimeZone;

public class CurrecyConverter {

    Scanner scanner = new Scanner(System.in);
    ExchangeRateResponse currency = getCurrencyCoverter();
    double value;
    double finalResult;
    double CLP;
    double BRL;
    double ARS;
    String formatResult;
    public void menuOption(int numberOption){
        switch (numberOption){
            case 1:
                System.out.print("\nIngresa los dolares para tranformarlo a pesos chilenos: ");
                value = scanner.nextDouble();
                CLP = currency.getConversionRates().get("CLP");
                finalResult = (value * CLP);
                formatResult = String.format("%.2f", finalResult);
                System.out.print("El valor de " + value + " dolares son " + formatResult + " pesos chilenos\n");
                break;
            case 2:
                System.out.print("\nIngresa los pesos chilenos para tranformarlo a dolares: ");
                value = scanner.nextDouble();
                CLP = currency.getConversionRates().get("CLP");
                finalResult = value / CLP;
                formatResult = String.format("%.2f", finalResult);
                System.out.print("El valor de " + value + " pesos chilenos son " + formatResult + " dolares\n");
                break;
            case 3:
                System.out.print("\nIngresa los dolares para tranformarlo a real brasileños: ");
                value = scanner.nextDouble();
                BRL = currency.getConversionRates().get("BRL");
                finalResult = value * BRL;
                formatResult = String.format("%.2f", finalResult);
                System.out.print("El valor de " + value + " dolares son " + formatResult + " reales brasileños\n");
                break;
            case 4:
                System.out.print("\nIngresa los reales brasileños para tranformarlo a dolares: ");
                value = scanner.nextDouble();
                BRL = currency.getConversionRates().get("BRL");
                finalResult = value / BRL;
                formatResult = String.format("%.2f", finalResult);
                System.out.print("El valor de " + value + " reales brasileños son " + formatResult + " dolares\n");
                break;
            case 5:
                System.out.print("\nIngresa los dolares para tranformarlo a pesos argentinos: ");
                value = scanner.nextDouble();
                ARS = currency.getConversionRates().get("ARS");
                finalResult = value * ARS;
                formatResult = String.format("%.2f", finalResult);
                System.out.print("El valor de " + value + " dolares son " + formatResult + " pesos argentinos\n");
                break;
            case 6:
                System.out.print("\nIngresa los pesos argentinos para tranformarlo a dolares: ");
                value = scanner.nextDouble();
                ARS = currency.getConversionRates().get("ARS");
                finalResult = value / ARS;
                formatResult = String.format("%.2f", finalResult);
                System.out.print("El valor de " + value + " pesos argentinos son " + formatResult + " dolares\n");
                break;
            default:
                break;

        }
    }

    public ExchangeRateResponse getCurrencyCoverter(){
        ExchangeRateService exchangeRateService = new ExchangeRateService();
        return exchangeRateService.getExchangeRateResponse();
    }
}
