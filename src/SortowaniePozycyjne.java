public class SortowaniePozycyjne {

    private static void wyrownajDlugosc(String[] tab) {
        int maxLength = 0;

        for (String value : tab) {
                maxLength = Math.max(maxLength, value.length()); //znalezienie dlugosci najdluzszej wartosci
        }

        for (int i = 1; i < tab.length; i++) {
                while (tab[i].length() < maxLength) { //wyrownanie dlugosci
                    tab[i] = "0" + tab[i];
                }
        }
    }

    public static void sortujPozycyjnie(String[] tab) {
        wyrownajDlugosc(tab); // wyrownujemy dlugosc
        int maxLength = tab[1].length(); // dlugosc wszystkich wartosci


        for (int cyfra = maxLength - 1; cyfra >= 0; cyfra--) { //sortowanie cyfrowe
            sortowanieCyfrowe(tab, cyfra);
        }

        for (int i = 1; i < tab.length; i++) { //usuniecie zer aby byl czytelniejszy wynik
                tab[i] = usunZera(tab[i]);
        }
    }

    private static void sortowanieCyfrowe(String[] tab, int cyfra) {
        int n = tab.length;
        String[] wynik = new String[n]; //  tablica wynikowa
        int[] zliczanie = new int[10]; //tablica do zliczania cyfr

        for (int i = 1; i < n; i++) {
            int num = tab[i].charAt(cyfra) - '0'; //konwersja
            zliczanie[num]++;
        }

        for (int i = 1; i < 10; i++) { //sumowanie
            zliczanie[i] += zliczanie[i - 1];
        }

        for (int i = n - 1; i > 0; i--) {
            int num = tab[i].charAt(cyfra) - '0';
            wynik[zliczanie[num]] = tab[i];
            zliczanie[num]--;
        }


        for (int i = 1; i < n; i++) {
            tab[i] = wynik[i]; //przepisanie do tablicy poczatkowej
        }
    }

    static String usunZera(String value) { //usuwanie zer dla czytelnosci
        int i = 0;
        while (i < value.length() - 1 && value.charAt(i) == '0') {
            i++;
        }
        return value.substring(i);
    }

}
