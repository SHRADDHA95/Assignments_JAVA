package com.hackerrank;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheetReader {

	public void readFromExcel(String filepath) throws InvalidFormatException,
			IOException {
		int flag = 0;
		String SAMPLE_XLSX_FILE_PATH = filepath;
		Workbook workbook = WorkbookFactory.create(new File(
				SAMPLE_XLSX_FILE_PATH));
		DataFormatter dataFormatter = new DataFormatter();

		workbook.getNumberOfSheets();

		Sheet sheet = workbook.getSheetAt(0);
		Iterator<Row> rowIterator = sheet.rowIterator();
		int NO_OF_ROWS = sheet.getPhysicalNumberOfRows();

		Row row1 = rowIterator.next();
		System.out.println("No OF COLUMNS:" + row1.getPhysicalNumberOfCells());

		System.out.println("No OF ROWS:" + NO_OF_ROWS);

		System.out.println("VALUES FROM EXCEL SHEET:");
		while (rowIterator.hasNext()) {

			Row row = rowIterator.next();

			// int length = row.getPhysicalNumberOfCells();

			// Now let's iterate over the columns of the current row
			Iterator<Cell> cellIterator = row.cellIterator();

			if (flag == 0) {

				while (cellIterator.hasNext()) {

					Cell cell = cellIterator.next();
					String cellValue = dataFormatter.formatCellValue(cell);
					System.out.print(cellValue + "\t");

				}

			}
			System.out.println();
		}

	}

	public static void main(String args[]) throws InvalidFormatException,
			IOException {
		ExcelSheetReader obj = new ExcelSheetReader();

		String SAMPLE_XLSX_FILE_PATH = "D:/Extra/ecotrix.xlsx";
		obj.readFromExcel(SAMPLE_XLSX_FILE_PATH);
	}
}
