package Soal;

import java.util.Scanner;

public class Soal1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int listNomor[] = new int [21];

        System.out.println("Masukin Jumlah Angka yang Ingin dighitung : ");
        int jumlahArray = input.nextInt();

        for(int i = 0; i<jumlahArray; i++){
            System.out.println("Masukin Angka ke -" + (i + 1));
            listNomor[i] = input.nextInt();
        }

         int jumlahPertambahan = 0;

        for (int i = 0; i < listNomor.length; i++) {
            jumlahPertambahan += listNomor[i];
        }
        System.out.println("Total dari pertambahan semua angka adalah: " + jumlahPertambahan);
    }
}
