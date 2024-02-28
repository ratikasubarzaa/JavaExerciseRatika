package com.example;

public class Main {
    public static void main(String[] args) {
//        Sama kayak print
        System.out.printf("Hello and welcome!");

//        Print new line
        System.out.println("My name Ratika");
        System.out.print("I am QA Engineer");

        //    variable
        boolean flag; //Try - catch
        float num;

//        Looping 1 to 5
        for (int i = 1; i <=5; i++){

            System.out.println("i = "+1);

        }

        int a = 10;
        int b = 2;
        float c = 3;
        String nama ="Ratika";
        char q = 'Y';
        boolean flag2 = false;


        float result;
//        result = a/b; // 10 divided 2 (both int)
        result = a/c; // 1o divided 3 (one of them is float)
        int resultType = (int) (a/c); // -> Type Casting
        System.out.println(result);
        System.out.println(resultType);


        // Example cases IF ELSE
//        int timeStart = 8;
//        int timeFinish = 17;
//        int waktuSaya = 9;
//        //karyawan tepat waktu dapat selamat, karyawan telat disoraki.
//        if (waktuSaya <= timeStart){
//            System.out.println("Selamat kamu tepat waktu");
//            System.out.println("Anda datang " + (timeStart - waktuSaya) + "jam lebih cepat");
//        }else {
//            System.out.println("YEU TELAT");
//            System.out.println("Anda telat " + (waktuSaya - timeStart) + " jam");
//        }

        // kondisi pake &&
        int timeStart = 8;
        int timeFinish = 17;
        int waktuSaya = 9;
        int waktuPulang = 14;
        //Karyawan tepat waktu datang dan pulang
        //Karyawan pulang cepat disoraki
        //Karyawan telat, pulang lama, dimaafkan
        //Karyawan datang duluan, pulang cepat, dicengin

        if (waktuSaya <= timeStart && waktuPulang >= timeFinish){
            System.out.println("Selamat kamu tepat waktu datang dan pulang");
            System.out.println("Anda pulang " + (timeStart - waktuSaya) + "jam lebih cepat");
            System.out.println("Anda pulang " + (waktuPulang - timeFinish) + " jam lebih lama");
        } else if (waktuSaya <= timeStart && waktuPulang <= timeFinish) {
            System.out.println("Datang awal pulcep ni yeeeeeee");
            //karyawan telat, pulang lama dimaafkan
        } else if (waktuSaya >= timeStart && waktuPulang >= timeFinish){
            System.out.println("Dimaafkan datang telatnya");
        //Karyawan telat + pulang cepat disoraki
        } else{
            System.out.println("YEU TELAT");
            System.out.println("Anda telat" + (waktuSaya - timeStart) + " jam");
            System.out.println("Anda pulang duluan" + (timeFinish - waktuPulang) + " Jam lebih cepat");
        }

        // switch season

        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Saya WFO");
                break;
            case 2:
                System.out.println("Saya libur/cuti");
                break;
            case 3:
                System.out.println("Saya WFH");
                break;
            default:
                System.out.println("Liburan alias weekend");
                break;
        }
        System.out.println("Hehe");
    }

    //Java While Loop


}