package com.image.reader;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ImageReaderServiceApp {

	public static void main(String[] args) {
		SpringApplication.run(ImageReaderServiceApp.class, args);
	}
	
	public static void testString() {
		List<String> columnNames = new ArrayList<>();
		columnNames.add("CUSTOMER REFERENCE NUMBER");
		columnNames.add("CUSTOMER NAME");
		columnNames.add("CITY, STATE");
		columnNames.add("PURCHASE VALUE AND DOWN PAYMENT");
		columnNames.add("LOAN PERIOD AND ANNUAL INTEREST");
		columnNames.add("GUARENTOR NAME");
		columnNames.add("GUARNTOR REFERENCE NUMBER");
		columnNames.add("LOAN AMOUNT AND PRINCIPAL");
		columnNames.add("TOTAL INTEREST FOR LOAN PERIOD AND PROPERTY INSURANCE PER MONTH");
		columnNames.add("STATUS");
		columnNames.add("REMARKS");
		
		List<List<String>> cellsData = new ArrayList<>();
		
		String testData = "608 28 6 767 886 8 MR.STANLEY B DYER OMAHANE SEI "
				+ " %HTY NINE MILLION ONE HUNDRED TWENTY THREE THOUSAND NINE "
				+ "UNDRED EIGHT DOLLARS AND TWENTY THREE CENTS AND TWENTY"
				+ "NINE % TWENTY EIGHT VEARS AND EIGHTTHREE % (PURCHAS"
				+ "E VALUE REDUCTION I4 33%) (MONTHLY PRINCIPAL REDUCTION 7"
				+ ",16%) (TOTAL INTEREST REDUCTION15.93%) MRS.KELLY M CROP"
				+ "PER 66? 63V 61 6463 631 6"

				+ "676 708 7 86 760 MR HERBERT 3 LARA CLEVELANDTOH"
				+ "S FIT‘TY NINE MILLION ONE HUNDRED TWENTY FIVE THOUSAND SI"
				+ ">< HUNDRED SEVENTY EIGHT DOLLARS AND FORTY FOUR CENTS AND"
				+ "TWENTY TWO % TEN VEARS AND NINE FIVE “/0 (PURCHASE VA"
				+ "LUE REDUCTION I2 82%) (MONTHLY PRINCIPAL REDUCTION 9.59%"
				+ ") (TOTAL INTEREST REDUCTIONLO 84%) DR DIANE J LEVIN"
				+ "0000 ‘HV I 1553 1007 8";
	}
}
