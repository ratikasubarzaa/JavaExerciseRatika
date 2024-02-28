package com.example;
import java.util.Scanner;

public class shapeDrawer {

    Scanner scanner = new Scanner(System.in);

//    public void drawShape(int choice){
//        //Conditional pilih mrnu
//        switch(choice){
//            case 1:
//                System.out.println("Masukkan berapa tinggi segitiga:"); //Segitiga siku-siku
//                int triangleHeight = scanner.nextInt();
//                drawTriangleSS(triangleHeight);
//                break;
//            case 2:
//                System.out.println(("Masukkan berapa tinggi segitiga menu sama kaki")); //Segitiga sama kaki
//                int triangleHeight2 = scanner.nextInt();
//                drawTriangleSK(triangleHeight2);
//                break;
//            case 3:
//                break;
//            default:
//                System.out.println("Invalid input"); //Segitiga sama kaki
//
//        }
//
//    }

//    public void drawTriangleSS(int triangleHeight){
//        //Nested Loop
//        //Outer Loop
//        for(int i=1; i <= triangleHeight;i ++){
//            //Inner Loop (Take care the columns)
//            for(int j = 1;j<= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }


//    public void drawShape(int choice){
//        //Conditional pilih mrnu
//        switch(choice){
//            case 1:
//                System.out.println("Enter the height of the triangle:");//Triangle
//                int triangleHeight = scanner.nextInt();
//                drawTriangle(triangleHeight);
//                break;
//            case 2:
//                System.out.println(("Enter the height of the square:")); //Square
//                int squareHeight = scanner.nextInt();
//                drawSquare(squareHeight);
//                break;
////1
//            case 3:
//                break;
//            default:
//                System.out.println("Invalid input"); //Segitiga sama kaki
//
//        }
//
//    }
//    public void drawTriangleSK(int triangleHeight2){
//        //Nested Loop
//        //Outer Loop
//        for(int i=1; i <= triangleHeight2;i ++){
//            //Inner Loop (Take care the columns)
//            for(int j = 1;j<= triangleHeight2 -1; j++) {
//                System.out.print(" ");
//            }
//
//            for(int k = 1;k <=2 * i - 1;k++){
//                System.out.print("*");
//            }
//        }
//
//
//    }

    // ---------------------------------------------------------------------------


    public void drawShape(int choice){
        //Conditional choose menu
        switch(choice){
            case 1:
                System.out.println("Enter the height of the triangle:");//Triangle
                int triangleHeight = scanner.nextInt();
                drawTriangle(triangleHeight);
                break;
            case 2:
                System.out.println(("Enter the height of the square:")); //Square
                int squareHeight = scanner.nextInt();
                drawSquare(squareHeight);
                break;
//1
            case 3:
                System.out.println(("Enter the height of the rectangle:")); //Rectangle
                int rectangleHeight = scanner.nextInt();
                drawRectangle(rectangleHeight);
                break;
            case 4:
                break;
            default:
                System.out.println("Invalid input"); //

        }

    }

    public void drawTriangle(int triangleHeight){

        //Nested Loop
        //Outer Loop
        for(int i=1; i <= triangleHeight;i++){
            //Inner Loop (Take care the columns)
            for(int j = 1;j <= triangleHeight +1; j++) {
                System.out.print(  " " );
            }
            for(int k = 1; k <= 2 * i -1; k++)
                System.out.print("*");

            System.out.println();
        }
    }

    public void drawSquare(int squareHeight){
        for(int i=1; i <= squareHeight;i ++){
           //Inner Loop
           for(int s = 1 ;s <= i; s++){
               System.out.print("*");
           }
           System.out.println();
        }
    }

    public void drawRectangle(int rectangleHeight){
        for(int i=1; i <= rectangleHeight;i ++){
            //Inner Loop
            for(int s = 1 ;s <= i; s++){
                System.out.print( "*" );
            }
            System.out.println();
        }
    }

    public void displayMenu(){
        System.out.println("Welcome to ASCII Shape Drawer");
        System.out.println("Choose a shape to draw: ");
        System.out.println("1. Triangle"); //Nested loop
        System.out.println("2. Square"); //Nested Loop, tapi inner loop ada 2
        System.out.println("3. Rectangle");
        System.out.println("4. Exit");
    }

    public void run(){
        //Loop while untuk aplikasi terus running sampai ada exit
        while (true){
            displayMenu();
            System.out.println("Masukkan Pilihan Anda");
            int choice = scanner.nextInt();
            drawShape(choice); //Dimana ada condiitonal IF else atau switch
            System.out.println();
        }
    }

    public static  void main(String[]args){
        //Inheritance (OOP)
        //Untuk Running
        shapeDrawer drawer = new shapeDrawer();
        drawer.run();

    }
}
