package tests;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws Throwable 
	{
		
		XSSFWorkbook wb = new XSSFWorkbook();
		
		XSSFSheet sheet0 = wb.createSheet("FirstSheet");
		
		Row row0 = sheet0.createRow(0);
		
		Row row1 = sheet0.createRow(1);
		
		Cell cellA = row0.createCell(0);
		
		Cell cellB = row0.createCell(1);
		
          Cell cellC = row1.createCell(0);
		
		Cell cellD = row1.createCell(1);
		
		cellA.setCellValue("First Cell");
		
		cellB.setCellValue("second Cell");
		
cellC.setCellValue("Third Cell");
		
		cellD.setCellValue("Forth Cell");
		
		
		//Conecting Stream for writing into Excel
		
		File file = new File("C:\\New folder\\neeraj.xlsx");
		
		FileOutputStream fo= new FileOutputStream(file);
		
		wb.write(fo);
		
		fo.close();
		
		System.out.println("File created");
		
		
	}

}
