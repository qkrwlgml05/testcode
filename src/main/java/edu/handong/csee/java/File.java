package edu.handong.csee.java;

import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class File {
	public static void main (String[] args) {
		try {
			PrintWriter pw = new PrintWriter("file.txt");
			
			for (int i = 0; i < 2059; i++) {
				pw.println((i+1)+"th line.");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
