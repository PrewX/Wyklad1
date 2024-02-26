import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.printf("Podaj wartość a: ");
        int a = scn.nextInt();
        System.out.printf("\nPodaj wartość b: ");
        int b = scn.nextInt(), c;
//        c = a+b;
//        System.out.printf("%d", c).println();
//        a = a+5;
//        System.out.printf("%d", a).println();
//        b = b-100;
//        System.out.printf("%d", b).println();
//        a = b*10+a*7;
//        System.out.printf("%d", a).println();
//        Pod tym napisz to
//        System.out.println("Moja wersja");
//        if(a>b){
//            System.out.printf("%d jest większe od %d", a, b).println(); //To jest prawidłowo
//        } else {
//            System.out.printf("%d jest mniejsze od %d", a, b).println();
//        }
        System.out.println("Twoja wersja");
        for(int i = 1; i <= a; i++ ) {
            System.out.printf("%d", i).println(); //staram się mniej więcej poruszać jak w cpp//    Zobacz jak u mnie wygląda printf i porównaj sobie (%s -> String, %d -> Int, %f -> Double, Float (zmiennoprzecinkowe)
        }
        System.out.println("Do While");
        int x = 0;
        do {
            System.out.println(x);
            x++;
        } while(x < 10);
//        Wypisało od 1 do 5 (po zmianie), tak chciałeś? Można i od 1
        //do while i while działa tak samo jak w cpp? 1:1 jak w cpp o tyle plus
    }
}

