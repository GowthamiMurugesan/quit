package guvi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quit {
	public static void main (String args[ ]) {
		char c = 0;
		BufferedReader br = new BufferedReader(new
		InputStreamReader(System.in));
		System.out.println("Enter Characters, ‘q’ to quit");
		do {
		try {
			c = (char) br.read( );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println( c );
		}while (c != 'q');
		}
		} 


