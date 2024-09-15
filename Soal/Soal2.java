package Soal;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukin Berapa Langkah : ");
        int langkahTangga = input.nextInt();

        for(int i = 1; i <= langkahTangga; i ++){

            for (int j = 1; j <= langkahTangga - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();  // Move to the next line after printing a row
        }

    }
}
