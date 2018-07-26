package Sathish.SampleOne;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample1 {
public static void main(String[] args) throws IOException {
	File fileLocation = new File("F:\\SampleOne\\Excel\\TestData.xlsx");
	FileInputStream stream = new FileInputStream(fileLocation);
	Workbook w = new XSSFWorkbook(stream);
	Sheet s = w.getSheet("Data");
	int Rowcount = s.getPhysicalNumberOfRows();
	System.out.println(Rowcount);
	Row r = s.getRow(0);
	int Cellcount = r.getPhysicalNumberOfCells();
	System.out.println(Cellcount);
	Cell c = r.getCell(0);
	int type = c.getCellType();
	System.out.println(type);
}
}
