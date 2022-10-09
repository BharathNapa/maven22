package com.api;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonParse_Demo {
	
	public static void main(String[] args) throws IOException, ParseException {
		
File f = new File("C:\\Users\\lenovo\\Maven\\Maven\\src\\test\\java\\com\\api\\file.jason");
		
		FileReader fr = new FileReader(f);
		
		JSONParser jp = new JSONParser();
		
		Object parse = jp.parse(fr);
		
		JSONObject jsonobj = (JSONObject) parse;
		
		Object object = jsonobj.get("page");
		
       System.out.println(object);
		
	
		
		
	}
		
		
		
		
		
	}
	

