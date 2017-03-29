package com.sanrxteam.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;



/*
 * 遍历文件行数
 */
public class getTotal {
	public static int getTotalLines(File file) {  
		
		int lines = 0; 
		
		FileReader in;
        LineNumberReader reader;
		
        try {
			in = new FileReader(file);
			reader = new LineNumberReader(in);  
	        String s = reader.readLine();  
	         
	        while (s != null) {  
	            lines++;  
	            s = reader.readLine();  
	        }  
	        reader.close();  
	        in.close();
	        
		} catch (FileNotFoundException e) {
			System.out.println("无文件");
		}  catch ( IOException e){
			e.printStackTrace();
		}
		  
        return lines;  
    }


}
