package it.unibo.oop.lab05.ex2;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {

	public int compare(String arg0, String arg1) {
		return  Double.compare(Double.parseDouble(arg0), Double.parseDouble(arg1));
				
	}

}
