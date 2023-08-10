package com.charapp;
import java.io.*;
public class PrintWritter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			PrintWriter writer=new PrintWriter(new FileWriter("textdata"));
			writer.write("Employee Name: Peter Sam James"+"\n"+"Department:Sales"+"\n"+"Designation:Manager"+"\n"+"Salary:35000");
			
		}
		catch(IOException e)
		{
			System.out.println(e);
		}

	}

}
