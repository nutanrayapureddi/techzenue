/**
 * program about incremental operator
 * @author Nutan
 * @since day 1&2
 */
package com.techzenure.day1;

public class Increment {

	public static void main(String[] args) {
		int n = 10;
		System.out.println(n++); //  10
		System.out.println(++n); //	12
		
		n = 20;
		n= n++ + ++n;//42
		System.out.println(n);
		

	}

}
