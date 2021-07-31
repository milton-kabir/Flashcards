//package flashcards;
package com.kabir.milton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        System.out.println("Input the number of cards:");
        int tc=Integer.parseInt(sc.nextLine());
        HashMap<String, String> myMap = new HashMap<>();
        List<String > ar=new ArrayList<>();
        for(int i=1;i<=tc;i++){
            System.out.println("Card #"+i+":");
            String st= sc.nextLine();
            System.out.println("The definition for card #"+i+":");
            String ts=sc.nextLine();
            myMap.put(st,ts);
            ar.add(st);
        }
        for(int i=0;i<ar.size();i++){
            System.out.println("Print the definition of \""+ar.get(i)+"\":");
            String st= sc.nextLine();
            String ts=myMap.get(ar.get(i));
            if(st.equals(ts)){
                System.out.println("Correct!");
            }
            else{
                System.out.println("Wrong. The right answer is \""+ts+"\".");
            }
        }

    }
}
