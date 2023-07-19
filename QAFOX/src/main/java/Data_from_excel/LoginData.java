package Data_from_excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class LoginData {
	@DataProvider(name="logindata")
	public static String[][] excel_data() throws IOException
	{
		FileInputStream fis = new FileInputStream("C:\\ExcelHandling\\Login_data.xlsx");		
		XSSFWorkbook xf = new XSSFWorkbook(fis);
		XSSFSheet sheet = xf.getSheet("Sheet1");
		
		int rc=sheet.getLastRowNum();
		System.out.println(rc);
		int cc = sheet.getRow(0).getLastCellNum();
		System.out.println("total rows: "+rc+" total columns "+cc);
		String [][]arr = new String[rc+1][cc];
		for(int r=0;r<=rc;r++)
		{
			for(int c=0;c<cc;c++)
			{
				arr[r][c]= sheet.getRow(r).getCell(c).toString();
			}
		}
		return arr;
	}

}
