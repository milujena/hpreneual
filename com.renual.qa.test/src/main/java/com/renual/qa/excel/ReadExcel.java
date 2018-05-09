package com.renual.qa.excel;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {
	
	
	//To get the data
			public static String getData(String path, String sheet, int rn, int cn)
			{
				try
				{
					FileInputStream fis = new FileInputStream(path);
					String data = WorkbookFactory.create(fis).getSheet(sheet).getRow(rn).getCell(cn).toString();
					return data;
				}
				catch(Exception e)
				{
					return "";
				}
			}
			
			//To get Row Count
				public static int getRow(String path, String sheet)
				{
					try
					{
						FileInputStream fis = new FileInputStream(path);
						int m = WorkbookFactory.create(fis).getSheet(sheet).getLastRowNum();
						return m;
					}
					catch(Exception e)
					{
						return 0;
					}
				}
				
				//To get Cell Count
				public static int getCell(String path, String sheet, int row)
				{
					try
					{
						FileInputStream fis = new FileInputStream(path);
						int m = WorkbookFactory.create(fis).getSheet(sheet).getRow(row).getLastCellNum();
						return m;
					}
					catch(Exception e)
					{
						return 0;
					}
				}


}
