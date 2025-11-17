package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String fileName="C:\\Users\\srraturi\\eclipse-workspace\\SeleniumMavenProject\\src\\test\\resources\\testData.xlsx";
		FileInputStream fileInput=new FileInputStream(new File(fileName));
		Workbook workbook=null;
		workbook=WorkbookFactory.create(fileInput);
		Sheet sheet=workbook.getSheet("Data");
		
		int totalRows=sheet.getLastRowNum();
		for(int i=1;i<=totalRows;i++) {
			sheet.getRow(i).createCell(3,CellType.STRING).setCellValue("Passed");
		}
		sheet.getRow(2).getCell(1).setCellValue("RootUser1234");
		FileOutputStream fileOutput=new FileOutputStream(new File(fileName));
		workbook.write(fileOutput);
		int totalCols=sheet.getRow(0).getLastCellNum();
		workbook.close();
		
	}
	public static int getCellIndex(String cellName,int totalCols) {
		int index=0;
//		
//		for(int j=0;j<totalCols;j++) {
//		if(row.getCell(j).getCellType()==CellType.STRING)	
//			System.out.print(row.getCell(j).getStringCellValue()+" ");
//		else if(row.getCell(j).getCellType()==CellType.NUMERIC)
//			System.out.print(row.getCell(j).getNumericCellValue()+ " ");
//		}
		return index;
	}

}
