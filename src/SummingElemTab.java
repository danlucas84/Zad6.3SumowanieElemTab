import java.util.Scanner;

public class SummingElemTab {

    public static void main(String[] args) {
        int[] tab = new int [5];
        Scanner scan = new Scanner(System.in);
        System.out.println(" podaj 1 liczbe");
        tab[0] = scan.nextInt();
        System.out.println("Podaj 2 liczbę");
        tab[1] = scan.nextInt();
        System.out.println("Podaj 3 liczbe");
        tab[2] = scan.nextInt();
        System.out.println("Podaj 4 liczbe");
        tab[3] = scan.nextInt();
        System.out.println("Podaj 5 liczbe");
        tab[4] = scan.nextInt();


        int sum = tab[0] + tab[2] + tab[4];
        System.out.println("suma 1, 3 oraz 5 liczby z 5 liczb wczytanych  to: " + sum);
    }
}
