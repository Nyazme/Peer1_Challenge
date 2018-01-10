package com.company;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        String CorrectPassword = "chocolate";
        Scanner Phred = new Scanner(System.in);
        System.out.println("Enter Password");
        String inputfromuser = Phred.nextLine();
                System.out.println("here is your password" + inputfromuser);
        if(CorrectPassword.equals (inputfromuser)) {
            System.out.println("Welcome");


        }





    }
}
