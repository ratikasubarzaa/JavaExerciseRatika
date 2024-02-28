package com.example;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Collection;
import java.util.AbstractCollection;

interface Shape{ //on of implementation of polymorphism
    void draw(int height);
}

class drawTriangleSS implements Shape {
    @Override
    public void draw(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class drawTriangleSK implements Shape {
    @Override
    public void draw(int triangleHeight) {
        for (int i = 1; i <= triangleHeight; i++) {
            for (int j = 1; j <= triangleHeight - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
public class ShapeDrawerPolyMorph {

    Scanner scanner = new Scanner(System.in);
    public void  displayMenu(){
        System.out.println("Selamat datang di ASCII gambar!");
        System.out.println("pilih gambar: ");
        System.out.println("1. segita siku-siku"); //nested loop
        System.out.println("2. segitiga sama kaki"); //nedted loop, tapi inner loop ada 2
        System.out.println("3. exit");
    }

    public void drawShape(int choice) {
        //conditional pilih menu
        try {
            switch (choice) {
                case 1:
                    System.out.println("Masukan berapa tinggi segitiga"); //segitiga siku-siku
                    int height = scanner.nextInt();
                    new drawTriangleSS().draw(height);
                    break;
                case 2:
                    System.out.println("Masukan berapa tinggi segitiga"); //segitiga sama kaki
                    int height2 = scanner.nextInt();
                    new drawTriangleSK().draw(height2);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Input"); //segitiga sama kaki
            }
        } catch (InputMismatchException ime) {
            System.out.println("Please enter a valid integer.");
            scanner.next();
        }
    }


    public void run(){
        while (true){
            displayMenu();
            System.out.println("Masukan Pilihan Anda: ");
            try {
                int choice = scanner.nextInt();
                drawShape(choice); // dimana ada kondisional
                System.out.println();
            } catch (InputMismatchException ime){
                System.out.println("Please enter a valid integer.");
                scanner.next();
            }
        }
    }
    public static void main(String[] args) {
        //inheritance (OOP)
        //untuk running
        ShapeDrawerPolyMorph drawer = new ShapeDrawerPolyMorph();
        drawer.run();
    }
}