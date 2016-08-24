package com.gspann.selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//Reading from Excel and putting in 2d array (using data provider)
public class ExcelTest {
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFCell cell;
	
	@Test(dataProvider="myDP")
	public void test1(String s)//only 1 string  coz only 1 column
	{
		System.out.println("Value is "+s);
	}
	//data provider method
	@DataProvider
	public Object [][] myDP()//public Object [][] myDP(String
	{
		Object [][] obj=null;//coz while reading w e dont knw the size
		try {
			 fis=new FileInputStream("D:/Sonam.xlsx");
					} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     try 
	     {
			wb=new XSSFWorkbook(fis);
		} 
	     catch (IOException e) //exception to read and write
	     {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     //excel of 2d read starts from 0
	    sheet = wb.getSheet("Sheet1");
	     int totalRows=sheet.getLastRowNum();//return index total row ie 2 but actual is 3 and not actual number ie total row is "2"so to print actual total rows we do +1(here 3rows are there in excel and 1 column
	     //so here totalrow=2 
	     //int actualrow=totalRows+1;
	     int totalCols=sheet.getRow(1).getLastCellNum();//total column is "1" ie actual column number and not index
	     //totalcolmn=1
	     //2d array is made as: [2][1]
	     obj=new Object[totalRows][totalCols];//initialize 2 d array as [2][1]
	     int startrow=1;//index of the row :coz row start from 0 and 0 is the heading which we dont want and this is for excel
	     int startCol=0;//index of the excel;(actual count is 1 but index is 0);
	     int ci,cj;// denotes 2Darray indexes and indexes starts from 0 always ie variables for 2d array
	     ci=0;//denoted 2d array 1st row
	     
	     for(int i=startrow;i<=totalRows;i++,ci++)//for rows and loops works on index
	     {
	    	 cj=0;//denoted 2d array 1st row
	    	 for(int j=startCol;j<totalCols;j++,cj++)//for columns
	    	 {
	    		 obj [ci][cj]=getData(i,j);
	    		
	     }
	     }
	     
	     
	      return obj;
	}
	      public Object getData(int r,int c)// to find the cell ie cell is an intersection of row and column ,also we 
	      		
	      {
	    	cell=sheet.getRow(r).getCell(c) ;
	    	int type=cell.getCellType();// as we don't know the what type the cell is returning
	    	if (type==0)//it means integer is returned "0" for integer
	    	{
	    		return cell.getRawValue(); // as integer only is returned used getRawValue for integer
	      }
	    	if (type==1)//for string type is 1
	    	{
	    		return cell.getStringCellValue();
	    	}
	    	else return null;
	}

}
