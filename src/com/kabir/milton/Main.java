//package flashcards;
package com.kabir.milton;

import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> myMap = new HashMap<>();
        while (true){
            System.out.println("Input the action (add, remove, import, export, ask, exit):");
            String ck= sc.nextLine();
            String st,ts;
            if(ck.equals("exit")){
                System.out.println("Bye bye!");
                break;
            }
            if(ck.equals("add")){
                System.out.println("The card:");
                st = sc.nextLine();
                if (myMap.containsKey(st)) {
                    System.out.println("The card \"" + st + "\" already exists.");
                    continue;
                }
                System.out.println("The definition of the card:");
                ts= sc.nextLine();
                if (myMap.containsValue(ts)) {
                    System.out.println("The definition \"" + ts + "\" already exists.");
                    continue;
                }
                myMap.put(st, ts);
                System.out.println("The pair (\""+st+"\":\""+ts+"\") has been added.");
            }
            else if(ck.equals("remove")){
                System.out.println("Which card?");
                st= sc.nextLine();
                if(myMap.containsKey(st)){
                    myMap.remove(st);
                    System.out.println("The card has been removed.");
                }
                else{
                    System.out.println("Can't remove \""+st+"\": there is no such card.");
                }
            }
            else if(ck.equals("ask")){
                System.out.println("How many times to ask?");
                int cnt=Integer.parseInt(sc.nextLine());
                for(String it:myMap.keySet()) {
                    if (cnt == 0) {
                        break;
                    }
                    cnt--;
                    System.out.println("Print the definition of \"" + it + "\":");
                    st = sc.nextLine();
                    ts = myMap.get(it);
                    if (st.equals(ts)) {
                        System.out.println("Correct!");
                    } else {
                        if (myMap.containsValue(st)) {
                            for (String i : myMap.keySet()) {
                                if (myMap.get(i).equals(st)) {
                                    System.out.println("Wrong. The right answer is \"" + ts + "\", but your definition is correct for \"" + i + "\".");
                                }
                            }
                        } else {
                            System.out.println("Wrong. The right answer is \"" + ts + "\".");
                        }
                    }
                }
            }
            else if(ck.equals("import")){
                System.out.println("File name:");
                String fileName = sc.nextLine();
                boolean cardPresent = true;
                int cardCount = 0;
                try {
                    BufferedReader buffer = new BufferedReader(new FileReader(/*"C:\\Users\\chris\\" +
                    "Documents\\" + "Java Project Ref Files\\" + */fileName/* + ".txt"*/));
                    String card;
                    while (cardPresent) {
                        card = buffer.readLine();
                        if (!Objects.equals(card, null)) {
                            String[] cardSplit = card.split(",");
                            cardCount++;
                            if (myMap.containsKey(cardSplit[0])) {
                                myMap.replace(cardSplit[0], cardSplit[1]);
                            } else {
                                myMap.put(cardSplit[0], cardSplit[1]);
                            }
                        } else {
                            cardPresent = false;
                        }
                    }
                } catch (IOException e) {
                    System.out.println("File not found.");
                    continue;
                }
                System.out.printf("%d cards have been loaded.%n", cardCount);
            }
            else if(ck.equals("export")){
                System.out.println("File name:");
                String fileName = sc.nextLine();
                int cardCount = 0;
                try {
                    BufferedWriter buffer = new BufferedWriter(new FileWriter(/*"C:\Users\drifter" +
                    "Documents\\" + */fileName/* + ".txt"*/));
                    for (var card : myMap.entrySet()) {
                        buffer.write(String.format("%s,%s%n", card.getKey(), card.getValue()));
                        cardCount++;
                    }
                    buffer.close();
                } catch (IOException e) {
                    System.out.println("Unable to save file");
                    continue;
                }
                System.out.printf("%d cards have been saved.%n", cardCount);
            }
        }
    }
}
