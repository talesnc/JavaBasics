import java.util.Scanner;

public class CurrencySplitter {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        double Total = reader.nextDouble();
        int notes = (int) Total;
        int coins = (int) ((Total - notes) * 100);
        int notes100 = notes / 100;
        notes -= notes100 * 100;
        int notes50 = notes / 50;
        notes -= notes50 * 50;
        int notes20 = notes / 20;
        notes -= notes20 * 20;
        int notes10 = notes / 10;
        notes -= notes10 * 10;
        int notes5 = notes / 5;
        notes -= notes5 * 5;
        int notes2 = notes / 2;
        notes -= notes2 * 2;
        int coins1 = notes;
        notes -= coins1 * 1;
        int coins50 = coins / 50;
        coins -= coins50 * 50;
        int coins25 = coins / 25;
        coins -= coins25 * 25;
        int coins10 = coins / 10;
        coins -= coins10 * 10;
        int coins05 = coins / 5;
        coins -= coins05 * 5;
        int coins01 = coins;
        
        System.out.println("NOTAS:");
        System.out.println(notes100 + " nota(s) de R$ 100.00");
        System.out.println(notes50 + " nota(s) de R$ 50.00");
        System.out.println(notes20 + " nota(s) de R$ 20.00");
        System.out.println(notes10 + " nota(s) de R$ 10.00");
        System.out.println(notes5 + " nota(s) de R$ 5.00");
        System.out.println(notes2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(coins1 + " moeda(s) de R$ 1.00");
        System.out.println(coins50 + " moeda(s) de R$ 0.50");
        System.out.println(coins25 + " moeda(s) de R$ 0.25");
        System.out.println(coins10 + " moeda(s) de R$ 0.10");
        System.out.println(coins05 + " moeda(s) de R$ 0.05");
        System.out.println(coins01 + " moeda(s) de R$ 0.01");
    }
}
