package com.image.reader.util;

import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import net.sourceforge.tess4j.util.LoadLibs;

public class ImageReader {
	public static String getImgText(String imageLocation) {
		ITesseract instance = new Tesseract();
		try {
			File tessDataFolder = LoadLibs.extractTessResources("tessdata");
			instance.setLanguage("eng");
			instance.setDatapath(tessDataFolder.getAbsolutePath());
			String imgText = instance.doOCR(new File(imageLocation));
			return imgText;
		} catch (TesseractException e) {
			e.getMessage();
			return "Error while reading image";
		}
	}
}
