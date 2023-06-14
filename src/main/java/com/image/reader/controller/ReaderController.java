package com.image.reader.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.image.reader.util.ReadCreateExcel;

@RestController
@CrossOrigin
@RequestMapping("/read")
public class ReaderController {

	@Autowired
	private ReadCreateExcel reader;
	
	@GetMapping("readImageData")
	public void createExcelOfImageData(@RequestParam(value="folderPath") String folderPath) {
		System.out.println(folderPath);
		reader.readCreateExcelFile(folderPath);
	}
}
