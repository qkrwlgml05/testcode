package edu.handong.csee.java;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckFile {
	String path1;
	String path2;
	
	public static void main (String[] args) {
		CheckFile check;
		if (args.length == 2) {
			check = new CheckFile(args);
		}
		else {
			String[] example = new String[2];
			Scanner sc = new Scanner(System.in);
			System.out.print("Please, Enter your two file path and file name");
			example[0] = sc.next();
			example[1] = sc.next();
			
			check = new CheckFile(example);
			sc.close();
		}
		
		check.run();
	}
	
	public CheckFile (String[] args) {
		path1 = args[0];
		path2 = args[1];
	}
	
	public void run() {
		try {
			Scanner file1 = new Scanner(new File (path1));
			Scanner file2 = new Scanner(new File (path2));
			int count = 0;
			while (file1.hasNext() && file2.hasNext()) {
				String line1 = file1.nextLine();
				String line2 = file2.nextLine();
				count++;
				if (!line1.equals(line2)) {
					System.out.println("1. " + line1 + "/// 2. " + line2 + "/// in " + count +"th line");
				}
			}
			
			if (file1.hasNext() || file2.hasNext()) {
				System.out.println("The file length is not balanced.");
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found!");
		}
	}

}
