package fst;

import java.util.HashSet;

public class activity10 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("G");
        System.out.println(hs.hashCode());
        hs.add("T");
        hs.add("A");
        hs.add("-");
        hs.add("V");
        hs.add("I");

        System.out.println("Original HashSet: " + hs);        
        System.out.println("Size of HashSet: " + hs.size());
        System.out.println("Removing A from HashSet: " + hs.remove("A"));
        if(hs.remove("T")) {
        	System.out.println("T removed from the Set");
        } else {
        	System.out.println("T is not present in the Set");
        }
        
        System.out.println("Checking if M is present: " + hs.contains("M"));
        System.out.println("Updated HashSet: " + hs);
    }
}
