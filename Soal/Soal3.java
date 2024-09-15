package Soal;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukin camelCase : ");
        String camelCase = input.next();

        int hitungKata = camelCase.split("(?=[A-Z])").length;

        System.out.println("Jumlah Kata yang Dimasukin Adalah : " + hitungKata);
    }
}
