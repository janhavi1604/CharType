package com.charapp;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BuffWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		try {
			
			FileWriter writer =new FileWriter("textdata");
			BufferedWriter buff=new BufferedWriter(writer);
		    buff.write("Employee Name: Peter Sam James"+"\n"+"Department:Sales"+"\n"+"Designation:Manager"+"\n"+"Salary:35000");
		    
		    buff.flush();
		    buff.close();
		}
		
		catch(IOException e)
		{
			System.out.println(e);
		}
	}

}
