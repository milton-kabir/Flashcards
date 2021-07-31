//package flashcards;
package com.kabir.milton;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number of cards:");
        int tc = Integer.parseInt(sc.nextLine());
        HashMap<String, String> myMap = new HashMap<>();
        List<String> ar = new ArrayList<>();
        for (int i = 1; i <= tc; i++) {
            System.out.println("Card #" + i + ":");
            String st, ts;
            while (true) {
                st = sc.nextLine();
                if (myMap.containsKey(st)) {
                    System.out.println("The term \"" + st + "\" already exists. Try again:");
                    continue;
                }
                break;
            }
            System.out.println("The definition for card #" + i + ":");
            while (true) {
                ts = sc.nextLine();
                if (myMap.containsValue(ts)) {
                    System.out.println("The definition \"" + ts + "\" already exists. Try again:");
                    continue;
                }
                break;
            }

            myMap.put(st, ts);
            ar.add(st);
        }
        for (int i = 0; i < ar.size(); i++) {
            System.out.println("Print the definition of \"" + ar.get(i) + "\":");
            String st = sc.nextLine();
            String ts = myMap.get(ar.get(i));
            if (st.equals(ts)) {
                System.out.println("Correct!");
            } else {
                if(myMap.containsValue(st)) {
                    for(String it:myMap.keySet()){
                        if(myMap.get(it).equals(st)){
                            System.out.println("Wrong. The right answer is \"" + ts + "\", but your definition is correct for \""+it+"\".");
                        }
                    }

                }
                else{
                    System.out.println("Wrong. The right answer is \"" + ts + "\".");
                }
            }
        }

    }
}
