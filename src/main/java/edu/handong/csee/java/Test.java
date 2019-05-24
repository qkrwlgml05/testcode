package edu.handong.csee.java;

import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Object myObject = new Test();
		((Test)myObject).run();
	}

	public void run() {
		String fileName = "out.txt";
		Scanner outputStream = null;
		
		try {
			outputStream = new Scanner(new File(fileName));
		} catch(FileNotFoundException e) {
			System.out.println("Error opening the file " + fileName);
			System.exit(0);
		}
		int count = 0;
        while(outputStream.hasNext()) {
            String stream = outputStream.nextLine();
            System.out.println(++count + ")" + stream);
        }
        outputStream.close();
	}
}