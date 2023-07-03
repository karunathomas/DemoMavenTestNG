package testNGDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook; 
import org.testng.annotations.DataProvider; 

public class DataFromExcel {
	//public static void main(String[] args) throws IOException {
	@DataProvider(name="getData") 
	public String[][] getData() throws IOException {
		File excelFile=new File(".\\src\\main\\java\\Resources\\testdata.xlsx");
		FileInputStream fis=new FileInputStream(excelFile);
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		//specifying sheet name
		XSSFSheet sheet = workbook.getSheet("testSheet");
		int rows=sheet.getPhysicalNumberOfRows();
		int cols=sheet.getRow(0).getLastCellNum();
		System.out.println(cols);
		 System.out.println(sheet.getPhysicalNumberOfRows()); 
		//bcoz dataprovider using so converted to string array
		String[][] data=new String[rows-1][cols];
		for(int i=0;i<rows-1;i++) {
			for(int j=0;j<cols;j++) {
				DataFormatter df=new DataFormatter();
				data[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j)); 
				// System.out.println(df.formatCellValue(sheet.getRow(i).getCell(j)));
				 //System.out.println(sheet.getRow(i).getCell(j).getStringCellValue()); 
				} 
				} 
				// for(String[] dataar:data) // {
				 // System.out.println(Arrays.toString(dataar)); // 
		//
		workbook.close(); 
		fis.close();  
				return data; 
			}	
	}
