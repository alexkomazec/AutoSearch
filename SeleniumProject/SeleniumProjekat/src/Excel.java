

import java.io.File;
 
import java.io.FileInputStream;
 
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
 
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 

 
public class Excel {
 
 public static void main(String []args){
 
  try {
 
  // Specify the file path which you want to create or write
 
  File src=new File("C:/b.csv");
 
  // Load the file
 
  FileInputStream fis=new FileInputStream(src);
 
   // load the workbook
 
   XSSFWorkbook wb=new XSSFWorkbook(fis);
 
  // get the sheet which you want to modify or create
 
   XSSFSheet sh1= wb.getSheetAt(0);
   XSSFRow excelRow ;
   XSSFCell excelCell1,excelCell2,excelCell3;

for(int i=0;i<10;i++)
{
 excelRow = sh1.createRow(i);             
 excelCell1 = excelRow.createCell(0);
 excelCell1.setCellValue("Dolar1");
 
 excelCell2=excelRow.createCell(1);
 excelCell2.setCellValue("Dolar2");
 
 excelCell3=excelRow.createCell(2);
 excelCell3.setCellValue("Dolar3");
 
   
}
   
   

 
 FileOutputStream fout=new FileOutputStream(new File("C:/b.csv"));
 
 
// finally write content 
 
 wb.write(fout);
 
// close the file
 
 fout.close();
 wb.close();
 
  } catch (Exception e) {
 
   System.out.println(e.getMessage());
 
  }
 
 }
 
}
