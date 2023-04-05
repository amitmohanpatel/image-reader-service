package com.image.reader;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.image.reader.util.ReadCreateExcel;

//@SpringBootApplication
public class ReaderApplication {

	public static void main(String[] args) {
////		SpringApplication.run(ReaderApplication.class, args);
//		if (args.length == 0) {
//			System.out.println("Please enter the folder path, It should not be empty!");
//		} else {
//			ReadCreateExcel.readCreateExcelFile(args[0]);
//		}
		String folderPath = "C:\\BT\\BPMN\\aib-bpmn-model\\reader\\image";
		ReadCreateExcel.readCreateExcelFile(folderPath);
	}
}
