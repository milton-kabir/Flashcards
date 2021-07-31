//package flashcards;
package com.kabir.milton;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        String tr=sc.nextLine();
        String def=sc.nextLine();
        String ans=sc.nextLine();
        if(def.equals(ans)){
            System.out.println("Your answer is right!");
        }
        else{
            System.out.println("Your answer is wrong...");
        }
    }
}
