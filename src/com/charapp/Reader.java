package com.charapp;
import java.io.*;
public class Reader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileReader reader =new FileReader("textdata");
			char[] cstr=new char[50];
			
			reader.read(cstr);
			System.out.println(cstr);
			
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		catch(IOException e1)
		{
			System.out.println(e1);
		}
	}

}
