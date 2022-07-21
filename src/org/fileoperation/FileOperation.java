package org.fileoperation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileOperation {
	public static void main(String[] args) throws IOException {
		
		File a=new File("C:\\Users\\Kumar\\Desktop\\murali\\mydata\\inheritance.Txt");
		boolean create = a.createNewFile();
		System.out.println(create);
		
		boolean write = a.canWrite();
		System.out.println(write);
		
		boolean read = a.canRead();
		System.out.println(read);
		
		String b=("I am going to meet my FRND");
		FileUtils.write(a,b,false);
		
		String c=("HE ");
		FileUtils.write(a,c,true);
		
	
				
	
	}
}

	


