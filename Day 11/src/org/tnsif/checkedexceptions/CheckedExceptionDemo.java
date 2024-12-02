package org.tnsif.checkedexceptions;

import java.io.FileInputStream;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		
		try
		{
			FileInputStream f= new FileInputStream("C:\\Users\\bhama\\Downloads\\PRATIK ITR_final_Report .pdf");
			System.out.println("File is exists!!");
			f.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled:"+e);
		}
	}

}
