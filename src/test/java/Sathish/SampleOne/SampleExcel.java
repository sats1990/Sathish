package Sathish.SampleOne;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SampleExcel {
public static void main(String[] args) throws IOException {
	File FileLoc = new File("F:\\SampleOne\\Excel\\TestData.xlsx");
	FileInputStream Stream = new FileInputStream(FileLoc);
	Workbook w = new XSSFWorkbook(Stream);
	Sheet s = w.getSheet("Data");
	int RowCount = s.getPhysicalNumberOfRows();	
	System.out.println(RowCount);
	Row r = s.getRow(0);
	for (int i = 0; i < r.getPhysicalNumberOfCells(); i++) {
		Cell C = r.getCell(i);
		System.out.println(i);
		
	}
}
}
