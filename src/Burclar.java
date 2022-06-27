import java.util.Scanner;

public class Burclar {
    public static void main(String[] args) {
        int month, day;
        Scanner input = new Scanner(System.in);

        System.out.print("Dogdugunuz Gun : ");
        day  = input.nextInt();
        System.out.print("Dogdugunuz Ay : ");
        month = input.nextInt();

        if (month == 1) {
            if (day < 22) {
                System.out.println("Burcunuz : Oglak ");
            } else if (day > 31) {
                System.out.println("Hatali Gun Girdiniz.");
            } else {
                System.out.println("Burcunuz : Kova ");
            }
        } else if ((month == 2)) {
            if (day < 20) {
                System.out.println("Burcunuz : Kova ");
            } else if (day > 28) {
                System.out.println("Hatali Gun Girdiniz.");
            } else {
                System.out.println("Burcunuz : Balik ");
            }
        } else if (month == 3) {
            if (day < 21) {
                System.out.println("Burcunuz : Balik");
            } else if (day > 31) {
                System.out.println("Hatali Gun Girdiniz.");
            } else {
                System.out.println("Burcunuz : Koc");
            }
        } else if (month == 4) {
            if (day < 21) {
                System.out.println("Burcunuz : Koc");
            } else if (day > 30) {
                System.out.println("Hatali Gun Girdiniz.");
            } else {
                System.out.println("Burcunuz : Boga");
            }
        } else if (month == 5) {
            if (day < 22) {
                System.out.println("Burcunuz : Boga");
            } else if (day > 31) {
                System.out.println("Hatali Gun Girdiniz.");
            } else {
                System.out.println("Burcunuz : Ikizler");
            }
        } else if (month == 6) {
            if (day < 23) {
                System.out.println("Burcunuz : Ikizler");
            } else if (day > 30) {
                System.out.println("Hatali Gun Girdiniz.");
            } else {
                System.out.println("Burcunuz : Yengec");
            }
        } else if (month == 7) {
            if (day < 23) {
                System.out.println("Burcunuz : Yengec");
            } else if (day > 31) {
                System.out.println("Hatali Gun Girdiniz.");
            } else {
                System.out.println("Burcunuz : Aslan");
            }
        } else if (month == 8) {
            if (day < 23) {
                System.out.println("Burcunuz : Aslan");
            } else if (day > 31) {
                System.out.println("Hatali Gun Girdiniz.");
            } else {
                System.out.println("Burcunuz : Basak");
            }
        } else if (month == 9) {
            if (day < 23) {
                System.out.println("Burcunuz : Basak");
            } else if (day > 30) {
                System.out.println("Hatali Gun Girdiniz.");
            } else {
                System.out.println("Burcunuz : Terazi");
            }
        } else if (month == 10) {
            if (day < 23) {
                System.out.println("Burcunuz : Terazi");
            } else if (day > 31) {
                System.out.println("Hatali Gun Girdiniz.");
            } else {
                System.out.println("Burcunuz : Akrep");
            }
        } else if (month == 11) {
            if (day < 22) {
                System.out.println("Burcunuz : Akrep");
            } else if (day > 30) {
                System.out.println("Hatali Gun Girdiniz.");
            } else {
                System.out.println("Burcunuz : Yay");
            }
        } else if (month == 12) {
            if (day < 22) {
                System.out.println("Burcunuz : Yay");
            } else if (day > 31) {
                System.out.println("Hatali Gun Girdiniz.");
            } else {
                System.out.println("Burcunuz : Oglak");
            }
        }else {
            System.out.println("Hatali Ay Girisi Yaptiniz.");
        }
    }
}