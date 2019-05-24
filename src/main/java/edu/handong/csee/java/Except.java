package edu.handong.csee.java;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Except {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

	}
	
	public static void method1() throws FileNotFoundException{
		method2();
	}
	
	public static void method2() throws FileNotFoundException {
		Scanner fi = new Scanner(new File("input.txt"));
		fi.close();
	}
   
}
