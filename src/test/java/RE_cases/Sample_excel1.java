package RE_cases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Sample_excel1 {
	@Test
	public  void main12() throws IOException {
		// TODO Auto-generated method stub
        File file = new File("E:\\OTHERS\\Rest Assured\\TestDataa\\data2.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fis);
	
		int sheets = workbook.getNumberOfSheets();
		for (int i=0;i<sheets;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("sheet1"))
			{
			Sheet sheet = workbook.getSheetAt(i);
			
			Iterator<Row> rows = sheet.iterator();
			Row firstrow = rows.next();
			Iterator<Cell> ce= firstrow.cellIterator();
			int k=0;
			int column=0;
			while(ce.hasNext())
			{
				Cell value = ce.next();
				if(value.getStringCellValue().equalsIgnoreCase("Testcases"))
				{
					column = k;
				}
				k++;
			}
			System.out.println(column);
     }
    }   

	}
}
 