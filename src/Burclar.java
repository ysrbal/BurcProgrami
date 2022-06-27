import java.util.Scanner;

public class Burclar {
    public static void main(String[] args) {
        int month, day;
        String burc = "";
        boolean isError = false;
        Scanner input = new Scanner(System.in);

        System.out.print("Dogdugunuz Gun : ");
        day = input.nextInt();
        System.out.print("Dogdugunuz Ay : ");
        month = input.nextInt();

        if (month == 1) {
            if (day < 22) {
                burc = "Oglak";
            } else if (day > 31) {
                isError = true;
            } else {
                burc = "Kova";
            }
        } else if ((month == 2)) {
            if (day < 20) {
                burc = "Kova";
            } else if (day > 28) {
                isError = true;
            } else {
                burc = "Balik";
            }
        } else if (month == 3) {
            if (day < 21) {
                burc = "Balik";
            } else if (day > 31) {
                isError = true;
            } else {
                burc = "Koc";
            }
        } else if (month == 4) {
            if (day < 21) {
                burc = "Koc";
            } else if (day > 30) {
                isError = true;
            } else {
                burc = "Boga";
            }
        } else if (month == 5) {
            if (day < 22) {
                burc = "Boga";
            } else if (day > 31) {
                isError = true;
            } else {
                burc = "Ikizler";
            }
        } else if (month == 6) {
            if (day < 23) {
                burc = "Ikizler";
            } else if (day > 30) {
                isError = true;
            } else {
                burc = "Yengec";
            }
        } else if (month == 7) {
            if (day < 23) {
                burc = "Yengec";
            } else if (day > 31) {
                isError = true;
            } else {
                burc = "Aslan";
            }
        } else if (month == 8) {
            if (day < 23) {
                burc = "Aslan";
            } else if (day > 31) {
                isError = true;
            } else {
                burc = "Basak";
            }
        } else if (month == 9) {
            if (day < 23) {
                burc = "Basak";
            } else if (day > 30) {
                isError = true;
            } else {
                burc = "Terazi";
            }
        } else if (month == 10) {
            if (day < 23) {
                burc = "Terazi";
            } else if (day > 31) {
                isError = true;
            } else {
                burc = "Akrep";
            }
        } else if (month == 11) {
            if (day < 22) {
                burc = "Akrep";
            } else if (day > 30) {
                isError = true;
            } else {
                burc = "Yay";
            }
        } else if (month == 12) {
            if (day < 22) {
                burc = "Yay";
            } else if (day > 31) {
                isError = true;
            } else {
                burc = "Oglak";
            }
        } else {
            System.out.println("Hatali Ay Girisi Yaptiniz.");
        }
        if (isError) {
            System.out.println("Hatali Gun Girdiniz.");
        } else {
            System.out.println("Burcunuz : " + burc);
        }
    }
}