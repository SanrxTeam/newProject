package com.sanrxteam;

import java.io.File;

import com.sanrxteam.service.readAppointed;
import com.sanrxteam.service.getTotal;

import com.sanrxteam.baiduAPi.TransApi;
public class start {
	
	
	
	static void service(){
		
	}
	public static void main(String[] args) {
		new readAppointed();
		new getTotal();
		
		//.srt 文件路径D:\Eclipse-neon\Wordspace\NewProject\data
		File demoFile = new File("D:\\Eclipse\\workspace\\NewProject\\data\\data.srt");
		int totalLineNum = getTotal.getTotalLines(demoFile);
		int lineNumber = 3;
		//循环输出；
		
		while(lineNumber <= totalLineNum){
		String text = readAppointed.readAppointedLineNumber(demoFile,lineNumber);//给这个方法加上返回值，返回值就是翻译回来的值
		System.out.println(text);
			lineNumber += 4;
		}
		
		//这里开始用filewrite写入文件，思路就是这样。字符流  缓存写入文件；
		//System.out.println("\u4f60\u81ea\u5df1\u505a\u7684\u5417\uff1f");
	}
	

}
