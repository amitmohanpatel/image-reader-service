package com.image.reader.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

@Service
public class ReadCreateExcel {

	public static void readCreateExcelFile(String inputFolderPath) {
		try {
			File folder = new File(inputFolderPath);
			if (folder.isDirectory()) {
				File [] filse = folder.listFiles();
				for (int i = 0; i < filse.length; i++) {
					if ((!filse[i].isDirectory()) && (checkIsImageFile(filse[i]))) {
						int count = i + 1;
						System.out.println("File creation start..." + count);
						String imgText = ImageReader.getImgText(filse[i].getAbsolutePath());
						createExcelFile(inputFolderPath, imgText, filse[i].getName());
						System.out.println("File creation end" + count);
					}
				}
			} else {
				System.out.println("Please enter the correct folder path, Not file name.");
			}
		} catch (Exception e) {
			System.out.println("Error while create excel file");
			e.printStackTrace();
		}
	}
	private static boolean checkIsImageFile(File file) {
		boolean status = false;
		String extension = file.getName().toString().split("\\.")[1];
		if (extension.equals("jpg") || extension.equals("jpeg") || extension.equals("png")) {
			status = true;
		}
		return status;
	}
	
	private static void createExcelFile(String fileLocation, String data, String fileName) throws IOException {
		String finalFilePath = fileLocation  + "\\" + fileName.split("\\.")[0] + ".xlsx";
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet();
		Row header = sheet.createRow(0);
		Cell headerCell = header.createCell(0);
		headerCell.setCellValue(data);
		FileOutputStream outputStream = new FileOutputStream(finalFilePath);
		workbook.write(outputStream);
		workbook.close();
	}
}
