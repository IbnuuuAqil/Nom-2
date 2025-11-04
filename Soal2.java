/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal2;
import java.util.Scanner;

/**
 *
 * @author hamasawojajar
 */
public class Soal2 {

    public static void main(String[] args) {
        Scanner masukan = new Scanner (System.in);
        
        int bilangan1;
        System.out.println(" masukan bilangan");
        bilangan1 = masukan.nextInt();

        if (bilangan1 % 2 == 0) {
            System.out.println("bilangan genap");
            System.out.println("bilangan ini bisa dibagi 2");
        } else {
            System.out.println("bilangan ganjil");
            System.out.println("bilangan ini tidak bisa" + "dibagi 2");
            System.out.println("karena hasil bagi sisa 1");
        }
    }
}
