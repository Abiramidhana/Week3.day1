package collections;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates_1 {

	public static void main(String[] args) {
		String text = "We learn java basics as part of Java sessions sessions in java week1";
        
	    String[]words = text.split("\\s");
	        for (int i = 0; i < words.length; i++) {
	            for (int j = i+1; j < words.length; j++) {
	                if (words[i].equalsIgnoreCase(words[j])) {
	                    words[j] = "";
	                    
	                    }
	                }
	            }
	        System.out.println("String without duplicates: ");
	        for (int i = 0; i< words.length; i++) {
	            System.out.print(words[i] +" " );
	        }
	    }
	}

	