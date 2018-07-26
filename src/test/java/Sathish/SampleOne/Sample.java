package Sathish.SampleOne;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample {
public static void main(String[] args) throws IOException {
	File Fileloc = new File("F:\\SampleOne\\Excel\\TestData.xlsx");
	FileInputStream stream = new FileInputStream(Fileloc);
	Workbook w = new XSSFWorkbook(stream);
	Sheet s = w.getSheet("Data");
	Row r = s.getRow(1);
	Cell c = r.getCell(0);
	System.out.println(c);
	
	
	
}
}
