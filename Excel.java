import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import java.io.FileNotFoundException;

public class Excel {
	

	public static String Excelread(String SheetName, int rowN,int colN) throws Exception {
		String CellValue = null;
		try {
			FileInputStream fS = new FileInputStream("");
			XSSFWorkbook wb = new XSSFWorkbook(fS);
			XSSFSheet sheet = wb.getSheet(SheetName);
			XSSFRow row = sheet.getRow(rowN);
			XSSFCell col = row.getCell(colN);
			CellValue = col.getStringCellValue();
			//return CellValue;
			wb.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return CellValue;	
	}
	
	//public static void writevlaue()
		public static void write(String s, int row,int col) {

			//String writeValue = null;
			

			try {

			File path = new File("pet.xlsx");

			XSSFWorkbook sheetName = new XSSFWorkbook();

			XSSFSheet marshal = sheetName.createSheet("petSheet");

			marshal.createRow(row).createCell(col).setCellValue(s);

			// marshal.getRow(0).createCell(6).setCellValue(s1);

			OutputStream fileOut = new FileOutputStream(path);

			sheetName.write(fileOut);
			}

			 catch (Exception e) {

			// TODO: handle exception

			}}}

		//	return writeValue;

		
		

		