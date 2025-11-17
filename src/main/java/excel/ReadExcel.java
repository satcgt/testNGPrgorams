package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fileInput=new FileInputStream(new File("C:\\Users\\srraturi\\eclipse-workspace\\SeleniumMavenProject\\src\\test\\resources\\TestData.xlsx"));
		XSSFWorkbook workbook=new XSSFWorkbook(fileInput);
		XSSFSheet sheet=workbook.getSheet("Data");
		System.out.println("Total Rows:" + sheet.getLastRowNum());
		System.out.println("Total cols:" + sheet.getRow(1).getLastCellNum());
		
		int totalRows=sheet.getLastRowNum();
		for(int i=1;i<=totalRows;i++) {
			XSSFRow row=sheet.getRow(i);
			int totalCols=sheet.getRow(i).getLastCellNum();
			for(int j=0;j<totalCols;j++) {
			if(row.getCell(j).getCellType()==CellType.STRING)	
				System.out.print(row.getCell(j).getStringCellValue()+" ");
			else if(row.getCell(j).getCellType()==CellType.NUMERIC)
				System.out.print(row.getCell(j).getNumericCellValue()+ " ");
			}
			System.out.println();
		}
		
		workbook.close();
	}

}
