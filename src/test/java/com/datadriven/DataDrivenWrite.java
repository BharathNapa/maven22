package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenWrite {
	
	private static void writeData() throws InvalidFormatException, IOException {

     File f = new File("C:\\Users\\lenovo\\Maven\\Maven\\src\\test\\java\\com\\datadriven\\Movie.xlsx");
     
     FileInputStream fis = new FileInputStream(f);
     
     Workbook w = new XSSFWorkbook(fis);
     
     Sheet createSheet = w.createSheet("Info");
     
     Row createRow = createSheet.createRow(0);
     
     Cell createCell = createRow.createCell(0);
     
     createCell.setCellValue("First Name");
     
     w.getSheet("info").getRow(0).createCell(1).setCellValue("Last Name");
     
     w.getSheet("Info").getRow(0).createCell(2).setCellValue("Employee ID");
     
     w.getSheet("Info").createRow(1).createCell(0).setCellValue("Bharath");
     
     w.getSheet("Info").getRow(1).createCell(1).setCellValue("Napa");
     
     w.getSheet("Info").getRow(1).createCell(2).setCellValue("123");
     
	FileOutputStream fos = new FileOutputStream(f);
	
	w.write(fos);
	
	w.close();
	}
	
public static void main(String[] args) throws InvalidFormatException, IOException {
	
	writeData();
		
	}
	

}
