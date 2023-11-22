import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] tab1 = new String[]{"11", "150", "80", "200", "52", "20", "24", "70", "50"};

        System.out.println("Poczatkowe wartosci: ");
        // male wartosci
        for (String value : tab1){
            System.out.print(value+" ");
        }
        System.out.println("\n");

        SortowaniePozycyjne.sortujPozycyjnie(tab1);

        System.out.println("Posortowane wartosci: ");
        for (String value : tab1){
            System.out.print(value+" ");
        }

        //duze wartosci
        String[] tab2 = new String[]{"13410", "17023414", "4552151", "752232625", "9063245", "8025552222", "24552", "255245", "66252525252522"};

        System.out.println("\n\nPoczatkowe wartosci: ");
        for (String value : tab2){
            System.out.print(value+" ");
        }
        System.out.println("\n");

        SortowaniePozycyjne.sortujPozycyjnie(tab2);

        System.out.println("Posortowane wartosci: ");
        for (String value : tab2){
            System.out.print(value+" ");
        }
    }
}