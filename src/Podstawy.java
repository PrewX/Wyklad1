public class Podstawy {
    public static void main(String[] args) {
        int a = 10, b = 1;
        double x = 5.5;
        char zn = '?';
        boolean l = true;
        final int liczba = 100;
        Printuje("Domyślne wartości",a,b,x,zn,l,liczba);
//        a = 30000000001; -> ZA DUŻA LICZBA DLA INTA = BŁĄD, tutaj też jest long dla większych niż int, ale on napisał taką liczbę
        a = 35000000; /*w cpp jest to long long*/
        Printuje("Zmieniona wartość a",a,b,x,zn,l,liczba);
    }
    public static void Printuje(String komentarz, int a, int b, double x, char zn, boolean l, int liczba){
        System.out.printf("============================\n%s\n============================\na = %d\nb = %d\nx = %f\nzn = %s\nl = %s\nliczba = %d", komentarz, a, b, x, zn, l, liczba).println();
    }
}

// final int liczba = 100; -> Stała
// Double i Float to liczby zmiennoprzecinkowe czyli np 5.5, 4.3
// Printuje to nazwa funkcji, Main to nazwa klasy
// Komentarze rób głównie //, chyba że chcesz wieloliniowy to dopiero wtedy /* KOMENTARZ */
