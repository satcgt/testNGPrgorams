package testNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testNGExp10Excel {
	
	@Test(dataProvider="RetrieveData")
	  public void login(String userName , Double Password) {
		  System.out.println("UserName :" + userName + "password :" + Password);
	  }
	
  
  @DataProvider(name="RetrieveData")
  public Object[][] retrieveData() throws IOException {
	  
	  
	  FileInputStream fileInput=new FileInputStream(new File("C:\\Users\\srraturi\\eclipse-workspace\\SeleniumMavenProject\\src\\test\\resources\\ExcelTestData.xlsx"));
		XSSFWorkbook workbook=new XSSFWorkbook(fileInput);
		XSSFSheet sheet=workbook.getSheet("Data");
//		System.out.println("Total Rows:" + sheet.getLastRowNum());
//		System.out.println("Total cols:" + sheet.getRow(1).getLastCellNum());
		
		int totalRows=sheet.getLastRowNum();
		int totalCols=sheet.getRow(1).getLastCellNum();
		Object[][] obj = new Object[totalRows][totalCols];
		for(int i=1;i<=totalRows;i++) {
			XSSFRow row=sheet.getRow(i);
			
			for(int j=0;j<totalCols;j++) {
					if(row.getCell(j).getCellType()==CellType.STRING) {	
//						System.out.print(row.getCell(j).getStringCellValue()+" ");
						obj[i-1][j]=row.getCell(j).getStringCellValue();
					}
					else if(row.getCell(j).getCellType()==CellType.NUMERIC) {
//						System.out.print(row.getCell(j).getNumericCellValue()+ " ");
						obj[i-1][j]=row.getCell(j).getNumericCellValue();
					}
			}
			System.out.println();
		}
		
		workbook.close();
		return obj;
  }
}
