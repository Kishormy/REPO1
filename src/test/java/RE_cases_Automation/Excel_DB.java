package RE_cases_Automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel_DB {
	
	public String Get_Data(int r, int c) throws IOException {
		File file = new File("E:\\OTHERS\\Rest Assured\\TestDataa\\data.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		Workbook Workbook = new XSSFWorkbook(inputStream);
		Sheet sheet = Workbook.getSheet("sheet1");
		Cell cell = sheet.getRow(r).getCell(c);
		cell.setCellType(Cell.CELL_TYPE_STRING);
		String data = cell.getStringCellValue();
		return data;
	}

	
	public void Write_Data() throws IOException {
		File file = new File("E:\\OTHERS\\Rest Assured\\TestDataa\\data.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		XSSFWorkbook WORKBOOK = new XSSFWorkbook(inputStream);
		Sheet sheet = WORKBOOK.getSheetAt(0);
		Row row = sheet.createRow(2);
		Cell cell = row.createCell(2);
		cell.setCellValue("Rambo");
		FileOutputStream fos = new FileOutputStream("E:\\OTHERS\\Rest Assured\\TestDataa\\data.xlsx");
		WORKBOOK.write(fos);
		fos.close();
	}
	
	

}
