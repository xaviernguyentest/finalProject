package Based_Commons;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	@SuppressWarnings("resource")
	public static String getCelData(String fileName, String sheetName, int row, int col){
		String cel = "";
		
		try {
		//specify the path of file
		File scr = new File(System.getProperty("user.dir")+"/src/test/java/demoPOM/DataCommons/DatatestExcel.xlsx");
		
		System.out.println(scr.getAbsolutePath());
		
		//load file
		FileInputStream fis = new FileInputStream(scr);
		
		//load workbook XLSX
		XSSFWorkbook wbx = new XSSFWorkbook(fis);
		//Get Sheet XLSX
		XSSFSheet shx = wbx.getSheet(sheetName);
		
		/*//Load workbook XLS
		HSSFWorkbook wb = new HSSFWorkbook();
		//Get Sheet XLS
		HSSFSheet sh = wb.getSheet(sheetName);*/
		
		cel = shx.getRow(row).getCell(col).getStringCellValue();
		}catch (Exception e) {
		System.out.println(e.getMessage());
		}
		return cel;
	}
}
