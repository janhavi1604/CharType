package com.charapp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BuffReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileReader reader =new FileReader("textdata");
			BufferedReader buff =new BufferedReader(reader);
			char[] cstr=new char[50];
			
			buff.read(cstr);
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


