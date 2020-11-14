package it.unibo.oop.lab05.ex1;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Example class using {@link Set}.
 * 
 */
public final class UseSet {

    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         * 
         * 1) Builds a TreeSet containing Strings
         */
    	
    	final var treeset = new TreeSet<String>();
    	
         /* 2) Populates such Collection with all the Strings ranging from "1" to
         * "20"
         */
    	for (int i = 1; i <= 20; i++) {
    		treeset.add(Integer.toString(i));
    	}
    	
         /* 3) Prints its content
         */
    	System.out.println(treeset);
    	
    	
         /* 4) Removes all those strings whose represented number is divisible by
         * three
         */
    	
    	Iterator<String> it1 = treeset.iterator();
    	
    	while(it1.hasNext()) {
    		if(Integer.parseInt(it1.next()) % 3 == 0 ) {
    			it1.remove();
    		}
    	}
    	
         /* 5) Prints the content of the Set using a for-each construct
         */
    	
    	for(final var number : treeset) {
    		System.out.println(number);
    	}
         /* 6) Verifies if all the numbers left in the set are even
         */
    	
    	boolean isEven = true;
    	for(final var number : treeset) {
    		isEven = (Integer.parseInt(number) % 2 == 0) ? isEven: false;
    	}
    	
    	System.out.println("All numbers left are even : " + isEven);
    }
}
