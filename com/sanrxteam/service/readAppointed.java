package com.sanrxteam.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

import com.google.gson.Gson;
import com.sanrxteam.baiduAPi.TransApi;
import com.sanrxteam.json.Json;

import netscape.javascript.JSObject;



public class readAppointed {
		
	private static final String APP_ID = "20170226000039911";
    private static final String SECURITY_KEY = "gL1V1LH1byLfH9Lu5pGq";
    

    
	 public static String readAppointedLineNumber(File demofile,int lineNumber){
		int lines = 0;
		String s = new String();
		String text = null;
		TransApi api = new TransApi(APP_ID, SECURITY_KEY);
		new getTotal();
		
		try {
			 

			
			FileReader in = new FileReader(demofile);
			
			LineNumberReader reader = new LineNumberReader(in); 
		//for(int lineNumber = 3;s != null  ;lineNumber += 4) {//错误疑问处；
			while(s != null){ 
		            lines++;  
		            s = reader.readLine();  
		            if((lines - lineNumber) == 0) {  
		             System.out.println(s);//
		             String query = s;
		             String out = api.getTransResult(query, "auto", "zh");//调用API
		             /*
		              * 这里是将获得的json字符串中的[]字符替换为空，
		              * 因为使用gson.fromJson时要求json字符串是标准的字符串，
		              * 不能包含[]字符，用replaceall时需要对[]进行转义。没了。
		             */
		             String ss = out.replaceAll("\\[", "").replaceAll("\\]", "");
		             Gson gson = new Gson();
		             //1.将取得的json字符串转换为Fanyi实体类
		             Json translation = gson.fromJson(ss, Json.class);
		             //Fanyi fanyi =  gson.fromJson(ss, Fanyi.class);
		             //2.用实体类中的get方法获得实体类中的属性值。
		             //System.out.println("-=-=-="+fanyi.getTo());
		             //System.out.println(translation.getTrans_result().getDst());
		             //System.out.println("-=-=-="+fanyi.getTrans_result().getSrc());
		             text = translation.getTrans_result().getDst();
		            }  
		        } 
			 reader.close();
			 in.close();
			
		} catch (FileNotFoundException  e) {
			System.out.println("文件不存在");
		}  catch (IOException e){
			e.printStackTrace();
		}
		return text;
	}
}
