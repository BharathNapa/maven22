package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenRead {
	
	public static void allData() throws IOException {
		
 System.out.println("All Data");
System.out.println(" ---------------");
		
		File f = new File("C:\\Users\\lenovo\\Maven\\Maven\\src\\test\\java\\com\\datadriven\\Movie.xlsx");
		
		FileInputStream fip = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fip);
		
		Sheet sheetAt = w.getSheetAt(0);
		
		  int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
		  
		 for (int i = 0; i < physicalNumberOfRows; i++) {
			 
			 Row row = sheetAt.getRow(i);
			 
			 int physicalNumberOfCells = row.getPhysicalNumberOfCells();
			 
			 for (int j = 0; j < physicalNumberOfCells; j++) {
				 
				 Cell cell = row.getCell(j);
				 
				 CellType cellType = cell.getCellType();
				 
				 if(cellType.equals(CellType.STRING)){
					 
					String stringCellValue = cell.getStringCellValue();
	           
					System.out.println(stringCellValue);
					
				 }
					
					else if (cellType.equals(CellType.NUMERIC)) {
						
						double numericCellValue = cell.getNumericCellValue();
						
					  int num = (int) numericCellValue;
					  
					  System.out.println(num);
			}
			
		}
			 
			 
		
	}
	}
	
		 public static void particularData() throws IOException {
			 
			 System.out.println("Particular Data");
				
				System.out.println(" ---------------");
				
				File f = new File("C:\\Users\\lenovo\\Maven\\Maven\\src\\test\\java\\com\\datadriven\\Movie.xlsx");
				
				FileInputStream fip = new FileInputStream(f);
				
				Workbook w = new XSSFWorkbook(fip);
				
				Sheet sheetAt = w.getSheetAt(0);
				
				 Row row = sheetAt.getRow(0);
				 
				 Cell cell = row.getCell(1);
				 
				 CellType cellType = cell.getCellType();
				 
				 if(cellType.equals(CellType.STRING)){
					 
						String stringCellValue = cell.getStringCellValue();
		           
						System.out.println(stringCellValue);
						
					 }
						
						else if (cellType.equals(CellType.NUMERIC)) {
							
							double numericCellValue = cell.getNumericCellValue();
							
						  int num = (int) numericCellValue;
						  
						  System.out.println(num);
				}
		 }
				 
				 public static void ParticularColumn() throws IOException {
					 
					 System.out.println("ParticularColumn");
						
						System.out.println(" ---------------");
						
						File f = new File("C:\\Users\\lenovo\\Maven\\Maven\\src\\test\\java\\com\\datadriven\\Movie.xlsx");
						
						FileInputStream fip = new FileInputStream(f);
						
						Workbook w = new XSSFWorkbook(fip);
						
						Sheet sheetAt = w.getSheetAt(0);
					
				        int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
				        
				        for (int i = 0; i < physicalNumberOfRows; i++) {
				        	
				        	Row row = sheetAt.getRow(i);
				        	
				        	Cell cell = row.getCell(0);
				        		
				        		String stringCellValue = cell.getStringCellValue();
				        		
				        		System.out.println(stringCellValue);
				        		
				        	
				        	}	        		
				        	
				        	w.close();						  
										  
	}
								
                     public static void ParticularRow() throws IOException {
					 
					 System.out.println("ParticularRow");
						
						System.out.println(" ---------------");
						
						File f = new File("C:\\Users\\lenovo\\Maven\\Maven\\src\\test\\java\\com\\datadriven\\Movie.xlsx");
						
						FileInputStream fip = new FileInputStream(f);
						
						Workbook w = new XSSFWorkbook(fip);
						
						Sheet sheetAt = w.getSheetAt(0);
					    	
					    	Row row = sheetAt.getRow(1);
					    	
					    	int physicalNumberOfCells = row.getPhysicalNumberOfCells();
					    	
					    	for (int j = 0; j < physicalNumberOfCells; j++) {
					    		
					    		Cell cell = row.getCell(j);
				        		
				        		String stringCellValue = cell.getStringCellValue();
				        		
				        		System.out.println(stringCellValue);
							}
							
						}
						
					
				
						
	
						
						
                    		
						
				    
	public static void main(String [] args) throws IOException {
		 
		 allData();
		 
		 particularData();
		 
ParticularColumn();

ParticularRow();

	 }
	
}


	
