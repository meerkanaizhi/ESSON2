package com.company;


import java.util.Random;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name = "Мээркан";
        int age = 24;
        double temp = 28;

        System.out.print("Input name = ");
        name = scan.next();

        age = generateRandomAge();
        System.out.println("Age = "+age);
        // age = scan.nextInt();

        System.out.print("Input temp = ");
        temp = scan.nextDouble();

        if((age>=20 && age<=45) && (temp<30 && temp>20)){
            System.out.println("Okey");

        } else if((age<20) && (temp>0 && temp<28)) {
            System.out.println("Okey");

        } else if((age>45) && (temp>10 && temp<25)){
            System.out.println("Okey");

        } else {
            System.out.println("No");
        }


    }

    public static int generateRandomAge(){
        int age = (int)(Math.random()*(107-0));
        return age;
    }
}
