package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, k , total=1,i;
        System.out.print("Üssü alýnacak sayý : ");
        n=scanner.nextInt();
        System.out.print("üs olacak sayý : ");
        k=scanner.nextInt();
        for (i=1; i<=k; i++){
            total*=n;
        }
        System.out.println("Sonuç = " + total);

    }
}