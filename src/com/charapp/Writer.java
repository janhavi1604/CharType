package com.charapp;
import java.io.*;

public class Writer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			FileWriter writer =new FileWriter("textdata");
		    writer.write("Employee Name: Peter Sam James"+"\n"+"Department:Sales"+"\n"+"Designation:Manager"+"\n"+"Salary:35000");
		    
		    writer.flush();
		    writer.close();
		}
		
		catch(IOException e)
		{
			System.out.println(e);
		}
		

	}

}
